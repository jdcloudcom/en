# createInstance


## Description
Create protection package instances and supporting regions: cn-north-1, cn-east-1 and cn-east-2

## Request Method
POST

## Request Address
https://antipro.jdcloud-api.com/v1/regions/{regionId}/instances

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Code|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**createInstanceSpec**|CreateInstanceSpec|True| |Create protection package instance request parameter|

### CreateInstanceSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Protection package instance name, required while purchasing new protection packages<br>The length is limited to 1-80 characters, only supporting Chinese characters, letters, numbers, -, ., / and _<br>|
|**ipNum**|Integer|True| |Protective IP counts, 1, 5, 10, 50, 100 and 1,000 (infinite)|
|**bpGbps**|Integer|True| |Basic bandwidth: 10, 20, 30 and 50, unit: Gbps|
|**epGbps**|Integer|True| |Elastic bandwidth: 0, 10 and 20, Unit: Gbps|
|**timeSpan**|Integer|True| |Purchased protection package duration, required while purchasing new protection packages<br>- When timeUnit is 3, the value can be 1-9<br>- When timeUnit is 4, the value can be 1-3<br>|
|**timeUnit**|Integer|True| |Purchase duration type, required when a new protection package is purchased<br>- 3: month<br>- 4: year|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**err**|Err| |
### Err
|Name|Type|Description|
|---|---|---|
|**code**|Long|Same as http code|
|**details**|Object| |
|**message**|String| |
|**status**|String|Specific Error|
### Result
|Name|Type|Description|
|---|---|---|
|**instanceId**|String|Created protection package instance Id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
