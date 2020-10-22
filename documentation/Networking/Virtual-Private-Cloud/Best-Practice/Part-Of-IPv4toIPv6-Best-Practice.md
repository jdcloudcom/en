
# **Transfer IPv4 Virtual Private Cloud Business to IPv4/IPv6 Dual Stack Network**

This tutorial will describe how to transfer the existing IPv4 Virtual Private Cloud ("single stack VPC") business to the IPv4/IPv6 dual stack network ("dual stack VPC") to enable the service to be simultaneously accessed by IPv4 and IPv6 users.

 ![dd](../../../../image/Networking/IPv6/IPv6-01.png)
 

## Prerequisites

- First, you should have a JD Cloud & AI account with real-name verification. If you don't have an account currently, please [Register](https://user.jdcloud.com/register?source=jdcloud&ReturnUrl=https%3A%2F%2Fwww.jdcloud.com).
- Deploy environment for the existing IPv4 Virtual Private Cloud.

## Operation Steps

### Step 1. Build IPv4/IPv6 dual stack VPC

  Objective: Create a dual stack VPC that includes a Subnet and a Load Balancer.

  ![dd](../../../../image/Networking/IPv6/IPv6-02.png)

 1. Log in [JD Cloud & AI Official Website](https://www.jdcloud.com/); Click the Console on the top right corner of the page, select **Virtual Private Cloud** and create IPv6 VPC. For detailed operations, please refer to [VPC Configuration](https://docs.jdcloud.com/en/virtual-private-cloud/vpc-configuration). Fill in relevant information. For [IPv6 CIDR] field, select **IPv6 CIDR Provided by JD Cloud & AI**.
 
 2. Select **Subnet** and create two subnets named Subnet 1 that supports IPv6 in the created VPC. For detailed operations, please refer to [Subnet Configuration](https://docs.jdcloud.com/en/virtual-private-cloud/subnet-configuration). For [Virtual Private Cloud] field, select the VPC of IPv6 type and check **IPv6 CIDR** (if this box isn't checked, it will create an IPv4 single stack Subnet) to designate the range of IPv6 CIDR.

 3. In the Subnet created in Step 2, create the IPv6 Load Balancer whose type is same as that in the existing IPv4 Virtual Private Cloud. This instance is an Application Load Balancer one. In network configuration, select the IPv6 Virtual Private Cloud and Subnet created in the above step, check **Auto-assign IPv6 Address**, and click **Buy Now** to make the payment and create the dual stack VPC.


### Step 2. Connect single VPC and dual stack VPC via VPC peering

 Objective: Connect single VPC and dual stack VPC via VPC peering to enable two VPCs to communicate with each other through private IP address.

 ![dd](../../../../image/Networking/IPv6/IPv6-03.png)


 1. Take one of the above two VPCs as the VPC at home terminal, the other VPC ID as the VPC at opposite terminal to create VPC peer-to-peer connection. For detailed operations, please refer to [Create VPC Peer-to-peer Connection](https://docs.jdcloud.com/en/virtual-private-cloud/vpc-peering-configuration).

 2. Configure the route policies for single stack VPC and dual stack VPC respectively. Select **VPC Peer-to-peer Connection** for the type of Next Hop. In Next Hop, select the VPC peer-to-peer connection created in Step 1 respectively.

 3. After configuring the Route Table, associate the Route Table with the Subnet to be interconnected, and then create, configure and associate the Route Table in the opposite-terminal Virtual Private Cloud by the same steps. The connection is established through private IP after the VPCs at both terminals are configured.


### Step 3. Configure Load Balancer

 Objective: Attach the VM in single stack VPC to the Load Balancer in dual stack VPC.

 ![dd](../../../../image/Networking/IPv6/IPv6-04.png)

 1. Log in the Load Balancer Details in the created dual stack VPC, select **Configure Virtual Server Group** first and click **Create Virtual Server Group**; select **IP** for one of the types and click **Register IP**; enter the VM private IP address supporting IPv6 address in the single stack VPC, and then access the Next after creating the Virtual Server Group.

 2. Configure Listener. Select **Listening Protocol and Port** (in case of HTTPS/TLS protocol, select the existing certificate or the new certificate), and then click **Next** to access Backend Forward Configuration to configure the content; click **Next** to access Health Check to configure the content; click **Next** to access Add Server Group; select **Virtual Server Group/IP Type** and select the server group of the related IP type.

 3. Log in the backend service to confirm the health check status in the created backend service. If it is normal, proceed to test; if it has been abnormal, please check if the VM service is enabled.

 4. Access the Load Balancer IPv6 address in the dual stack VPC. If the service can be accessed, it means the VM is attached.

 5. Associate the Load Balancer EIP in the single stack VPC with the Load Balancer in the dual stack VPC.
   ![dd](../../../../image/Networking/IPv6/IPv6-06.png)


After the above steps, the single stack business is transferred to the dual stack VPC. The Load Balancer resources in IPv4 Virtual Private Cloud can be released to avoid unnecessary costs.
