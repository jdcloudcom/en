# describeUserQuota

Description: query account quota information

- Request Method
```xml
GET https://redis.jdcloud-api.com/v1/regions/{regionId}/quota
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
quota|Quota|

- Quota

Name|Type|Description
---|:--:|---:
max|Integer|Quota
name|string|Name of the item of quota
used|Integer|Used numbers

- Error Code

Error Code|Description
---|---:
200|OK
