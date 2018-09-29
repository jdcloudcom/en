# Infrastructure

JCS for MongoDB provides a 3-node replica set architecture by default, where the Primary and Secondary nodes are visible to the user and the Hidden node are invisible to users.

## Business Architecture
The business structure is as follows:
![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-000.jpg)


|Name|Description|
| - | - | 
|Control Services| Supports a variety of management control tasks for MongoDB instances, including creation, deletion, query, configuration changes, disaster tolerance switching, backup and recovery tasks, etc.|
|Monitoring Services|Collect MongoDB instance information (resource usage and database key statistics, etc.) and physical machine information (resource usage information and ratings, etc.), the former for users and consoles, and the latter for system management.|
|Sentinel| Sentinel monitors whether MongoDB instances are alive. Multiple sentinels work at the same time. When a node is found to be unavailable, it sends a failover task, automatically creates a new node, and synchronizes the data.|
|Backup Services| Automatic scheduled backups, and supporting for users to manually create backups.|
|Log Collection| Collect log information about the running of MongoDB instance.|
|Data Migration| When the primary and secondary nodes are unavailable, or when you need to clone an online running instance, the online migration system is responsible for instance rebuild and data migration tasks to ensure that the business is not affected.|

## Related Reference

- [Product Benefit](../Introduction/Benefits.md)
- [Features](../Introduction/Features.md)
- [Price Overview](../Pricing/Price-Overview.md)
- [Billing Rules](../Pricing/Billing-Rules.md)
- [Create Instance](../Getting-Started/Create-Instance.md)
