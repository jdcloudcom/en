# modifyWhiteList


## Description
Modify the IP White List that allows access to the instance. The White List is a list of IP/IP segments that are allowed to access the current instance. By default, the White List is open to the VPC. If the user has enabled the internet access, you need to configure a White List for the IP of the internet.

## Request method
PUT

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/whiteList

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ips**|String|True| |For IP or IP segment, different IP/IP segments shall be separated by commas, for example 0.0.0.0/0,192.168.0.10|


## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
PUT
```
public void testModifyWhiteList() {
    ModifyWhiteListRequest request = new ModifyWhiteListRequest();
    request.setRegionId("cn-north-1");
    request.setInstanceId("mysql-k67q8n46si");
    request.setIps("127.0.0.1,0.0.0.1");
    ModifyWhiteListResponse response = rdsClient.modifyWhiteList(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpaote3hqwti0r73ow6q0dct8ogcn507"
}
```
