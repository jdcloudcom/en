# describeUserQuota

Description: Query account quota information

- Request Method
```xml
GET https://redis.jdcloud-api.com/v1/regions/{regionId}/quota
```
Name|Type|Required or not|Default|Description
---|:--:|:--:|:--:|---:
regionId|String|True||Region ID in the region where the JCS for Redis instance is located. At present, JCS for Redis includes North China, South China, and eastern China regions. The Region ID is cn-north-1, cn-south-1 and cn-east-2 respectively.

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
name|string|Name of Quota Item
used|Integer|Number of the Used

- Error Code

Error Code|Description
---|---:
200|OK
