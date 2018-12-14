# **Multi-machine shared EIP**

Application Scenario: Multiple VMs in the same VPC access the public network through a VM that acts as a NAT gateway and share the IP bandwidth. Assume that there is currently a VPC named NAT01 (10.1.0.0/16) and affiliated two subnets: SNAT01 (10.1.1.0/24) and SNAT02 (10.1.2.0/24). There are multiple VMs in SNAT02. Multiple machines in the subnet SNAT02 can access the Internet through a VM as the NAT gateway in the subnet SNAT01.

**Step 1: Create a VM as a NAT gateway in the SNAT01 subnet**

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Muitiple-Virtual-Machine-Use-Shared-IpAddress/Step1-1.png)



Create a VM in SNAT01 and select **CentOS-7.2 64-bit NAT Gateway** for image
![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Muitiple-Virtual-Machine-Use-Shared-IpAddress/Step1-2.png)



Select NAT01 for VPC and SNAT01 for subnet.

Configure the EIP type and bandwidth

names the VM as SNAT01.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Muitiple-Virtual-Machine-Use-Shared-IpAddress/Step1-3.png)



After the creation is complete, you can see the VMs’ status on the machine list page in different subnets under the same VPC 



**Step 2: configure Route table associated with subnet SNAT02 point to the NAT gateway**

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Muitiple-Virtual-Machine-Use-Shared-IpAddress/Step2-1.png)



View the route table associating with the subnet SNAT02

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Muitiple-Virtual-Machine-Use-Shared-IpAddress/Step2-2.png)



Edit the Route Table: - Next Hop Type: VM, next hop machine: SANT01

After completing the configuration, all VMs on the subnet SNAT02 can access the public network through SANT01 as the NAT gateway.

Other subnets’ routes can be configured similarly.

**Note: If a VM requires to access Internet through the NAT gateway, two subnets each with an independent route table in the same VPC are needed,client VMs to access Internet through the NAT gateway can be placed in one sunbent, and then the NAT Gateway should be placed in another subnet**