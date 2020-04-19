## Frequently Asked Questions (FAQ)

### Business Consultation

1.Q: What is VPN Service？<br />

A: IPsec VPN is a network service JD Cloud & AI provides for customers, which is used to establish Internet-based communication so as to achieve intranet encryption on resources between enterprise IDC and public cloud.<br />

2.Q: Which Public Cloud products can be connected by IPsec VPN?<br />

A: At present, VPN Service can connect to Public Cloud VPC and access to products or service provided in VPC, including Virtual Machines, Load Balancer and Cloud Database RDS.<br />

3.Q: What business scenarios are supported by VPN?<br />
A: VPN supports the establishment of encrypted Intranet communication between the Enterprise IDC and the Public Cloud, or the Office and the Public Cloud, or different Cloud Manufacturers.<br />

4.Q: What client types are supported by VPN?<br />
A: At present, we have tested the VPN tunnel connection established with hardware devices of many manufactures as well as with other public cloud manufactures. Only the test on Sangfor client failed. The service is going to be updated continuously so as to support the connection with Sangfor devices. Please stay tuned.<br />

5.Q: Is the VPN in Clint-To-Site mode supported?<br />
A: The Public Cloud does not provide the VPN in Clint-To-Site mode at present. It is recommended to create a VPN in Clint-To-Site mode by creating a VM via the Clint-To-Site VPN image of NFV manufacturer as a VPN Gateway.<br />


### Fault Processing

1.Q: How to deal with VPN Tunnel disconnection?<br />

A: Restart the tunnel and view VPN Tunnel negotiation log. VPN Tunnel negotiation log checking function will be provided in console in the following days. If the newly created tunnel is still unstable, please update tunnel parameters on cloud and client, use encryption methods with higher security and establish multiple tunnels to achieve business redundancy.<br />
