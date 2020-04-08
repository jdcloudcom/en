## Cisco Firewall Device Private Line Configuration
"The Direct Connection is taken as an example, and the configuration method of Hosted Connect is the same as the Direct Connection."
After Private Virtual Interface is created on [Private Virtual Interface Console](https://cns-console.jdcloud.com/host/dedicatedVif/list), corresponding configuration shall be carried out on customer’s local devices for negotiation and establishment of Business Tunnel.

Taking devices the three-layer sub-interface of which is supported by Cisco as an example, this article specifies how to configure private line on client device. For devices three-layer sub-interface of which is supported by Cisco, please refer to this example for configuration.

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
  interface Ethernet1/1
    no switchport
    speed 1000
    no negotiate auto

  interface Ethernet1/1.10  //Establish sub-interface by C-tag
    description customer_primary_link
    ip address 172.16.0.1  255.255.255.252  //Use the first address to configure APIs address
    encapsulation dot1Q 10    //Use c-tag to configure dot1q encapsulation

  router bgp 65001  //Configure BGP Protocol and Autonomous System Number
  bgp router-id <loopback>   //Use loopback APIs address to configure BGP router-id
  bgp log-neighbor-changes   //configure log neighbor changes

  neighbor 172.16.0.2/30   //Configure BGP neighborhood
    remote-as 64512             //Assign the AS No. of neighborhood
    description Primary_line_peer  //describe neighbor
    ebgp-multihop 2                //Configure EBGP multihop
    address-family ipv4 unicast

  address-family ipv4 unicast
    network 10.0.0.0 255.255.0.0  //Announce Subnets to access cloud VPC

    # Port 2/another router are configured with the second pair of interconnection addresses. For devices only support one physical port configuration, please use subip to configure the second pair of interconnection addresses in the above sub-interface
    interface Ethernet1/2
      no switchport
      speed 1000
      no negotiate auto

    interface Ethernet1/2.10  //Establish sub-interface by C-tag
      description customer_secondary_link
      ip address 172.16.0.5  255.255.255.252  //Use the first address to configure APIs address
      encapsulation dot1Q 10    //Use c-tag to configure dot1q encapsulation

    router bgp 65001  //Configure BGP Protocol and Autonomous System Number
    bgp router-id <loopback>   //Use loopback APIs address to configure BGP router-id
    bgp log-neighbor-changes   //configure log neighbor changes

    neighbor 172.16.0.6/30   //Configure BGP neighborhood
      remote-as 64512
      description Secondary_line_peer
      ebgp-multihop 2
      address-family ipv4 unicast

    address-family ipv4 unicast
      network 10.0.0.0 255.255.0.0  //Announce Subnets to access cloud VPC
```

8. Configure cloud route, refer to [Border Gateway Route Table Configuration](../../Operation-Guide/Route-Management/Border-Gateway-Route-Configuration.md).

9. Test connectivity:
Create machine on cloud subnet, and ping the intranet address of an instance in enterprise IDC intranet.

For other requirements, refer to [Restriction](../../Introduction/Restrictions.md).
