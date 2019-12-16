# modifyParameters


## Description
For modifying the configuration parameter of SQL Server instance, the following parameter:max_worker_threads,max_degree_of_parallelism,max_server_memory_(MB) is supported. Some modified parameters can come into force only when being rebooted. For details, please refer to relevant document of Microsoft. <br>- Only Support SQL Server

## Request Method
PUT

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/parameters

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|String|True| |Instance ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**parameters**|[Parameter[]](#Parameter)|True| |Modified Instance Parameter|

### <a name="Parameter">Parameter</a>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Parameter Name|
|**value**|String|True| |Modified Parameter Value|

## Response parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
