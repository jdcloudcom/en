## **NAT Instance Gateway**

### Features

If multiple VMs in one VPC require to access to the Internet at the same time and the EIP resources are insufficient, you can solve this problem by creating a NAT gateway instance. JD Cloud & AI supports self-built NAT instance gateway to realize SNAT.

Use Restrictions: The self-built NAT gateway instance shares quotas with the VM.



### **Overview**

A NAT gateway instance is a gateway instance that translates Private IP addresses and EIP addresses in a VPC. It is a way for cloud resources without EIP access the Internet (but it does not support request from Internet to the VPC). The typical application scenarios of the JD Cloud & AI VPC NAT gateway instance are as follows:

- Large bandwidth, high availability public network access. For the public network access application scenarios where users require to large bandwidth, large EIP quantities, and large deployment services, JD Cloud & AI NAT gateway instance can meet the demands.
- Secure public network access. The NAT gateway instance of JD Cloud & AI VPC provides security IP translation. If the user wants to hide the EIP of the machine in the VPC to avoid exposing its network deployment and wants to access the public network, then the JD Cloud & AI NAT instance gateway can meet such demands.



### **Use of NAT instance gateway and Elastic IP**

#### **Scenario 1: Only use NAT gateway instance**

A VM is not associated with the elastic EIP, and all access to Internet traffic is translated by the NAT gateway instance . In this solution, the traffic from the VM to the Internet is forwarded to the NAT gateway instance through the intranet. Therefore, the VM is not limited by the EIP bandwidth bond with itself, and the network traffic cost is on the NAT gateway instance instead of on this VM.

##### **Scenario 2: Use EIP only**

The VM is only associated to the elastic EIP and does not use the NAT instance A VM only associate with a EIP without accessing to a NAT gateway instance. In this scenario, all Internet access traffic of the VM flows out through the EIP , which is limited by the EIP bandwidth associate with the VM. The related public network costs will base on the VM network charging mode.

**NAT Instance Gateway Configuration Description**

**Purpose**:Multiple VMs on the same VPC access the public network through another VM that acts as a NAT gateway instance to share IP bandwidth.

**Simulation Scenario**:Assume that there is currently a VPC named NAT01 (10.1.0.0/16) and affiliated two subnets: SNAT01 (10.1.1.0/24) and SNAT02 (10.1.2.0/24). There are multiple VMs on SNAT02. The VMs on the subnet SNAT02 can access the Internet through the VM on the subnet SNAT01 as a NAT GW.



**Step 1: Create a VM as a NAT gateway instance in the subnet SNAT01**

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/NAT-Instance-Gateway/step1.png)

Create a VM in SNAT01 and select CentOS-7.2 64-bit NAT Gateway for image

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/NAT-Instance-Gateway/step2.png)



Select VPC to which it belongs as NAT01 and the subnet is SNAT01

Configure the EIP type and bandwidth

Name the VM as SNAT01

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/NAT-Instance-Gateway/step3.png)



After completing the creation , you can see the VMs’ status in the same VPC by subnets on the VM list page



**Step 2: Configure the route table of subnet SNAT02 points to the NAT instance gateway**

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/NAT-Instance-Gateway/step4.png)



View the route table associating to the subnet through subnet SNAT02

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/NAT-Instance-Gateway/step5.png)



Edit the Route Table: - Next Hop Type: VM, next hop machine: SANT01

After the configuration is complete, all VMs on the subnet SNAT02 can access the public network through the subnet SANT01 functions as the NAT instance gateway.

Other subnet routes under the same VPC can be configured similarly.

**Note: If a VM requires to access Internet through the NAT gateway, the subnets in which you have created the VM and the NAT gateway can not be associated with the same route table**