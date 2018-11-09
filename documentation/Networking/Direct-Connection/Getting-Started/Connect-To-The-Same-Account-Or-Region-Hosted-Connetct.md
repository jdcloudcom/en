## **Hosted Connect of the Same Account in the Same Region**

``Before using the Hosted Connect, you should plan the network segment in the JD Cloud hosted area and the VPC to ensure that the network segment in the JD Cloud hosted area and the network segment in the VPC will not overlap! ``



### **If using the physical links to get through the hosted area of JD Cloud and the VPC on JD Cloud, you need to complete the following steps: **

Step 1: Create a hosted connection

Step 2: Create a border gateway

Step 3: Create a hosted private virtual interface

Step 4: Configure the route table in the VPC

Step 5: Configure the route table on the border gateway

Step 6: Configure routers in the JD Cloud hosted area



### **Detailed procedures are as follows: **

#### **Step 1: Create a hosted connection**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select “Direct Connection -> Hosted Connect -> Hosted Connection”.

3. For the configuration of the hosted connection, see console page for details.

4. Click "OK". In the hosted connection list page, the status of the connection is Applying.

Auditors of JD Cloud will review your application. Under normal circumstances, it will be completed within two working days. When passing the hosted connection review, the connection status changes to Pending. At this time, you need to pay for this hosted connection. For details, please refer to the Purchase Notes.

5. Please pay according to the settlement method specified in the direct connection contract signed with JD Cloud.

6. After the hosted connection is successfully paid, the connection status changes to Under Construction. The port number of the access device is automatically allocated to access the physical link. And JD Cloud will automatically complete the laying of the hosted connection without any customer participation.

7. Finally confirm that the hosted connection is created.



#### **Step 2: Create a border gateway**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select “Direct Connection Service -> Direct Connection Service -> Border Gateway”.

3. Create border gateway, and it will automatically connect with the VPC of the account within the same region.



#### **Step 3: Create a hosted private virtual interface**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select “Direct Connection -> Hosted Connect -> Hosted Private Virtual Interface”.

3. For the configuration of the hosted private virtual interface, see console page for details.

Primary configuration items are as follows:

- - Hosted Connect: physical link for VPC and hosted area communication;
  - Border gateway: the BGP endpoint running on the JD Cloud side and the hosted area side to communicate with the VPC privately;
  - vlanId: the identity for users to divide the service channels, and the vlan is used to isolate different services on the same physical link. Each channel has a unique vlanId on the physical link.
  - BGP ASN, Key Pair: information required for the BGP protocol running between the router of the hosted area and JD Cloud router.
  - Router connection address: BGP Peer information required for the BGP protocol running between the router of the hosted area and JD Cloud router.

4. Click "OK". In the list page of hosted private virtual interface, the status of the connection is Configuring.

5. Upon configuration, the hosted private virtual interface is available and can be used.



#### **Step 4: Configure the route table in the VPC**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select “Virtual Private Cloud”, enter the route table related to JD Cloud VPC Private Subnet required to communicate with the Intranet of JD Cloud hosted area.

3. Configure the route table. The destination is the network segment in your JD Cloud hosted area. And select the border gateway that hosts the hosted connect network intercommunication for the nest hop.



#### **Step 5: Configure the route Table on the border gateway**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, and select “Direct Connection Service ->  Border Gateway”, enter the details for the border gateway hosting the hosted connect network intercommunication.

3. Configure the route table. Two-way route is required, one way to VPC side and another to your JD Cloud hosted area side.

For the route to the VPC, the destination is the network segment in your IDC. And select the specific VPC required to communicate for the nest hop.

The destination of the route to JD Cloud hosted area side is the network segment in your JD Cloud hosted area. And select the hosted private virtual interface that hosts the hosted connect network intercommunication for the nest hop.



#### **Step 6: Configure routers in the JD Cloud hosted area**

Configure the route in the customer JD Cloud hosted area, including the configuration related to running BGP Protocol with JD Public Cloud, and the specific routing configuration.

For the route to the VPC, the destination is the network segment in your VPC. And the address for the nest hop is the address of BGP Peer to JD Public Cloud side, i.e., the JD Cloud side address of the hosted private virtual interface/ 30 Address.