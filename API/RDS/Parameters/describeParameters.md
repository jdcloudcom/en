# describeParameters


## Description
View configuration parameter of SQL Server instance<br>- only support SQL Server

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/parameters

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|String|True| |Instance ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeParameters#Result)| |

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**parameters**|[DBInstanceParameter[]](describeParameters#DBInstanceParameter)|List of Instance Configuration Parameters|
### <a name="DBInstanceParameter">DBInstanceParameter</a>
|Name|Type|Description|
|---|---|---|
|**name**|String|Parameter Name|
|**description**|String|Parameter Description|
|**configureValue**|String|The modified parameter value will come into force or not, subject to the case that whether rebooting is required|
|**runningValue**|String|Effective Value in the Current Instance|
|**range**|String|Allowable Range of the Parameter Value|
|**needRestart**|String|Is rebooting required for bringing modification into force.- true: The parameter can come into force upon rebooting, - false: The parameter can come into force without rebooting.|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
