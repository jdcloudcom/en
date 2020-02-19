# describeParameterGroupParameters


## Description
View parameters of parameter group<br>- Only support MySQL

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/parameterGroups/{parameterGroupId}/parameters

|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**parameterGroupId**|String|True| |Parameter Group ID|

## Request Parameters
None


## Returned Parameters
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeparametergroupparameters#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**parameters**|[ParameterGroupParameter[]](describeparametergroupparameters#parametergroupparameter)| |
### <div id="parametergroupparameter">ParameterGroupParameter</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|Parameter Name|
|**description**|String|Parameter Description|
|**configureValue**|String|Whether the value of modified parameter will take effect or not, subject to the case that whether the parameter is required for reboot|
|**defaultValue**|String|Default Value of Parameter|
|**range**|String|Allowable Range of the Parameter Value|
|**type**|String|Type of Parameter Value|
|**needRestart**|String|Whether reboot is required for taking effect of parameter modification- true: parameter needs reboot for taking effect- false: no reboot is required for taking effect of parameter|

## Return Code
|Return Code|Descripton|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeParameterGroupParameters() {
    DescribeParameterGroupParametersRequest request = new DescribeParameterGroupParametersRequest();
    request.setParameterGroupId("mysql-pg-e4zkfymxwt");
    request.setRegionId("cn-north-1");
    DescribeParameterGroupParametersResponse response = rdsClient.describeParameterGroupParameters(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpao9dpjb6w3rhja4dswi216drtajeih", 
    "result": {
        "parameters": [
            {
                "configureValue": "5000", 
                "defaultValue": "262144", 
                "description": "The size of the cache to hold changes to the binary log during a transaction", 
                "name": "binlog_cache_size", 
                "needRestart": "false", 
                "range": "4096-16777216", 
                "type": "integer"
            }, 
            "..."
        ]
    }
}
```
