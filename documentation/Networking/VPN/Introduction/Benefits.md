## Benefits

### Connection Level Tunnel High Availability

Each VPN connection will be assigned with public network addresses of two clouds, which is used to establish at least two VPN tunnels with client public network addresses. In case of unavailability of certain tunnel caused by accidental or expected maintaining behaviors, the business traffic shall be switched to tunnels available, and BGP Routing Protocol can be configured to achieve automatic traffic switchover.


### Flexible Route Control

The same route policy is used for all VPN tunnels under the same VPN connection, and static route and BGP dynamic route are supported. You are recommended to configure and use BGP Routing Protocol so as to achieve business high availability.


### Flexible Tunnel Configuration

Support establishment of VPN tunnel based on IKE v1/v2 and IPsec, configuration of identifiers at home end and on cloud of the tunnel, application of multiple different authentication algorithms, encryption algorithms and other algorithms and active detection of the tunnel based on DPD.


### Compatible with Multiple Different Clients

Support establishing VPN connection with mainstream VPN client devices including Cisco, Huawei and Hillstone, other public cloud manufacturers, strongSwan and other open source VPN clients.
