# Use Restrictions
#### JD Cloud’s requirements on client VPN devices
* The client VPN devices shall support standard IPsec Protocol, tunnel mode and ESP;
* They shall support parameters related to negotiation in the two stages including IKE and IPsec;
* They shall support logical interfaces used to associate the tunnel to devices based on Route-Based VPN.
* The Static and Internet-rountable IPV4 address used on client shall be used as the tunnel’s outer-layer address to disable VPN Tunnel.
* If the client is a firewall device or is configured with security policy, the following protocol ports shall be released:
  - UDP 500, for IKE negotiation;
  - IP 50, for IPsec ESP negotiated and encrypted data package transmission;
  - UDP 4500, NAT Traversal (NAT-T) shall be enabled at the same time if your client devices are behind the NAT devices;
* MTU shall not exceed 1450;


#### Compatible with Client
List of clients passing the test:
  * Hardware Device:
    - Cisco IOS 15.0(or later) software；
    - HUAWEI USG6500 Series Firewall;
  * Open Source VPN Solutions: strongSwan and others;
  * VPN products from other public cloud manufacturers;


"List of clients failing the connectivity test:"
  * Sangfor Hardware Device or Gateway Image. Because JD Cloud VPN is a IPsec based on route and Sangfor devices only support policy-based IPsec, some problems occurred during stage 2 of tunnel negotiation, causing failure to the test on connectivity. To deal with the problem, communication with colleagues in Sangfor relevant departments has been carried out and the parties will update their own software versions in a short term so as to support VPN connectivity between them.



#### Related Resources Quota for VPN

|   Product | Resource | Restriction | Exceptional Application Method |
|:--------:|:-----------------------------------------------------------:|:----------------------------------------------------------------------:|:------------:|
| VPN Connection | Number of VPN Connections creatable supported by each Border Gateway in the same region | 10 | Tickets     |
|          |                Number of cloud public network addresses under the same VPN Connection | 2 | The number cannot be increased   |
|          |               Number of VPN Tunnels creatable for the same VPN Connection | Up to (number of cloud public network address connected by VPN * number of Customer Gateway’s public network address piece) VPN Tunnels can be created | The number cannot be increased   |
|          | Number of VPN Tunnels creatable between the same pair of cloud public network address and customer gateway public network addresses | 1 | The number cannot be increased   |
| Border Gateway | Number of Border Gateways in the same region | 5 | Tickets     |
|          |                Number of VPC Attachments creatable for each Border Gateway | 50 | Tickets     |
|          |               Number of Static Route rules for the same Border Gateway | 50 | Tickets     |
|          |               Number of Dynamic Route rules for the same Border Gateway | 300 | Tickets     |
| VPC Attachment | Number of VPC Attachments creatable between the same pair of VPC and Border Gateway | 1 | The number cannot be increased   |
| Customer Gateway | Number of Customer Gateways in the same region | 10 | Tickets     |
|          |                 Number of public network addresses for the same Customer Gateway | 4 | The number cannot be increased.   |
