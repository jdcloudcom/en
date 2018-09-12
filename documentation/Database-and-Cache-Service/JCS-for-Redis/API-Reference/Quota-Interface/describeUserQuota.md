# describeUserQuota

Description: query account quota information

- Request method
```xml
GET https://redis.jdcloud-api.com/v1/regions/{regionId}/quota
```
Name|type|required or not|default|description
---|:--:|:--:|:--:|---:
regionId|String|True||Region ID in the region where the Redis instance is located. At present, Redis includes North China, South China, and eastern China regions. The Region ID is cn-north-1, cn-south-1 and cn-east-2 respectively.

- Request parameter<br>
None


- Return parameter

Name|type|description
---|:--:|---:
requestId|String|
result|Result

- Result

Name|type|description
---|:--:|---:
quota|Quota|

- Quota

Name|type|description
---|:--:|---:
max|Integer|Quota
name|string|Name of the item of quota
used|Integer|used numbers

- Error code

Error code|description
---|---:
200|OK
