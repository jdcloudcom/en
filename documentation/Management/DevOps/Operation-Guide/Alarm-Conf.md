# Alarm Configuration

It is impossible for the user to pay attention to the data change of each monitoring item all the time. Therefore, it is necessary to configure an effective and reasonable alarm policy to allow the system to automatically send an alarm notification to the user when an exception or error occurs in the machine or service.

Features:

•      Monitoring data is sent to alarm and storage in two ways; storage does not affect alarm speed

•      Effective alarm convergence means to prevent alarm storm

•      Rich exception detection algorithm, support alarm for value change, threshold, sudden increase and decrease, null data, etc.

•      Support alarm callback, which can automatically handle simple faults

•      Solution of data latency: If latency occurs, it is recognized as exception alarm

## Operation Guide


Select product line or the service tree nodes under the product line, select [Intelligent Monitoring] - [Monitoring Configuration] in the menu, and click **Create** on the right on the "Alarm Configuration" page to open the alarm configuration window as shown in the figure.

Support for configuration via form or JSON.

Name: Set the name of this alarm configuration,

Range & Node: Select the scope and specific nodes of the alarm configuration

Alarm level: There are four levels, which are P0 (FATAL), P1 (CRITICAL), P2 (WARNING), and P3 (NOTICE). The severity decreases progressively.

Description: Add Chinese description for the alarm

**Alarm Rules**: Configure alarm policy here, including monitoring items, active group and specific rules. The form supports configuration threshold and no data alarm. You can add multiple alarm rules, set the and (alarm when both/all are satisfied), or (alarm when one is satisfied) dependencies.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide47.jpg)

Alarm Interval: The interval between two alarm notifications

Alarm Callback: Alarm callback, used to configure triggering some operations. Currently, HTTP GET and POST mode requests are supported. Help users to automatically handle faults and quickly stop loss by accessing the callback url when faults occur.

Maximum Number of Alarms: Up to how many alarm notifications can be sent after the alarm is triggered.

Effective Time: The time that the alarm is enabled.

Enable the alarm: Set whether to enable the alarm configuration.

Enable alarm merging: A valid alarm convergence mode, which can only be merged when the ns type of the monitoring item is HOST/INSTANCE. The modes include BY\_APP and BY\_GROUP. When multiple nss trigger the alarm at the same time, the first alarm notification contains one ns, and the subsequent alarm notifications will be combined and sent together, showing one ns. And in other cases, N sets of NS alarm combination >) is adopted to notify.

Receive recovery notification: Whether to send a notification when the alarm event is recovered.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide48.jpg)

Alarm Mode: Select the mode of alarm notification (may be multiple), in which the voice alarm is by default associated to send SMS.

Alarm Group: The alarm group here can be selected from node alarm group and global alarm group, receiving alarm notifications in modes other than voice.

Duty Group: The duty group mainly receives voice alarms and sends SMS at the same time.

Voice Effective Time: Configure the effective time period for voice alarms.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide49.jpg)

## JSON Configuration Case


**(1) JSON Configuration Field Description**

```json
{
	"JUDGE": {
		"alarmInterval": [
			5
		],  ---[Configure the alarm time interval, which can be set as an array (20, 2, 5... trigger time point is the first time, 20 is the interval between the first time and the second time)]
		"switchConfig": {
			"enableTime": {
				"beginTime": "00:00",
				"endTime": "23:59"
			},
			"on": true
		},  ---[Alarm switch, whether to enable: Enabling time period]
		"level": "WARNING",  ---[Alarm Level]
		"conditionTagEqual": false,
		"conditionOperator": "&&",  ---[Alarm dependency, || or &&, or relation, and relation]
		"conditionList": [  ---[Alarm rules (may add multiple dependency rules)]
			{
				"formula": "Compulsory cpu.idle < 80",  ---[Judging rules of monitoring items alarm]
				"metricDataFilter": {  ---[Filter the monitoring items whose statistics type and the tag matching result are true.]
					"tags": "",  ---[Monitoring item tags, supporting the inclusion and exclusion relations. HasTag (1 parameter), NotHasTag, TagValueIn, TagValueNotIn(\"core\", \"1,2,3\”) refer to that tag value is only met when it is not in this scope. When the tag field is null, match the monitoring items excluding tags.]
					"valueType": "STATISTIC",  ---[Support STRING, STATISTIC]
					"valueKey": "AVG"  ---【MAX|AVGetc. effective when valueType=STATISTIC]
				},
				"parameter": {
					"simple": [
						5,
						3
					]  ---[Represents that there are n times out of m times that the collected data meets the alarm threshold. When using the sudden increase and decrease alarm, this rule is invalid.]
				},
				"nsFilter": "",  ---[Filter ns; the specific filter modes are in the following table]
				"nsType": "HOST",  ---[HOST (machine, system halt, agent) |INSTANCE (process, port, ssh, log, customization)|APP (aggregation monitoring)|DOMAIN (domain name monitoring)]
				"ns": ""
			}
		]
	}
}
```

Functions supported by nsFilter:

| Function Name       | Parameter Number | Function Description                    | Example                                         |
| -------------- | -------- | --------------------------- | -------------------------------------------- |
| GroupIn        | 1        | The group is within this scope              | GroupIn(\\"pre,online\\"\)                   |
| HasHostTag     | 1        | Return true when including this HostTag       | HasHostTag(\\"backup\\")                     |
| HostTagValueIn | 2        | The specified HostTag value is within the specified scope | HostTagValueIn(\\"version\\", \\"1.0,2.0\\") |
| NsContain      | 1        | nsThe specified character string is included        | NsContain(\\"judge-hawkeye-ark\\")          |
| HasTag         | 1        | Including tag                     | HasTag(\\"lang\\")                           |
| TagValueIn     | 2        | The specified tag value is within the specified scope     | TagValueIn(\\"priority\\",\\"0,1\\")         |



```json
{
	"ALERT": {
		"tagTransDict": [
			{
				"dict": [
					""
				],
				"tag": ""
			}
		],  ---[Describes the Chinese explanation of tag value. Fill key in tag, and fill escape in dict]
		"noticer": "$sys_op$, $app_dev$",  ---[Alarm Group]
		"callNoticer": "$product_onCall$",  ---[Duty Group]
		"callEnableTime": {
			"beginTime": "21:00",
			"endTime": "09:00"
		},  ---[The time the duty group receiving alarms]
		"note": "",---[Add Chinese description of alarm configuration]
		"merge": {
			"on": true,
			"method": "BY_APP"
		}, ---[The alarm is merged with the premise that the premise can only be performed when the ns type of the monitoring item is HOST/INSTANCE Mode: BY_APP, BY_GROUP (Put one ns in the first alarm, the following ones merge to be sent, <{{.N}} NS alarm merge>)]
		"sendFlag": 7, ---[sendFlag: Value. Sending email for 1, SMS for 2, Dongdong for 4, and voice message for 8; multiple notification                             modes are combined, the value being the value sum of the corresponding multiple notification                             modes]
		"maxAlarmTime": 3,  ---[Set the maximum number of alarm notifications to be sent before alarm recovery]
		"sendRecoveryNotice": true,  ---[Whether to receive recovery notification when the alarm event is recovered]
		"callback": {  ---[Alarm Callback]
			"timing": {
				"whenNoticeComes": true,  ---[Call back once the alarm is triggered]
				"atFirstTime": false,  ---[Call back by default every time the alarm is triggered, true, call back when the alarm is triggered for the first time]
				"whenEventEnds": true  ---[Call back when the event is recovered]
			},
			"parameter": {
				"url": "",  ---[Callback Address]
				"requestMethod": "POST",  ---[Request mode, support POST and GET]
				"header": {
					"Content-Type": "application/x-www-form-urlencoded"
				},  ---[Request header, you may fill in the field value pair in the request header]
				"postData": ""  ---[Request Body]
			},
			"type": "CURL",  ---[Callback mode, curL command]
			"on": false  ---[Set whether to enable callback]
		}
	}
}
```

**(2) Monitoring item value change alarm**      

Monitor item value change alarm: The formula field configures the ValueChange (metricname) function; fill in the monitoring item name in the brackets.

**(3) No data alarm on monitoring item**      

No data alarm: The formula field configures Nodata (metricname, n or t) function

•       Nodata(cpu.idle, 3)3 means 3 cycles

•       Nodata(cpu.idle, "1h45m"), means it’s true when cpu.idle is lost for more than 1 hour and 45 minutes

**(4) Traffic and other suddenly increasing or decreasing alarm**      

```json
"parameter": {
"advanced": {
  "param": [
    [
      0.1, 0.1
    ],
    [
      0.05, 0.07
    ],
    [
      0.07, 0.15
    ],
    [
      0.05, 0.2
    ]
  ],  ---[The parameters of the four groups represent the working day busy hours/working day idle hours/weekend busy hours/weekend idle hours configuration. The two parameters configured in each group are the rising percentage threshold and the falling percentage threshold.]
"disableSwitch": {
  "on": false,
  "disableTime": [
    {
      "beginTime": "00:15",
      "endTime": "00:31",
    }
  ],
  "minActiveValue": 5000
},
}
```

>`
disableSwitch Configuration Description:
`

>`disableTime: If the time period needs to exclude an interval, that is, you want to block the sudden increase and decrease between 00:15-00:30, you need to write the endTime as 00:31, the hour and minute must be a character string of 2 digits, the hour should be in 24-hour system, and the beginTime must be less than endTime`

>` minActiveValue: It is used to set a minimum value to judge the sudden increase and decrease, avoiding some unnecessary alarms. If and only if the average value of both windows is greater than this value, it will be judged as exception. Please note to set on as tr when setting this valueue
`