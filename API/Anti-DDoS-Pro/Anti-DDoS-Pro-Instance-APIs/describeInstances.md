# describeInstances


## Description
Search the instance list

## Request method
GET

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Belonging region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|False||Instance name, fuzzy matching available|
|**pageNumber**|Integer|False||Page number; 1 by default|
|**pageSize**|Integer|False||Paging size; it is 20 by default; value range [10, 100]|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**dataList**|Instance[]||
|**totalCount**|Integer||
### <a name="Instance">Instance</a>
|Name|Type|Description|
|---|---|---|
|**abovePeakCount**|Integer|Frequency of over peak value|
|**businessBitslimit**|Integer|Business bandwidth|
|**carrier**|String|ISP Line, i.e. UNICOM and TELECOM|
|**ccProtectMode**|Integer|cc defense mode, 0->normal  1->critical  2->relaxed  3->customized|
|**ccProtectStatus**|Integer|cc enabling status, 0->disabled  1->enabled|
|**ccSpeedLimit**|Integer|cc defense mode has the same speed limit as customized mode|
|**ccSpeedPeriod**|Integer|cc defense mode has the same speed limit period as customized mode|
|**ccThreshold**|Integer|CC threshold|
|**chargeStatus**|String|Billing status, PAID->normal  ARREARS->overdue  EXPIRED->expired|
|**createTime**|Integer|Instance creation time|
|**elasticTriggerCount**|Integer|Times of triggering elastic bandwidth|
|**expireTime**|Integer|Instance expiration time|
|**hostQps**|Integer|The protection threshold of each Host when ccProtectMode is a customized mode|
|**hostUrlQps**|Integer|The protection threshold of each Host+URI when ccProtectMode is a customized mode|
|**inBitslimit**|Integer|Minimum bandwidth|
|**instanceId**|Integer|Instance ID|
|**ipBlackList**|String[]|IP blacklist|
|**ipBlackStatus**|Integer|IP blacklist status, 0->disabled  1->enabled|
|**ipHostQps**|Integer|The protection threshold of each source IP to Host when ccProtectMode is a customized mode|
|**ipHostUrlQps**|Integer|The protection threshold of each source IP to Host+URI when ccProtectMode is a customized mode|
|**ipWhiteList**|String[]|IP white list|
|**ipWhiteStatus**|Integer|IP white list status, 0->disabled  1->enabled|
|**name**|String|Instance Name|
|**pin**|String|User pin|
|**resilientBitslimit**|Integer|Elastic bandwidth|
|**resourceId**|String|Resource ID, used during upgrade and renewal|
|**ruleCount**|Integer|Non-web service rules|
|**securityStatus**|String|Security status, SAFE->security  CLEANING->cleaning  BLOCKING-blocking|
|**urlWhitelist**|String[]|url white list|
|**urlWhitelistStatus**|Integer|url white list status, 0->disabled  1->enabled|
|**webRuleCount**|Integer|Web service rules|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
