# FAQ

**Q: Does the JCS for MongoDB support public network connections?**

A: For security reasons, the JCS for MongoDB currently only provides intranet connections and does not provide public network connections. If you need to directly connect to the MongoDB instance locally, you can use the proxy forwarding method. For the operation mode, please refer to "[Public Network Connection MongoDB Instance](../Best-Practices/Public-Network-Connect-to-MongoDB-Instance.md) )".


**Q: Which versions does JCS for MongoDB support?**

A: JCS for MongoDB currently supports version 3.2, and will soon release version 3.4 and version 3.6.


**Q: Which protocols does the JCS for MongoDB support?**

A: JD Cloud JCS for MongoDB is fully compatible with MongoDB's official protocol. For details, see "[MongoDB Official Documentation](https://docs.mongodb.com/v3.2/introduction/)".

**Q: What is the size of the oplog and whether adjustment is supported?**

A:  Oplog is 5% of the instance storage space and the adjustment is not supported temporarily.

   
**Q: Why is the MongoDB memory usage ratio so high in the monitoring?**

A: MongoDB uses a memory-mapped storage engine, which converts disk IO operations into memory operations. If it is a read operation, the data in memory acts as a cache. If it is a write operation, the memory can also convert the random write operation to a sequential one, which can greatly improve performance, and users don't have to worry about high memory usage ratio. If the memory capacity has become a performance bottleneck, upgrade the instance configuration. For details, see "[Change Instance Configuration](../Operation-Guide/Instance-Management/Modify-Instance-Spec.md)".
