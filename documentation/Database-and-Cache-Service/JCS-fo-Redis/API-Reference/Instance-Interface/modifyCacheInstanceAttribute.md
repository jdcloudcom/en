# modifyCacheInstanceAttribute

Description: modify the resource name and description of Redis instance, alternatively

-Request method
```xml 
PATCH https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}
```
Name|type|required or not|default|description
---|:--:|:--:|:--:|---:
cacheInstanceId|String|True||Redis instance ID
regionId|String|True||Region ID in the region where the Redis instance is located. At present, Redis includes North China, South China, and eastern China regions. The Region ID is cn-north-1, cn-south-1 and cn-east-2 respectively.

- Request parameter

Name|type|required or not|default|description
---|:--:|:--:|:--:|---:
cacheInstanceDescription|String|False||Redis instance resource description
cacheInstanceName|String|False||Redis instance resource name

- Return parameter

Name|type|description
---|:--:|---:
requestId|String|

- Error code

Error code|description
---|---:
200|OK
