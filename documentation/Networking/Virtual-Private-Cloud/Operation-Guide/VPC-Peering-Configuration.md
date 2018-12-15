## **VPC Peering Connection**

### **Operation Guide**



#### **Create a VPC Peering Connection**

1) Log in to the console, click on the private network in the Network menu of the product menu, and then click on the VPC peer-to-peer connection in the private network menu to enter the VPC peering list page.

2) Click Create on the VPC Peer Connection List page to open the Create VPC Peer Connection Creation window.

3) Configure the VPC peering connection information in the VPC peering connection creation window, and click OK to complete the creation. The popup window will prompt the creation is successful, please go to the routing table to configure the relevant routing. Click to go to the configuration to enter the routing table list page, click Configure later to return to the VPCpeering list. Configuration information is as follows

- Region: Select the location where the VPC is located
- Name: Fill in the name as needed
- Local VPC: Select the VPC to initiate a VPC peering connection
- Peer VPC ID: Fill in the Peer VPC ID

4) The same steps are required in the peer VPC to create a VPC peering connection.



#### Configure a route policy

1) Log in to the console, click on the private network in the Network menu of the product menu, and then click on the routing table in the private network menu to enter the routing table list page.

2) Click Create on the routing table list page to open the routing table to create a popup window.

3) Configure the basic information of the routing table in the routing table creation popup window, and click OK to complete the creation. The pop-up window "Displays the routing policy after the routing table is created, and the associated subnet takes effect. Do you want to configure? ", select to configure the routing table details page immediately. The routing table configuration information is as follows

- Region: Select the location where the VPC is located
- VPC: Select the VPC to initiate a VPC peering connection
- Name: Fill in the name as needed

4) In the routing table details page, click the routing policy tab, then click Edit to open the route editing mode, click on the new one to start editing the new routing entry.

5) Fill in the relevant configuration in the routing entry, click Save to complete the routing table edit. The routing entries are configured as follows

- Destination End: Peer VPC CIDR or range
- Next Hop Type: Select VPC peering connection
- Next Hop: Previously created VPC peering connection

6) After configuring the route table, you need to associate the route table to the subnet that needs to be interconnected, and in the Peer VPC, you need to follow the same steps to create, configure, and associate the route table. After the configuration is complete, the VPCs on both ends can establish a connection through the Private IP.



#### Deleting a VPC peering connection

Deleting a VPC peering connection will disconnect the connection with the Peer VPC. Please do this operation while ensuring that you have fully communicated with the Peer VPC administrator.

1) Log in to the console, click on the private network in the Network menu of the product menu, and then click on the VPC peer-to-peer connection in the private network menu to enter the VPC peering list page.

2) Select the VPC peering connection to be deleted in the VPC peering connection list page, click Delete to open the Delete VPC Peering connection window, and click OK to complete the Delete VPC peering connection operation.