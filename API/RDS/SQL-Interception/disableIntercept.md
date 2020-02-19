# disableIntercept


## Description
Disable high security mode of database<br>- Support MySQL only

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/intercept:disableIntercept

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|String|True| |Instance ID|

## Request Parameter
None


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testDisableIntercept() {
    DisableInterceptRequest request = new DisableInterceptRequest();
    request.setInstanceId("mysql-k67q8n46si");
    request.setRegionId("cn-north-1");
    DisableInterceptResponse response = rdsClient.disableIntercept(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpakc3mnur1ig6a8awtodm2nrti46uku"
}
```
