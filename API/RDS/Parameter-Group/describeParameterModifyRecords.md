# describeParameterModifyRecords


## Description
View modification history of parameters<br>- Only support MySQL

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/parameterGroups/{parameterGroupId}/records

|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**parameterGroupId**|String|True| |Parameter Group ID|

## Request Parameters
|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Pages displaying data, which is 1 by default with value range: [-1,∞).   When pageNumber is 1, return all data page numbers; when exceeding total pages, display the last page;|
|**pageSize**|Integer|False| |Data entries displayed on each page, which is 10 by default with the value range: [10,100] and a multiple of 10.|
|**startTime**|String|False| |Search start time, with the format: YYYY-MM-DD HH:mm:ss|
|**endTime**|String|False| |Search end time, with the format: YYYY-MM-DD HH:mm:ss|


## Returned Parameters
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeparametermodifyrecords#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**records**|[ParameterModifyRecords[]](describeparametermodifyrecords#parametermodifyrecords)| |
|**totalCount**|Integer| |
### <div id="parametermodifyrecords">ParameterModifyRecords</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|Parameter Name|
|**preModify**|String|Parameter Value before Modification|
|**postModify**|String|Parameter Value after Modification|
|**updateTime**|String|Modification Time|

## Return Code
|Return Code|Descripton|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeParameterModifyRecords() {
    DescribeParameterModifyRecordsRequest request = new DescribeParameterModifyRecordsRequest();
    request.setParameterGroupId("mysql-pg-e4zkfymxwt");
    request.setRegionId("cn-north-1");
    request.setPageNumber(1);
    request.setPageSize(10);
    DescribeParameterModifyRecordsResponse response = rdsClient.describeParameterModifyRecords(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpaod3dd4dgdc3tp0swuhpti0kncek92", 
    "result": {
        "records": [
            {
                "name": "binlog_cache_size", 
                "postModify": "5000", 
                "preModify": "262144", 
                "updateTime": "2020-01-08 14:19:43"
            }
        ], 
        "totalCount": 1
    }
}
```
