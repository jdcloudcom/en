# Create CA certificates and private keys by yourself

This document specifies steps of building CA by yourself, for configuring Ingress Resource of Https type. If you already have certificates and private keys, please directly use them when [Defining Ingress Resource](https://docs.jdcloud.com/en/jcs-for-kubernetes/Deploy-Ingress-Resource).

## I. Build CA by Yourself, for Creating Digital Signature Certificate Subsequently

1. Install cfssl tool set

```
wget https://pkg.cfssl.org/R1.2/cfssl_linux-amd64
mv cfssl_linux-amd64 /usr/bin/cfssl

wget https://pkg.cfssl.org/R1.2/cfssljson_linux-amd64
mv cfssljson_linux-amd64 /usr/bin/cfssljson

wget https://pkg.cfssl.org/R1.2/cfssl-certinfo_linux-amd64
mv cfssl-certinfo_linux-amd64 /usr/bin/cfssl-certinfo
```

2. Create configuration file

CA configuration files are used for configuring Customer Scenario (profile) and specific parameters (usage: expiration time, server certification, client certification, encryption, etc.), but it needs to specify a specific scenario when other certificates are signed subsequently.

```
mkdir /root/cert
cd /root/cert
cat > ca-config.json <<EOF
{
  "signing": {
    "default": {
      "expiry": "87600h"
    },
    "profiles": {
      "ingress": {
        "usages": [
            "signing",
            "key encipherment",
            "server auth",
            "client auth"
        ],
        "expiry": "87600h"
      }
    }
  }
}
EOF
```

3. Create certificate signature request files

```
cd /root/cert
cat > ca-csr.json <<EOF
{
  "CN": "ingress",
  "key": {
    "algo": "rsa",
    "size": 2048
  },
  "names": [
    {
      "C": "CN",
      "ST": "BeiJing",
      "L": "BeiJing",
      "O": "k8s",
      "OU": "4Paradigm"
    }
  ],
  "ca": {
    "expiry": "876000h"
 }
}
EOF
```

4. Produce CA certificates and private keys

```
cd /root/cert
cfssl gencert -initca ca-csr.json | cfssljson -bare ca
ls ca*.pem
```

## II. Create SSL Certificates and Private Keys

1. Create certificate signature requests

```
cd /root/cert
cat > web-server-csr.json <<EOF
{
  "CN": "ingress",
  "hosts": [
    "web-server-test.jdcloud.com"
  ],
  "key": {
    "algo": "rsa",
    "size": 2048
  },
  "names": [
    {
      "C": "CN",
      "ST": "BeiJing",
      "L": "BeiJing",
      "O": "k8s",
      "OU": "4Paradigm"
    }
  ]
}
EOF
```
2. Apply for SSL certificate

```
cd /root/cert
cfssl gencert -ca=/root/cert/ca.pem \
  -ca-key=/root/cert/ca-key.pem \
  -config=/root/cert/ca-config.json \
  -profile=ingress web-server-csr.json | cfssljson -bare web-server
ls web-server*.pem
```