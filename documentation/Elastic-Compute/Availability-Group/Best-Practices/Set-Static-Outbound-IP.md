# Set fixed exit IP

If the following three requirements are posed to the VM in your Availability Group:

* Receives request from load balancer
* VM in the Availability Group requires an active access to public network
* Fixed Publice IP is expected when access to public network

![](../../../../image/ag/settingoutboundIP.png)

## Operational Steps


**Step 1: Create VPC and two Subnets: Subnet 1 and Subnet 2: one subnet is where the Availability Group is located and the other is where NAT instances located.**

1. Access to [VPC Console](https://cns-console.jdcloud.com/vpc/list) to go to the VPC Listing page. Or access to [JD Cloud Console](https://console.jdcloud.com) and click **Network**-**VPC** in left guide bar to go to the VPC Listing page.
2. Choose region.
3. Click **Creation** button.
4. A pop-up screen for VPC creation will show up. Set up therein the name and the description of VPC.
	
	The name shall be set up at this step as: “Web Service”.
5. Set up CIDR for VPC: Set up the border of VPC. CIDR shall only be the intranet segments, with choices ranging from 10.0.0.0 (mask 16-28), 172.16.0.0~172.31.0.0 (mask 16-28), to 192.168.0.0 (mask 16-28). CIDR can also be the non-preset type. In this case, the VPC border will operate in auto scaling with the applied subnet segments. Users with good understanding of network knowledge are recommended for VPC of non-preset CIDR type.

	At this step, CIDR shall be set up as VPC 192.168.0.0/16 and be named as XXX.

6. Click **OK** to view the VPC just created.
7. Visit [Subnet Console](https://cns-console.jdcloud.com/subnet/list) to access to subnet listing page. Or visit [JD Cloud Console](https://console.jdcloud.com) and click **Network**-**VPC**-**Subnet** in left guide bar to go to the Subnet Listing page.
8. Choose the region where you just created the VPC and click **Creation** button to pop up a Create Subnet Popup Window.
9. Choose “Web Service” of hosting VPC; subnet CIDR shall only be Intranet segments, with choices within “Web Service” CIDR range. The allocated CIDR for Subnet 1 is 192.168.1.0/24 and for Subnet 2 is 192.168.2.0/24.
10. Set up subnet name and description.
11. Choose associated route table for subnet. Each subnet can be and shall be attached with one route table. Please remember to attach an independent route table (such as “Availability Group suited route table”) for Subnet 1, as it requires the public network access.
12. Click **OK** to trigger the Create Subnet.

**Step 2: Create NAT instance in Subnet 2 and allocate an elastic IP to the instance. This IP is the fixed IP for VM of Availability Group to access to public network.**

Operation steps for NAT creation can be referenced from [Linux Instance Creation](../../Virtual-Machine/Getting-Start-Linux/Create-Instance.md). The only thing you need to do is to choose NAT Gateway of CentOS 7.2 64 bits in public image.

**Step 3: Configure VPC route table and direct the public traffic flow in Subnet 1 into NAT instance.**

1. Visit [Route Table Console](https://cns-console.jdcloud.com/routeTable/list) to go to the rout table listing page. Or access to [JD Cloud Console](https://console.jdcloud.com) and go to route table listing page by clicking **network**-**VPC**-**route table** in the left guide menu.
2. Find “Availability Group Route Table” and click to go to the detail page;
3. Click **Routing Strategy** tag to check Tab information of the route strategy and click **Edit**.
4. Add routing strategy. The destination shall be a public IP or be 0.0.0.0/0. Next hop shall be VM type and shall be picked after getting access to the instances created by NAT Gateway image.
5. Click **Save**.

**Step 4: Create Availability Group on the basis of Subnet 1 and add new instances to the Availability Group.**

You are now required to create Availability Group for your service. You can log into [Availability Group Quick Start Guide](../Getting-Start.md) to view more detailed steps.

	Please note that the Availability Group of hosting VPC shall be the same VPC hosting NAT instances and be different from subnet VPC.
	
Now VMs of Availability Group can all visit public network via the Elastic IP configured by NAT instance.


## Related References

[Create Linux Instance](../../Virtual-Machine/Getting-Start-Linux/Create-Instance.md)