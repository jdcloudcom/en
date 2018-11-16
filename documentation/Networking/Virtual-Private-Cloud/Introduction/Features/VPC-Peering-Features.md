## **VPC Peering Connection**

### **Basic Concept**

VPC peering connection is a cross-VPC network interconnection service which enables the VPC IP to route traffic between peering VPCs as if they belong to the same network. You can realize the interconnection of the VPC among the same or different users in the same area. Traffic intercommunication of different VPCs can be realized by configuring the route policy on both ends. Peering connection do not rely on a single piece of hardware, hence there is no single point of failure or bandwidth bottleneck.



### ** Peering connection’s interoperability is not delivered**

Peering connection enables the VPCs to create interconnection between two of them, however this kind of interconnection relationships will not be delivered. For example, if VPC 1 creates the peering connection with VPC 2 and VPC 1 also creates the peering connection with VPC 3, however, on account of that peering connection cannot be delivered, the traffic of VPC 2 and VPC 3 cannot be interconnected.



### ** Status Interpretation**

- Initialization: Unilateral VPC creates VPC peering connection and the VPC on opposite side does not create VPC peering connection.
- Connected: VPCs on both sides have created VPC peering connections.
- Disconnected: One side deletes the VPC peer connection and the status on the other side is set to disconnected.



### **Billing Mode**

Co-located Peer Connection: Free of charge.



### **Usage Restrictions**

With regards to peering connections, you require to pay attention to the following points:

- If you want to enable the real communication between the two ends of the peering connection, you must ensure that the relevant route rules are configured on the related route table of the local end and the opposite end.
- Currently, it only supports the VPC peering connection between the VPCs in the same region.
- VPC CIDR on both ends of the peering connection cannot overlap. If overlap is created, errors will be reported.
- Any Party of the peering connection can interrupt the peering connection at any time. The traffic between the two VPCs will be interrupted immediately after the interruption.
- There is no bandwidth upper limit for peering connection in the same region.



 