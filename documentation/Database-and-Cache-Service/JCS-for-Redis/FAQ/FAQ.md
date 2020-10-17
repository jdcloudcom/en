# FAQ

## Purchase/Cost Type

**Q: Which versions are compatible with JCS for Redis now?**

Q: At present, the protocols Redis 2.8 and Redis 4.0 are compatible. However, some commands are restricted now. For details, please refer to: [Command Support](../Getting-Started/Command-Supported.md).


**Q: Which protocols are currently supported by JCS for Redis?**

A: JCS for Redis is fully compatible with the JCS for Redis official protocol. Refer to relevant documents in various languages for usage methods.

**Q: How is JCS for Redis charged?**

A: At present, two modes are provided, i.e., Monthly Package and Pay By Configuration.

**Q: What is the maximum amount of JCS for Redis available to each user?**

A: At present, the maximum quota for JCS for Redis is 5 for each user. If you need to create more instances, please contact the customer service.



## Connection/Login Type

**Q: Does JCS for Redis support Internet access?**

A: In order to improve the security of data access, JCS for Redis currently only supports intranet virtual machine access. Public network proxy access is available. For details, see [the JCS for Redis instance of public network connection](../Best-Practices/Public-Network-Connect-to-Redis-Instance.md).
 

**Q: Why do the Virtual Machines fail to access the Redis instance?**

A: You are suggested to conduct the checks below:

-  1. Please confirm the Virtual Machines and Redis are in the same VPC or not; 

-  2. If yes, please follow the [Connection Instance](../Getting-Started/Connect-Instances.md) document and check if the format and content are correct; 

- 3. Check if the Redis white list function is enabled.

- 4. If connection still fails, please contact the customer service for help.


## Common Application Type

**Q: What are the Redis version and supported commands?**

A: Please refer to the [Command Supported](../Getting-Started/Command-Supported.md) document. Please contact the customer service if you have other doubts.


**Q: How to import and export Redis data?**

A: Please refer to the [Data Migration](https://docs.jdcloud.com/en/jcs-for-redis/data-migration) document. Please contact the customer service if you have other doubts.


**Q: In the use of jedis, how to deal with character strings, such as \xac\xed\x00\x05t\x00, which are excessive in the key stored in redis?**

A: It is a problem of jedis serialization. Please modify the serialization method of redisTemplate. If it cannot be resolved, please contact the customer service.




## Common Error Information and Solutions


| Error Information | Suggestions to Solutions  |  
|:--:|:--:|
| OOMcommand not allowed when used memory maxmemory  redis-7cxm…… |  The error is connection failure due to the reason that the disk is full and unavailable. After data of the shard are cleared, connection can be resumed. You are suggested to configure alarm to monitor shard memory utilization rate or make expansion.  |
| Redis Client On Error:Error:connct ETIMEDOUT |  The error is the connection timeout. You are suggested to view the network information is correctly configured and try again.  |
