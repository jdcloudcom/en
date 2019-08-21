# Define ingress resource by using open source nginx-ingress controller

Ingress is an entry for accessing internal cluster service from external of JCS for Kubernetes. Service resources in clusters will be exposed outside the cluster with the method of HTTP/HTTPS route.

Taking example of open source nginx-ingress controller, this document specifies methods of defining Ingress Resource of HTTP and HTTPS type in clusters.

## I. Connection to Cluster

With the Kubernetes command line client kubectl, you can connect to JCS for Kubernetes from the client computer, realizing application deployment. For details, please refer to use of Kubectl client [Connect to JCS for Kubernetes](https://docs.jdcloud.com/en/jcs-for-kubernetes/connect-to-cluster).

## II. Deployment of Ningx-ingress Controller
Nginx-ingress Controller is the officially open source ingress controller of Nginx. For its deployment method, please refer to [Nginx-ingress controller Deployment](https://docs.jdcloud.com/en/jcs-for-kubernetes/deploy-ingress-nginx-controller).

## III. Deploy Ingress Resource of HTTP Type

1. Deploy one Deployment in clusters, run one Nginx webserver and return names of pod Virtual Machines, IP Address, port, request URI and local time of server. For details, please refer to the following Yaml files.

```
apiVersion: apps/v1
kind: Deployment
metadata:
  name: nginx-deployment
  labels:
    app: nginx
spec:
  replicas: 3
  selector:
    matchLabels:
      app: nginx
  template:
    metadata:
      labels:
        app: nginx
    spec:
      containers:
      - name: nginx
        image: nginxdemos/hello:latest        #Nginx webserver Docker Image
        ports:
        - containerPort: 80
```
2. Download YAML files and execute the following commands. Deploy the above Deployment in clusters and confirm deployment running status:

```
Download YAML file:
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/ingress/deploy-nginx-server.yml

Deploy to clusters:
kubectl create -f deploy-nginx-server.yml

Confirm deployment running status:
kubectl get deployment nginx-deployment
NAME               DESIRED   CURRENT   UP-TO-DATE   AVAILABLE   AGE
nginx-deployment   3         3         3            3           24s
```

3. Create one service of ClusterIP type, expose applications deployed in deployment (created in Step 1), and confirm service and Endpoint status:

```
Create Service:
kubectl expose deployment nginx-deployment --target-port=80 --port=60000 --protocol=TCP --name=servicetest-jdcloud

Confirm Service status:
kubectl get service servicetest-jdcloud
NAME                  TYPE        CLUSTER-IP    EXTERNAL-IP   PORT(S)     AGE
servicetest-jdcloud   ClusterIP   10.0.63.197   <none>        60000/TCP   46s

Confirm Endpoints status:
kubectl get endpoints servicetest-jdcloud
NAME                  ENDPOINTS                              AGE
servicetest-jdcloud   10.0.0.19:80,10.0.0.6:80,10.0.0.8:80   88s

```

4. Create one ingress resource of Http type and use service created in Step 3 as the backend of ingress. Yaml file download and descriptions are as follows:

* Download Yaml file:

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/ingress/deploy-http-ingress-resource.yml
`

* Yaml file description:

```
apiVersion: extensions/v1beta1
kind: Ingress
metadata:
  name: k8s-app-monitor-agent-ingress
  annotations:
    metadata.annotations.kubernetes.io/ingress.class: "nginx "     #designates Ingress Controller used for creating Ingress Resource, and Nginx Controller created above is used for this instance
spec:
  rules:
  - host: k8s-ingress-nginx-controller-test.jdcloud
    http:
      paths:
      - path: /
        backend:
          serviceName: servicetest-jdcloud
          servicePort: 60000
```

* Execute the commands below to deploy the above ingress resource to clusters:

`
kubectl create -f deploy-http-ingress-resource.yml 
`

* Confirmation Ingress Resource status

```
kubectl get ingress k8s-app-monitor-agent-ingress

NAME                            HOSTS                                       ADDRESS   PORTS   AGE

k8s-app-monitor-agent-ingress   k8s-ingress-nginx-controller-test.jdcloud             80      23s
```

4. Access following service after verification of names of Virtual Machines configured in Ingress Resource Rule is passed in local browser:

* Get Internet IP of Nginx-ingress Controller, i.e., External IP of LoadBalancer type service associated to Nginx-ingress Controller. For details, please refer to [Nginx-ingress controller Deployment](https://docs.jdcloud.com/en/jcs-for-kubernetes/deploy-ingress-nginx-controller).

* Add DNS configuration in /etc/hosts of local server: IP refers to the external IP of LoadBalance type service searched in the last step, and domain refers to the names of Virtual Machines: k8s-ingress-nginx-controller-test.jdcloud, configured in ingress resource rule;

* Enter k8s-ingress-nginx-controller-test.jdcloud/servicetest-jdcloud in the browser to verify if nginx webserver is exposed outside the cluster.

## IV. Deploy Ingress Resource of HTTPS Type

### Step 1: CA Certificates and Private Keys

1. You can use service of [SSL Certificate](https://docs.jdcloud.com/en/ssl-certificate/product-overview) provided by JD Cloud;

2. You can build CA or SSL by yourself. For details, please refer to [Build CA Certificates and Private Keys by Yourself](https://docs.jdcloud.com/en/jcs-for-kubernetes/deploy-CA-SSL);

3. If you already have CA certificates and private keys, please skip to Step 2 by ignoring this step.

### Step 2: Create Secret resources in JCS for Kubernetes with the SSL certificates created in Step 1 or other customized certificates

1. Create Secret of TLS type by executing the following commands:

```

kubectl create secret tls ingress-ssl-secret --cert web-server.pem --key web-server-key.pem			#Please replace values of cert and key with SSL certificates and private key names which are actually applied
```

2. View Secret status

```
kubectl describe secret/ingress-ssl-secret
Name:         ingress-ssl-secret
Namespace:    nginx-ingress
Labels:       <none>
Annotations:  <none>

Type:  kubernetes.io/tls

Data
====
tls.crt:  1448 bytes
tls.key:  1675 bytes
```

### Step 3: Create Ingress Resource of HTTPS type

1. YAML file download and description for Ingress Resource of HTTPS  type are as follows:

* Download Yaml file

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/ingress/deploy-https-ingress-resource.yml
`

* Description for Yaml file is as follows:

```
apiVersion: extensions/v1beta1
kind: Ingress
metadata:
  annotations:
	metadata.annotations.kubernetes.io/ingress.class: "nginx "     #designates Ingress Controller used for creating Ingress Resource, and Nginx Controller created above is used for this instance
  name: myingress
  namespace: nginx-ingress
spec:
  rules:
  - host: nginx-ingress-test.jdcloud
    http:
      paths:
      - backend:
          serviceName: servicetest-jdcloud
          servicePort: 60000
        path: /nginx-demo
  tls:
  - hosts:
    - nginx-ingress-test.jdcloud
    secretName: ingress-ssl-secret        #secretName shall be replaced with the TLS type Secret name created in Step 2
```

2. Deploy Ingress Resource by running commands below:

`
kubectl create -f deploy-https-ingress-resource.yml
`

3. Access following service after verification of names of Virtual Machines configured in Ingress Resource Rule is passed in local browser:

* Get Internet IP of Nginx-ingress Controller, i.e., External IP of LoadBalancer type service associated to Nginx-ingress Controller. For details, please refer to [Nginx-ingress controller Deployment](https://docs.jdcloud.com/en/jcs-for-kubernetes/deploy-ingress-nginx-controller).

* Add DNS configuration in /etc/hosts of local server: IP refers to the external IP of LoadBalance type service searched in the last step, and domain refers to the names of Virtual Machines: nginx-ingress-test.jdcloud, configured in ingress resource rule;

* Enter nginx-ingress-test.jdcloud/nginx-demo in the browser to verify output results.

**Remarks**: When the customized CA certificate is used, the browser will notify that the certificate is not trusted. In such case, you can import the ca.pem file of self-built CA to the operating system and set it as permanently trustful.