## **VPC Attachment**

### **Basic Concepts**

VPC Attachment, is the service provided by JD Cloud, which is used to Get through the connection between JD Public Cloud VPC and Border Gateway, and realize the interconnection of single or multiple VPCs of JD Cloud and your IDC own network at the Intranet level, or your convenient connection among multiple VPCs in the same region on JD Cloud to provide users with rich and flexible connectivity solutions between the Hybrid Cloud and Isolation Network.

### **Features**

- Connect VPC and Border Gateway: Get through the connection between JD Public Cloud VPC and Border Gateway, and use the transfer capability of Border Gateway to realize high-speed interconnection among one VPC and multiple VPCs in the same region or among VPN Channel/Private Virtual Interface/Hosted Private Virtual Interface.

- Connection method of VPC and Border Gateway: Now, VPC Attachment supports interconnection between VPC and Border Gateway in the same region. One VPC Attachment can be created for the same VPC and the same Border Gateway. The same VPC can create different VPC Attachments with multiple different Border Gateways, one Border Gateway support the creation of different VPC Attachments with multiple different VPCs.

- Route Transmission Feature: Dynamic transmission with two-way routing can be realized between VPC Route Table and Border Gateway Route Table by VPC Attachment.

  Border Gateway->Route Transmission on the Direction of VPC: When VPC Route Table configures the route transmission, fill in the Source Border Gateway and route transmission scope for route transmission, the system will automatically add the routing rules that conform to the transmission range in the valid route table of the Border Gateway to the VPC Route Table, and the Next Hop points to the relevant Border Gateway;

  VPC->Route Transmission on the Direction of Border Gateway: When creating VPC Attachment based on BGW, if "VPC All Segment" or "Specify Subnet Segment is selected in transmission of VPC segment, which is the routing automatic transmission method. The Border Gateway Transmission Route Table will automatically add or delete route table items that reach the relevant subnet based on the configured subnet scope, the route prefix is the subnet segment, and the Next Hop is the VPC Attachment connecting the specified VPC and the Border Gateway.

- Static Route Configuration: VPC and Border Gateway can realize the interconnection of VPC and Border Gateway through configuration of static route.

- High Network Performance: The performance of single VPC Attachment can be up to 10Gbps.






