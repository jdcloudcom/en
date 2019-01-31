# FAQ

**Q: Does the JCS for MongoDB support public network connections?**

A: For security reasons, the JCS for MongoDB currently only provides intranet connections and does not provide public network connections. If you need to directly connect to the MongoDB instance locally, you can use the proxy forwarding method. For the operation mode, please refer to "[Public Network Connection MongoDB Instance](../Best-Practices/Public-Network-Connect-to-MongoDB-Instance.md) )".


**Q: Which versions does JCS for MongoDB support?**

A: JCS for MongoDB currently supports version 3.2, 3.4 and 3.6.


**Q: Which protocols does the JCS for MongoDB support?**

A: JD Cloud JCS for MongoDB is fully compatible with MongoDB's official protocol. For details, please refer to "[MongoDB Official Documentation](https://docs.mongodb.com/v3.2/introduction/)".

**Q: What is the size of the oplog and whether adjustment is supported?**

A:  Oplog is 5% of the instance storage space and the adjustment is not supported temporarily.

   
**Q: Why is the MongoDB memory usage ratio so high in the monitoring?**

A: MongoDB uses a memory-mapped storage engine, which converts disk IO operations into memory operations. If it is a read operation, the data in memory acts as a cache. If it is a write operation, the memory can also convert the random write operation to a sequential one, which can greatly improve performance, and users don't have to worry about high memory usage ratio. If the memory capacity has become a performance bottleneck, upgrade the instance configuration. For details, please refer to "[Change Instance Configuration](../Operation-Guide/Instance-Management/Modify-Instance-Spec.md)".

**Q: Currently, the local MongoDB Version 4.0 is being used. If I change to Version 3.6 on cloud, what should I pay attention to?**

A: MongoDB 4.0 adds some function features. If you change to Version 3.6, you need to pay attention to the followings:

1. Avoid using multi-document transactions.
2. Avoid using new aggregation commands.

	- Type Conversion

		| Operator | Description |
		|---|:---|
		| $convert | Convert value to specified type. |
		| $toBool | Convert value to boolean. |
		| $toDate | Convert value to Date. |
		| $toDecimal | Convert value to Decimal128. |
		| $toDouble | Convert value to Double. |
		| $toInt | Convert value to integer. |
		| $toLong | Convert value to long. |
		| $toObjectId | Convert value to ObjectId. |
		| $toString | Convert value to string. |

	- Character Handling

		| Operator | Description |
		|---|:---|
		|$ltrim|Removes whitespace or the specified characters from the beginning of a string.|
		|$rtrim|Removes whitespace or the specified characters from the end of a string.|
		|$trim|Removes whitespace or the specified characters from the beginning and end of a string.|

3. Avoid using new monitoring commands (FreeMonitoring).
4. Pay attention to the use of some improved commands in Version 4.0.

	- Command
	
		| Operator | Description |
		|---|:---|
		|db.collection.drop() |accepts the write concern option.|

	- Geolocation Search

		| Operator | Description |
		|---|:---|
		|$geoNear|support using the minDistance option with 2d indexes.<br /> adds a key option that enables users to specify which geospatial index to use when querying a collection with multiple geospatial indexes. |
		|$near|support using the minDistance option with 2d indexes.|
		|$nearSphere|support using the minDistance option with 2d indexes.|

5. For detailed descriptions of 4.0 features, please view [Official Document](https://docs.mongodb.com/manual/release-notes/4.0/).
