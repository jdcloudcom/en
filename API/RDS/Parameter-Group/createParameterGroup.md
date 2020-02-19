# createParameterGroup


## Description
Create a parameter group<br>- Only support MySQL

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/parameterGroups

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**engine**|String|True| |Type of instance engine, see [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**engineVersion**|String|True| |Version of instance engine, see [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**parameterGroupName**|String|True| |Name of Parameter Group|
|**description**|String|False| |Description of Parameter Group|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createparametergroup#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**parameterGroupId**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testCreateParameterGroup() {
    CreateParameterGroupRequest request = new CreateParameterGroupRequest();
    request.setEngine("MySQL");
    request.setEngineVersion("5.7");
    request.setParameterGroupName("test mysql");
    request.setRegionId("cn-north-1");
    request.setDescription("tttttt");
    CreateParameterGroupResponse response = rdsClient.createParameterGroup(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpao7596fv3d1f5qefbs76m9872j5ww9", 
    "result": {
        "parameterGroupId": "mysql-pg-e4zkfymxwt"
    }
}
```
