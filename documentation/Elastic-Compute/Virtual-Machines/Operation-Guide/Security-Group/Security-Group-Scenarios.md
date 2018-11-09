# Customer Scenario

## Scenario 1: Intranets access between instances

### Scenario Description
Instances in the same VPC and region can access mutually in intranet by set security group rules.
### Configuration Suggestions
Whether the instances in the same VPC and region can be mutually accessed depends on the rule configuration of the security group. Even if two instances join the same security group, without corresponding permission rules, mutual access cannot be realized.

Whether two instances belong to the same security group, you need to configure two inbound rules with the type of ALL Traffic, and private IP of the two instances as the source IP.

## Scenario 2: Provision of public network services by an instance

### Scenario Description
An instance associated to EIP can provide public network access services, actively access to the public network and allow administrators to remotely manage the VM. In this case, you can set security group rules to ensure that only specific IP addresses and ports can communicate with the instance.
### Configuration Suggestions
* If the instance needs to provide Web services, you need to allow port 80/443 used by https/https protocol.
* For ports that are required for instance management, such as ports 22 and 3389, we recommend that you only allow access to the IP where instance management is required.
* If the range of EIP address for your instance management is fixed: In the security group settings, only your IP address can access ports 22 and 3389 of the security group.
* If the range of EIP address for your instance management is not fixed: Access of addresses within specified IP network segment to the instance is allowed. The range of the specific IP segment is confirmed according to the your network situation. To set instance management as available for all addresses, enter 0.0.0.0/0 (setting the management as available for all addresses will increase the risk of your security group, please use with caution)

|  **Protocol Type**   |  **Destination Port**   |  **Source IP**   |  **Policy**   |  **Description**   |
| --- | --- | --- | --- | --- |
| HTTP    |  80   |  0.0.0.0/0   |  Accept   | Allow inbound HTTP access to Web server from anywhere    |
| HTTPS    |  443   |  0.0.0.0/0   |   Accept  |  Allow inbound HTTPS access to Web server from anywhere   |
|  SSH      | 22    |  Range of Your EIP Address   |  Accept   |Linux instance allows SSH remote login from user network|
|  Customize TCP   | 3389    |   Range of Your EIP Address  |   Accept  | Windows instance allows RDP remote login from user network    |

Your EIP address can be obtained in following ways:
1. Query through the IP address database.
2. If there is a deviation in the IP address queried by IP, you can configure the source IP range as 0.0.0.0/0 first. Use your current network access instance, obtain the source IP address through tcpdump on the instance, and then configure the source IP into the security group rule.

## Scenario 3: Load Balancer is used to provide public network services
### Scenario Description
Load balancer is a load balancing service that distributes traffic to multiple instances. It extends the external service capability of the application system through traffic distribution and improves the availability of the application system by eliminating single-point fault.
An instance with no EIP address can receive access from the public network through public network Load Balancer, but cannot initiate access to the public network.
### Configuration Suggestions
* Security group 1 provides Web services for the Internet and only opens port https/https to the Internet.
* Security group 2 provides application services for security group 1, and opens application service ports to security group 1.

Security Group 1:

|  **Protocol Type**   |  **Destination Port**   |  **Source IP**   |  **Policy**   |  **Description**   |
| :--- | :--- | :--- | :--- | :--- |
| HTTP    |  80   |  0.0.0.0/0   |  Accept   | Allow inbound HTTP access to Web server from anywhere    |
| HTTPS    |  443   |  0.0.0.0/0   |   Accept  |  Allow inbound HTTPS access to Web server from anywhere   |
|  SSH      | 22    |  Operation and Maintenance IP Address or Network Segment   |  Accept   |Linux instance allows inbound SSH access from O&M security group|
|  Customize TCP   | 3389    |   Operation and Maintenance IP Address or Network Segment |   Accept  | Windows instance allows RDP remote login from user network    |
|  ALL Traffic   | 1-65535   |   Network Segment of Load Balancer System |   Accept  | Allow SLB system to access security group 1    |

Security Group 2:

|  **Protocol Type**   |  **Destination Port**   |  **Source IP**   |  **Policy**   |  **Description**   |
| :--- | :--- | :--- | :--- | :--- |
| Customize TCP    |  8080   |  IP address or network segment of instances in security group 1  |  Accept   | Allow security group 1 to access the application service port of security group 2    |
|  SSH      | 22    |  Operation and Maintenance IP Address or Network Segment   |  Accept   |Linux instance allows inbound SSH access from O&M security group|
|  Customize TCP   | 3389    |   Operation and Maintenance IP Address or Network Segment |   Accept  | Windows instance allows RDP remote login from user network    |
|  ALL Traffic   | 1-65535   |   Network Segment of Load Balancer System |   Accept  | Allow SLB system to access security group 2|