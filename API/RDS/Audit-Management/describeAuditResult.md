# describeAuditResult


## Description
Only support check of audit content of MySQL instance

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit:describeAuditResult

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search the start time, with the format as: YYYY-MM-DD HH:mm:ss, the start time cannot be 30 days earlier than the current time|
|**endTime**|String|True| |Search the end time, with the format as: YYYY-MM-DD HH:mm:ss, the duration from the start time to the end time cannot exceed 3 days|
|**dbName**|String|False| |Database Name|
|**accountName**|String|False| |Account Name|
|**pageNumber**|Integer|False| |Page displaying the data; it is 1 by default, the value range: [-1,∞)|
|**pageSize**|Integer|False| |The data entries displayed on each page, which is 10 by default, with the value range: 10, 20, 50|
|**filters**|[Filter[]](describeauditresult#filter)|False| |Filtering parameters, the relationship between multiple filtering parameters is "AND"<br>Support the filter for following attributes:|

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filtering Conditions|
|**operator**|String|False| |Operators of filtering conditions, which is eq by default|
|**values**|String[]|True| |Values of Filtering Conditions|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeauditresult#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**auditResult**|[AuditResult[]](describeauditresult#auditresult)| |
|**totalCount**|Integer| |
### <div id="auditresult">AuditResult</div>
|Name|Type|Description|
|---|---|---|
|**startTime**|String|SQL Execution Time|
|**ip**|String|Source IP|
|**accountName**|String|Account Name|
|**operation**|String|Operation Types|
|**threadId**|String|Thread ID|
|**processId**|String|Thread ID, which is supported only by PostgreSQL|
|**dbName**|String|Database Name|
|**sql**|String|sql Sentence|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeAuditResult() {
    DescribeAuditResultRequest request = new DescribeAuditResultRequest();
    request.setStartTime("2020-01-05 00:00:00");
    request.setEndTime("2020-01-07 14:59:49");
    request.setInstanceId("mysql-wp4e9ztap2");
    request.setRegionId("cn-north-1");
    Filter filter = new Filter();
    filter.setName("operation");
    filter.addValue("DDL");
    request.addFilter(filter);
    DescribeAuditResultResponse response = rdsClient.describeAuditResult(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa2ud0kg5ngr6bm3nor1t3wcg3oqqbg", 
    "result": {
        "auditResult": [], 
        "totalCount": 0
    }
}
```
