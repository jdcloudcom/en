## VPC Attachment Firewall Device IPsec VPN Configuration:
After VPN Tunnel is created on [VPN Connection Console](https://cns-console.jdcloud.com/host/vpnConnection/list), corresponding configuration shall be carried out on customer’s local devices for negotiation and establishment of VPN Tunnel.

Taking Cisco C3900 as the example, this article tells how to configure VPN on Cisco devices, which is applicable for Cisco IOS 15.0+ software. For devices of other versions, please make configuration by referring to this example.

Network topology examples are as follows (``Configuration to the following topology and operation steps is used for reference only. During actual configuration, please replace values in the example configuration item with the actual parameter value used by you``):

|  | VPN public network address | Interconnected Intranet Segment |
|:---:|:---:|:---:|
| Cloud | 116.xxx.xxx.10 | 192.168.0.0/24 |
| Enterprise IDC | 220.xxx.xxx.150 | 10.0.0.0/16 |

VPN Tunnel configuration examples are as follows ("With a tunnel as the example, please create tunnels respectively on client by use of two public network addresses on VPN cloud in order to ensure business high availability"):

| Parameter Type | Parameter | Value |
|:---:|:---:|:---:|
| General | Cloud Public Network Address | 116.xxx.xxx.10 |
|  | Customer Gateway Public Network Address | 220.xxx.xxx.150 |
|  | Local ID | 116.xxx.xxx.10 |
|  | Remote ID | 220.xxx.xxx.150 |
|  | Tunnel IP | 169.254.1.1/30 |
| IKE Configuration | Pre-shared key | secret |
|  | IKE Version | v2 |
|  | DH Group | Group19 |
|  | Authentication Algorithm | SHA256 |
|  | Encryption Algorithm | aes128 |
|  | IKE SA Lifetime(s) | 14400 |
| IPsec Configuration | Packet Encapsulation Mode | Tunnel Mode     |
|  | Security Protocol | ESP |
|  | DH Group | Group19 |
|  | Authentication Algorithm | SHA256 |
|  | Encryption Algorithm | aes128 |
|  | IPsec SA Lifetime(s) | 3600 |
|  | IPsec SA Lifetime(Byte) | 0 |
|  | IPsec SA Lifetime(Packet) | 0 |
|  | DPD | Enable |

#### Main Configuration Steps
1. Log in command line configuration interface on firewall devices;

2. Configure IKE policy
```
  ! config ike algorithm
  crypto ikev2 proposal proposal_jdcloud
    encryption aes-cbc-128
    integrity sha256
    group 19
  exit

  ! config ike policy
  crypto ikev2 policy policy_jdcloud
    match fvrf any
    proposal proposal_jdcloud
  exit
```

3. Configure identity verification and pre-shared key;
```
  ! config authentication and psk
  crypto ikev2 profile ike_profile_jdcloud
    match identity remote address 116.xxx.xxx.10 255.255.255.255
    identity local address 220.xxx.xxx.150
    authentication remote pre-share key secret
    authentication local pre-share key secret
    lifetime 14400
    dpd 10 8 periodic
  exit
```

4. Configure IPsec policy:
```
  ! config ipsec security protocol
  crypto ipsec transform-set transform-jdcloud esp-aes esp-sha256-hmac
    mode tunnel
  exit

  !config ipsec policy
  crypto ipsec profile ipsec_profile_jdcloud
    set transform-set transform-jdcloud
    set pfs group19
    set ikev2-profile ike_profile_jdcloud
  exit
```

5. Configure tunnel:
```
  ! config logic interface
  interface Tunnel1
    ip address 169.254.1.1 255.255.255.252
    ip tcp adjust-mss 1379
    tunnel source 220.xxx.xxx.150
    tunnel mode ipsec ipv4
    tunnel destination 116.xxx.xxx.10
    ip virtual-reassembly
  exit

  ! config sla
  ip sla 100
    icmp-echo 169.254.1.2 source-interface Tunnel1
    frequency 5
  exit

  ip sla schedule 100 life forever start-time now
  track 100 ip sla 100 reachability
```

6. Configure ACL to allow needed segment communication;
```
  access-list 100 permit ip 10.0.0.0 0.0.255.255 192.168.0.0 0.0.0.255
```

7. Configure routes (with static route as the example);
```
  ip route 192.168.0.0 255.255.255.0 116.xxx.xxx.10
```

8. Configure cloud route, refer to [Border Gateway Route Table Configuration](../../Operation-Guide/Route-Management/Border-Gateway-Route-Configuration.md).

9. Test connectivity
Create machine on cloud subnet, and ping the intranet address of an instance in enterprise IDC intranet.

For other requirements, refer to [Restriction](../../Introduction/Restrictions.md).
