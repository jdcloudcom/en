# resetCacheInstancePassword

Description: Reset JCS for Redis Instance Password

- Request Method
```xml
POST https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}:resetCacheInstancePassword
```
Name|Type|Required or not|Default|Description
---|:--:|:--:|:--:|---:
cacheInstanceId|String|True||JCS for Redis instance ID
regionId|String|True||Region ID in the region where the JCS for Redis instance is located. At present, JCS for Redis includes North China, South China, and eastern China regions. The Region ID is cn-north-1, cn-south-1 and cn-east-2 respectively.

- Request Parameter

Name|Type|Required or not|Default|Description
---|:--:|:--:|:--:|---:
password|String|True||Password must include and can only be letters and numbers, and shall not be less than 8 characters and not more than 16 characters.

- Return Parameter

Name|Type|Description
---|:--:|---:
requestId|String|


- Error Code

Error Code|Description
---|---:
200|OK
