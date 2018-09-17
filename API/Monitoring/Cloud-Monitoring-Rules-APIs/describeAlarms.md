# describeAlarms


## 描述
Query monitoring rules, supporting query based on rule status, alarm status, resource ID and product name.

## 请求方式
GET

## 请求地址
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**enabled**|Integer|False||Rule status: 1 is Enable, 0 is Disable|
|**isAlarming**|Integer|False||Whether it is the rule that is alarming, 0 is neglect, 1 is yes, only one can take effect at the same time as status, isAlarming takes priority to take effect|
|**pageNumber**|Integer|False||Page; it is 1 by default, the value range: [1,∞)|
|**pageSize**|Integer|False||Paging size; it is 20 by default; value range[10, 100]|
|**resourceId**|String|False||Resource Id|
|**serviceCode**|String|False||Product name|
|**status**|Integer|False||Rule alarm status, 1: Normal, 2: Alarm, 4: Insufficient data|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**alarmList**|[Alarm[]](##Alarm)|List of rules|
|**numberPages**|Number|Number of total pages|
|**numberRecords**|Number|Number of total records|
|**pageNumber**|Number|Page|
|**pageSize**|Number|Paging size|
### <a name="Alarm">Alarm</a>
|名称|类型|描述|
|---|---|---|
|**calculation**|String|Statistical method: average value=avg, maximum value=max, minimum value=min,|
|**contactGroups**|String[]|Notify contact group, for example [“contact group 1”, “contact group 2”]|
|**contactPersons**|String[]|Notify contact, for example“[‘contact 1’, ‘contact 2’]”|
|**createTime**|String|Creation time|
|**enabled**|Integer|Enable&Disable 1 Enable, 0 Disable|
|**id**|String|Rule id|
|**metric**|String|Monitoring item|
|**metricName**|String|Name of rule id monitoring item|
|**noticePeriod**|Integer|Notification period unit: hour|
|**noticeTime**|String|Alarm time  ,  this field is valid when querying the alarming rule|
|**operation**|String|>=、>、<、<=、==、！=|
|**period**|Integer|Statistical period (unit: minute)|
|**region**|String|Region information|
|**resourceId**|String|Resource id applied by this rule|
|**serviceCode**|String|Product corresponded to the alarm rule|
|**status**|Integer|Monitoring item status: 1 Normal, 2 Alarm, 4 Insufficient data|
|**tag**|String|Auxiliary information of monitoring item|
|**threshold**|Number|Threshold|
|**times**|Integer|Alarm after how many times|
|**value**|Number|Alarm value, this field is valid when querying the alarming rule|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
