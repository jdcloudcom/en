# updateAlarm


## 描述
Modify alarm rules already created, support to modify alarm rules and notified contact information When the alarm rule is in the status of “Enabled” the alarm rule is allowed to be modified.

## 请求方式
PATCH

## 请求地址
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms/{alarmId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**alarmId**|String|True||Rule id|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**calculation**|String|True||Statistical method: average value=avg, maximum value=max, minimum value=min, summation=sum|
|**contactGroups**|String[]|False||Notify contact group, for example [“contact group 1”, “contact group 2”]|
|**contactPersons**|String[]|False||Notify contact, for example“[‘contact 1’, ‘contact 2’]”|
|**downSample**|String|False||Sampling frequency|
|**metric**|String|True||Query Metric field returned by list API of available monitoring item based on the product line|
|**noticePeriod**|Integer|False||Notification period unit: hour|
|**operation**|String|True||>=、>、<、<=、==、!=|
|**period**|Integer|True||Statistical period (unit: minute), optional value: 2, 5, 15, 30, 60|
|**serviceCode**|String|True||Product name|
|**threshold**|Number|True||Threshold|
|**times**|Integer|True||Alarm after how many times, optional value: 1, 2, 3, 5|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**alarmId**|String|Rule id|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
