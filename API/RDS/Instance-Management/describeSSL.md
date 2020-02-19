# describeSSL


## Description
View the current instance with the encrypted connection enabled.

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/ssl

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS Instance ID, the Unique Identifier of One RDS Instance|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describessl#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**available**|Boolean|Whether the current instance enables encryption function. If enabled, return to true; if not, return to false.|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeSSL() {
    DescribeSSLRequest request = new DescribeSSLRequest();
    request.setInstanceId("mysql-k67q8n46si");
    request.setRegionId("cn-north-1");
    DescribeSSLResponse response = rdsClient.describeSSL(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa6jgkroerde1u5wh08e13824uia8d1", 
    "result": {
        "available": false
    }
}
```
