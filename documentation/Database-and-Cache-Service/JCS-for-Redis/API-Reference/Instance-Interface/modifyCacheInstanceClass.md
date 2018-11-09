# modifyCacheInstanceClass

Description: Change JCS for Redis Instance Configuration

- Request Method
```xml
POST https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}:modifyCacheInstanceClass
```
Name|Type|Required or not|Default|Description
---|:--:|:--:|:--:|---:
cacheInstanceId|String|True||JCS for Redis instance ID
regionId|String|True||Region ID in the region where the JCS for Redis instance is located. At present, JCS for Redis includes North China, South China, and eastern China regions. The Region ID is cn-north-1, cn-south-1 and cn-east-2 respectively.

- Request Parameter

Name|Type|Required or not|Default|Description
---|:--:|:--:|:--:|---:
cacheInstanceClass|String|True||JCS for Redis Instance Type Code after the Change

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
