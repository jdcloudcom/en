# Change of Nodes

Instances of MongoDB replica set support 3, 5 and 7 nodes. Once an instance is created, count of node in the replica set can be changed on the Console.

## Prerequisites

- Configuration can be changed for instances in status of running and normal billing.

## Operation Steps

1. Log in [MongoDB Console](https://mongodb-console.jdcloud.com/mongodb?dataCenter=bj_02).

2. On the "Instance List" page, select a target instance, enter the Instance Details, click **Change Nodes** among the operation item on the upper right corner and open the popup.

   ![](https://github.com/jdcloudcom/cn/blob/mongo-20200928/image/mongodb/mongo-109.png)

3. Select nodes to be adjusted in the popup.

   - Nodes: Modified according to demands.	
   - Type: Type of existing instance, immutable.
   - Bucket: Bucket of existing instance, immutable.
   - Network: Virtual private cloud and subnet of existing instance, immutable.
   - Billing type: Billing type of existing instance, immutable.
   - Fees
     - For instance in the billing type of pay bay configuration, the cost is the hourly cost of the new instance.
     - For an instance in the billing type of Monthly Package, the cost is the price difference between the new and old configuration in the validity period of such instance.

4. After configuration is selected, click **OK** and enter the "Order Confirmation" Page.

5. On the "Order Confirmation" Page, confirm instance information and go through the Service Terms of JCS for MongoDB.

   - If the billing type is selected as by configuration, please click **Instant Account Setup**.
   - If Monthly Package is selected as the billing type, please click **Pay Now**, enter the "Order Payment" Page and complete the payment process.

6. After the payment process is done, the page will automatically redirect to the MongoDB "Instance List" Page. Wait until instance change configuration is completed. Then, you can view configuration information changed in the "Instance Details".  


## Relevant Reference

- [Create Instance](../../Getting-Started/Create-Instance.md)
- [Connect Instance](../../Getting-Started/Connect-Instance.md)
- [Rene Instance](Renewal-Instructions.md)
- [Restart Instance](Restart-Instance.md)
