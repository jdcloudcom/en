## **Basic Architecture**

#### **Summary**

Overall architecture diagram of Direct Connection is as follows:

 ![](/image/Networking/Direct-Connect-Service/Infrastructure.png)



#### **Components of Direct Connection**

Direct Connection

- Physical Connection: the physical links for the connection between JD Cloud machine room and customer IDC machine room.
- Private Virtual Interface: a logical link for the connection between border gateway and physical connection.



Hosted Connect

- Hosted Connection: a physical link for the connection between JD Cloud machine room and devices of customer JD Cloud hosted area.
- Hosted Private Virtual Interface: a logical link for the connection between border gateway and hosted connection.



Border Gateway (BGW): gate way to carry the communication between VPC and external device and the current hosted function is Direct Connection. Border gateway will automatically relate to all VPC of the user in the same region.



#### **High-availability Architecture**

High-availability architecture designs are used/ supported for all components of the Direct Connection Service, in which:

- For physical connection/ hosted connection, it is recommended that the customer accesses more than two physical links in the same region to guarantee the high-availability of the physical links.
- When the customer creates a border gateway, the border gateway of active-active mode will be created by default.
- When the customer creates an interface, the private virtual interface/ hosted private virtual interface of active-active mode will be created by default.