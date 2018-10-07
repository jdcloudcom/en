# Create Read-only Instances
In an application scenario where there are a small number of write requests to the database, but there are a large number of read requests, a single instance may not be able to resist reading pressure or even may affect the main services. In order to achieve the flexible expansion of read capabilities and share the pressure of the database, one or more read-only instances can be created in a certain region, by which, a large number of database read requirements can be met, thereby increasing the throughput of the application.

MySQL/Percona/MariaDB service read-only instance is a single-node architecture that synchronizing changes to the primary instance to all read-only instances through original replication.

## Limits
* The number of read-only instances in a single instance cannot exceed 8.
* The number of available IPs of the network where the read-only instance is located is required to be greater than the purchase amount.
* Read-only instance only supports the billing type ***Pay By Configuration***, and not supports ***Monthly Package***.

## Operation Steps
1. Login [RDS Console](https://rds-console.jdcloud.com/database).
2. Select the instance that required to be added with the read-only instance, click the name of the target instance, and enter the instance detailed page.
3. Select the tag of ***Read-only Instance Management***, open the read-only instance management page and click ***Add Read-only Instance*** to create a read-only instance.
4. Description for the interface parameter of a read-only instance creation
    * Region: The region cannot be modified, and the default is in the same region as the main instance.
    * Availability Zone: Different regions, the number of available regions varies based on the console. Please refer to [Region and Availability Zone] for the detailed description of regions (https://www.jdcloud.com/help/detail/1844/isCatalog/1)
    * Types: It is recommended to read the read-only instance with a type not smaller than the primary instance, in terms of the selection of new read-only instance type.
    * Storage Space: Please ensure that the new read-only instance storage space not less than the main instance, otherwise it may cause data inconsistency.
    * Network: The region cannot be modified, and the network is in the same region as the main instance.
    * Purchases: The number of read-only instances of the same configuration.
    
    ![image2018-3-2 13_58_33.png](https://img1.jcloudcs.com/cms/e13a1926-043c-49e1-a94c-c27f1491f3bc20180302140739.png)

5. Click ***Buy Now*** to enter the order confirmation page.
6. Read the RDS Terms of Service and click [Instant Account Setup] to start creating read-only instances.
