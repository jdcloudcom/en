# copyParameterGroup


## Description
Copy Parameter Set

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/parameterGroups:copyParameterGroup

|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameters
|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**parameterGroupId**|String|True| |Parameter Group ID|
|**parameterGroupName**|String|True| |Name of Parameter Group|
|**description**|String|False| |Description of Parameter Group|


## Returned Parameters
|Name|Type|Description|
|---|---|---|
|**result**|[Result](copyparametergroup#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**parameterGroupId**|String| |

## Return Code
|Return Code|Descripton|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testCopyParameterGroup() {
    CopyParameterGroupRequest request = new CopyParameterGroupRequest();
    request.setDescription("copy mysql-pg-mpzspoh243");
    request.setParameterGroupId("mysql-pg-mpzspoh243");
    request.setParameterGroupName("copy");
    request.setRegionId("cn-north-1");
    CopyParameterGroupResponse response = rdsClient.copyParameterGroup(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpaodvuh5d8ncviu4bd10v05u451ghip", 
    "result": {
        "parameterGroupId": "mysql-pg-4xs1w58i9u"
    }
}
```
