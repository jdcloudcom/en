## Huawei Firewall Device IPsec VPN Configuration:
After VPN Tunnel is created on [JD Cloud VPN Connection Console](https://cns-console.jdcloud.com/host/vpnConnection/list), corresponding configuration shall be carried out on customer’s local devices for negotiation and establishment of VPN Tunnel.

Taking Huawei USG6530 as the example, this article tells how to configure VPN on Huawei devices, which is applicable for HUAWEI USG6500 Series Firewall. For other series devices, please make configuration by referring to the example.

Network topology examples are as follows (``Configuration to the following topology and operation steps is used for reference only. During actual configuration, please replace values in the example configuration item with the actual parameter value used by you``):

|  | VPN public network address | Interconnected Intranet Segment |
|:---:|:---:|:---:|
| Cloud | 116.xxx.xxx.10  | 192.168.0.0/24 |
| Enterprise IDC | 220.xxx.xxx.150 |  10.0.0.0/16   |

VPN Tunnel configuration examples are as follows ("With a tunnel as the example, please create tunnels respectively on client by use of two public network addresses on VPN cloud in order to ensure business high availability"):

| Parameter Type | Parameter | Value       |
|:---:|:---:|:---:|
| General | Cloud Public Network Address | 116.xxx.xxx.10  |
|  | Customer Gateway Public Network Address | 220.xxx.xxx.150 |
|  | Local ID | 116.xxx.xxx.10 |
|  | Remote ID | 220.xxx.xxx.150 |
|  | Tunnel IP | 169.254.1.1/30 |
|  IKE Configuration | Pre-shared key | secret |
|  | IKE Version | v2 |
|  | DH Group | Group19 |
|  | Authentication Algorithm | SHA256 |
|  | Encryption Algorithm | aes128 |
|  | IKE SA Lifetime(s) | 14400 |
| IPsec Configuration | Packet Encapsulation Mode | Tunnel Mode     |
|  | Security Protocol | ESP |
|  | DH Group | Group14 |
|  | Authentication Algorithm | SHA256 |
|  | Encryption Algorithm | aes128 |
|  | IPsec SA Lifetime(s) | 3600 |
|  | IPsec SA Lifetime(Byte) | 0 |
|  | IPsec SA Lifetime(Packet) | 0 |
|  | DPD | Enable |

#### Main Configuration Steps
1. Log in command line configuration interface on firewall devices;

2. Configure IKE policy
```shell
  # config dpd
  ike dpd type periodic
  ike dpd idle-time 10
  ike dpd retransmit-interval 5

  # config ike algorithm
  ike proposal 1
    encryption-algorithm aes-128
    dh group19
    authentication-algorithm sha2-256
    authentication-method pre-share
    integrity-algorithm hmac-sha2-256
    prf hmac-sha2-256
    sa duration 14400
```

3. Configure identity verification and pre-shared key;
```shell
  # config authentication and psk
  ike peer jdcloud_ike_peer_test
    undo version 1
    exchange-mode auto
    pre-shared-key secret
    ike-proposal 1
    remote-address 116.xxx.xxx.10
```

4. Configure IPsec policy and tunnel;
```shell
  ipsec sha2 compatible enable

  # config ipsec security protocol
  ipsec proposal jdcloud_ipsec_proposal_test
    esp authentication-algorithm sha2-256
    esp encryption-algorithm aes-128

  # config ipsec policy and logic interface
  ipsec policy jdcloud_ipsec_policy_test 1 isakmp
    pfs dh-group14
    security acl 3002
    ike-peer jdcloud_ike_peer_test
    proposal jdcloud_ipsec_proposal_test
    tunnel local 220.xxx.xxx.150
    sa trigger-mode auto
    sa duration traffic-based 0
    sa duration time-based 3600
    route inject dynamic
```

5. Configure tunnel:
```shell
  # use ipsec with physical interface
  interface GigabitEthernet1/0/0
    description jdcloud_test
    undo shutdown
    ip address xxx.xxx.xxx.xxx 255.255.255.248
    vrrp vrid 107 virtual-ip 220.xxx.xxx.150 255.255.255.224 active
    gateway 220.xxx.xxx.1
    service-manage https permit
    service-manage ping permit
    redirect-reverse next-hop 220.xxx.xxx.1
    ipsec policy jdcloud_ipsec_policy_test
```

6. Configure ACL to allow needed segment communication;
```shell
  acl number 3002
    rule 5 permit ip source 10.0.0.0 0.0.255.255 destination 192.168.0.0 0.0.0.255
```

7. Configure routes (with static route as the example);
```shell
  ip route-static 192.168.0.0 255.255.255.0 116.xxx.xxx.10
```

8. Configure cloud route, refer to [Border Gateway Route Table Configuration](../../Operation-Guide/Route-Management/Border-Gateway-Route-Configuration.md).

9. Test connectivity
Create machine on cloud subnet, and ping the intranet address of an instance in enterprise IDC intranet.

For other mrequirements, refer to [Restriction](../../Introduction/Restrictions.md).
