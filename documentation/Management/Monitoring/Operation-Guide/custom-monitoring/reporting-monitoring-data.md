## Report Monitoring Data
The feature of Customized Metric Monitoring provides you with an interface for reporting monitoring data, so that you can report the time series data collected by yourself to the Monitoring. Currently, the method of OpenAPI is supported to report, and the original data and the aggregated statistics can be reported.

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

Note: For Getting Started on OpenAPI, please see the <a href="www.jdcloud.com">public description</a>

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
dimensions|Object |True|Data Dimension, the data type is in a map type, supporting at least one, with up to five tags, and a total length no more than 255 bytes, only supporting English text, figures, underline _, dot.[0-9][a-z] [A-Z] [. _ ], the others will return err
metric|	String |True |	The name of the monitoring indicator, with a length no more than 255 bytes, only supporting English text, figures, underline _, dot., [0-9][a-z] [A-Z] [. _ ], the others will return err               
namespace|	String |True |	Namespace, with a length no more than255 bytes, only supporting English text, figures, underline _, dot., [0-9][a-z] [A-Z] [. _ ], the others will return err               
timestamp|Integer|True|Timestamp for reporting data points, only supporting 10 digits, with a second-level timestamp, unable to write in the time of the past 30 days                              
type |Integer|True |The data reporting type, with 1 standing for original value, and 2 for aggregated data. When reporting aggregated data, it is recommended to report the line for 60s, otherwise it cannot be queried normally                           
values |	Object |	True |The set of indicator values, the data type must be map type, the key is the data type, and the value is the data value. When type=1, the key can only be "value", the reported value is the original value, when type=2, the value of K Can be "avg", "sum", "last", "max", "min", "count", and it only supports the above types, otherwise it will report an error, the value content is an integer or floating point number, the maximum value is 9223372036854775807, count only supports>=0 value  

### Return Parameter  

Name | Type | Required or not 
---|---|---
error |Object| Error Message.     
requestId|String |Requested id                        
result |Result |                
                      
### Result
Name | Type | Required or not 
---|---|---
errMetricDataList|MetricDataList[]|
success|Boolean  |All successful writes are represented as true, otherwise false   

### MetricDataList
Name | Type | Required or not 
---|---|---
errDetail|string	| Error Data Description
errMetricData |string |Error Data              

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
