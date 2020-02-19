# describeIntercept


## Description
View security mode enabled in current instance. If high security mode of database is enabled, configuration information will be returned<br>- Only support MySQL

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/intercept

|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|String|True| |Instance ID|

## Request Parameters
None


## Returned Parameters
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeintercept#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**available**|Boolean| |

## Return Code
|Return Code|Descripton|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeIntercept() {
    DescribeInterceptRequest request = new DescribeInterceptRequest();
    request.setInstanceId("mysql-k67q8n46si");
    request.setRegionId("cn-north-1");
    DescribeInterceptResponse response = rdsClient.describeIntercept(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpakd27kavrguqb926odbdbqdj49rfq7", 
    "result": {
        "available": false
    }
}
```
