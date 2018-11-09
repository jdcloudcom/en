# modifyCacheInstanceAttribute

Description: Modify the resource name and description of JCS for Redis instance, alternatively

-Request Method
```xml 
PATCH https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}
```
Name|Type|Required or not|Default|Description
---|:--:|:--:|:--:|---:
cacheInstanceId|String|True||JCS for Redis instance ID
regionId|String|True||Region ID in the region where the JCS for Redis instance is located. At present, JCS for Redis includes North China, South China, and eastern China regions. The Region ID is cn-north-1, cn-south-1 and cn-east-2 respectively.

- Request Parameter

Name|Type|Required or not|Default|Description
---|:--:|:--:|:--:|---:
cacheInstanceDescription|String|False||JCS for Redis Instance Resource Description
cacheInstanceName|String|False||JCS for Redis Instance Resource Name

- Return Parameter

Name|Type|Description
---|:--:|---:
requestId|String|

- Error Code

Error Code|Description
---|---:
200|OK
