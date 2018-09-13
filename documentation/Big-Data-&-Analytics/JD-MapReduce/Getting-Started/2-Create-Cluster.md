# Create a cluster

You can quickly create a cluster from the JD MapReduce console.
For a description of the JD MapReduce billing instructions, please refer to: [Price Overview](../Pricing/Price-Overview.md), [Billing Overview](../Pricing/Billing-Overview.md), this article describes the creation through the console. JD MapReduce cluster.

## Precondition
-  Have a JD Cloud account and have completed the real-name verification. If you do not have an account, please [Register](https://accounts.jdcloud.com/p/regPage?source=jdcloud&ReturnUrl=%2f%2fuc.jdcloud.com%2fpassport%2fcomplete%3freturnUrl%3dhttp%3A%2F%2Fuc.jdcloud.com%2Fredirect%2FloginRouter%3FreturnUrl%3Dhttps%253A%252F%252Fwww.jdcloud.com%252Fhelp%252Fdetail%252F734%252FisCatalog%252F1), or complete [Real-name Verification](https://uc.jdcloud.com/account/certify).
-  If the billing type is selected and paid by configuration, please confirm that your account balance (including coupon) is not less than 50 yuan.

## Operation Steps
1. Log in to the [JD MapReduce Console](https://xdata.jdcloud.com/rmgr/resources/res-manage/custom-resources.html#/) and select the region.
     JD Cloud's computer room is distributed in multiple locations around the world. These locations are called geographies. JD MapReduce currently supports cn-north-1, cn-south-1, and will support more regions in the future.

	   Instructions:
	   -  Cloud service products in the same geographical area are interconnected through intranets, but the intranets of different accounts are completely isolated;
	   -  The intranet cannot communicate between cloud service products in different regions;
	   -  When purchasing a cloud service, it is recommended to choose the region closest to your customer to reduce the access delay;
2. On the cluster management page, click “Create” to enter the creation page.

	1. Software setup
	
	   Instructions:
	   -  High availability is enabled. The cluster will have two Masters: Active Namenode and Standby Namenode: two Namenodes form a mutual standby, one is in the Active state and is the primary Namenode, and the other is in the Standby state. It is the Namenode and only the master. The Namenode can provide read and write services to the outside;
	   -  Do not enable high availability, the cluster has a Master by default;
	   -  JD MapReduce_BD-OS-1.0 version selects high availability by default when creating a cluster;
	
3. Click "Buy Now" and the page will automatically jump to the JD MapReduce cluster management page, waiting for the cluster to be created.

