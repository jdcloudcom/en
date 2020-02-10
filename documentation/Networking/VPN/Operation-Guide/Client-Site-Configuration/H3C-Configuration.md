jdcloud_ike_peer_test## H3C Firewall Device IPsec VPN Configuration
After VPN Tunnel is created on [JD Cloud VPN Connection Console](https://cns-console.jdcloud.com/host/vpnConnection/list), corresponding configuration shall be carried out on customer’s local devices for negotiation and establishment of VPN Tunnel.

Taking H3C MSR800 as the example, this article specifies how to configure VPN on H3C devices, which is applicable for H3C Series Firewall. For other series devices, please refer this example for configuration.

Network topology examples are as follows (``Configuration to the following topology and operation steps is used for reference only. During actual configuration, please replace values in the example configuration item with the actual parameter value used by you``):

|  | VPN Public Network Address | Interconnected Intranet Segment |
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
| IKE Configuration | Pre-shared Key Pair | secret |
|  | IKE Version | v2 |
|  | DH Group | Group2 |
|  | Authentication Algorithm | SHA256 |
|  | Encryption Algorithm | aes128 |
|  | IKE SA Lifetime(s) | 14400 |
| IPsec Configuration | Packet Encapsulation Mode | Tunnel Mode |
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
  ike dpd jdvpndpd
    interval-time 10
    time-out 10
  quit

  # config ike algorithm
  ike proposal 1
    encryption-algorithm aes-cbc
    authentication-method pre-share
    dh group2
    sa duration 14400
    authentication-algorithm sha
  quit
```

3. Configure identity verification and pre-shared key pair;
```shell
  # config authentication and psk
  ike peer jdcloud_ike_peer_test
    remote-address 116.xxx.xxx.10
    pre-shared-key secret
    exchange-mode main
    proposal 1
    dpd jdvpndpd
  quit
```

4. Configure IPsec policy and tunnel;
```shell
  ipsec sha2 compatible enable

  # config ipsec security protocol
  ipsec transform-set jdcloud_ipsec_proposal_test
    encapsulation-mode tunnel
    esp encryption-algorithm aes-cbc-128
    esp authentication-algorithm sha1
  quit

  # config ipsec policy and logic interface
  ipsec profile jdcloud_ipsec_profile_test
    ike-peer jdcloud_ike_peer_test
    pfs dh-group2
    sa duration time-based 3600
    transform-set jdcloud_ipsec_proposal_test
  quit

  ipsec anti-replay check
    ipsec anti-replay window 128
```

5. Configure tunnel:
```shell
  # use ipsec with physical interface
  interface jdcloud_tunnel1
    ip address 169.254.1.1 255.255.255.252
    ip virtual-reassembly
    source 220.xxx.xxx.150
    destination 116.xxx.xxx.10
    tunnel-protocol ipsec ipv4
    ipsec profile jdcloud_ipsec_profile_test
    tcp mss 1380
    undo shutdown
  quit
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

9. Test Connectivity:
Create machine on cloud subnet, and ping the intranet address of an instance in enterprise IDC intranet.

For other requirements, refer to [Restriction](../../Introduction/Restrictions.md).
