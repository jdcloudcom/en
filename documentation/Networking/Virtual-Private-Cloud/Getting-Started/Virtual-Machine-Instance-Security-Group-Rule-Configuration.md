## **Machine Instance Security Group Rule Configuration**

#### **Scenario 1: Intranet access between VMs**

#### **Scenario Description:**

In the same region, the VMs under a same router can set the communication availability by applying security group rules.


#### **Configuration Suggestions:**

The VMs associated security groups are disconnected by default. To achieve intranets communication, there are the following solutions:

- set the security groups to authorize each other, both add the other security goup’s IP address on the source IP and target IP. 



### Scenario 2: A VM provides public network service

#### **Scenario Description:**

A VM associated with an EIP can accept access from the public network or actively access to the public network. At this point, you can set security group rules to ensure that only specific IP addresses and ports can achieve the VM.



#### **Configuration Suggestions:**

- If the VM needs to provide Web services, you need to open the 80/443 port used by the http/https protocol.
- For the ports required by the operation and maintenance VMs, such as port 22 and port 3389, we recommend that you only open the port on the IPs associated with the VMs  needed to be managed.
- If the VMs’ EIP range is fixed: In the security group settings, only set your IP address can access the 22 and 3389 ports in the security group.
- If the VMs’ EIP range that is not fixed: Allow a certain group of source addresses to access the remote management terminal. The range of this IP segment base on your network. To set up all addresses can operate the VMs, please enter 0.0.0.0/0 (setting to all addresses will increase your security group risky, please use with caution).



#### Recommended Security Group Policy (Inbound Rules):

| **Source Address**         | **Protocol** | **Port** | **Action** | **Description**                                   |
| ------------------ | -------- | -------- | ---------- | ------------------------------------------ |
| 0.0.0.0/0 | tcp | 80 | Accept | Allow inbound HTTP access to the web server from anywhere |
| 0.0.0.0/0 | tcp | 443 | Accept | Allow inbound HTTPS access to the web server from anywhere |
| Your EIP Address Range | tcp | 22 | Accept | Linux Machine Allows SSH Remote Login from User Network |
| Your EIP Address Range | tcp | 3389 | Accept | Windows Machine Allows RDP Remote Login from User Network |

 

Your EIP address can be obtained as follows:

1. Query through IP library

2. If there is a discrepancy in the IP query result, you can configure the source IP range to 0.0.0.0/0 first. Use your current network to access the VMs, and obtain the source IP address through tcpdump on the VM. Then configure the source IP into the security group rule.



### **Scenario 3: Providing public network services using SLB load balancer**

#### **Scenario Description:**

Load balancer is a load balancer service that distributes traffic to multiple VMs. SLB can extend the application's external service capabilities through traffic distribution, improving the availability of applications by eliminating single points of failure.

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

 