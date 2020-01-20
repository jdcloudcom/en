## VPN connection

### Basic Concept
VPN Connection: VPN Connection is an assembly of VPN tunnels established between a group of cloud public network addresses and a group of client public network addresses, which is used as a routing mode to assign VPN public IP on cloud and unify the tunnels (based on the consideration of business high availability, static/BGP are suggested to use BGP route).

VPN Tunnel is an IPsec Site-To-Site encryption channel established between a cloud public network address and a client public network address, which is used to ensure secure communication among businesses in different networking environments. The establishment of VPN Tunnel includes two-stage negotiation including IKE and IPsec, supporting high-security encryption and authentication algorithm.

"Maximum elevated bandwidth processing capability of each VPN Tunnel is 1.5Gbps ``


### Cloud Public Network Address
After VPN Connection is created based on Border Gateway and Customer Gateway, a public network address on cloud will be automatically allocated to VPN Connection and the address will be used as the VPN Tunnel’s cloud public network address.

Based on realization of business high availability, two public network addresses will be automatically allocated. It is strongly suggested that customers use the two public network addresses to establish VPN Tunnel with client simultaneously couple with the usage of BGP dynamic route protocol so as to achieve high availability of connection tunnel and ensure continuity and availability of business.

### Unified Routing Method
Routing method shall be configured in VPN Connection and the configuration shall be shared by all VPN Tunnels under the Connection. You are recommended to enable BGP route.

### VPN Tunnel Configuration
An encryption tunnel based on route shall be established between a public network address for VPN Connection and a public network address for Customer Gateway, which is used for intranet communication between environments of the two VPN ends.

VPN Tunnel is negotiated and established based on IKE and IPsec, which supports IKE V1 and V2, authentication algorithms including SHA1 and SHA256, encryption algorithms including AES128 and AES256, Diffie-Hellman key negotiation mechanisms including Group2 and Group5, and DPD detection on tunnel activity and other characteristics.

After VPN Tunnel is created on cloud, tunnel negotiation with client will be automatically initiated.

### VPN Tunnel Management
VPN Tunnel supports management status and running status with management status showing whether or not the Tunnel can be used currently for tunnel negotiation and creation and running status showing current availability status of the Tunnel.

Under default circumstances, management status of the Tunnel is "UP", which means that the tunnel can be automatically negotiated and established. After the tunnel is successfully negotiated and established (e.g. the tunnel’s running status is "UP"), normal communication can be carried out.

If customers need to upgrade maintenance or change configuration for certain tunnel or client devices, the management status of the tunnel shall be set as "Down", which means that business traffic will no longer be routed to the tunnel. After the completion of maintenance upgrade or configuration changes, the management status of the tunnel shall be reset as "UP", which means that the tunnel will be renegotiated and re-established based on the new configuration.

```
  Please make sure that the management status of the tunnel is set as "DOWN" before configuration is changed so as to avoid business traffic interruption caused by tunnel’s accidental disconnection, renegotiation and re-establishment.
```

### Monitoring
VPN Connection supports viewing relevant monitoring information of all tunnels under the VPN Connection within up to 14 days, and the information includes original inflow/outflow traffic rate, encrypted inflow/outflow traffic rate and inflow/outflow data package rate. Other monitoring items are being supported gradually.
