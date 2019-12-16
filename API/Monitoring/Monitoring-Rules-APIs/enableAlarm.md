# enableAlarms


## Description
Enabling and Disabling Rules

## Request Method
POST

## Request Address
https://monitor.jdcloud-api.com/v2/groupAlarms:switch


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**alarmIds**|String[]|True| |ID List of Alarm Rules|
|**state**|Long|False| |Enable: 1, Disable 0,|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested identifierid|

### Result
|Name|Type|Description|
|---|---|---|
|**success**|Boolean| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|Enabling and Disabling Rules  | 


