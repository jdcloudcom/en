# modifyParameterGroupParameters


## Description
Modify parameters of parameter group<br>- Only support MySQL

## Request Method
PUT

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/parameterGroups/{parameterGroupId}/parameters

|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**parameterGroupId**|String|True| |Parameter Group ID|

## Request Parameters
|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**parameters**|Parameter[]|True| |Modified Parameters|

### Parameter
|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Parameter Name, which currently supports the following parameters: max_worker_threads, max_degree_of_parallelism, max_server_memory_(MB)|
|**value**|String|False| |Modified Value of Parameter|

## Returned Parameters
None


## Return Code
|Return Code|Descripton|
|---|---|
|**200**|OK|
