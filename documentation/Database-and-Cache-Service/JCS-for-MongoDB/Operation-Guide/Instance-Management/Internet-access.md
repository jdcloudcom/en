# Internet Access

Internet access is not enabled for MongoDB instances by default and can be manually enabled if required by your business.

**To guarantee the connection security, please be sure to set a white list to limit access source.**



## Notes

- As the Internet domain will take effect after a certain period, please wait for 3~5 minutes with patience.
- If the Internet access is disabled, the access address will be changed if it is enabled next time.
- Replica set instances do not support URI connection currently and support single node connection only. Please note to distinguish Primary and Secondary in use.

## Operation Steps

1. Log in to [MongoDB Console](https://mongodb-console.jdcloud.com/mongodb).

2. Select the target instance in the "Instance List" page and click **Instance Name** to enter the Details of the instance.

3. In the connection information module, click **Enable Internet Access** to open the confirmation popup.

   - Replica set:

     ![image-20200428165731668](../../../../../image/mongodb/mongo-101.png)

   - Sharded cluster:

     ![image-20200428172120757](../../../../../image/mongodb/mongo-102.png)

4. Click **OK** in the confirmation popup to enable Internet access.

5. It can be viewed in the connection information after being enabled.

   - Replica set

     ![image-20200428171925903](../../../../../image/mongodb/mongo-103.png)

   - Sharded cluster

     ![image-20200428172301220](../../../../../image/mongodb/mongo-104.png)

6. The created Internet domain will be displayed in the connection information module. If not required, please click **Disable Internet Domain**.

   
