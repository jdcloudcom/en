Note: For the introduction to use of OpenAPI, please refer to the [Common Declaration](http://docs.jdcloud.com/en/common-declaration/api/introduction)


### 1.describeProductsForAlarm

**Search can be used for creating the product list of monitoring alarm rules and the available dimensions hereunder** 	

Example Request

```
https://monitor.jdcloud-api.com/v2/groupAlarms:products?serviceCode=redis
```

Return

```
{
    "requestId": "b7783874-8542-4ee4-8c18-3cbc6b3e7a20",
    "result": {
        "productList": [
            {
                "serviceCode": "redis",
                "product": "redis2.8cluster",
                "productName": "JCS for Redis2.8-Cluster",
                "tagServiceCode": "",
                "tags": {},
                "dimensions": [
                    {
                        "dimension": "redis2.8cluster-instance",
                        "dimensionName": "Instance",
                        "tagServiceCode": "",
                        "isNode": false,
                        "tags": {}
                    },
                    {
                        "dimension": "redis2.8cluster-shard",
                        "dimensionName": "Mutli-part",
                        "tagServiceCode": "",
                        "isNode": true,
                        "tags": {
                            "shardId": ""
                        }
                    },
                    {
                        "dimension": "redis2.8cluster-proxy",
                        "dimensionName": "Agent",
                        "tagServiceCode": "",
                        "isNode": true,
                        "tags": {
                            "proxyId": ""
                        }
                    }
                ]
            },
            {
                "serviceCode": "redis",
                "product": "redis2.8MS",
                "productName": "JCS for Redis2.8-master-slave",
                "tagServiceCode": "",
                "tags": {},
                "dimensions": [
                    {
                        "dimension": "redis2.8MS-instance",
                        "dimensionName": "Instance",
                        "tagServiceCode": "",
                        "isNode": false,
                        "tags": {}
                    },
                    {
                        "dimension": "redis2.8MS-proxy",
                        "dimensionName": "Agent",
                        "tagServiceCode": "",
                        "isNode": true,
                        "tags": {
                            "proxyId": ""
                        }
                    }
                ]
            },
            {
                "serviceCode": "redis",
                "product": "redis",
                "productName": "JCS for Redis4.0",
                "tagServiceCode": "redis",
                "tags": {},
                "dimensions": []
            }
        ]
    }
}
```

### 2.describeMetricsForAlarm

**Search can be used to create the indicator list of monitoring alarm rules** 	

Example Request

```
https://monitor.jdcloud-api.com/v2/groupAlarms:metrics?product=vm
```

Return

```
{
    "requestId": "5f66e4e0-c3b1-4b9f-b35e-1c7e361d3bf2",
    "result": {
        "metrics": [
            {
                "serviceCode": "vm",
                "product": "vm",
                "dimension": "",
                "metric": "cpu_util",
                "metricName": "CPU Utilization Rate",
                "calculateUnit": "%"
            },
            {
                "serviceCode": "vm",
                "product": "vm",
                "dimension": "",
                "metric": "memory.usage",
                "metricName": "Memory Utilization Rate",
                "calculateUnit": "%"
            },
            {
                "serviceCode": "vm",
                "product": "vm",
                "dimension": "",
                "metric": "vm.disk.bytes.read",
                "metricName": "Disk Read Throughput",
                "calculateUnit": "Bps"
            },
            {
                "serviceCode": "vm",
                "product": "vm",
                "dimension": "",
                "metric": "vm.disk.bytes.write",
                "metricName": "Disk Write Throughput",
                "calculateUnit": "Bps"
            },
            {
                "serviceCode": "vm",
                "product": "vm",
                "dimension": "",
                "metric": "vm.network.bytes.incoming",
                "metricName": "Network Input Rate",
                "calculateUnit": "bps"
            },
            {
                "serviceCode": "vm",
                "product": "vm",
                "dimension": "",
                "metric": "vm.network.bytes.outgoing",
                "metricName": "Network Output Rate",
                "calculateUnit": "bps"
            }
        ]
    }
}
```

### 3. createAlarm

**Create alarm rules**

Example Request

```
https://monitor.jdcloud-api.com/v2/groupAlarms
```


Parameter

```
{
    "clientToken":"{{$guid}}",    //Idempotent checkout parameter. If the parameter is the same and requests are submitted for many times, rules will be created once.
    "product":"vm",
    "dimension":"",
    "ruleName":"xxxxxx",
    "enabled":1,
      "tags":{},  
    "ruleOption":{
    	"rules":[          //Designate triggering conditions to set alarm rules
    	{ 
        "calculateUnit":"ms",
        "calculation":"avg",
        "downSample":"",
        "metric":"cpu_util",   
        "NoticePeriod":1,
        "Operation":"gte",
        "Period":1,        
        "tags":{            
           },             
        "threshold":25,
        "times":2
        },        
        {
        "calculateUnit":"ms",
        "calculation":"avg",
        "downSample":"",
        "metric":"cpu_util",
        "noticeLevel":{
            "custom":true,
            "levels":{"common":50,"fatal":100}
        },  
        "NoticePeriod":1,
        "Operation":"gte",
        "Period":1,        
        "tags":{            
           },             
        "threshold":50,
        "times":2
        }
        ] ,
        "templateOption":{"templateType":2,   //Create rules based on template triggering conditions. When rules and templateOption are designated at the same time, the rules parameter shall come into force with priority
        	"templateId":"t-vtp6p3i54z"
        }
    } ,
    "resourceOption":{
    	"resourceItems":[{"resourceId":"i-otkqy1sfdsf","region":"cn-north-1"},{"resourceId":"i-sfefscvsdf","region":"cn-north-1"},{"resourceId":"i-sdfdsf","region":"cn-south-1"}],    //Create rules with designated resources
    	"tagsOption":{
    		"tags":[{"key":"77","values":["66"]},{"key":"sdf","values":["66","sdfsdff"]}]     //Create rules with tags. When tagsOption and resourceItems are designated at the same time, the resourceItems parameter shall come into force with priority
    	}
    	
    },
    "noticeOption":[{
    	"noticeCondition":[1,2],
    	"noticeWay":[1,2],
    	"noticePeriod":180,
    	"effectiveIntervalStart":"09:00:00",
    	"effectiveIntervalEnd":"22:30:59"
    }],
    "webHookOption":{
         "webHookProtocol":"http",
        "webHookUrl":"http://www.baidu.com"	,
        "webHookContent":"{ \"action\": \"ALARM\" , \"data\": { \"resourceId\": \"${resourceId}\", \"serviceCode\": \"${serviceCode}\", \"requestId\": \"${requestId}\", \"metric\": \"${metric}\", \"currentValue\": ${currentValue}, \"times\": ${times}, \"tags\": \"${tags}\", \"alertTime\": \"${alertTime}\", \"region\": \"${region}\", \"checkType\": \"vm\", \"asGroupId\": \"asg-51vfz2vnqu\", \"threshold\": \"${threshold}\", \"value\": ${currentValue} } }",
        "webHookSecret":"11111111111111111111111111111111111111111111111111"
    },
    "baseContact":[{"referenceId":1,"referenceType":1},{"referenceId":1,"referenceType":0},{"referenceId":1,"referenceType":2}]
   
}
```

### 4. deleteAlarms

**Batch Delete Rules**

Example Request

```
https://monitor.jdcloud-api.com/v2/groupAlarms/alarm-bapdo1w7cz,alarm-1nc9fgje63     //When deletion is designated, please separate rule ids with commas. Support maximum 50
```


Return

```
{
    "requestId": "3f807886-fdb8-42fa-85ba-25e055f7b393",
    "result": {
        "success": true
    }
}
```

### 5. updateAlarm

**Modify the created alarm rules**

Example Request

```
https://monitor.jdcloud-api.com/v2/groupAlarms/alarm-5vayu60os4
```

Parameter

```
{
    "clientToken":"{{$guid}}",    
    "product":"vm",
    "dimension":"",
    "ruleName":"xxxxx",
    "enabled":1,
      "tags":{},  
    "ruleOption":{
    	"rules":[
    	{ 
        "calculateUnit":"ms",
        "calculation":"avg",
        "downSample":"",
        "metric":"cpu_util",   
        "NoticePeriod":1,
        "Operation":"gte",
        "Period":1,        
        "tags":{            
           },             
        "threshold":25,
        "times":2
        },        
        {
        "calculateUnit":"ms",
        "calculation":"avg",
        "downSample":"",
        "metric":"cpu_util",
        "noticeLevel":{
            "custom":true,
            "levels":{"common":50,"fatal":100}
        },  
        "NoticePeriod":1,
        "Operation":"gte",
        "Period":1,        
        "tags":{            
           },             
        "threshold":50,
        "times":2
        }
        ]
    } ,
    "resourceOption":{
    	"resourceItems":[{"resourceId":"i-otkqy126jn","region":"cn-north-1"},{"resourceId":"i-otkqy126jc","region":"cn-north-1"},{"resourceId":"id2","region":"cn-south-1"}]    	
    },
    "noticeOption":[{
    	"noticeCondition":[1,2],
    	"noticeWay":[1,2],
    	"noticePeriod":180,
    	"effectiveIntervalStart":"09:00:00",
    	"effectiveIntervalEnd":"22:30:59"
    }],
    "webHookOption":{
         "webHookProtocol":"http",
        "webHookUrl":"http://www.baidu.com"	,
        "webHookContent":"{ \"action\": \"ALARM\" , \"data\": { \"resourceId\": \"${resourceId}\", \"serviceCode\": \"${serviceCode}\", \"requestId\": \"${requestId}\", \"metric\": \"${metric}\", \"currentValue\": ${currentValue}, \"times\": ${times}, \"tags\": \"${tags}\", \"alertTime\": \"${alertTime}\", \"region\": \"${region}\", \"checkType\": \"vm\", \"asGroupId\": \"asg-51vfz2vnqu\", \"threshold\": \"${threshold}\", \"value\": ${currentValue} } }",
        "webHookSecret":"11111111111111111111111111111111111111111111111111"
    },
    "baseContact":[{"referenceId":1,"referenceType":1},{"referenceId":1,"referenceType":0},{"referenceId":1,"referenceType":2}]
   
}
```

Return

```
{
    "requestId": "073dc34b-eb3d-4045-8892-be4bfed2e8e4",
    "result": {
        "alarmId": "alarm-3a4moysno4",
        "success": true
    }
}
```

### 6. describeAlarms

Search Rules

Example Request

```
https://monitor.jdcloud-api.com/v2/groupAlarms?pageNumber=1&pageSize=2
```

Return

```
{
    "requestId": "ec990c3e-76ff-4a20-91c5-0bb03cad38cc",
    "result": {
        "alarmList": [
            {
                "product": "vm",
                "productName": "Virtual Machines",
                "dimension": "vm",
                "dimensionName": "Instance",
                "resourceOption": {
                    "resourceItems": [
                        {
                            "resourceId": "id2",
                            "region": "cn-south-1"
                        },
                        {
                            "resourceId": "i-otkqy126jc",
                            "region": "cn-north-1"
                        },
                        {
                            "resourceId": "i-otkqy126jn",
                            "region": "cn-north-1"
                        }
                    ],
                    "tagsOption": null
                },
                "ruleOption": {
                    "rules": [
                        {
                            "metric": "cpu_util",
                            "period": 1,
                            "calculation": "avg",
                            "operation": "gte",
                            "threshold": 25,
                            "times": 2,
                            "noticeLevel": {
                                "levels": null,
                                "custom": null
                            },
                            "downSample": "",
                            "metricName": "CPU Utilization Rate",
                            "calculateUnit": "%"
                        },
                        {
                            "metric": "cpu_util",
                            "period": 1,
                            "calculation": "avg",
                            "operation": "gte",
                            "threshold": 50,
                            "times": 2,
                            "noticeLevel": {
                                "levels": {
                                    "common": 50,
                                    "fatal": 100
                                },
                                "custom": true
                            },
                            "downSample": "",
                            "metricName": "CPU Utilization Rate",
                            "calculateUnit": "%"
                        }
                    ],
                    "templateOption": null
                },
                "enabled": 1,
                "ruleName": "wujiang",
                "ruleType": "resourceMonitor",
                "alarmId": "alarm-3a4moysno4",
                "ruleVersion": "v2",
                "alarmStatus": 1,
                "alarmStatusList": [],
                "createTime": "2019-09-19T11:42:16+08:00"
            },
            {
                "product": "redis2.8cluster",
                "productName": "JCS for Redis2.8-Cluster",
                "dimension": "redis2.8cluster-shard",
                "dimensionName": "Mutli-part",
                "resourceOption": {
                    "resourceItems": [
                        {
                            "resourceId": "id2",
                            "region": "cn-south-1"
                        },
                        {
                            "resourceId": "i-otkqy126jc",
                            "region": "cn-north-1"
                        },
                        {
                            "resourceId": "i-otkqy126jn",
                            "region": "cn-north-1"
                        }
                    ],
                    "tagsOption": null
                },
                "ruleOption": {
                    "rules": [
                        {
                            "metric": "jmiss.redis.instance.mem_fragmentation_ratio",
                            "period": 1,
                            "calculation": "avg",
                            "operation": "gte",
                            "threshold": 25,
                            "times": 2,
                            "noticeLevel": {
                                "levels": null,
                                "custom": null
                            },
                            "downSample": "",
                            "metricName": "Multi-part memory fragment rate",
                            "calculateUnit": " "
                        },
                        {
                            "metric": "jmiss.redis.instance.keyspace_hit_rate",
                            "period": 1,
                            "calculation": "avg",
                            "operation": "gte",
                            "threshold": 50,
                            "times": 2,
                            "noticeLevel": {
                                "levels": {
                                    "common": 50,
                                    "fatal": 100
                                },
                                "custom": true
                            },
                            "downSample": "",
                            "metricName": "Mutli-part Hit Ratio",
                            "calculateUnit": "%"
                        }
                    ],
                    "templateOption": null
                },
                "enabled": 1,
                "ruleName": "wujiang",
                "tags": {
                    "role": "M"
                },
                "ruleType": "resourceMonitor",
                "alarmId": "alarm-d5q7fwpl0s",
                "ruleVersion": "v2",
                "alarmStatus": 4,
                "alarmStatusList": [
                    4
                ],
                "createTime": "2019-09-04T09:58:35+08:00"
            }
        ],
        "pageNumber": 1,
        "numberPages": 11,
        "numberRecords": 21,
        "pageSize": 2  
    }
}


```



