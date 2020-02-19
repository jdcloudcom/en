# describeParameterGroups


## Description
Get all parameter group list under current account<br>- Only support MySQL

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/parameterGroups

|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameters
|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Pages displaying data, which is 1 by default with value range: [-1,∞).   When pageNumber is 1, return all data page numbers; when exceeding total pages, display the last page;|
|**pageSize**|Integer|False| |Data entries displayed on each page, which is 10 by default with the value range: [10,100] and a multiple of 10.|


## Returned Parameters
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeparametergroups#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**parameterGroups**|[ParameterGroup[]](describeparametergroups#parametergroup)| |
|**totalCount**|Integer| |
### <div id="parametergroup">ParameterGroup</div>
|Name|Type|Description|
|---|---|---|
|**parameterGroupId**|String|Parameter group ID|
|**parameterGroupName**|String|Name of Parameter Group|
|**parameterGroupStatus**|String|Status of Parameter Group|
|**description**|String|Description of Parameter Group|
|**engine**|String|Type of Instance Engine|
|**engineVersion**|String|Database Version|
|**regionId**|String|Region code, see [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md) for value range|
|**createTime**|String|Create Time of Parameter Group|

## Return Code
|Return Code|Descripton|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeParameterGroups() {
    DescribeParameterGroupsRequest request = new DescribeParameterGroupsRequest();
    request.setPageNumber(1);
    request.setPageSize(10);
    request.setRegionId("cn-north-1");
    DescribeParameterGroupsResponse response = rdsClient.describeParameterGroups(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpao7omjn7039ocmwo25nhdae9mag0pb", 
    "result": {
        "parameterGroups": [
            {
                "createTime": "2020-01-08 14:15:49", 
                "description": "tttttt", 
                "engine": "MySQL", 
                "engineVersion": "5.7", 
                "parameterGroupId": "mysql-pg-e4zkfymxwt", 
                "parameterGroupName": "test mysql", 
                "parameterGroupStatus": "AVAILABLE", 
                "regionId": "cn-north-1"
            }
        ], 
        "totalCount": 1
    }
}
```
