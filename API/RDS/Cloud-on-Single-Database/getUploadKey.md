# getUploadKey


## Description
Obtain the required key for uploading files from Cloud on Single Database. Cloud on Single Database needs the correct key value to connect to JD Cloud<br>- only support SQL Server

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/importFiles:getUploadKey

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](getuploadkey#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**key**|String|The Key to be used to upload the file|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testGetUploadKey(){
    GetUploadKeyRequest request=new GetUploadKeyRequest();
    request.setInstanceId("sqlserver-83uqv7avy4");
    request.setRegionId("cn-north-1");
    GetUploadKeyResponse response= rdsClient.getUploadKey(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa4m1sg1b8refswmtdq9h0r40082h3r", 
    "result": {
        "key": "GQx4EEy53e44Zt0por6NKhkrbhiHqw3NK4MBbZBft9xVy11m6BL5wTFsthBraXNSiN8G97OOED4dMryee1vybuQW7UliGAtzZdwX21NIX5dNcDQBcrELtQ=="
    }
}
```
