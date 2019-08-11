# describeInstances


## Description
Search the instance list

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page Number: 1 by default|
|**pageSize**|Integer|False| |Paging Size: 20 by default; value range [10, 100]|
|**name**|String|False| |Instance name, fuzzy matching available|


## Response parameter
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
|**dataList**|Instance[]| |
|**currentCount**|Integer|Current Page Counts|
|**totalCount**|Integer|Total Amount|
|**totalPage**|Integer|Total Number of Pages|
### Instance
|Name|Type|Description|
|---|---|---|
|**id**|String|Instance ID|
|**name**|String|Instance Name|
|**carrier**|Integer|Link Type. <br>- 1: China Telecom<br>- 3: China Telecom, China Unicom and China Mobile|
|**ipType**|Integer|IP type that can be protected, only China Telecom Line supports IPV6 ISP line at present. <br>- 0: IPV4. <br>- 1: IPV4/IPV6|
|**elasticTriggerCount**|Integer|Times of Triggering Elastic Bandwidth|
|**abovePeakCount**|Integer|Frequency of Over Peak Value|
|**inBitslimit**|Integer|Minimum Bandwidth|
|**resilientBitslimit**|Integer|Elastic Bandwidth|
|**businessBitslimit**|Integer|Business Bandwidth|
|**ccThreshold**|Integer|CC Threshold Size|
|**ccPeakQPS**|Integer|CC defense Peak, unit: QPS|
|**ruleCount**|Integer|Non-web Service Rules|
|**webRuleCount**|Integer|Web Service Rules|
|**chargeStatus**|String|Billing status: <br>- PAID: Paid<br>- ARREARS: Overdue<br>- EXPIRED: Expired|
|**securityStatus**|String|Security status: <br>- SAFE: Safe<br>- CLEANING: Clean<br>- BLOCKING: Blocking|
|**createTime**|String|Instance Creation Time|
|**expireTime**|String|Instance Expiration Time|
|**resourceId**|String|Resource ID, used during upgrade and renewal|
|**ccObserveMode**|Integer|CC defense observer mode. <br>- 0: Disable <br>- 1: Enable|
|**ccProtectMode**|Integer|CC defense mode. <br>- 0: Normal <br>- 1: Critical <br>- 2: Loose <br>- 3: Customized|
|**ccProtectStatus**|Integer|CC enabling status. <br>- 0: Disable <br>- 1: Enable|
|**ccSpeedLimit**|Integer|CC defense mode is with the same speed limit as customized mode|
|**ccSpeedPeriod**|Integer|CC defense mode is with the same speed limit period as customized mode|
|**ipBlackList**|String[]|IP blacklist|
|**ipBlackStatus**|Integer|IP blacklist status. <br>- 0: Disable <br>- 1: Enable|
|**ipWhiteList**|String[]|IP white list|
|**ipWhiteStatus**|Integer|IP whitelist status. <br>- 0: Disable <br>- 1: Enable|
|**urlWhitelist**|String[]|url White List|
|**urlWhitelistStatus**|Integer|url whitelist status. <br>- 0: Disable <br>- 1: Enable|
|**hostQps**|Integer|The protection threshold of each Host when ccProtectMode is a customized mode|
|**hostUrlQps**|Integer|The protection threshold of each Host+URI when ccProtectMode is a customized mode|
|**ipHostQps**|Integer|The protection threshold of each source IP to Host when ccProtectMode is a customized mode|
|**ipHostUrlQps**|Integer|The protection threshold of each source IP to Host+URI when ccProtectMode is a customized mode|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
