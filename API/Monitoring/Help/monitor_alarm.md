Note: For the introduction to use of OpenAPI, please refer to the [Common Declaration](http://docs.jdcloud.com/en/common-declaration/api/introduction)

### 1.describeMetricsForCreateAlarm

**Search can be used to create the indicator list of monitoring alarm rules** 	

Example Request

```
https://monitor.jdcloud-api.com/v1/metricsForCreateAlarm?serviceCode=vm
```

Return

```
{
    "requestId": "11111",
    "result": {
        "serviceCodeList": [
            {
                "serviceCode": "vm",
                "metrics": [
                    {
                        "calculateUnit": "%",
                        "metric": "cpu_util",
                        "metricName": "CPU Utilization Rate",
                        "serviceCode": "vm",
                        "downSample": ""
                    },
                    {
                        "calculateUnit": "%",
                        "metric": "memory.usage",
                        "metricName": "Memory Utilization Rate",
                        "serviceCode": "vm",
                        "downSample": ""
                    },
                    {
                        "calculateUnit": "Bps",
                        "metric": "vm.disk.bytes.read",
                        "metricName": "Disk Read Throughput",
                        "serviceCode": "vm",
                        "downSample": ""
                    },
                    {
                        "calculateUnit": "Bps",
                        "metric": "vm.disk.bytes.write",
                        "metricName": "Disk Write Throughput",
                        "serviceCode": "vm",
                        "downSample": ""
                    },
                    {
                        "calculateUnit": "bps",
                        "metric": "vm.network.bytes.incoming",
                        "metricName": "Network Input Rate",
                        "serviceCode": "vm",
                        "downSample": ""
                    },
                    {
                        "calculateUnit": "bps",
                        "metric": "vm.network.bytes.outgoing",
                        "metricName": "Network Output Rate",
                        "serviceCode": "vm",
                        "downSample": ""
                    }
                ]
            }
        ]
    }
}
```

### 2. createAlarm

**Create alarm rules**

Example Request

```
https://monitor.jdcloud-api.com/v1/regions/cn-north-1/alarms
```


Parameter

```
{
    "clientToken": "vm-1562675527",
    "createAlarmSpec": {
        "calculateUnit": "%",
        "calculation": "avg",
        "contactGroups": [
            "123"
        ],
        "contactPersons": [
            "456"
        ],
        "downSample": "",
        "metric": "cpu_util",
        "noticeLevel": {
            "custom": true,
            "levels": {
                "common": 10,
                "critical": 50,
                "fatal": 70
            }
        },
        "noticePeriod": 3,
        "operation": "gt",
        "period": 2,
        "resourceIds": [
            "i_test01"
        ],
        "serviceCode": "vm",
        "tags": {},
        "threshold": 10,
        "times": 1,
        "webHookUrl": "https://www.jd.com",
        "webHookContent": "{\"content\":\"123\"}",
        "webHookSecret": "123456789012345678901234",
        "webHookProtocol": "https"
    }
}
```


Return

```
{
    "requestId": "b95ad29e-4c73-4654-a720-41ac35e5ef21",
    "result": {
        "alarmIDList": [
            "alarm-fczoaanast"
        ]
    }
}
```

### 3. deleteAlarms

**Batch Delete Rules**

Example Request

```
https://monitor.jdcloud-api.com/v1/regions/cn-north-1/alarms
```

Parameter

```
{
	"ids":"alarm-fczoaanast|alarm-46o8wi1tjw"
}
```

Return

```
{
    "requestId": "1111"
}
```

### 4. updateAlarm

**Modify the created alarm rules**

Example Request

```
https://monitor.jdcloud-api.com/v1/regions/cn-north-1/alarms/alarm-fczoaanast
```

Parameter

```
{
    "rule": {
        "metric": "memory.usage",
        "calculateUnit": "%",
        "calculation": "avg",
        "downSample": "",
        "operation": "gt",
        "threshold": 20,
        "tags": {},
        "times": 1,
        "period": 2,
        "noticePeriod": 3,
        "noticeLevel": {
            "custom": true,
            "levels": {
                "common": 20,
                "critical": 50,
                "fatal": 70
            }
        }
    },
    "contacts": [
        {
            "referenceId": 34,
            "referenceType": 1
        }
    ],
    "webHookUrl": "https://www.jd.com",
    "webHookContent": "{\"content\":\"123\"}",
    "webHookSecret": "123456789012345678901234",
    "webHookProtocol": "https"
}
```

Return

```
{
    "requestId": "b95ad29e-4c73-4654-a720-41ac35e5ef21",
    "result": {
        "alarmIDList": [
            "alarm-fczoawasds"
        ]
    }
}
```

### 5. describeAlarms

Search Rules

Example Request

```
https://monitor.jdcloud-api.com/v1/regions/cn-north-1/alarms
```

Return

```
{
    "requestId": "7ebd0e7f-b7ce-45e7-a6c8-ed2e2fc06c70",
    "result": {
        "alarmList": [
            {
                "id": "alarm-jfws97535q",
                "metric": "cpu_util",
                "metricName": "cpu Usage",
                "resourceId": "i-test01",
                "region": "cn-north-1",
                "serviceCode": "vm",
                "period": 1,
                "calculation": "max",
                "operation": "gt",
                "threshold": 30,
                "times": 1,
                "noticePeriod": 1,
                "noticeLevel": {
                    "levels": {
                        "common": 30
                    },
                    "custom": false
                },
                "downSample": "",
                "enabled": 1,
                "status": 4,
                "createTime": "2019-06-24T17:26:45+08:00",
                "tags": {},
                "calculateUnit": "%",
                "webHookUrl": "",
                "webHookContent": "",
                "webHookSecret": "",
                "webHookProtocol": ""
            }
        ],
        "total": 1
    }
}
```

