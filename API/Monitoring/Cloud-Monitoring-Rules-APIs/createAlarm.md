# createAlarm


## 描述
Create alarm rules, it can create alarm rules for a certain instance, or it also can create alarm rules for multiple instances at the same time.

## 请求方式
POST

## 请求地址
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**clientToken**|String|True||Idempotent validation parameter, 32-bit at the longest, the return value will not change if the value does not change|
|**createAlarmSpec**|[CreateAlarmSpec](##CreateAlarmSpec)|True|||

### <a name="CreateAlarmSpec">CreateAlarmSpec</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**calculation**|String|True||Statistical method must be consistent with the defined metric, with an optional list of values: avg, max, sum, min|
|**contactGroups**|String[]|False||Contact group notified by alarm rules must be already created on the console, for example“[‘contact group 1’, ‘contact group 2’]”|
|**contactPersons**|String[]|False||Contacts notified by alarm rules must be already created on the console, for example“[‘contact 1’, ‘contact 2’]”|
|**downSample**|String|False||Sampling frequency, some metrics support setting downSample, through <a href="https://www.jdcloud.com/help/detail/2791/isCatalog/1">[Query metric list to create monitoring rules available]</a>API is available for viewing.|
|**metric**|String|True||For values, please view <a href="https://www.jdcloud.com/help/detail/2791/isCatalog/1"> [Query metric list to create monitoring rules available]</a> metric field of API|
|**noticePeriod**|Integer|False||Notification period unit: hour|
|**operation**|String|True||Alarm comparison is limited to <=,<,>,>=,==,!=|
|**period**|Integer|True||Statistical period, unit in minutes, currently supported value: 2, 5, 15, 30, 60|
|**resourceIds**|String[]|True||Alarm rules shall correspond to the Instance List, 100 pieces at most each time, for example"['resourceId1','resourceId2']"|
|**serviceCode**|String|True||For values of product name, please view <a href="https://www.jdcloud.com/help/detail/2791/isCatalog/1">[Query metric list to create monitoring rules available ]</a> serviceCode field of API|
|**threshold**|Number|True||Alarm threshold, currently, only numeric type is available|
|**times**|Integer|True||Continuous periods, alarms are made when several statical periods meet threshold value conditions through continuous detections, optional values: 1, 2, 3, 5|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**alarmIdList**|String[]|Rule id list created successfully|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
