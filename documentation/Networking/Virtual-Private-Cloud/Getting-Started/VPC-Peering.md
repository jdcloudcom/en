## **VPC Peering Connection**

**Scenario**

In cn-south, two VPCs have communication requirements through Private IP, with the details as follows:

- Local VPC

- - Name: VPCforPeeringA
  - ID：vpc-xxvpcforpeeringaxx
  - Range: 10.0.0.0/16

- Peer VPC

- - Name: VPCforPeeringB
  - ID：vpc-xxvpcforpeeringbxx
  - Range: 172.16.0.0/16

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPC-Peering/Step1-1.png)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPC-Peering/Step1-2.png)



**Step 1: Create a peer-to-peer connection**

1) Log in to the JD Cloud console, click on the private network in the Network menu of the product menu, and then click on the VPC peer-to-peer connection in the private network menu to enter the VPC peering list page.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPC-Peering/Step1-3.png)



2) Click **Create** on the VPC Peer Connection List page to open the Create VPC Peer Connection Creation window.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPC-Peering/Step1-4.png)



3) Configure the VPC peering connection in the VPC peering connection creation window, and click OK to complete the creation. The popup window will prompt **the creation is successful, please go to the routing table to configure the relevant routing**. Click to go to the configuration to enter the routing table list page, or click **Configure later** to return to the VPCpeering list. Configuration information is as follows.

- For region, select **cn-south-1**
- For name, fill in peeringAtoB
- For local VPC, select VPCforPeeringA
- For peer VPC ID, fill in vpc-xxvpcforpeeringbxx

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPC-Peering/Step1-5.png)



4) The same steps are required in the peer VPC to create a VPC peering connection to VPCforPeeringA.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPC-Peering/Step1-6.png)



**Step 2: Configure a routing table for peer-to-peer connections**

1) Log in to the console, click on the private network in the Network menu of the product menu, and then click on the routing table in the private network menu to enter the routing table list page.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPC-Peering/Step2-1.png) 



2) Click **Create** on the routing table list page to open the routing table creating window.

3) Configure the basic information of the routing table in the routing table creating window, and click OK to complete. The pop-up window will display **the routing policy after the routing table is created, and the associated subnet takes effect. Do you want to configure?**, select to configure the routing table details page immediately.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPC-Peering/Step2-2.png) 



The routing table configuration information is as follows:

- For region, select **cn-south-1**
- For a private network, select VPCforPeeringA
- for name, fill in RTBforPeeringAtoB

4) In the routing table details page, click the **routing policy** tab, then click **Edit** to open the route editing mode, click ”edit” to add a new routing rule.

5) Fill in the relevant configuration in the routing entry, click **Save** to complete editing the routing table. The routing entries are configured as follows:

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPC-Peering/Step2-3.png) 



- Fill in the destination to 172.16.0.0/16
- For next hop type, select VPC peering connection
- For next hop, select peeringAtoB
- If you need public network access, you need to add a routing rule from 0.0.0.0/0 to the internet.

6) After configuring the routing table, you need to associate the routing table with the subnet that needs to be interconnected. In the private network on the peer end, you need to take similarly steps to create and configure the routing table RTBforPeeringBtoA.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPC-Peering/Step2-4.png) 



After the configuration is complete, the VPCs on both ends can establish a connection through the Private IP.