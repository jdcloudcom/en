# Delete NAT Gateway
1. Open VPC Console https://cns-console.jdcloud.com/host/vpc/list

2. Click **NAT Gateway** on the navigation bar on left side**

3. Tick the NAT Gateway with specification to be deleted on NAT Gateway page, if the status is in operation, click **Stop** in the operation column**

4. Refresh the page to confirm that the status of NAT Gateway to be deleted is changed into "Stop"**

Note: After deleting NAT Gateway, Public IP associated with the Gateway will also be deleted.

In Route Table, the next hop of route table item pointing to the deleted NAT Gateway will be blank, the route table item will fail as shown in the following diagram.
![路由表](../../../../../image/Networking/Nat-Gateway/nat-4.png)
