# Create NAT Gateway
1. Open VPC Console https://cns-console.jdcloud.com/host/vpc/list

2. Click **NAT Gateway** on the navigation bar on left side**

3. Click **Create** on NAT Gateway page**

4. Configure NAT Gateway according to the following information

| Configuration | Description |
| :- | :- |
| Region and Availability Zone |	Select the region of VPC that needs to be configured with the NAT Gateway and select the Availability Zone |
| Specification |	Select NAT Gateway Specification. Specification of NAT Gateway will affect the maximum number of connections and the number of new connections per second of SNAT functionality, but will not affect data throughput. Please refer to [Product Specifications](../../Introduction/Specifications.md) for details |
| Network |	Select the VPC and Subnet that need to be configured with NAT Gateway Note: NAT Gateways and Virtual Machines using NAT Gateways shall not be deployed in the same Subnet |
| NAT Gateway Public IP |	Select NAT Gateway Public Network Bandwidth |
| Basic Information |	Fill in NAT Gateway Name and Description |

5. After confirming that the information is correct, click **Buy Now**

6. After confirming the Order Information, tick **Read the NAT Gateway Service Protocol**, click **Instant Account Setup**

7. Return to NAT Gateway Page to confirm that the newly purchased NAT Gateway is displayed, and its status is in operation
