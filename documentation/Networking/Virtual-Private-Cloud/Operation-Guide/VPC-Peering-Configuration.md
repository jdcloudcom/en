## **VPC Peering Connection**

### **Operation Guide**



#### **Create a VPC Peering Connection**

1) Open the console, click on the private network in the Network menu of the product menu, and then click on the VPC peer-to-peer connection in the private network menu to enter the VPC peering list page.

2) Click **Create** on the VPC Peer Connection List page to open the Create VPC Peer Connection Creation window.

3) Configure the VPC peering connection information in the VPC peering connection creation window, and click **OK** to complete the creation. The popup window will prompt the creation is successful, please go to the routing table to configure the relevant routing. Click **Configure it now** to enter the routing table list page, click **Configure later** to return to the VPCpeering list. Configuration information is as follows:

- Region: Select the region where the VPC is located
- Name: Input in the name as needed
- Local VPC: Select the VPC to initiate a VPC peering connection
- Peer VPC ID: Input the Peer VPC ID

4) The same steps are required in the peer VPC to create a VPC peering connection.



#### Configure a route policy

1) Open the console, click on the private network in the product menu, and then click on the routing table in the private network menu to enter the routing table list page.

2) Click **Create** on the routing table list page to open  a popup window for creating route table.

3) Configure the basic information of the route table in the creation popup window, and click **OK** to complete the creation. The pop-up window displays the routing policy: **After creating the route table, you need to configure the routing policies and associate the subnet to take it into effect. Whether to Configure It?** select **configure it now** to enter details page . The routing table configuration information is as follows:

- Region: Select the region where the VPC is located
- VPC: Select the VPC to initiate a VPC peering connection
- Name: Input the name as needed

4) In the route table details page, click the route policy tab, then click **Edit** to open the route editing mode, click on the new one to start editing a new route rule. 

5) Input the relevant configuration in the route rule, click **Save** to complete the routing table edit. The route rule  are configured as follows:

- Destination End: Peer VPC CIDR or range
- Next Hop Type: Select VPC peering connection
- Next Hop: Previously created VPC peering connection

6) After configuring the route table, you need to associate the route table with the subnet that needs to be interconnected, and in the Peer VPC, you need to follow the same steps to create, configure, and associate the route table. After the configuration is complete, the VPCs on both ends can establish a connection through the Private IP.



#### Deleting a VPC peering connection

Deleting a VPC peering connection will disconnect the connection with the Peer VPC. Please do this operation while ensuring that you have fully communicated with the Peer VPC administrator.

1) Open the console, click on the private network in the Network menu of the product menu, and then click on the VPC peering connection in the private network menu to enter the VPC peering list page.

2) Select the VPC peering connection to be deleted in the VPC peering connection list page, click **Delete** to open the **Delete VPC Peering connection** window, and click **OK** to complete the Delete VPC peering connection operation.