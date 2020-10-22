# Build IPv4/IPv6 Dual Stack Virtual Private Cloud

### Brief Introduction

  JD Cloud & AI Virtual Private Cloud now can be created a Virtual Private Cloud simultaneously supporting ipv4 and ipv6 addresses (IPv6 is currently under beta. If you need to use it, please open ticket to apply for beta). The addresses of these two types can be accessed through private network/public network. We will describe how to create the IPv4/IPv6 Virtual Private Cloud below.

### Application Scenarios

- Scenarios where a dual stack network or IPv6 Virtual Private Cloud is required in order to offer services.

### Prerequisites

  First, you should have a JD Cloud & AI account with real-name verification. If you don't have an account currently, please [Register](https://user.jdcloud.com/register?source=jdcloud&ReturnUrl=https%3A%2F%2Fwww.jdcloud.com).

### Operation Steps

  This tutorial will describe how to deploy Virtual Private Cloud simultaneously supporting IPv6 and IPv4 VMs in JD Cloud & AI. First, you need to create the Virtual Private Cloud or Subnet supporting IPv6 before you create VM.

Note: The resources, such as Virtual Private Cloud, Subnet, Route Table, Network ACL, Security Group, shall be created in the same region

  **Step 1: ** Log in JD Cloud & AI Console, select **Virtual Private Cloud** to create the Virtual Private Cloud supporting IPv6. For detailed operations, please refer to [Configure Dual Stack VPC](https://docs.jdcloud.com/en/virtual-private-cloud/vpc-configuration);

  **Step 2: ** Create a Route Table under the Virtual Private Cloud created in Step 1, and configure the route policies in Route Table Details based on the demand (or you may configure it later according to the business). For detailed operations, please refer to [Route Table Configuration](https://docs.jdcloud.com/en/virtual-private-cloud/route-table-configuration);

  **Step 3: ** Create a Subnet supporting IPv6 under the Virtual Private Cloud created in Step 1, and select the Route Table created in Step 2. For detailed operations, please refer to [Subnet Configuration](https://docs.jdcloud.com/en/virtual-private-cloud/subnet-configuration);

  **Step 4: ** (Optional) This may be created according to the business demand. Create a Network ACL under the Virtual Private Cloud created in Step 1, associate it with the Subnet created in Step 3 and configure the ACL inbound and outbound rules. For detailed operations, please refer to [Network ACL Configuration](https://docs.jdcloud.com/en/virtual-private-cloud/network-acl-configuration);

  **Step 5: ** Create a Security Group under  the Virtual Private Cloud created in Step 1, and configure the Security Group inbound and outbound rules. The specific rules may be modified according to the business demand in future. For detailed operations, please refer to [Security Group Configuration](https://docs.jdcloud.com/en/virtual-private-cloud/security-group-configuration);

  **Step 6: ** Create an IPv6 VM under the Subnet created in Step 2, set the VM login password, and associate it with the Security Group created in Step 5. For detailed operations, please refer to [Create VM](https://docs.jdcloud.com/en/virtual-machines/create-instance);

  After the above steps, the IPv6 Virtual Private Cloud is built. Next, you need to test the network connectivity.


### Test Network Connectivity

  The xshell software is used for the test. Log in IPv6 VM and ping an IPv6 service to conduct the test.

  **Step 1: ** Log in IPv6 VM via xshell; open xshell to create a new session, and then enter the Host name; enter the VM IPv6 address for VM field;

  **Step 2: ** Enter the user name and password to log in the VM and proceed to the test;

  **Step 3: ** Enter ping -6 [Other ipv6 address]. If the result shown in the following figure appears, connectivity succeeded.

![image-20200908203808838](../../../../image/Networking/IPv6/IPv6-05.png))

