# disableInternetAccess


## Description
Disable the internet access function of the RDS instance. After the disabling, users cannot access the RDS through the Internet, but can access the domain name through the intranet domain in JD Cloud

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}: disableInternetAccess

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
public void testDisableInternetAccess() {
    DisableInternetAccessRequest request = new DisableInternetAccessRequest();
    request.setRegionId("cn-north-1");
    request.setInstanceId("mysql-wp4e9ztap2");
    DisableInternetAccessResponse response = rdsClient.disableInternetAccess(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa51bee41j6djud8ucu3kehnipmsof0"
}
```
