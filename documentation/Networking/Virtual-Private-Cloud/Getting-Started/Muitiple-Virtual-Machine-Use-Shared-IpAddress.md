# **Multi-machine shared EIP**

Application Scenario: Multiple machines under the same VPC access the public network through a machine that acts as a NAT gateway to share IP bandwidth. Assume that there is currently a VPC named NAT01 (10.1.0.0/16) and affiliated two subnets: SNAT01 (10.1.1.0/24) and SNAT02 (10.1.2.0/24). There are multiple machines under SNAT02. Multiple machines under the subnet SNAT02 can access the Internet as the machine of the NAT GW through the subnet SNAT01.

**Step 1: Create a machine as a NAT gateway under the SNAT01 subnet**

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Muitiple-Virtual-Machine-Use-Shared-IpAddress/Step1-1.png)



Create a machine under SNAT01 and select CentOS-7.2 64-bit NAT Gateway for image

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Muitiple-Virtual-Machine-Use-Shared-IpAddress/Step1-2.png)



Select VPC to which it belongs as NAT01 and the subnet is SNAT01

Configure the EIP type and bandwidth

The machine is named as SNAT01

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Muitiple-Virtual-Machine-Use-Shared-IpAddress/Step1-3.png)



After the creation is complete, you can see the machine status of different subnets under the same VPC on the machine list page



**Step 2: Route table to configure subnet SNAT02 point to the NAT gateway**

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Muitiple-Virtual-Machine-Use-Shared-IpAddress/Step2-1.png)



View the route table associating to the subnet through subnet SNAT02

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Muitiple-Virtual-Machine-Use-Shared-IpAddress/Step2-2.png)



Edit the Route Table: - Next Hop Type: VM, next hop machine: SANT01

After the configuration is complete, all machines on the subnet SNAT02 can access the public network through SANT01 as the NAT gateway.

Similarly, other subnet routes under the same VPC can be configured.

**Note: If the machine requires to communicate through the NAT gateway, you cannot select a machine in the subnet that is associated to the same route table as the subnet where the machine resides as the NAT gateway.**