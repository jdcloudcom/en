# describeBlackListRulesOfWebRule


## Description
Search blacklist rules list of web service rules

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules/{webRuleId}/webBlackListRules

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Anti-DDoS Pro instance Id|
|**webRuleId**|String|True| |Web Rule Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page Number; 1 by Default|
|**pageSize**|Integer|False| |Segmentation size; it is 10 by default; value range[10, 100]|


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
|**dataList**|WebBlackListRule[]| |
|**currentCount**|Integer|Current Page Counts|
|**totalCount**|Integer|Total Amount|
|**totalPage**|Integer|Total Number of Pages|
### WebBlackListRule
|Name|Type|Description|
|---|---|---|
|**id**|String|Blacklist Rule Id|
|**name**|String|Blacklist Rule Name|
|**mode**|Integer|Match mode:<br>- 0: uri<br>- 1: ip<br>- 2: cookie<br>- 3: geo<br>- 4: header|
|**key**|String|Match key. <br>- When mode is cookie, upload the name of cookie<br>- When mode is header, upload the key of header|
|**value**|String|Match value. <br>- When mode is uri, upload the uri to be matched<br>- When mode is ip, upload the ip blacklist and whitelist Id to be referenced<br>- When mode is cookie, upload the value of cookie<br>- When mode is header, upload the value of header|
|**pattern**|Integer|Match rules, when mode is uri, cookie and header, it is valid. Include the following match rules: <br>- 0: Exact match<br>- 1: Prefix match<br>- 2: Contain<br>- 3: Regex match<br>- 4: Suffix match|
|**action**|Integer|Processing actions after hit. <br>- 0: Release<br>- 1: CC defense|
|**actionValue**|String|Processing value after hit, when action is 2, the redirection path is actionValue|
|**status**|Integer|Rule status. <br>- 0: Disable <br>- 1: Enable|
|**geoList**|Geo[]|geo blacklist region list, when mode is not geo or not set, this field is null|
### Geo
|Name|Type|Description|
|---|---|---|
|**label**|String|geo Interception Region|
|**value**|String|geo Interception Region Code|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
