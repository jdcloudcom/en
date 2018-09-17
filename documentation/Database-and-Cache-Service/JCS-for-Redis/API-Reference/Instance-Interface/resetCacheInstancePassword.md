# resetCacheInstancePassword

Description: reset Redis instance password

- Request Method
```xml
POST https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}:resetCacheInstancePassword
```
Name|type|required or not|default|description
---|:--:|:--:|:--:|---:
cacheInstanceId|String|True||Redis instance ID
regionId|String|True||Region ID in the region where the Redis instance is located. At present, Redis includes North China, South China, and eastern China regions. The Region ID is cn-north-1, cn-south-1 and cn-east-2 respectively.

- Request Parameter

Name|type|required or not|default|description
---|:--:|:--:|:--:|---:
password|String|True||password must include and can only be letters and numbers, and shall not be less than 8 characters and not more than 16 characters.

- Return Parameter

Name|Type|Description
---|:--:|---:
requestId|String|


- Error Code

Error Code|Description
---|---:
200|OK
