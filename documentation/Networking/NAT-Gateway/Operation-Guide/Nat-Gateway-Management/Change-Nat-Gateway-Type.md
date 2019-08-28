# NAT Gateway Specification Change
1. Open VPC Console https://cns-console.jdcloud.com/host/vpc/list

2. Click **NAT Gateway** on the navigation bar on left side**

3. Tick the NAT Gateway to be resized on NAT Gateway page, if the status is in operation, click **Stop** in the operation column, refresh the page to confirm that the NAT Gateway status is changed into "Stop"

4. Tick the NAT Gateway with specification to be adjusted, click **Specification Change** in the operation column, and resize according to the following information

| Configuration | Description 
| :- | :- |
| Specification |	Select NAT Gateway Specification. Specification of NAT Gateway will affect the maximum number of connections and the number of new connections per second of SNAT functionality, but will not affect data throughput. Please refer to [Product Specifications](../../Introduction/Specifications.md) for details |
| Bandwidth Cap | Select the bandwidth size to be changed in the range of 1-1000Mbps If it is required to change the bandwidth above 1000Mbps, please apply for by **Opening Ticket** |

5. After the specification change is completed, click **Confirm** to generate the order

6. After confirming the Order Information, tick **Read the NAT Gateway Service Protocol**, click **Instant Account Setup**
