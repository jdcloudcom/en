# Product Overview

An Elastic IP address is a Public IP address that can be applied for independently. It supports dynamic association and disassociation on cloud resources, including virtual machine instances, native containers, load balancers, and NFV instances. The major function of Elastic IP address is to improve the fault-tolerance ability for instances. In case of master instance failure, the user can manually switch the Elastic IP address to a standby instance, thus minimizing the failure response time.

Currently JD Cloud leverages the cutting-edge technology of active-active vRouter which provides high availability ability for users. users can benefit from features of link redundancy and high availability in scenarios of massive concurrent connections, extra-large traffic loads, and burst traffic compared to classic active-standby mode. Based on this technology, JD Cloud’s EIP address’s maximum bandwidth can reach up to 150% of the bandwidth users actually purchase, which provides business continuity guarantee.

Normally, an Elastic IP address’s maximum bandwidth equals 150% of the bandwidth users actually purchase according to the traffic-sharing model of active-active vRouter. In rare specific situations, like downloading files through a single FTP connection, an Elastic IP address’s maximum bandwidth might reduce to 75% of user’s actual bandwidth.

The Elastic IP mainly has the following features:

* Complete elasticity: the Public IPs provided by JD Cloud are all Elastic IPs. An Elastic IP address, either from independent application or from a package order with instances, can be associated to or disassociated from a cloud resource at any time.

* Supporting the association of multiple resources: Elastic IP supports associating, Virtual Machine, container, Load Balancer, and NFV instance, providing access to public network for cloud resources.

* Supporting multiple billing types: Elastic IP supports three types of billing, i.e. monthly package, pay by configuration, and pay by consumption. users can choose appropriate billing type as required for their business.

* Flexible adjustment of bandwidth: Elastic IP supports the adjustment of bandwidth, and users can modify bandwidth based on the requirement for change in business and traffic. The modification will be effective immediately.

## Common Operation

- Elastic IP Management
	- [Create Elastic IP](../Operation-Guide/Elastic-IP-Management/Create-Elastic-IP.md)
	- [Delete Elastic IP](../Operation-Guide/Elastic-IP-Management/Delete-Elastic-IP.md)
	- [Associate Elastic IP](../Operation-Guide/Elastic-IP-Management/Associate-Elastic-IP.md)
	- [Disassociate Elastic IP](../Operation-Guide/Elastic-IP-Management/Disassociate-Elastic-IP.md)
	- [Modify Elastic IP bandwidth](../Operation-Guide/Elastic-IP-Management/Modify-Elastic-IP.md)
- View Elastic IP resource
	- [View Elastic IP resource](../Operation-Guide/View-Elastic-IP-Detail/View-Elastic-IP-Detail.md)
- View Elastic IP monitoring
	- [View Elastic IP Monitoring](../Operation-Guide/View-Elastic-IP-Monitoring/View-Elastic-IP-Monitoring.md)
- View Elastic IP billing
	- [View Elastic IP billing](../Operation-Guide/View-Elastic-IP-Billing/View-Elastic-IP-Billing.md)
- Export Elastic IP List
	- [Export Elastic IP List](../Operation-Guide/Export-Elastic-IP-List/Export-Elastic-IP-List.md)

## Billing
The Elastic IP supports three types of billing, i.e. monthly package, pay by configuration, and pay by consumption. For details, refer to: [Billing Instructions](../Pricing/Billing-Overview.md)
