# Connection Instance

For security reasons, the JCS for MongoDB currently only provides intranet connections and does not provide public network connections.

If you need to directly connect to the JCS for MongoDB instance, you can use the Virtual Machines proxy forwarding method. For the operation mode, please refer to [Public Network Connection MongoDB Instance](../Best-Practices/Public-Network-Connect-to-MongoDB-Instance.md).



## Precondition

- The MongoDB instance status is up and the billing status is normal.
- The MongoDB instance is in the same VPC as the Virtual Machines used for connection, and the connection between them is not limited by ACL, security group or white list.

## Operation Steps

### Replica Set Instance

1. Get connection information on MongoDB replica set.

    1. Login [MongoDB Console](https://mongodb-console.jdcloud.com/mongodb).

    1. On the "Instance List" page, select the target instance, and click the **Instance Name** to enter the "Instance Details" page.

    1. On the "Instance Details" page, view the resource information and get the connection information for the MongoDB instance.

      ![View Connection](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-006.png)

      - Database name, default is admin.

      - User name, default is root.

      - The name of the replica set.

      - Connection address.

        By default, node 1 is Primary and node 2 is Secondary. If automatic disaster tolerance occurs, the Primary and Secondary nodes may change.

        Please use Connection String URI connection for the client to ensure highly available.

2. Connection MongoDB instance.

   - Using Mongo Shell for connection
     The mongo shell is an interactive JavaScript shell that comes with MongoDB. You can use the mongo shell to query and update data or perform administrative operations.
     Please use the client of mongo shell 3.2 or above to connect to the MongoDB instance, otherwise the authentication may not be successful
     Use the mongo command to connect on the Virtual Machines. The command is as follows:

     ```
     mongo --host jmongo-xxx.jmiss.jcloud.com:27017 --authenticationDatabase admin -u root -p
     mongo --host jmongo-xxx.jmiss.jcloud.com:27017 --authenticationDatabase admin -u root -p
     ```

     or

     ```
     mongo mongodb://root:****@jmongo-xxx.jmiss.jcloud.com:27017,jmongo-xxx.jmiss.jcloud.com:27017/admin?replicaSet=mgset-xxx
     (****Partially replaced with root password)
     ```

   - Using Connection String URI to connect the instance

     MongoDB service can be connected in the traditional way of parameter passing. Most drivers also support connection in the form of URI. MongoDB officially recommends using URIs to connect to MongoDB services to guarantee high availability of connection. Please use the driver with MongoDB 3.2 version and higher

     The command style is as follows:

     ```
     mongodb://root:****@jmongo-xxx.jmiss.jcloud.com:27017,jmongo-xxx.jmiss.jcloud.com:27017/admin?replicaSet=mgset-xxx
     (****Partially replaced with root password)		
     ```

### Sharded Cluster Instance

1. Get connection address of MongoDB Sharded Cluster.

   1. Log in [MongoDB Console](https://mongodb-console.jdcloud.com/mongodb).

   2. On the "Instance List" page, select the target instance and click ** Instance Name** to go to the "Instance Details" page.

   3. On the "Instance Details", view the resources information and get connection information on MongoDB instances.

      ![image-20200120161354197](../../../../image/mongodb/mongo-053.png)

2. Connects MongoDB shard instances.

   - Use Mongo shell for connection.

     ```
     mongo mongodb://root:****@jmongo-hb1-prod-mongo-xxx.jmiss.jdcloud.com:27017/admin
     ```

   - Use Connection String URI to connect instances

     ```
     mongodb://root:****@jmongo-hb1-prod-mongo-xxx1.jmiss.jdcloud.com:27017,jmongo-hb1-prod-mongo-xxx2.jmiss.jdcloud.com:27017/admin
     ```

      

## Related Reference

- [Public Network Connection MongoDB Instance](../Best-Practices/Public-Network-Connect-to-MongoDB-Instance.md)
- [Problem Processing: Virtual Machines Unable to Connect MongoDB Instance](../Troubleshooting/Connect-Failed.md)
- [Problem Processing: Login Database Prompt No Permission](../Troubleshooting/Authentication.md)
  	
