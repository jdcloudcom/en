# Usage Restrictions

#### Related Restrictions for Direct Connection

- For Direct Connection requirements for Device of the client side, see Product Overview.
- The Direct Connection Service only supports border gateways that are connected to the same region, that is, the physical connection and the border gateway belong to the same area.
- Before using the Direct Connect, you should plan the network segments in IDC and the VPC to ensure that the network segments in IDC and the network segments the VPC are overlapped;

#### Related Restrictions on Hosted Connect

- For Hosted Connect requirements for Device of the client side, see Product Overview.
- The Hosted Connect Service only supports border gateways that are connected to the same Region, that is, the Hosted Connection and the border gateway belong to the same Region.
- Before using the Hosted Connect, you shall plan the network segment in the JD Cloud & AI Cabinet Service and the VPC to try to ensure that the network segment in the JD Cloud & AI Cabinet Service and the network segment in the VPC will not overlap!

#### Related Resource Quota for Border Gateway

| Resources | Limits | Requests for Exceptions |
|:---:|:---:|:---:|
|Physical Connection in the Same Region + Number of Hosted Connection	|10	| Tickets	|
|Number of Private Virtual Interface Created on Each Physical Connection	|50	| Tickets	|
|Number of Hosted Private Virtual Interface Created on Each Hosted Connection	|50	| Tickets	|
|Number of Border Gateway in the Same Region	|1	| Ticket	|
|Number of VPC Attachments creatable for each Border Gateway 	|50	| Tickets	|
|Number of static route rules for the same Border Gateway 	|50	| Tickets	|
|Number of dynamic route rules for the same Border Gateway 	|300	| Tickets	|
