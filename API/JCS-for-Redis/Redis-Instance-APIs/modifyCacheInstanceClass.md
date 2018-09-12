# modifyCacheInstanceClass


## 描述
Changing the configuration of the Redis instance can only change the instance configuration in the running status and the specification of the changed configuration cannot be the same as the previous one
Pay-in-advance users, from the cluster version to the principal/subordinate version, the  memory size of the new specification is larger than the old size of the memory size, from the principal/subordinate version to the cluster version, the memory size of the new specification is no less than the memory size of the old specification


## 请求方式
POST

## 请求地址
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}:modifyCacheInstanceClass

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**cacheInstanceId**|String|True||The ID of the Redis instance is the unique identifier to access to instance.|
|**regionId**|String|True||The Region ID of the region where the Redis instance is located. At present, the Redis has North China, South China, and East China regions, and the corresponding Region IDs are cn-north-1, cn-south-1, and cn-east-2|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**cacheInstanceClass**|String|True||The modified Redis type after the change, see: <a href="https://www.jdcloud.com/help/detail/411/isCatalog/1">instance type code</a>|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ID of This Change Request|
|**result**|[Result](##Result)|The Result Information of This Request.|


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**orderNum**|String|The Order Number of This Change Request.|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
