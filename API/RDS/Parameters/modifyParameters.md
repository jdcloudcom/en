# modifyParameters


## Description
Modify Configuration Parameter of SQL Server Instance Some modified parameters can come into force only when being rebooted. For details, please refer to relevant documents of Microsoft<br>- Support SQL Serve onlyr

## Request Method
PUT

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/parameters

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**parameters**|Parameter[]|True| |Modified Instance Parameter|

### Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Parameter Name, with the Following Parameter Supported Now:max_worker_threads,max_degree_of_parallelism,max_server_memory_(MB)|
|**value**|String|False| |Modified Parameter Value|

## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
