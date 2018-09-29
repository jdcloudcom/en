# describeInstances


## Description
Search the instance list

## Request method
GET

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Belonging Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|False| |Instance Name, Fuzzy Matching Available|
|**pageNumber**|Integer|False| |Page Number: 1 by default|
|**pageSize**|Integer|False| |Paging Size: 20 by default; value range [10, 100]|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|Instance[]| |
|**totalCount**|Integer| |
### Instance
|Name|Type|Description|
|---|---|---|
|**abovePeakCount**|Integer|Frequency of Over Peak Value|
|**businessBitslimit**|Integer|Business Bandwidth|
|**carrier**|String|ISP Line, i.e. UNICOM and TELECOM|
|**ccProtectMode**|Integer|cc Defense Mode, 0->normal  1->critical  2->relaxed  3->customized|
|**ccProtectStatus**|Integer|cc enabling status, 0->disabled  1->enabled|
|**ccSpeedLimit**|Integer|cc defense mode has the same speed limit as customized mode|
|**ccSpeedPeriod**|Integer|cc defense mode has the same speed limit period as customized mode|
|**ccThreshold**|Integer|CC Threshold|
|**chargeStatus**|String|PAID|ARREARS|EXPIRED|
|**createTime**|Integer|Instance Creation Time|
|**elasticTriggerCount**|Integer|Times of Triggering Elastic Bandwidth|
|**expireTime**|Integer|Instance Expiration Time|
|**hostQps**|Integer|The protection threshold of each Host when ccProtectMode is a customized mode|
|**hostUrlQps**|Integer|The protection threshold of each Host+URI when ccProtectMode is a customized mode|
|**inBitslimit**|Integer|Minimum Bandwidth|
|**instanceId**|Integer|Instance ID|
|**ipBlackList**|String[]|IP Blacklist|
|**ipBlackStatus**|Integer|IP Blacklist Status, 0->disabled  1->enabled|
|**ipHostQps**|Integer|The protection threshold of each source IP to Host when ccProtectMode is a customized mode|
|**ipHostUrlQps**|Integer|The protection threshold of each source IP to Host+URI when ccProtectMode is a customized mode|
|**ipWhiteList**|String[]|IP White List|
|**ipWhiteStatus**|Integer|IP White List Status, 0->disabled  1->enabled|
|**name**|String|Instance Name|
|**pin**|String|User Pin|
|**resilientBitslimit**|Integer|Elastic Bandwidth|
|**resourceId**|String|Resource ID, used during upgrade and renewal|
|**ruleCount**|Integer|Non-web Service Rules|
|**securityStatus**|String|SAFE|CLEANING|BLOCKING|
|**urlWhitelist**|String[]|url White List|
|**urlWhitelistStatus**|Integer|url White List Status, 0->disabled  1->enabled|
|**webRuleCount**|Integer|Web Service Rules|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
