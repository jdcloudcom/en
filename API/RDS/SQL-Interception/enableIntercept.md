# enableIntercept


## Description
Enable high security mode of database<br>- Support MySQL only

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/intercept:enableIntercept

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
public void testEnableIntercept() {
    EnableInterceptRequest request = new EnableInterceptRequest();
    request.setInstanceId("mysql-k67q8n46si");
    request.setRegionId("cn-north-1");
    EnableInterceptResponse response = rdsClient.enableIntercept(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpakbc5ihe8icrgq0b7cre48fkgk3n7o"
}
```
