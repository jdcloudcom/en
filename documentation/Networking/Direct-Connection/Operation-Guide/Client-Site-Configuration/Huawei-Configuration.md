## Huawei Firewall Device Private Line Configuration
"The Direct Connection is taken as an example, and the configuration method of Hosted Connect is the same as the Direct Connection."
After Private Virtual Interface is created on [Private Virtual Interface Console](https://cns-console.jdcloud.com/host/dedicatedVif/list), corresponding configuration shall be carried out on customer’s local devices for negotiation and establishment of Business Tunnel.

Taking devices the three-layer sub-interface of which is supported by Huawei as an example, this article specifies how to configure private line on client device. For devices three-layer sub-interface of which is supported by Huawei, please refer to this example for configuration.

Network topology examples are as follows (``Access to public cloud through two direct connects is suggested. Configuration to the following topology and operation steps is used for reference only. During actual configuration, please replace values in the example configuration item with the actual parameter value used by you``):

|  | Cloud | Enterprise IDC |
|:---:|:---:|:---:|
| Interconnected Segment | 192.168.0.0/24 | 10.0.0.0/16 |
| vlanId | 10 | 10 |
| BGP ASN | 64512 | 65001 |
| Interconnection Address | 172.16.0.2/30 | 172.16.0.1/30 |
|  | 172.16.0.6/30 | 172.16.0.5/30 |

#### Main Configuration Steps
1. Log in command line configuration interface on firewall devices, and configure vlan and BGP information by referring to the following configuration information:
```
    # Port 1 is configured with the first pair of interconnection addresses
    interface 10GE1/0/1
      undo portswitch
      device transceiver 10GBASE-COPPER

    interface 10GE1/0/1.10
      description DL-pri1
      ip address 192.168.1.1 255.255.255.252
      dot1q termination vid 10

    # Port 2/another router are configured with the second pair of interconnection addresses. For devices only support one physical port configuration, please use subip to configure the second pair of interconnection addresses in the above sub-interface
    interface 10GE1/0/2
      undo portswitch
      device transceiver 10GBASE-COPPER

    interface 10GE1/0/2.10
      description DL-pri2
      ip address 192.168.1.5 255.255.255.252
      dot1q termination vid 10

    bgp 65001
    router-id <loopback>
    peer 192.168.1.2 as-number 64512
    peer 192.168.1.6 as-number 64512

    ipv4-family unicast
      network 10.0.0.0 255.255.0.0

    peer 192.168.1.2 enable
    peer 192.168.1.6 enable
```

8. Configure cloud route, refer to [Border Gateway Route Table Configuration](../../Operation-Guide/Route-Management/Border-Gateway-Route-Configuration.md).

9. Test connectivity:
Create machine on cloud subnet, and ping the intranet address of an instance in enterprise IDC intranet.

For other requirements, refer to [Restriction](../../Introduction/Restrictions.md).
