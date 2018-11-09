## Direct Connection

``Before using the Direct Connection, the network segments in the IDC and the VPC should be planned to ensure that the network segments in the IDC and the network segments in the VPC do not overlap. ``

``If you use Direct Connection and Hosted Connect at the same time, please plan the network segment in IDC, JD Cloud hosted area and VPC to ensure normal communication. ``



### **Create a Physical Connection**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select “Direct Connection Service -> Direct Connection -> Physical Connection”.

3. For the creation of physical connection, you can directly contact with the Direct Connection partner of JD Cloud. Our partner will provide you one-stop service. For the specific partners, see JD Cloud Marketplace. You can also choose self-service application, as the Document indicates.

4. Configure physical connection, see console page for details.

5. Click "OK". In the physical connection list page, the status of the connection is Applying.

Auditors of JD Cloud will review your application. Under normal circumstances, it will be completed within two working days. When passing the physical connection review, the connection status changes to Pending. At this time, you need to pay for this physical connection. For details, please refer to the Purchase Notes.

6. Please pay according to the settlement method specified in the Direct Connection Contract Service signed with JD Cloud.

7. After the physical connection is successfully paid, the connection status changes to under Construction. The port number of the access device is automatically allocated to access the physical link.

8. Synchronize the port information to the operator of your choice to check the resources and route the line. The operation and maintenance personnel of JD Cloud machine room will cooperate to complete the line to the home. If you need the operator to complete the line entry in person, please provide relevant personnel information in advance. JD Cloud will complete the entry reservation for your operator in advance, and give you the contact information of the receptionist of the machine room on the same day.

9. Finally confirm that the physical connection is created.



### Create a Border Gateway

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select “Direct Connection Service -> Direct Connection Service -> Border Gateway”.

3. Create border gateway, and it will automatically connect with the VPC of the account within the same region.



### **Create a Private Virtual Interface**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select “Direct Connection Service -> Direct Connection -> Private Virtual Interface”.

3. Configure private virtual interface, see console page for details.

4. Click "OK". In the list page of private virtual interface, the status of the connection is configuring.

5. Upon configuration, the private virtual interface is available and can be used.



### Configure the Route Table in the VPC

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select “Virtual Private Cloud”, enter the route table related to JD Cloud VPC Private Subnet required to communicate with IDC Intranet.

3. Configure the route table. The destination is the network segment in your IDC. And select the border gateway that hosts the direct connection network intercommunication for the nest hop.



### **Configure the Route Table on the Border Gateway**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, and select “Direct Connection Service -> Direct Connection Service -> Border Gateway”, enter the details for the border gateway hosting the direct connection network intercommunication.

3. Configure the route table. Two-way route is required, one way to VPC side and another to your IDC side.

For the route to the VPC, the destination is the network segment in your IDC. And select the specific VPC required to communicate for the nest hop.

The destination of the route to IDC side is the network segment in your IDC. And select the private virtual interface that hosts the direct connection network intercommunication for the nest hop.



### **Configure Routers within Customer IDC**

Configure the route in the customer IDC, including the configuration related to running BGP Protocol with JD Cloud, and the specific routing configuration.

For the route to the VPC, the destination is the network segment in your VPC. And the address for the nest hop is the address of BGP Peer to JD Public Cloud side, i.e., the JD Cloud side address of the private virtual interface/ 30 Address.



### Delete the Private Virtual Interface

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select “Direct Connection Service -> Direct Connection -> Private Virtual Interface”.

3. Enter the list or details of Private Virtual Interface, and click “Delete” to delete the Private Virtual Interface.



### **Delete Physical Connection**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select “Direct Connection Service -> Direct Connection -> Physical Connection”.

3. Go to the list or details of Physical Connection, and click “Delete”. Only the physical connection that has not been used to create the Private Virtual Interface can be deleted. After the physical connection is deleted, if you need to use the Direct Connection Service again, you need to apply for a new physical connection.

After the Physical Connection is deleted through the JD Cloud Console/Open API, the physical port of the JD Cloud routing device will be released immediately, but you need to contact the operator/partner for physical link removal. JD Cloud will cooperate.