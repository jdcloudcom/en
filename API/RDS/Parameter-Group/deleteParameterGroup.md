# deleteParameterGroup


## Description
Delete parameter set<br>- Support MySQL only

## Request Method
DELETE

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/parameterGroups/{parameterGroupId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**parameterGroupId**|String|True| |Parameter Group ID|

## Request Parameter
None


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
DELETE
```
public void testDeleteParameterGroup() {
    DeleteParameterGroupRequest request = new DeleteParameterGroupRequest();
    request.setRegionId("cn-north-1");
    request.setParameterGroupId("mysql-pg-ap9dc33crt");
    DeleteParameterGroupResponse response = rdsClient.deleteParameterGroup(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpao4p0b09ccwn0hnfrikc8cmg9nqj97"
}
```
