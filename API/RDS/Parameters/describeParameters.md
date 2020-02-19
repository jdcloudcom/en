# describeParameters


## Description
View configuration parameter of SQL Server instance<br>- only support SQL Server

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/parameters

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|String|True| |Instance ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeparameters#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**parameters**|[DBInstanceParameter[]](describeparameters#dbinstanceparameter)|List of Instance Configuration Parameters|
### <div id="dbinstanceparameter">DBInstanceParameter</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|Parameter Name|
|**description**|String|Parameter Description|
|**configureValue**|String|The modified parameter value will come into force or not, subject to the case that whether rebooting is required|
|**runningValue**|String|Effective Value in the Current Instance|
|**range**|String|Allowable Range of the Parameter Value|
|**needRestart**|String|Is rebooting required for bringing modification into force.- true: The parameter can come into force upon rebooting, - false: The parameter can come into force without rebooting.|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeParameters() {
    DescribeParametersRequest request = new DescribeParametersRequest();
    request.setInstanceId("sqlserver-83uqv7avy4");
    request.setRegionId("cn-north-1");
    DescribeParametersResponse response = rdsClient.describeParameters(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpam6r0kgsjvd3eshajnhaa1b5ifrwec", 
    "result": {
        "parameters": [
            {
                "configureValue": "32767", 
                "description": "enables SQL Server to create a pool of worker threads to service a larger number of query requests", 
                "name": "max_worker_threads", 
                "needRestart": "false", 
                "range": "[0,128-32767]", 
                "runningValue": "32767"
            }, 
            {
                "configureValue": "2", 
                "description": "limit the number of processors to use in parallel plan execution", 
                "name": "max_degree_of_parallelism", 
                "needRestart": "false", 
                "range": "[0-64]", 
                "runningValue": "2"
            }, 
            {
                "configureValue": "1887437", 
                "description": "Maximum amount of memory in megabytes in the buffer pool used by an instance of Microsoft SQL Server", 
                "name": "max_server_memory_(MB)", 
                "needRestart": "false", 
                "range": "[512-2147483647]", 
                "runningValue": "1887437"
            }
        ]
    }
}
```
