# modifyCacheInstanceClass

Description: change Redis instance configuration

- Request Method
```xml
POST https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}:modifyCacheInstanceClass
```
Name|type|required or not|default|description
---|:--:|:--:|:--:|---:
cacheInstanceId|String|True||Redis instance ID
regionId|String|True||Region ID in the region where the Redis instance is located. At present, Redis includes North China, South China, and eastern China regions. The Region ID is cn-north-1, cn-south-1 and cn-east-2 respectively.

- Request Parameter

Name|type|required or not|default|description
---|:--:|:--:|:--:|---:
cacheInstanceClass|String|True||Redis Instance Type code after the change

- Return Parameter

Name|Type|Description
---|:--:|---:
requestId|String|
result|Result|

- Result

Name|Type|Description
---|:--:|---:
orderNum|String|

- Error Code

Error Code|Description
---|---:
200|OK
