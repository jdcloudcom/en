# modifyParameterGroupParameters


## Description
Modify parameters of parameter group<br>- Only support MySQL

## Request Method
PUT

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/parameterGroups/{parameterGroupId}/parameters

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**parameterGroupId**|String|True| |Parameter Group ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**parameters**|[Parameter[]](modifyparametergroupparameters#parameter)|True| |Modified Parameters|

### <div id="parameter">Parameter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Parameter Name|
|**value**|String|True| |Modified Parameter Value|

## Response parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
PUT
```
public void testModifyParameterGroupParameters() {
    ModifyParameterGroupParametersRequest request = new ModifyParameterGroupParametersRequest();
    request.setParameterGroupId("mysql-pg-e4zkfymxwt");
    Parameter parameter = new Parameter();
    parameter.setName("binlog_cache_size");
    parameter.setValue("5000");
    request.addParameter(parameter);
    request.setRegionId("cn-north-1");
    ModifyParameterGroupParametersResponse response = rdsClient.modifyParameterGroupParameters(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpao8wga4wnjbj1p3rq6uw9nj2468sek"
}
```
