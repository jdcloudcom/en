# describeParameters


## Description
View configuration parameter of SQL Server instance<br>- only support SQL Server

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/parameters

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**parameters**|DBInstanceParameter[]|List of Instance Configuration Parameters|
### DBInstanceParameter
|Name|Type|Description|
|---|---|---|
|**configureValue**|String|The modified parameter value will come into force or not, subject to the case that whether rebooting is required|
|**description**|String|Parameter Description|
|**name**|String|Parameter Name|
|**needRestart**|String|Is rebooting required for bringing modification into force.- true: The parameter can come into force upon rebooting, - false: The parameter can come into force without rebooting.|
|**range**|String|Allowable Range of the Parameter Value|
|**runningValue**|String|Effective Value in the Current Instance|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
