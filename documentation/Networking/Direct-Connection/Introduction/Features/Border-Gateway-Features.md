## **Border Gateway**

### **Basic Concept**

The Border Gateway (BGW) is a gateway used by JD Cloud to host VPC north-south traffic. Its main function is to realize Intranet communication with other external gateways or environments. The border gateway is automatically associated with VPCs of customers in the same Region.

Currently, the Border Gateway is used for Direct Connection Service.

The border gateway only supports communication between the IDC of customer and JD Cloud VPC, and the communication between JD Cloud hosted area and JD Cloud VPC.

VPCs connected to the same border gateway cannot communicate with each other through the border gateway, and Private Virtual Interface/Hosted Private Virtual Interface connected to the same border gateway cannot communicate with each other through the border gateway.
