# describeTables


## Description
Obtain the list information of the base designated by the current instance \- Only support MySQL, Percona and MariaDB

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/databases/{dbName}/tables

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS Instance ID, the Unique Identifier of One RDS Instance|
|**dbName**|String|True| |Base name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |The page displaying the data, which is 1 by default, with value range: [-1,∞). When the pageNumber is -1, all data pages are returned; when it exceeds the total pages, the last page is displayed.|
|**pageSize**|Integer|False| |The data entries displayed on each page, which is 100 by default, with the value range: [10,100], which is used for searching interfaces of lists|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describetables#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**tables**|String[]|Database table name collection|
|**totalCount**|Integer| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeTables() {
    DescribeTablesRequest request = new DescribeTablesRequest();
    request.setDbName("dj_db");
    request.setInstanceId("mysql-k67q8n46si");
    request.setRegionId("cn-north-1");
    DescribeTablesResponse response = rdsClient.describeTables(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpaoofj0eshnh4sk65c6eh52cc2j9pe9", 
    "result": {
        "tables": [
            "dj_db"
        ], 
        "totalCount": 1
    }
}
```
