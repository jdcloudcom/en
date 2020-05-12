# Usage Restrictions

#### JD Cloud & AI’s requirements on client VPN devices
* Completed enterprise real-name verification in JD Cloud;
* The client side’s initiator of the direct connection needs to be a three-layer interchanger or router device;
* Support BGP protocol, BPG-4 is recommended;
* Support VLAN or 802.1q protocols;
* Support three-layer sub-interface configuration (optional);

#### Related Restrictions for Direct Connection

- For Direct Connection requirements for Device of the client side, see Product Overview.
- The Direct Connection Service only supports border gateways that are connected to the same region, that is, the physical connection and the border gateway belong to the same area.
- Before using the Direct Connect, you should plan the network segments in IDC and the VPC to ensure that the network segments in IDC and the network segments the VPC are overlapped;
- The type of physical port is: 1000MBase-T, 1000MBase-LX(1310nm 10km), 10GBase-LR(1310nm 10km), 100GBase-LR4(1310nm 10km). JD Cloud will provide a single-mode optical module necessary for cloud when customers access the 1000M and 10G optical ports for the first time. When accessing 100G optical ports, customers need to provide a QSFP28 100G single-mode optical module necessary for cloud;
- Resize. Resize can only be adjusted between 1G and 10G. If you want to change it to other port type, please apply for accessing a new physical connection. When applying for changing port configuration, customers need to provide a single-mode optical module necessary for cloud;

#### Related Restrictions on Hosted Connect

- For Hosted Connect requirements for Device of the client side, see Product Overview.
- The Hosted Connect Service only supports border gateways that are connected to the same Region, that is, the Hosted Connection and the border gateway belong to the same Region.
- Before using the Hosted Connect, you shall plan the network segment in the JD Cloud & AI Cabinet Service and the VPC to try to ensure that the network segment in the JD Cloud & AI Cabinet Service and the network segment in the VPC will not overlap!
- The type of physical port is: 1000MBase-LX(1310nm), 10GBase-LR(1310nm). JD Cloud will provide a single-mode optical module necessary for cloud when customers access the 1000M and 10G optical ports for the first time;
- Resize. Resize can only be adjusted between 1G and 10G. If you want to change it to other port type, please apply for accessing a new hosted connection. When applying for changing port configuration, customers need to provide a single-mode optical module necessary for cloud;

#### Related Resource Quota for Border Gateway

| Resources | Limits | Requests for Exceptions |
|:---:|:---:|:---:|
|Physical Connection in the Same Region + Number of Hosted Connection	|10	| Tickets	|
|Number of Private Virtual Interface Created on Each Physical Connection	|50	| Tickets	|
|Number of Hosted Private Virtual Interface Created on Each Hosted Connection	|50	| Tickets	|
|Number of Border Gateway in the Same Region	|5	| Ticket	|
|Number of VPC Attachments creatable for each Border Gateway 	|50	| Tickets	|
|Number of static route rules for the same Border Gateway 	|50	| Tickets	|
|Number of dynamic route rules for the same Border Gateway 	|300	| Tickets	|
