# modifyParameterGroupAttribute


## Description
Modify parameter set name and description<br>- Support MySQL only

## Request Method
PUT

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/parameterGroups/{parameterGroupId}:modifyParameterGroupAttribute

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**parameterGroupId**|String|True| |Parameter Group ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**parameterGroupName**|String|True| |Parameter Set Name|
|**description**|String|False| |Parameter Set Description|


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
PUT
```
public void testModifyParameterGroupAttribute() {
    ModifyParameterGroupAttributeRequest request = new ModifyParameterGroupAttributeRequest();
    request.setDescription("modify describe");
    request.setParameterGroupId("mysql-pg-rbywujyl6c");
    request.setParameterGroupName("modify name");
    request.setRegionId("cn-north-1");
    ModifyParameterGroupAttributeResponse response = rdsClient.modifyParameterGroupAttribute(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpao6a3i8dsth9wqghkq5jsjci0ku5wf"
}
```
