# describeInstances


## Description
Search the instance list

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page Number: 1 by default|
|**pageSize**|Integer|False| |Paging Size: 20 by default; value range [10, 100]|
|**name**|String|False| |Instance Name, Fuzzy Matching Available|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**code**|Integer|Request Error Status Code|
|**status**|String|Request Error Status Code|
|**message**|String|Request Error Notification|
### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|Instance[]| |
|**currentCount**|Integer|Current Page Counts|
|**totalCount**|Integer|Total Amount|
|**totalPage**|Integer|Total Number of Pages|
### Instance
|Name|Type|Description|
|---|---|---|
|**id**|Long|Instance ID|
|**name**|String|Instance Name|
|**carrier**|Integer|Link type, 1: China Telecom, 2: China Telecom, China Unicom, 3: China Telecom, China Unicom and China Mobile|
|**ipType**|Integer|ip types that can be protected, only China Telecom Line supports IPV6 ISP line at present:<br>- 0: IPV4,<br>- 1: IPV4/IPV6<br>|
|**elasticTriggerCount**|Integer|Times of Triggering Elastic Bandwidth|
|**abovePeakCount**|Integer|Frequency of Over Peak Value|
|**inBitslimit**|Integer|Minimum Bandwidth|
|**resilientBitslimit**|Integer|Elastic Bandwidth|
|**businessBitslimit**|Integer|Business Bandwidth|
|**ccThreshold**|Integer|CC Threshold|
|**ruleCount**|Integer|Non-web Service Rules|
|**webRuleCount**|Integer|Web Service Rules|
|**chargeStatus**|String|PAID|ARREARS|EXPIRED|
|**securityStatus**|String|SAFE|CLEANING|BLOCKING|
|**createTime**|String|Instance Creation Time|
|**expireTime**|String|Instance Expiration Time|
|**resourceId**|String|Resource ID, used during upgrade and renewal|
|**ccProtectMode**|Integer|cc Defense Mode, 0->normal  1->critical  2->relaxed  3->customized|
|**ccProtectStatus**|Integer|cc enabling status, 0->disabled  1->enabled|
|**ccSpeedLimit**|Integer|cc defense mode has the same speed limit as customized mode|
|**ccSpeedPeriod**|Integer|cc defense mode has the same speed limit period as customized mode|
|**ipBlackList**|String[]|IP Blacklist|
|**ipBlackStatus**|Integer|IP Blacklist Status, 0->disabled  1->enabled|
|**ipWhiteList**|String[]|IP White List|
|**ipWhiteStatus**|Integer|IP White List Status, 0->disabled  1->enabled|
|**urlWhitelist**|String[]|url White List|
|**urlWhitelistStatus**|Integer|url White List Status, 0->disabled  1->enabled|
|**hostQps**|Integer|The protection threshold of each Host when ccProtectMode is a customized mode|
|**hostUrlQps**|Integer|The protection threshold of each Host+URI when ccProtectMode is a customized mode|
|**ipHostQps**|Integer|The protection threshold of each source IP to Host when ccProtectMode is a customized mode|
|**ipHostUrlQps**|Integer|The protection threshold of each source IP to Host+URI when ccProtectMode is a customized mode|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
