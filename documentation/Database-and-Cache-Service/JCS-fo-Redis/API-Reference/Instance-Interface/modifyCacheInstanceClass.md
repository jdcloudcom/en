# modifyCacheInstanceClass

Description: change Redis instance configuration

- Request method
```xml
POST https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}:modifyCacheInstanceClass
```
Name|type|required or not|default|description
---|:--:|:--:|:--:|---:
cacheInstanceId|String|True||Redis instance ID
regionId|String|True||Region ID in the region where the Redis instance is located. At present, Redis includes North China, South China, and eastern China regions. The Region ID is cn-north-1, cn-south-1 and cn-east-2 respectively.

- Request parameter

Name|type|required or not|default|description
---|:--:|:--:|:--:|---:
cacheInstanceClass|String|True||Redis Instance Type code after the change

- Return parameter

Name|type|description
---|:--:|---:
requestId|String|
result|Result|

- Result

Name|type|description
---|:--:|---:
orderNum|String|

- Error code

Error code|description
---|---:
200|OK
