# Condition Description Method

Condition consists of condition operational character, condition key and condition value. Multiple conditions can be included in Condition

## Relationship Between Conditions

 - There is the "Or" relationship between multiple values in the same condition key. When checking the condition, the judgment condition is satisfied as long as one of these values is satisfied
 - There is the "And" relationship between different values. When checking the condition, the judgment condition only can be satisfied when all the condition values are satisfied.

## Condition operational character supported now

|  Type | Condition operational character |Description|
|:----------:|:-----------------:|:-----------------:|
|  Character string operational character  |  StringEquals | Character string equals (case sensitive)|

## Global condition key supported now

 | Name |Description |Supported operational character |
| :----------------- |:---------- | :----------------- |
 |Jdcloud:RequestTag/tag-key|The format is "Jdcloud:RequestTag/tag-key":"tag-value"<Br>, wherein tag-key and tag-value are tag key-value pair|Character string operational character|
 
 ## Product line that currently supports specified tag condition key
 
After putting on the according tag on the resource, you can specify resources in batch by specifying specific tag conditions without entering resource ID individually when creating the strategy.

  | Product Line Name  | Resource ID|
| :-----------------:|:-----------------: |
 |Cloud Disk Service|DiskID|
  |Kubernetes|NodeGroupID|
| Native Container  | ContainerID  |
 | Pod  | PodID  |
  |Cloud File Service | FileSystemID  |
 |  JCS for Redis | CacheInstanceID  |
|  JCS for Memcached | InstanceID  |
|  RDS | InstanceID  |
 |  JCS for MongoDB | InstanceID  |
|  DRDS|  InstanceID |
|  CDN | DomainName|
| Message Queue  |TopicName   |
| Queue Service  | QueueID  |
|  JCS for Elasticsearch | InstanceID  |
