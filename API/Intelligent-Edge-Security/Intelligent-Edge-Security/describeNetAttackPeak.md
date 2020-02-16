# describeNetAttackPeak


## Description
Search attack peak

## Request Method
GET

## Request Address
https://edgesecurity.jdcloud-api.com/v1/describeNetAttackPeak


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Start Time|
|**endTime**|String|True| |End Time|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**flow**|Double|Traffic Size|
|**unit**|String|Traffic Unit|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
