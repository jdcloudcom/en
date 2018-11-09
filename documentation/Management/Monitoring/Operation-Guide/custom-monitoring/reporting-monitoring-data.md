## Report Monitoring Data
The function of Custom Metric Monitoring provides you with an interface for reporting monitoring data, so that you can report the time series data collected by yourself to the Monitoring. Currently, the method of OpenAPI is supported to report, and the original data and the aggregated statistics can be reported.

### Reporting Interface Description

1. Interface Name: putMetricData

2. Public Domain Name:

Region | Domain name
---|---
cn-north-1 |monitor.cn-north-1.jdcloud-api.com
cn-south-1 |monitor.cn-south-1.jdcloud-api.com
cn-east-1 |monitor.cn-east-1.jdcloud-api.com
cn-east-2 |monitor.cn-east-2.jdcloud-api.com

3. Support batch reporting mode. A single request can contain up to 50 data points; the data size shall not exceed 256k.

Note: For Getting Started Guide on OpenAPI, please see the <a href="https://github.com/jdcloudcom/en/blob/translationUse/API/Common-Declaration/Introduction.md">public description</a>

### Request Method

POST   https://{Public Network Domain name}/v1/customMetrics

For example: POST    https://monitor.cn-north-1.jdcloud-api.com/v1/customMetrics

### Request Parameter

Name | Type | Required or Not | Description
---|---|---|---
metricDataList|	MetricDataCm[] |	False |	Data Parameter   

### MetricDataCm

Name | Type | Required or Not | Description
---|---|---|---
dimensions|Object |True|Data dimension, data type is map type, support at least one, up to five tags, no more than 255 bytes in total length, only English, numbers, underlines_, dot., [0-9][a-z] [A-Z] [. _ ] are allowed, others will return err
metric|	String |True |Metric name, no more than 255 bytes in length, only English, numbers, underlines_, dot., [0-9][a-z] [A-Z] [. _ ] are allowed, others will return err               
namespace|	String |True |Naming space,  no more than 255 bytes in length, only English, numbers, underlines_, dot., [0-9][a-z] [A-Z] [. _ ] are allowed, others will return er               
timestamp|Integer|True|Timestamp for reporting data points only supports 10-bit, second timestamp, the time of the past 30 days cannot be written in                              
type |Integer|True | Data reporting type, 1 is the original value, 2 is aggregated data. When the aggregated data is reported, it is suggested that it shall be reported during the period of 60s, otherwise, it cannot be queried normally.                           
values |	Object |	True | Metric value collection, the data type must be the map type, key is the data type, value is the data value, when type=1, key only can be “value”, the reported is the original value, when type=2, key can be "avg”, "sum”, "last”, "max”, "min”, “count”, which only support the above types, otherwise it will report an error, value contents are integers or floating point numbers, the largest value is 9223372036854775807, count only supports numbers >=0  

### Return Parameter  

Name | Type | Required or not 
---|---|---
error |Object| Error information.     
requestId|String |Request ID                        
result |Result |                
                      
### Result
Name | Type | Required or not 
---|---|---
errMetricDataList|MetricDataList[]|
success|Boolean  |All successful write-ins are true, otherwise are false   

### MetricDataList
Name | Type | Required or not 
---|---|---
errDetail|string	| Error data Description
errMetricData |string |Error data              

### Return Code  
Name | Type 
---|---
200	|OK
400	|invalid parameter
500 |internal server error
429	|quota exceed


### Sample Code

Request Sample
```
[
        {
            "namespace":"test",
            "metric":"vm.mem.usage1",
            "tags":{
                "host":"1.2.3.23",
                "datacenter":"cn-north-1 "
            },
             "timestamp":15305424971,
             "type":1,
             "values":{
             "value":"12342213"        
            }
        },

        {
            "namespace":"test1",
            "metric":"vm.cpu.usage",
            "dimensions":{
                "host":"1.2.3.19",
                "tag":"bj "
            },
             "timestamp":1530542497,
             "type":2,
             "values":{
             "avg":"80",
             "max":"32424244120"
            }
        }
]
```

Return Sample

```
success：

{
    "requestId": "1111",
    "result": {
        "success": true,
        "metricDataList": []
    }
}
fail：
{
   "requestId": "1111",
    "result": {
        "success": false,
        "metricDataList": [
            {
                "data": {
                    "namespace": "test",
                    "metric": "vm.mem.usage1",
                    "dimensions": {
                        "host": "1.2.3.23",
                        "tag": "cn-north-1"
                    },
                    "timestamp": 15305424971,
                    "type": 1,
                    "values": {
                        "value": "12342213"
                    }
                },
                "errDetail": "Time value only allowed Secondtimestamps,length is 10"
            }
        ]
    },
    "error": {
        "code": 400,
        "message": "INVALID_ARGUMENT",
        "status": "INVALID_ARGUMENT",
        "details": null
    }
}
```
