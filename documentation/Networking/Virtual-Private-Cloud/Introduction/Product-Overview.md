## Product Overview

### Overview of VPC

JD Virtual Private Cloud (VPC) is the logically isolated cyberspace which you customize on the JD public Cloud. It is similar with the traditional network which you built in data center. This private cyberspace is completely controlled by the user and supports the customized division of the network segment and route policy, etc. Users can create and manage multiple cloud products in VPC, such as VMs, load balancers, etc., and configure resources within the network to connect to the Internet. In addition, you can connect your IDC intranet and JD VPC by VPN, to realize hybrid cloud deployment of applications and enable the applications to migrate to the cloud smoothly.


### The Overall Structure of VPC

![私有网络整体结构](/image/Networking/Virtual-Private-Cloud/VPC_Infrastrucure.png)



### VPC VS Traditional Network

#### Main Differences

| VPC | Traditional Data Center Network |
| -------------------- | ------------------ |
| Forwarding and Control Element Separation | Forwarding and Control Element Coupling |
| Centralized Control | Distributed Control |
| Programmable               | Not Programmable           |
| Open API              | Not Open             |
| Virtualization-based Network Capability | Hardware-based Network Capability |



#### Functional Comparison

| VPC | Traditional Network |
| ------------------------------------------------------------ | ------------------------------------ |
| Operate various components of the network flexibly through console or API. Use software to define network, saving the costs of equipment as well as the operation and maintenance | Unable to change network configuration flexibly, high operation and maintenance costs |
| Realize flexible service switching through Elastic IP | Not supporting flexible associating and flexible switching of service through Public IP |
| Connect JD VPC to Enterprise IDC through VPN/Dedicated Line access which can reduce the enterprise IT operation and maintenance costs, protect the security of core data and easily build hybrid cloud | Do not support hybrid cloud deployment |
| configurate  security group and ACL policies  on your own to provide multiple safety guards for users' data and applications at the instance level and subnet level| Need to purchase additional equipment in order to reach to the same security level |

 

### VPC Security

Users can set up a VPC network on their own. Different VPCs are logically isolated. Users can customize the VPC network segments and subnet network segments. Users can also set ACL policies at subnet level and associate security groups with the instances in the subnet to provide multiple safety guards.
