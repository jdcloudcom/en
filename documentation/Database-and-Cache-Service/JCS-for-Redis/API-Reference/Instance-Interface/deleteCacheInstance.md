# deleteCacheInstance

Description: delete singe Redis instance

- Request Method
```xml
DELETE https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}
```

Name|type|required or not|default|description
---|:--:|:--:|:--:|---:
cacheInstanceId|String|True||Redis instance ID
regionId|String|True||Region ID in the region where the Redis instance is located. At present, Redis includes North China, South China, and eastern China regions. The Region ID is cn-north-1, cn-south-1 and cn-east-2 respectively.

- Request Parameter<br>
None

- Return Parameter

Name|Type|Description
---|:--:|---:
requestId|String|

- Error Code

Error Code|Description
---|---:
200|OK
