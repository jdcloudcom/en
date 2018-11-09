
# Networking

VPC Overview

JD Cloud Virtual Private Cloud (VPC) is a logically isolated cyberspace that you customize on the JD Public Cloud, which is similar to the traditional network you built in the data center, and fully controlled by the user, supporting customized network segment division, route policy, and so on. Users can create and manage multiple cloud products in the VPC, such as VM, Load balancer, etc., and configure resources within the network to connect to the Internet. In addition, you can get through your IDC intranet and JD VPC by VPN\Dedicated Line access, to realize hybrid cloud deployment of applications and enable the applications to migrate to the cloud smoothly.



Elastic IP

Elastic IP is a public IP address that can be independently applied. It can be dynamically associated and disassociated with resources such as VM, load balancer, and NFV instance. The main function of the Elastic IP is to shield the instance fault. In the manual configuration mode, when the instance fails, the Elastic IP can be drifted to the redundant instance to achieve the purpose of quickly responding to the fault.

Perfectly elastic: All the EIPs provided by the JD Cloud are elastic IPs. You can change the associate between the Elastic IP and the cloud resource at any time, whether you purchase the Elastic IP independently or purchase the Elastic IP along with other resources such as the VM.

Support multiple resource associate: The Elastic IP supports associate with cloud resources such as VM, load balancer and NFV instance, and provides public network access for cloud resources.

Supports multiple billing types: The Elastic IP supports three types of billing, including monthly package, pay by configuration, and pay by consumption. Users can select the appropriate billing type based on actual business needs.

Flexible bandwidth adjustment: The Elastic IP supports bandwidth adjustment. Users can change the bandwidth at any time according to the change of service traffic demand, and the modification takes effect immediately.



Networking Access

Private IP Address: Containers in the same VPC can communicate over private IP.

EIP Address: Can be applied independently, support dynamic associate and disassociate with the container. The EIP address is the only address in the world that is available for communication between the container and the Internet.

For details, refer to the EIP operating guide.