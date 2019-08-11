# describeWhiteListRuleOfWebRule


## Description
Search whitelist rules of web service rules

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules/{webRuleId}/webWhiteListRules/{webWhiteListRuleId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Anti-DDoS Pro instance Id|
|**webRuleId**|String|True| |Web Rule Id|
|**webWhiteListRuleId**|String|True| |Whitelist rule Id of web service rules|

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
|**data**|WebWhiteListRule| |
### WebWhiteListRule
|Name|Type|Description|
|---|---|---|
|**id**|String|Whitelist Rule Id|
|**name**|String|Whitelist Rule Name|
|**mode**|Integer|Match mode:<br>- 0: uri<br>- 1: ip<br>- 2: cookie<br>- 3: geo<br>- 4: header|
|**key**|String|Match key. <br>- When mode is cookie, upload the name of cookie<br>- When mode is header, upload the key of header|
|**value**|String|Match value. <br>- When mode is uri, upload the uri to be matched<br>- When mode is ip, upload the ip blacklist and whitelist Id to be referenced<br>- When mode is cookie, upload the value of cookie<br>- When mode is header, upload the value of header|
|**pattern**|Integer|Match rules, when mode is uri, cookie and header, it is valid. Include the following match rules: <br>- 0: Exact match<br>- 1: Prefix match<br>- 2: Contain<br>- 3: Regex match<br>- 4: Suffix match|
|**action**|Integer|Processing actions after hit. <br>- 0: Release<br>- 1: CC defense|
|**status**|Integer|Rule status. <br>- 0: Disable <br>- 1: Enable|
|**geoList**|Geo[]|geo Whitelist Region List|
### Geo
|Name|Type|Description|
|---|---|---|
|**label**|String|geo Interception Region|
|**value**|String|geo Interception Region Code|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
