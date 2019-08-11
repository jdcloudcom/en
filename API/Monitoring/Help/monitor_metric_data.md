Note: For the introduction to use of OpenAPI, please refer to the [Common Declaration](http://docs.jdcloud.com/en/common-declaration/api/introduction)

### 1. describeMetrics

**Search available monitoring item list based on the product line**

Example Request

```
https://monitor.jdcloud-api.com/v1/metrics?serviceCode=vm
```

Return

```
{
    "requestId": "3f1f6026-216b-4ced-8249-12aa6acc3773",
    "result": {
        "metrics": [
            {
                "calculateUnit": "%",
                "metric": "memory.usage",
                "metricName": "Memory Utilization Rate",
                "serviceCode": "vm",
                "downSample": ""
            },
            {
                "calculateUnit": "%",
                "metric": "cpu_util",
                "metricName": "CPU Utilization Rate",
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
}
```

### 2. describeMetricData

**View the data of a single monitoring item of a certain resource**

Example Request

```
https://monitor.jdcloud-api.com/v1/regions/cn-north-1/metrics/memory.usage/metricData?timeInterval=1h&serviceCode=vm&resourceId=i-test01&tags.1.key=role&tags.1.values.1=M
```

Return

```
{
    "requestId": "4b2d2495-33d4-4b44-a0c1-a9deb31370a1",
    "result": {
        "metricDatas": [
            {
                "data": [
                    {
                        "timestamp": 1562723040000,
                        "value": "4.1667"
                    },
                    {
                        "timestamp": 1562723100000,
                        "value": "4.0000"
                    },
                    {
                        "timestamp": 1562726460000,
                        "value": "4.0000"
                    },
                    {
                        "timestamp": 1562726520000,
                        "value": "4.0000"
                    },
                    {
                        "timestamp": 1562726580000,
                        "value": "4.0000"
                    }
                ],
                "tags": [
                    {
                        "tagKey": "dataCenter",
                        "tagValue": "bj_02"
                    },
                    {
                        "tagKey": "hostname",
                        "tagValue": "A01-TEST.JCLOUD.COM"
                    },
                    {
                        "tagKey": "project_id",
                        "tagValue": "123456789"
                    },
                    {
                        "tagKey": "resourceId",
                        "tagValue": "i-test01"
                    },
                    {
                        "tagKey": "serviceCode",
                        "tagValue": "vm"
                    },
                    {
                        "tagKey": "az",
                        "tagValue": "prod_bj03"
                    }
                ],
                "metric": {
                    "calculateUnit": "%",
                    "metric": "memory.usage",
                    "metricName": "Memory Utilization Rate",
                    "aggregator": "avg",
                    "period": "1min"
                }
            }
        ]
    }
}
```

### 3. lastDownsample

**View the last monitoring data point of a certain resource**

Request Example

```
https://monitor.jdcloud-api.com/v1/regions/cn-north-1/metrics/memory.usage/lastDownsample?timeInterval=1h&serviceCode=vm&resourceId=i-test01
```

Return

```
{
    "requestId": "345b7934-f178-46a2-bfc8-786e8af363fb",
    "result": {
        "items": [
            {
                "metric": "memory.usage",
                "name": "i-test01",
                "value": 4
            }
        ]
    }
}
```

