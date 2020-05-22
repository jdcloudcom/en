# FAQ

**Q: Does JCS for Redis support Internet access?**

A: In order to improve the security of data access, JCS for Redis currently only supports intranet virtual machine access. Public network proxy access is available. For details, see the JCS for Redis instance of public network connection.


**Q: Which protocols are currently supported by JCS for Redis?**

A: JCS for Redis is fully compatible with the JCS for Redis official protocol. Refer to relevant documents in various languages for usage methods.


**Q: What is the maximum amount of JCS for Redis available to each user?**

A: Currently, the maximum number of JCS for Redis available to each user is 5. If it fails to satisfy your business requirements, please contact the customer service.

**Q: Why do the Virtual Machines fail to access the Redis instance?**

A: 1. Please confirm the Virtual Machines and Redis are in the same VPC or not; 2. If yes, please follow the [Connection Instance](https://docs.jdcloud.com/en/jcs-for-redis/connect-instances) document and check if the format and content are correct; and 3. If the aforesaid two steps are OK and the connection still fails, please contact the customer service for help.


**Q: What are the Redis version and supported commands?**

A: Please refer to the [Command Supported](https://docs.jdcloud.com/en/jcs-for-redis/command-supported) document. Please contact the customer service if you have other doubts.


**Q: How to import and export Redis data?**

A: Please refer to the [Data Migration](https://docs.jdcloud.com/en/jcs-for-redis/data-migration) document. Please contact the customer service if you have other doubts.

**Q: In the use of jedis, how to deal with character strings, such as \xac\xed\x00\x05t\x00, which are excessive in the key stored in redis?**

A: It is a problem of jedis serialization. Please modify the serialization method of redisTemplate. If it cannot be resolved, please contact the customer service.


**Q: After an application is initialized with Redis SDK, why no connection number is shown in the monitoring?**

A: After an application is initialized in start when a connection pool is used by quoting Redis SDK, if there is no actual read-write operation and the server does not establish a connection, the connection number may be 0, which is normal.
