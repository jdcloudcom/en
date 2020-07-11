# Node Domain Management

The shard cluster instances consist of mongos, shard and configserver. Generally, only mongos node is connected for business read-write data.

In some special scenarios, if data are imported or exported by shards, the shard/configserver node domain can be enabled to meet business demands.

## Prerequisite

1. The instance type is a shard cluster.
2. The current instance is not defaulting and is in the "running" status.

## Instructions for Use

1. The node domain is temporarily used for scenarios such as data migration. Please be sure to avoid direct connection and data writing and conduct timely release after use, for fear of misoperation.
2. The shard/configserver node domain is only suitable for single node connection method. Please pay attention to distinguish Primary from Secondary in use.

## Operation Steps

1. Log in [MongoDB Console](https://mongodb-console.jdcloud.com/mongodb).

2. Select a target instance on the "Instance List" Page and Enter the Instance Details.

3. Click **Database Connection** on the "Instance Details" and open the Database Connection Management Page.

4. On the Database Connection Management Page, select **Intranet Connection** or **Internet Connection** to view connection information of various node types of the existing shard cluster.

   ![image-20200628174310190](../../../../../image/mongodb/mongo-105.png)

5. Click the button **Enable Node Intranet Access** or **Enable Node Internet Access** at the right side of the shard/configserver mode, domains of all shard/configserver nodes of current instance can be enabled. If Intranet/Internet domain is not enabled for any new node, such domain can be enabled by nodes.

   ![image-20200628174537528](../../../../../image/mongodb/mongo-106.png)

6. When the node domain is enabled and the account and password of the current node are unavailable, the account and password for node management shall be completed, which shall be kept in mind.

   

7. If you need to release a domain, please click **Disable Node Intranet Access** or **Disable Node Internet Access** on the existing page.

   ![image-20200628175044660](../../../../../image/mongodb/mongo-107.png)

   

   
