# describeParameterGroupParameters


## Description
View parameters of parameter group<br>- Only support MySQL

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/parameterGroups/{parameterGroupId}/parameters

|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**parameterGroupId**|String|True| |Parameter Group ID|

## Request Parameters
None


## Returned Parameters
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeParameterGroupParameters#Result)| |

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**parameters**|[ParameterGroupParameter[]](describeParameterGroupParameters#ParameterGroupParameter)| |
### <a name="ParameterGroupParameter">ParameterGroupParameter</a>
|Name|Type|Description|
|---|---|---|
|**name**|String|Parameter Name|
|**description**|String|Parameter Description|
|**configureValue**|String|Whether the value of modified parameter will take effect or not, subject to the case that whether the parameter is required for reboot|
|**defaultValue**|String|Default Value of Parameter|
|**range**|String|Allowable Range of the Parameter Value|
|**type**|String|Type of Parameter Value|
|**needRestart**|String|Whether reboot is required for taking effect of parameter modification- true: parameter needs reboot for taking effect- false: no reboot is required for taking effect of parameter|

## Return Code
|Return Code|Descripton|
|---|---|
|**200**|OK|
