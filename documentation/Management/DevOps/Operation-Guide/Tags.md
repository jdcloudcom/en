# Tags Instructions

tag can be regarded as label or attribute, e.g., function of adding labels to friends in WeChat. Use tag can conveniently identify one or a class of objects, so as to filter out objects with a certain characteristic or a certain label during the operation.

There are two kinds of tags on the intelligent monitoring platform:

(1) Tag of monitoring object: Mainly refers to tags of application, group, instance or machine, wherein tags of group or instance can be used to mark production environment, regions, etc., tag a machine can mark its server type, etc.

(2) Tag of monitoring item: Monitoring item tags include attributes that added by platform by default, user customized in log monitoring and custom metric monitoring as monitoring items, facilitating users to differentiate values of monitoring items under different attributes. It is used in the form of adding "/key = value" after the monitoring item, wherein key is the keyword of tag and value is the value of tag.

The monitoring items added with tags by the platform by default include:

- cpu.idle/core=0, 1 presents cpu idle rate of a certain core;
- Monitoring items of disk utilization, mount=/ presents the disk utilization of a specific attaching point
- For disk.io, /device = sda, ... tag presents io utilization of a certain partition
- For net.ini/out,  /iface=eth0, tag presents network traffic situation of a certain network interface
- Tag, sidc, sisp of domain name monitoring items present machine room and operator respectively.

## User Guide


**(I) Add tags for monitoring objects**

It shall be noted that tag can be inherited down, tag of application can be inherited to group, tag of group can be inherited to instance, inherited tag of nodes at lower hierarchy level will be deleted synchronously in the case that it is deleted at the higher hierarchy level.

(1) Before using tag, it shall be added to application, group, instance and machine, the specific operations are shown as below.

​    a. Add tag for application: Select the application node in the service tree at the left, select [Configuration Management] - [Service Tree] in the menu to access Edit Application page as shown in the figure. Click **Add** after the tags field, add tag in the form of key:value, click **OK** at the bottom to save it.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide52.jpg)

 b. Add tag for group: Similarly, select application node in the service tree at the left, select  [Configuration Management] - [Service Tree] in the menu to access Edit Application page as shown in the figure. Click **Edit Group** tab to add, edit tag of group as shown in the figure.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide53.jpg)

 c. Add tag for instance: Similarly, access the Edit Application page as shown in the figure. Click **Edit Instance** tab to add and edit tag of instance.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide54.jpg)

 d. Add tag for machine: Open Edit Application page. Click **Machine List** tab to select the machine, then click **Tag in Batch** at the top of the list to add tag for the machine.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide55.jpg)

(II) Configuration monitoring item tag

(1) As mentioned above, the monitoring items added with tags by the platform by default include:

- ​      cpu.idle/core=0, 1 presents cpu idle rate of a certain core;
- ​      Monitoring items of disk utilization, mount=/ presents the disk utilization of a specific attaching point
- ​      For disk.io, /device = sda, ... tag presents io utilization of a certain partition
- ​      For net.ini/out,  /iface=eth0, tag presents network traffic situation of a certain network interface
- ​      Tag, sidc, sisp of domain name monitoring items present machine room and operator respectively.

(2) Log monitoring can configure monitoring item tag according to log contents to obtain different status response time as shown in the figure.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide56.JPG)

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide57.jpg)

(3) Custom metric monitoring can define output monitoring items and their tags in the script, see Acquisition Configuration of Custom Metric Monitoring for specific configuration method.

(III) Use of tag

(1) Use tag in primary aggregation configuration

In primary aggregation, select monitoring items with tags, select disk available rate as shown in the figure to allow aggregation at tag dimension, which can summarize the available rate of disks at different disk attaching points.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide58.jpg)

(2) Use tag in secondary aggregation configuration

In secondary aggregation, use filterTags field to filter tag for calculative monitoring items with the format: key=[value1|value2|value3], e.g., isp=[dx|lt|yd], \_group=[mjq|langfang]. It presents to filter selected operator and selected data for aggregation.

(3) Use tag in alarm configuration

In form-base alarm configuration, when alarming for monitoring items with tags, it can filter by tag values. Monitoring item of domain name monitoring is shown as in the figure. Selecting sidc = mjq presents that only alarms for this item in this machine room. Facilitate users to configure alarm flexibly.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide59.jpg)

In the JSON alarm configuration, tags field is used to configure monitoring item tag, nsFilter field can be used to filter monitoring objects (application, instance, machine, etc.), implementing alarm for part of groups, machines, etc.

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
| NsContain      | 1        | nsThe specified character string is included        | NsContain(\\".judge-hawkeye-ark\\")          |
| HasTag         | 1        | Including tag                     | HasTag(\\"lang\\")                           |
| TagValueIn     | 2        | The specified tag value is within the specified scope     | TagValueIn(\\"priority\\",\\"0,1\\")         |

