## Juniper Firewall Device IPsec VPN Configuration
After VPN Tunnel is created on [JD Cloud VPN Connection Console](https://cns-console.jdcloud.com/host/vpnConnection/list), corresponding configuration shall be carried out on customer’s local devices for negotiation and establishment of VPN Tunnel.

Taking Juniper SRX12.1X47-D20.7 virtual firewall as the example, this article specifies how to configure VPN on Juniper devices, which is applicable for SRX software of Juniper 12.1X47. For devices of other versions, please refer this example for configuration.
```
  For ACX Series, EX Series, M Series, MX Series, PTX Series, QFabric, QFX Series, SRX Series, and T Series hardware and devices, please make configuration by referring to contents in the article.
```

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
|  | Authentication Algorithm | SHA1 |
|  | Encryption Algorithm | aes128 |
|  | IKE SA Lifetime(s) | 14400 |
| IPsec Configuration | Packet Encapsulation Mode | Tunnel Mode |
|  | Security Protocol | ESP |
|  | DH Group | Group2 |
|  | Authentication Algorithm | SHA1 |
|  | Encryption Algorithm | aes128 |
|  | IPsec SA Lifetime(s) | 3600 |
|  | IPsec SA Lifetime(Byte) | 0 |
|  | IPsec SA Lifetime(Packet) | 0 |
|  | DPD | Enable |

#### Main Configuration Steps
1. Log in command line configuration interface on firewall devices;

2. Basic information of configuration network, security domain and address book:
```shell
  set security zones security-zone trust address-book address addr_10_0_0_0_16 10.0.0.0/16
  set security zones security-zone untrust address-book address addr_192_168_0_0_24 192.168.0.0/24
```

2. Configure IKE policy
```shell
  set security ike proposal jdcloud-ike-proposal-test authentication-method pre-shared-keys
  set security ike proposal jdcloud-ike-proposal-test authentication-algorithm sha1
  set security ike proposal jdcloud-ike-proposal-test encryption-algorithm aes-128-cbc
  set security ike proposal jdcloud-ike-proposal-test lifetime-seconds 14400
  set security ike proposal jdcloud-ike-proposal-test dh-group group2

  set security ike policy jdcloud-ike-policy-test mode main
  set security ike policy jdcloud-ike-policy-test proposals jdcloud-ike-proposal-test
  set security ike policy jdcloud-ike-policy-test pre-shared-key ascii-text "secret"
```

3. Configure gateway, outflow API and protocol version:
```shell
  set security ike gateway jdcloud-ikegw-test ike-policy jdcloud-ike-policy-test
  set security ike gateway jdcloud-ikegw-test external-interface ge-0/0/0.0
  set security ike gateway jdcloud-ikegw-test address 116.xxx.xxx.10

  set security ike gateway jdcloud-ikegw-test dead-peer-detection
```

4. Configure IPsec policy:
```shell
  set security ipsec proposal jdcloud-ipsec-proposal-test protocol esp
  set security ipsec proposal jdcloud-ipsec-proposal-test authentication-algorithm hmac-sha1-96
  set security ipsec proposal jdcloud-ipsec-proposal-test encryption-algorithm aes-128-cbc
  set security ipsec proposal jdcloud-ipsec-proposal-test lifetime-seconds 3600

  set security ipsec policy jdcloud-ipsec-policy-test perfect-forward-secrecy keys group2

  set security ipsec policy jdcloud-ipsec-policy-test proposal-set standard

  set security ipsec vpn jdcloud-vpn-test bind-interface st0.1
  set security ipsec vpn jdcloud-vpn-test ike gateway jdcloud-ikegw-test
  set security ipsec vpn jdcloud-vpn-test ike ipsec-policy jdcloud-ipsec-policy-test
  set security ipsec vpn jdcloud-vpn-test establish-tunnels immediately
```

5. Configure tunnel
```shell
  set interfaces st0.1 family inet address 169.254.1.1/30
  set interfaces st0.1 family inet mtu 1436
  set security zones security-zone trust interfaces st0.1

  #Configure inbound IKE traffic
  set security zones security-zone untrust host-inbound-traffic system-services ike

  # Configure inbound routing protocol
  set security zones security-zone trust host-inbound-traffic protocols all
```

6. Configure ACL to allow needed segment communication;
```shell
  # Configure Outbound Policy
  set security policies from-zone trust to-zone untrust policy jdcloud-security-policy-outbound match source-address addr_10_0_0_0_16
  set security policies from-zone trust to-zone untrust policy jdcloud-security-policy-outbound match destination-address addr_192_168_0_0_24
  set security policies from-zone trust to-zone untrust policy jdcloud-security-policy-outbound match application any
  set security policies from-zone trust to-zone untrust policy jdcloud-security-policy-outbound then permit

  # Configure Inbound Policy
  set security policies from-zone untrust to-zone trust policy jdcloud-security-policy-inbound match source-address addr_192_168_0_0_24
  set security policies from-zone untrust to-zone trust policy jdcloud-security-policy-inbound match destination-address addr_10_0_0_0_16
  set security policies from-zone untrust to-zone trust policy jdcloud-security-policy-inbound match application any
  set security policies from-zone untrust to-zone trust policy jdcloud-security-policy-inbound then permit
```

7. Configure routes (with static route as the example);
```shell
  ip route 192.168.0.0 255.255.255.0 116.xxx.xxx.10
  set routing-options static route 192.168.0.0/24 qualified-next-hop 10.10.10.1
```

8. Configure cloud route, refer to [Border Gateway Route Table Configuration](../../Operation-Guide/Route-Management/Border-Gateway-Route-Configuration.md).

9. Test Connectivity:
Create machine on cloud subnet, and ping the intranet address of an instance in enterprise IDC intranet.

For other requirements, refer to [Restriction](../../Introduction/Restrictions.md).
