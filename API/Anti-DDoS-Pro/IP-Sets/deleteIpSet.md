# deleteIpSet


## Description
Delete instance IP blacklist and whitelist. Support batch operations, multiple ipSetId, separated by ',', can be uploaded in batch operations. Deletion is not allowed when IP blacklist and whitelist rules are referenced

## Request Method
DELETE

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
|**data**|BatchResultDetail| |
### BatchResultDetail
|Name|Type|Description|
|---|---|---|
|**successCount**|Integer|Number of Resources Operated Successfully|
|**failed**|ErrorItem[]|Resources Operation Failed and Reasons|
### ErrorItem
|Name|Type|Description|
|---|---|---|
|**id**|String|Error Resource ID|
|**code**|Long|Error code, same as standard code|
|**details**|Object| |
|**message**|String| |
|**status**|String|Specific error, same as standard status|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
