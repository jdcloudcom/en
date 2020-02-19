# describeWhiteList


## Description
View the current White List of RDS instances. The White List is a list of IP/IP segments that are allowed to access the current instance. By default, the White List is open to the VPC. If the user has enabled the internet access, you need to configure a White List for the IP of the internet.

## Request method
GET

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/whiteList

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describewhitelist#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**whiteLists**|[WhiteList[]](describewhitelist#whitelist)|White List|
### <div id="whitelist">WhiteList</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|White List Name|
|**ips**|String|For IP or IP segment, different IP/IP segments shall be separated by commas, for example 0.0.0.0/0,192.168.0.10|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeWhiteList() {
    DescribeWhiteListRequest request = new DescribeWhiteListRequest();
    request.setRegionId("cn-north-1");
    request.setInstanceId("mysql-k67q8n46si");
    DescribeWhiteListResponse response = rdsClient.describeWhiteList(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpaot34k3hifbuhtjkb181j0mbg42gke", 
    "result": {
        "whiteLists": [
            {
                "ips": "8.8.0.0/16", 
                "name": "default"
            }
        ]
    }
}
```
