# modifyBlackListRuleOfWebRule


## Description
Modify blacklist rules of web service rules

## Request Method
PATCH

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules/{webRuleId}/webBlackListRules/{webBlackListRuleId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Anti-DDoS Pro instance Id|
|**webRuleId**|String|True| |Web Rule Id|
|**webBlackListRuleId**|String|True| |Blacklist rule Id of web service rules|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**webBlackListRuleSpec**|WebBlackListRuleSpec|True| |Modify request parameters of blacklist rules of web service rules|

### WebBlackListRuleSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Blacklist Rule Name|
|**mode**|Integer|True| |Mode:<br>- 0: uri<br>- 1: ip<br>- 2: cookie<br>- 3: geo<br>- 4: header|
|**key**|String|False| |Match key, required in case mode is cookie and header. <br>- When mode is cookie, upload the name of cookie<br>- When mode is header, upload the key of header|
|**value**|String|True| |Match value. <br>- When mode is uri, upload the uri to be matched<br>- When mode is ip, upload the ip blacklist and whitelist Id to be referenced<br>- When mode is cookie, upload the value of cookie<br>- When mode is geo, upload the geo region code, character string separated by ','. Search <a href='http://docs.jdcloud.com/anti-ddos-pro/api/describewebruleblacklistgeoareas'>describeWebRuleBlackListGeoAreas</a> API to get settable region code list<br>- When mode is header, upload the value of header|
|**pattern**|Integer|False| |Match Rules, required in case mode is uri, cookie and header. Support the following match rules: <br>- 0: Exact match<br>- 1: Prefix match<br>- 2: Contain<br>- 3: Regex match<br>- 4: Suffix match|
|**action**|Integer|True| |Processing actions after hit. <br>- 0: Block<br>- 1: Redirect<br>- 2: Verification code|
|**actionValue**|String|False| |Processing value after hit, when action is 1, upload the redirection path|
|**status**|Integer|True| |Rule status. <br>- 0: Disable <br>- 1: Enable|

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
|**code**|Integer|Modification results, 0: Modification failed, 1: Modification succeeded|
|**message**|String|Please specify reasons for modification failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
