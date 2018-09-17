# updateMonitor


## 描述
Modification of domain name monitoring items

## 请求方式
POST

## 请求地址
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/monitorUpdate

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domainId**|String|True||Domain Name ID|
|**regionId**|String|True||Region ID to which the instance belongs|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**updateMonitor**|[UpdateMonitor](##UpdateMonitor)|True||Monitoring Item Information Setting|

### <a name="UpdateMonitor">UpdateMonitor</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**alarmLimit**|Integer|False||Trigger an alarm several times|
|**id**|Integer|False||Monitor Item ID|
|**ipBackup01**|String|False||Alternate Address 1|
|**ipBackup02**|String|False||Alternate Address 2|
|**monitorEnable**|Integer|False||Monitoring status, turn on monitor 2, suspend monitor 4|
|**monitorFreq**|Integer|False||Monitoring frequency, in second|
|**monitorPort**|Integer|False||Monitoring Port|
|**monitorRule**|Integer|False||Do not modify any 0, forcibly suspend Resolution Record 1 to switch to Alternate Address 2 automatically|
|**monitorUri**|String|False||Monitoring Path|
|**notifyEmailEnable**|Integer|False||Do not send mail 0, send mail 1|
|**notifyMsgBarEnable**|Integer|False||Do not send notification bar 0, send notification bar 1|
|**notifySmsEnable**|Integer|False||Do not send SMS 0, send SMS 1|
|**protocol**|Integer|False||https 0，https 1|
|**stopRecoverRule**|Integer|False||0 automatic recovery, 1 manual recovery|
|**switchRecoverRule**|Integer|False||0 restore to the main host automatically, 1 restore to the main host manually|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ID of this request|



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
