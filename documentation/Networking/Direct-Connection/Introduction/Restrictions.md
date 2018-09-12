# Usage Restrictions

#### Related Restrictions for Direct Connection

- For Direct Connection requirements for Device of the client side, see Product Overview.
- The Direct Connection Service only supports border gateways that are connected to the same region, that is, the physical connection and the border gateway belong to the same area.
- Before using the Direct Connection, you should plan the network segments in the IDC and the VPC to ensure that the network segments in the IDC and the network segments in the VPC do not overlap!



#### Related Restrictions on Hosted Connect

- For Hosted Connect requirements for Device of the client side, see Product Overview.
- The Hosted Connect Service only supports border gateways that are connected to the same Region, that is, the Hosted Connection and the border gateway belong to the same Region.
- Before using the Hosted Connect, you should plan the network segment in the JD Cloud hosted area and the VPC to ensure that the network segment in the JD Cloud hosted area and the network segment in the VPC will not overlap!



#### Related Resource Quota for Virtual Private Cloud

| Resources	| Limits	| Requests for Exceptions	|
| :-: | :-: | :-: |
|Physical Connection in the Same Region + Number of Hosted Connection	|10	| Tickets	|
|Number of Private Virtual Interface Created on Each Physical Connection	|50	| Tickets	|
|Number of Hosted Private Virtual Interface Created on Each Hosted Connection	|50	| Tickets	|
|Number of Border Gateway in the Same Region	|1	| Ticket	|
|Number of Routing Rules for the Same Border Gateway	|50	| Tickets	|

