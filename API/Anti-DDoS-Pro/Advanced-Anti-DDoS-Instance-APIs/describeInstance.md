# describeInstance


## 描述
Search instances

## 请求方式
GET

## 请求地址
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||Instance ID|
|**regionId**|String|True||Belonging region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**data**|[Instance](##Instance)||
### <a name="Instance">Instance</a>
|名称|类型|描述|
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

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
