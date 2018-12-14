## **Machine Instance Security Group Rule Configuration**

#### **Scenario 1: Intranet access between VMs**

#### **Scenario Description:**

In the same area, the VM under the same router can set the internal network between the cloud servers to communicate with each other through security group rules.



#### **Configuration Suggestions:**

The cloud server in the same security group is interconnected by default intranet. The cloud server in different security groups cannot pass the default intranet. To achieve intranets communication, there are the following solutions:

- Solution 1: The cloud server can be placed in the same security group to meet the intranet connectivity.
- Solution 2: If the cloud server is not in the same security group, the two security groups are authorized by each other intranet, and the IP address of the other party can be added to the access source and access target.



### Scenario 2: VM provides public network service

#### **Scenario Description:**

A VM associated to a EIP can accept access from the public network or actively access the public network. At this point, you can set security group rules to ensure that only specific IP addresses and ports can communicate with the VM.



#### **Configuration Suggestions:**

- If the VM needs to provide Web services, you need to develop the 80/443 port used by the open http/https protocol.
- For the ports necessary for the operation and maintenance machine, such as port 22 and port 3389, we recommend that you only open the security group for the IP that you need to manage the VM.
- If you manage the VM's EIP address range is fixed: In the security group settings, only your IP address can access the 22 and 3389 ports of the security group.
- If you manage A VM with a EIP address range that is not fixed: Allow a certain IP source address to access the remote management terminal. The range of the specific IP segment is confirmed according to the network conditions of your network. To set up all addresses to manage the VM, please enter 0.0.0.0/0 (setting to that all addresses can be managed will increase your security group risk, please use with caution)  



#### Recommended Security Group Policy (Inbound Rules):

| **Source Address**         | **Protocol** | **Port** | **Action** | **Description**                                   |
| ------------------ | -------- | -------- | ---------- | ------------------------------------------ |
| 0.0.0.0/0 | tcp | 80 | Accept | Allow inbound HTTP access to the web server from anywhere |
| 0.0.0.0/0 | tcp | 443 | Accept | Allow inbound HTTPS access to the web server from anywhere |
| Your EIP Address Range | tcp | 22 | Accept | Linux Machine Allows SSH Remote Login from User Network |
| Your EIP Address Range | tcp | 3389 | Accept | Windows Machine Allows RDP Remote Login from User Network |

 

Your EIP address can be obtained as follows:

1. Query through IP library

2. If there is a discrepancy in the IP address queried by IP, you can configure the source IP range to 0.0.0.0/0 first. Use your current network to access the VM, and obtain the source IP address through tcpdump on the VM. Then configure the source IP into the security group rule.



### **Scenario 3: Providing public network services using SLB load balancer**

#### **Scenario Description:**

Load balancer is a load balancer service that distributes traffic to multiple cloud servers. SLB can extend the application's external service capabilities through traffic distribution, improving the availability of applications by eliminating single points of failure.

A VM instance that does not have a public network IP address can receive access from the public network through the public network load balancer, but cannot initiate an access to the public network.



#### **Configuration Suggestions:**

- Security Group 1 provides Web services for the Internet and only opens the http/https port to the Internet.
- Security Group 2 provides application services for security group 1, and opens application service ports for Security Group 1.



#### Recommended Security Group Policy (Inbound Rules):

Security Group 1:

| **Source Address**  | **Protocol** | **Port** | **Action** | **Remarks**                                   |
| ----------- | -------- | -------- | ---------- | ------------------------------------------ |
| 0.0.0.0/0 | tcp | 80 | Accept | Allow inbound HTTP access to the web server from anywhere |
| 0.0.0.0/0 | tcp | 443 | Accept | Allow inbound HTTPS access to the web server from anywhere |
| SLB System Segment | All | -1/-1 | Accept | Allow SLB System to Access Security Group 1 |
| O&M Security Group | tcp | 22 | Accept | Linux Instances Allow Inbound SSH Access from O&M Security Groups |
| O&M Security Group | tcp | 3389 | Accept | Windows Instances Allow Inbound RDP Access from O&M Security Groups |

Security Group 2:

| **Source Address**  | **Protocol** | **Port** | **Action** | **Remarks**                                   |
| ----------- | -------- | -------- | ---------- | ------------------------------------------ |
| Security Group 1 | tcp | 8080 | Accept | Allow Security Group 1 to access the application service port of Security Group 2 |
| SLB System Segment | All | -1/-1 | Accept | Allow SLB System to Access Security Group 2 |
| O&M Security Group | tcp | 22 | Accept | Linux Instances Allow Inbound SSH Access from O&M Security Groups |
| O&M Security Group | tcp | 3389 | Accept | Windows Instances Allow Inbound RDP Access from O&M Security Groups |

 