# **ACL**

### **Basic Concept**

Access Control List (ACL) is a subnet-level stateless optional security layer that controls the data stream to and from subnet, which can be exact to protocol and port granularity, and act as a firewall to control traffic to and from one or more subnets. Without the protection of network ACL or the configuration of access control policy, all network ports of the servers in the subnet are more likely to be attacked or even invaded on the Internet.

Network ACL can be used to filter the east-west traffic across subnets or the north-south traffic to and from the Internet. Subnets with the same network traffic control can be associated with the same network ACL. By setting the outbound and inbound permission rules, the traffic to and from the subnet can be precisely controlled.

![](/image/Networking/Virtual-Private-Cloud/Network-ACL-Basic.jpg)



## **ACL Rules**

Network ACL rules are used to control inbound and outbound traffic for associated subnets. The new network ACL will reject all inbound and outbound traffic (All Drop) without any other rules.

Network ACLs are divided into inbound rules and outbound rules, where inbound rules are used to filter traffic from Internet or other subnets to the current subnet; outbound rules are used to access traffic from the Internet or other subnets from the current subnet.

For each rule of the network ACL, you hve to specify the follows:

| Parameter   | Explanation                                                         |
| ------ | ------------------------------------------------------------ |
| Priority | Enter a positive integer from 1 - 32768. The lower the priority number, the higher the priority. The higher the number, the lower the priority |
| Type | Application types applicable to the rule, such as HTTP, FTP or customized TCP |
| Protocol | Transport layer protocols applicable to the rule, such as TCP, UDP or ICMP |
| Port | Port range applicable to the rule. You can enter a single port (such as 80) or a certain port range (such as 32768-65535) |
| IP address | Source or destination IP address applicable to the rule. You can enter a single IP address or IP address field, where: Single IP address adopts in dotted decimal notation, for example, the 192.168.0.0 IP address field uses CIDR notation such as 192.168.0.0/16 |
| Strategy   | Permission or rejection                                                   |



### **Matching Order of ACL Rules**

Network ACL rules are matched according to the priority you set when you created them. The smaller the priority number, the higher the level, the lower the level, the larger the number. Immediately executed once matched. If no rule matches, the access will be denied.

We recommend that you set a separate priority interval for each subnet if you need to apply network ACL rules to two different subnets. If you have created two subnets 192.168.1.0/24 and 192.168.200.0/24, you can set the network ACL priority applied to the subnet 192.168.1.0/24 at between 1000 - 1999, and the network ACL rules of subnet 192.168.200.0/24 at between 2000 - 2999.

Settings following the above method will ensure that the rules for other subnets will not be affected when adjusting network ACL rules for a subnet.

We recommend that you start by creating a rule with the multiples of 1000, so that you can insert new rules when required.



### **Temporary Port**

Temporary port is the port configured when the client initiates request. Pay attention when setting network ACL rules. Due to the stateless nature of network ACLs, even if you set inbound rules to permit certain accesses, the access cannot be responded if you do not set an outbound rule for the temporary port.

The client that initiates request will select a temporary port range, and the range changes depending on the client's operating system.

- A number of Linux kernels use Port 32768-61000
- Windows Server 2003 uses Port 1025-5000
- Windows Server 2008 uses Port 49152-65535

Therefore, if a request from Windows XP client on Internet reaches your VPC's web server, your network ACL must have a corresponding outbound rule, i.e., to configure an outbound rule with a the port range of 1025-5000. In fact, to cover the data stream that may be initiated by different client types into public instances in your VPC, you have to open the temporary port 1024-65535, and can also add rules to ACL to reject any data stream from malicious ports within this range. You just have to make sure that the rejection rules are placed at a higher priority.



For specific rules on temporary ports, please visit: <https://en.wikipedia.org/wiki/Ephemeral_port>



### **Usage Restrictions**

When setting network ACL rules, please pay special attention to the following restrictions:

* Network ACL rules are stateless. Even if the inbound rule is set to permit specified IP address to access, the access cannot be responded if the corresponding outbound rule is not set, For details, see the temporary port section.
* A network ACL can be associated to multiple subnets, but a subnet can only be associated to one network ACL.



### **Network ACL VS. Security Group:**

| Network ACL                    | Security Group                                                   |
| -------------------------- | -------------------------------------------------------- |
| Stateless                     | Stateful                                                   |
| Effective at subnet-level | Effective at instance-level |
| Support permission rules and rejection rules | Support permission rules |
| Automatically applied to all instances within subnet | Security group rules are applied to instances only if the security group is specified at the same time of starting instances |

 