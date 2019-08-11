# describeIpSet


## Description
Search instance IP blacklist and whitelist

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/ipSets/{ipSetId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Anti-DDoS Pro instance Id|
|**ipSetId**|String|True| |IP Blacklist and Whitelist Id|

## Request Parameter
None


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
|**data**|IpSet| |
### IpSet
|Name|Type|Description|
|---|---|---|
|**id**|String|IP Blacklist and Whitelist Id|
|**name**|String|IP Blacklist and Whitelist Name|
|**ip**|String[]|Arrays of IP or IP Segment|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
