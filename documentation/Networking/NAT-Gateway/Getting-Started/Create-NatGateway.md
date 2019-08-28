# Virtual Machines Use NAT Gateway

Create a Test Environment that includes a VPC, two Subnets, a VM, and a NAT Gateway to verify the Internet connectivity of the NAT Gateway

## Create VPC, Subnet and VM

1. Create a test VPC (test-vpc), create two test subnets (subnet1, subnet2) in test-vpc, please refer to [VPC Configuration](../../Virtual-Private-Cloud/Operation-Guide/VPC-Configuration.md) and [Subnet Configuration](../../Virtual-Private-Cloud/Operation-Guide/Subnet-Configuration.md) for detailed steps

2. Create a test VM (test-vm) without Public IP in test subnet subnet1, please refer to [Create Instance](../../../Elastic-Compute/Virtual-Machines/Operation-Guide/Instance/Create-Instance.md) for detailed steps

3. Create two routes (rt1, rt2), rt1 is associated with subset subnet1, rt2 is associated with subset subnet2, please refer to [Route Table Configuration](../../Virtual-Private-Cloud/Operation-Guide/Route-Table-Configuration.md) for detailed steps

## Create NAT Gateway

1. Open VPC Console https://cns-console.jdcloud.com/host/vpc/list

2. Click **NAT Gateway** on the navigation bar on left side**

3. Click **Create** on NAT Gateway page**

4. Configure NAT Gateway according to the following information

| Configuration | Description |
| :- | :- |
| Region and Availability Zone |	Select the region of VPC that needs to be configured with the NAT Gateway and select the Availability Zone |
| Specification |	Select NAT Gateway Specification. Specification of NAT Gateway will affect the maximum number of connections and the number of new connections per second of SNAT functionality, but will not affect data throughput. Please refer to [Product Specifications](../Introduction/Specifications.md) for details |
| Network |	Select the VPC and Subnet that need to be configured with NAT Gateway Note: NAT Gateways and Virtual Machines using NAT Gateways shall not be deployed in the same Subnet |
| NAT Gateway Public IP |	Select NAT Gateway Public Network Bandwidth |
| Basic Information |	Fill in NAT Gateway Name and Description |

5. After confirming that the information is correct, click **Buy Now**

6. After confirming the Order Information, tick **Read the NAT Gateway Service Protocol**, click **Instant Account Setup**

7. Return to NAT Gateway Page to confirm that the newly purchased NAT Gateway is displayed, and its status is in operation

## Configure Route Table

1. Open VPC Console https://cns-console.jdcloud.com/host/vpc/list

2. Click **Route Table** on the navigation bar on left side**

3. Select the Route Table associated with the Subnet where NAT Gateway resides to enter Route Table Details

4. Select **Route Policy**, click **Edit**, add a route, the destination is **0.0.0.0/0**  The next hop type is **Internet**, click **Save**  after confirmation

5. Select the Route Table associated with the Subnet of the Virtual Machines that require use of the NAT Gateway to enter Route Table Details

6. Select **Route Policy**, click **Edit**, add a route, the destination is **0.0.0.0/0**  The next hop type is **NAT Gateway**, click **Save** after confirmation**

## Verify NAT Gateway Internet Connectivity

1. Confirm that a Virtual Machine without associated Public IP has been created in the Subnet of Virtual Machines

2. Open VPC Console https://cns-console.jdcloud.com/host/compute/list

3. Click **Instance** on the navigation bar on left side**

4. Select the Virtual Machines to be tested, click **Remote Connection** in the right operation column, and log in the Virtual Machines

5. Run "ping www.jd.com" from the command line and confirm that ping works
