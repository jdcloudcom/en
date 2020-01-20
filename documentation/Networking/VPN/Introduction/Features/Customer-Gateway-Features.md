# Customer Gateway

### Basic Concept

Customer Gateway (CGW) is the logical representation of client device on cloud in VPN Connection and customers will create VPN connection based on border gateway and customer gateway and create VPN Tunnel based on VPN Connection public network address and Customer Gateway public network address. Customer Gateway supports assigning multiple public network addresses. </br>
Based on the consideration of high availability, you are recommended to configure at least two public network addresses for Customer Gateway with each public network address being established a VPN Tunnel with one of the two public network addresses in VPN Connection respectively, and different BGP ASNs shall be assigned to Border Gateway and Customer Gateway respectively to operate EBGP Routing Protocol. In case of unavailability of certain VPN tunnel caused by maintenance on devices or accidental situation, businesses on the VPN tunnel can be migrated seamlessly to other tunnels available.

### Customer Gateway Multiple Public IP Description

It is supported to assign multiple public network addresses to Customer Gateway, and under normal circumstances, one public network address is sufficient for the configuration. Based on the consideration of business high availability, you are recommended to configure at least two different public network addresses on client.</br>
In order to meet the demands of multi-cloud deployment presented by some Customer JD Cloud and Amazon AWS, four public network address options are provided on Customer Gateway, which is used to meet compatibility with VPN Connection and satisfy customers’ demand on seamless interconnection. For details, refer to [Customer Gateway Operation Manual](../../Operation-Guide/Customer-Gateway-Management/Customer-Gateway-Configuration.md)..

### Compatible with Client
For details of Client Compatibility, please see [Restrictions](../Restrictions.md)
