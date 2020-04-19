## Terminology

| English | Chinese | Description |
|:---:|:---:|:---:|
| VPN | VPC | Private network communication is achieved by establishment of tunnels among public networks, which is commonly applicable to intranet communication among enterprises’ branches and between branches and headquarters by two main modes, namely, Site-To-Site and Point-To-Site. |
| IKE | Internet Key Exchange | SA is used in Stage 1 of VPN tunnel negotiation process to create IPsec negotiation in Stage 2, and IKE v1 and IKE v2 are supported. For more information, refer to RFC 2409, RFC 4306 and other references. |
| IPsec | Internet Protocol Security | Private connection shall be negotiated and established between cloud and client, and IP grouping shall be encrypted and verified so as to protect VPN data transmission security. For more information, please refer to RFC 4301, RFC 4309 and other references. |
| Site-To-Site VPN  | Site-To-Site VPN | VPN tunnels shall be established between two VPN gateways, Internal networking instances behind the gateways can carry out internal intranet intercommunication through VPN gateway, which is applicable to opening up the internal network among data centers, offices, or between data center and office. This VPN type is supported by JD Cloud & AI currently. |
| Point-To-Site VPN | End-To-Site VPN | VPN Tunnel shall be established between terminal devices and VPN gateways and the terminal device can access to internal network through VPN gateway, which is applicable to personal PC, mobile phone, tablet and other devices to access to internal network. |
| VPN Connection | VPN Connection | An integration of multiple VPN tunnels shall be established between a pair of cloud public IP and client public IP. |
| VPN Tunnel | VPN Tunnel | VPN Tunnel shall be established between a cloud public IP and a client public IP to carry business traffic. |
| BGP |  Border Gateway Protocol | Border Gateway Protocol is a dynamic route protocol, which can dynamically adjust the routing clauses published on cloud and client with EBGP Routing Protocol being operated between cloud and client. |
| Route-Based VPN | Route-Based VPN | VPN gateway itself exerts no restriction on intranet segments interconnecting two ends but can solely control segments’ connectivity by virtue of route. |
| Policy-Based VPN | Policy-Based VPN | Intranet segment allowed by the two ends for interconnection shall be configured on VPN Gateway, and only data package matching the policy can be communicated through VPN tunnel. |
