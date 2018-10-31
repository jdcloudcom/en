## **Billing Rules**

The cost of Direct Connection and Hosted Connect of Direct Connection Service consists of two parts: physical link access fees and channel fees.

`` Note: If you choose to apply for Direct Connection through JD Cloud's Direct Connection partner, JD Cloud only charges the channel fee, and the physical link access fee is charged by the partner. ``



### For details on how to use the product, please refer to: Operation Guide - Direct Connection, Hosted Connect.



The specific charging standards are as follows.

### **Physical Link Access Fees**

- The Physical Connection in the Direct Connection, self-service access mode. Each time a customer accesses a dedicated line, JD Cloud charges a one-time access fee of RMB 15,000. The line laying fee is charged by the operator, and the customer needs to contact the operator for price consultation.
- The Physical Connection in the Direct Connection, the partner access mode. When the customer access to the dedicated line, JD Cloud does not charge any fees, the line laying fee is charged by the partner, and the customer needs to contact the partner for price consultation.
- The Hosted Connection in the Hosted Connect. Each time a connection is connected, JD Cloud charges a one-time access fee of RMB 15,000. JD Cloud is responsible for completing the line laying from the hosted area to the public cloud.



### **Channel Fees**

The channel is between the access region of the physical link and the location of the VPC network that needs to be accessed. If they fall into two regions, cross-region connection costs may be generated. The channel includes the Private Virtual Interface and the Hosted Private Virtual Interface:

- - When the physical link access Region is the same as the Region of the VPC network that needs to be accessed, the channel fee will not be charged;
  - When the physical link access Region is different from the Region of the VPC network that needs to be accessed, customers need to use the Cross-region transmission resources of JD Cloud while accessing the services in the VPC through the dedicated line. Therefore, JD Cloud will charge a certain fee. JD Cloud does not provide customers with a dedicated line to access Cross-region VPCs.



### **Billing Examples**

Customer Scenario: The customer IDC is located in Beijing, and the IDC operator is Unicom. It needs to connect to the cn-north-1 Region of JD Cloud through Direct Connection and access the VPC within the Region.

Related Costs:

- - The customer chooses the self-service access mode. The customer contacts the operator to request access to the access point of JD Cloud through Direct connect. The operator checks the access points of JD Cloud and provides the quotation to the customer. In this process, JD Cloud cooperates with the operator to carry out resource verification. After the customer confirms the access, JD Cloud collects the one-time access fee and completes the access.
  - The customer chooses the access complete by the partner. The customer contact JD Cloud's Direct connect partner to access JD Cloud through Direct connect. Since the partner's access point has been connected to the access point of JD Cloud in advance, the customer only needs to access to the partner's nearest access point. The partner checks its available access points for the customer and provides the quotation to the customer. JD Cloud will not charge any fees during the access process.



### **Payment and Settlement Modes**

At present, JD Cloud Direct Connection Service only provides offline payment. If customers need to use the Direct Connection Service, please contact your business manager.