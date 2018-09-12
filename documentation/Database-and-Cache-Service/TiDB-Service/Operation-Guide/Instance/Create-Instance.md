# Create Instance

You can quickly create the TiDB Service instances through the console

## Operation Steps
1. Log in to the distributed database TiDB management console.
2. On the Instance List page, click button - “Create” - to go to “Create Page”.

![Create Instance 1](../../../../../image/TiDB/Create-Instance-1.png)

3. Billing method during the period of public beta shall be pay by configuration by default. For the billing standard, please refer to the billing method.
4. Parameter description of instance configuration is as follows:
- **Region**: Select the region where the instance is located. The intranets of different regional resources are not interoperable and cannot be changed after creation. For detailed description of the region, please refer to “Region and Availability Zone”. During the period of public beta, only the “Availability Zone A” of “cn-north-1” is supported.
- **Database type**: The currently supported database type is TiDB+TiKV.
- **Version**: Refer to the version of the database type. Currently, the latest version - version 2.04 - is provided. Different regions support different versions. The specific circumstances shall be subject to the console.

![Create Instance 2](../../../../../image/TiDB/Create-Instance-2.png)

- Specifications of TiDB: CPU and Memory for TiDB Node
- Quantity of TiDB Node: The quantity of node is 2 by default. Currently, modification is not supported. For the introduction of TiDB, please refer to Node Management

![Create Instance 3](../../../../../image/TiDB/Create-Instance-3.png)

- Specifications of TiKV: CPU and Memory of TiKV Node
- TIKV storage space: This storage space contains data files and system files.
- Quantity of TiKV data replica: The quantity of data replica is 3 by default and modification is not supported; Ensure that the service can continue to work normally under the condition that 2 data replicas are lost.
- Quantity of TiKV Node: The quantity of node is 3 by default. Currently, modification is not supported. For the introduction of TiKV, please refer to Node Management.

![Create Instance 4](../../../../../image/TiDB/Create-Instance-4.png)

- The Networking: Currently, only one manner can be provided, which is the Deployment of Basic Networking.
- Database Account: Currently, customized database account is not supported. The root account shall be used by default.  
- Password: After the instance is created successfully, you can use the account and password defaulted by system to log on the instance. The length and characters of the password are limited, whose specific condition shall be subject to console.

![Create instance 5](../../../../../image/TiDB/Create-Instance-5.png)

5. Click “Buy Now” to go to the Oder Confirmation page. 

6. After reading the Usage & Service Terms of TiDB Service, follow the prompts to complete the subsequent steps. 
