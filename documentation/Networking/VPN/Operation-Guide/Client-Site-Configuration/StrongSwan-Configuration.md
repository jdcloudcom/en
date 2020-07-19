## strongSwan IPsec VPN Configuration:
After VPN Tunnel is created on [VPN Connection Console](https://cns-console.jdcloud.com/host/vpnConnection/list), corresponding configuration shall be carried out on customer’s local devices for negotiation and establishment of VPN Tunnel.

Taking strongSwan 5.3.5 as the example, this article tells how to configure strongSwan VPN on Ubuntu 16.04 x86_64 machine, which is applicable for open source software client.

Network topology examples are as follows (``Configuration to the following topology and operation steps is used for reference only. During actual configuration, please replace values in the example configuration item with the actual parameter value used by you``):

|  | VPN public network address | Interconnected Intranet Segment |
|:---:|:---:|:---:|
| Cloud | 116.xxx.xxx.10  | 192.168.0.0/24 |
| Enterprise IDC | 220.xxx.xxx.150 | 10.0.0.0/16 |

VPN Tunnel configuration examples are as follows ("With a tunnel as the example, please create tunnels respectively on client by use of two public network addresses on VPN cloud in order to ensure business high availability"):

| Parameter Type | Parameter | Value |
|:---:|:---:|:---:|
| General | Cloud Public Network Address | 116.xxx.xxx.10  |
|  | Customer Gateway Public Network Address | 220.xxx.xxx.150 |
|  | Local ID | 116.xxx.xxx.10 |
|  | Remote ID | 220.xxx.xxx.150 |
|  | Tunnel IP |  169.254.1.1/30 |
|  IKE Configuration | Pre-shared key | secret |
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
1. Ubuntu installs strongSwan:
```
  apt-get install -y strongswan
  ipsec version   #View version of installed strongswan
```

2. Configure IKE and IPsec policy and edit /etc/ipsec.conf file:
```
  # ipsec.conf - strongSwan IPsec configuration file
  # basic configuration
  config setup
     uniqueids=no

  conn %default
      authby=psk
      type=tunnel

  conn jdcloud_tunnel1
      auto=start
      left=%defaultroute    # If client VPN gateway is behind NAT device, intranet address of client VPN gateway shall be filled in here
      leftid=220.xxx.xxx.150
      right=116.xxx.xxx.10
      leftsubnet=0.0.0.0/0    #Open all segments for interconnection
      rightsubnet=0.0.0.0/0   #Open all segments for interconnection
      type=tunnel
      leftauth=psk
      rightauth=psk
      keyexchange=ikev2
      ikelifetime=4h
      ike=aes128-sha1-modp1024    #Assemble according to encryption algorithm, certification algorithm and DH group designated during tunnel configuration
      esp=aes128-sha1-modp1024
      lifetime=1h
      keyingtries=%forever
      mobike=no
      dpddelay=10s
      dpdtimeout=30s
      dpdaction=restart
      mark=100  #Each tunnel shall use different tagged values, to guarantee uniqueness
```

3. Configure pre-shared key and edit /etc/ipsec.secrets file:
```
  220.xxx.xxx.150 116.xxx.xxx.10 : PSK "secret"
```

4. Configure tunnel and use virtual tunnel interface (VTI):
```
  sudo ip link add jdcloud_tunnel1 type vti local 10.0.0.x remote 116.xxx.xxx.10 key 100    #local recommends to use intranet address of gateway
  sudo ip addr add 169.254.1.1/30 remote 169.254.1.2/30 dev jdcloud_tunnel1
  sudo ip link set jdcloud_tunnel1 up mtu 1450
```

5. Configure iptables to allow needed segment communication;
```
  sudo iptables -t mangle -A FORWARD -o jdcloud_tunnel1 -p tcp --tcp-flags SYN,RST SYN -j TCPMSS --clamp-mss-to-pmtu
  sudo iptables -t mangle -A INPUT -p esp -s 116.xxx.xxx.10 -d 220.xxx.xxx.150 -j MARK --set-xmark 100   # If client VPN gateway is behind NAT device, intranet address of client VPN gateway shall be filled in at -d.
```

6. Set strongSwan to use route table defaulted by system and edit /etc/strongswan.d/charon.conf file:
```
  install_routes=no    #The default value is yes; the note is removed and the default value is changed to be no here for the purpose of preventing creation of new route tables of tunnels and apply the same route table for different tunnels, i.e., main route table
```

7. Enable system IP forwarding, edit /etc/sysctl.conf file and execute "sudo sysctl -p":
```
  net.ipv4.ip_forward = 1
```

8. Modify network configuration of attachment/network interface, edit /etc/sysctl.conf file and execute "sudo sysctl -p":
```
  net.ipv4.conf.jdcloud_tunnel1.rp_filter=2   # Allow linux to process asymmetric routes
  net.ipv4.conf.jdcloud_tunnel1.disable_policy=1  # Disable SPD policy inspection on attachments.
  net.ipv4.conf.eth0.disable_xfrm=1   # Disable IPsec encryption on physical network interface
  net.ipv4.conf.eth0.disable_policy=1   # Disable SPD policy inspection on physical network interface
```

9. Configure routes (with static route as the example);
```
  ip route add 192.168.0.0/16 dev jdcloud_tunnel1 metric 100
```

10. Enable strongSwan:
```
  ipsec start
```

11. Configure cloud route, refer to [Border Gateway Route Table Configuration](../../Operation-Guide/Route-Management/Border-Gateway-Route-Configuration.md).

12. Test Connectivity
Create machine on cloud subnet, and ping the intranet address of an instance in enterprise IDC intranet.

For more content of strongSwan, refer to [strongSwan Document](https://strongswan.org/documentation.html?spm=a2c4g.11186623.2.13.2d4c346eTfyt9H).

For other requirements, refer to [Restriction](../../Introduction/Restrictions.md).
