## Border Gateway Route Configuration
After configuration of Physical Connection/Hosted Connection on cloud is completed, corresponding routes including Border Gateway Route Table route and VPC Route Table route shall be configured.

```
  After you declare client segment on client routing devices, Border Gateway establishing BGP session with it will automatically learn client route into dynamic route table on Border Gateway by virtue of BGP Protocol, and you do not need to add the client route manually into static route table on Border Gateway. Meanwhile, Border Gateway automatically declares the routes in its valid route table to routing devices on client.

  The function of the border gateway supporting running BGP routing protocol is currently only released in Guangzhou and Shanghai.
```

The following steps are descriptions for configuration of static route on Border Gateway ("based on the consideration of business high availability, you are recommended to use BGP route").

### Operation Steps
##### 1. Create VPC Attachment
For creation of VPC Attachment and setting of VPC transmission segment, refer to [VPC Attachment Management](../../Operation-Guide/Border-Gateway-Management/VPC-Attachment-Configuration.md).

##### (Selectable) 2. Border Gateway route table adds route to VPC
If VPC Attachment is created with no VPC segment being assigned for transmission, routes to VPC can be manually added.
a) Log in [JD Cloud & AI Border Gateway Console](https://cns-console.jdcloud.com/host/borderGateway/list);  </br>
b) Click corresponding border gateway and enter border gateway details;</br>
c) The "Route Table" Tab will display effective, static and dynamic route tables on current Border Gateway, click **Edit** on "Static Route Table" and select **Add One**. Target End is targeted VPC Intranet segment (for example: 192.168.0.0/24). Type of Next Hop is VPC Attachment and Next Hop is VPC Attachment created with VPC. Remarks can be added to the route. For more content of Border Gateway Route Going Into Effect, refer to [Border Gateway Route Management](https://docs.jdcloud.com/en/direct-connection/border-gateway-features);

```
  Valid route table stores all valid route clauses in Border Gateway.
  Static route table stores all route clauses added manually in Border Gateway.
  Dynamic route table stores all route clauses learned through BGP dynamic route and route transmission in Border Gateway.
```

##### 3. Border Gateway route table adds route to client
a) Log in [JD Cloud & AI Border Gateway Console](https://cns-console.jdcloud.com/host/borderGateway/list);  </br>
b) Click corresponding border gateway and enter border gateway details;</br>
c) In "Route Table" Tab, click **Edit** on "Static Route Table" and select **Add One**. Target End is targeted client segment (for example: 10.0.0.0/16). Type of Next Hop is Private Virtual Interface/Hosted Private Virtual Interface, and Next Hop is Private Virtual Interface/Hosted Private Virtual Interface created with the client. Remarks can be added to the route;

```
  Only available/unavailable Private Virtual Interfaces/Hosted Private Virtual Interfaces will be listed when adding a route for Next Hop.
```
