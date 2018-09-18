# describeInstanceClass

Description: query the list of instance type for certain region

- Request Method
```xml
GET https://redis.jdcloud-api.com/v1/regions/{regionId}/instanceClass
```
Name|type|required or not|default|description
---|:--:|:--:|:--:|---:
regionId|String|True||Region ID in the region where the Redis instance is located. At present, Redis includes North China, South China, and eastern China regions. The Region ID is cn-north-1, cn-south-1 and cn-east-2 respectively.

- Request Parameter<br>
None


- Return Parameter

Name|Type|Description
---|:--:|---:
requestId|String|
result|Result

- Result

Name|Type|Description
---|:--:|---:
instanceClasses|InstanceClass[]|
totalCount|Integer

- InstanceClass

Name|Type|Description
---|:--:|---:
bandwidthMbps|Integer|Bandwidth
cpu|Integer|cpu
diskGB|Integer|Disk
instanceClass|String|See Instance Type Code Table for Instance Type code.
maxConnetction|Integer|Largest connection number
memoryMB|Integer|Memory

- Error Code

Error Code|Description
---|---:
200|OK
