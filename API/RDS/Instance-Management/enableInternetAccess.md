# enableInternetAccess


## Description
Enable the internet access function of the RDS instance. After enabling, users can access RDS instances through the internet

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:enableInternetAccess

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|

## Request parameter
None


## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testEnableInternetAccess() {
    EnableInternetAccessRequest request = new EnableInternetAccessRequest();
    request.setRegionId("cn-north-1");
    request.setInstanceId("mysql-wp4e9ztap2");
    EnableInternetAccessResponse response = rdsClient.enableInternetAccess(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa51721t8vscgc223qqpcagsqhtpgr7"
}
```
