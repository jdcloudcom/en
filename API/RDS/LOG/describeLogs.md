# describeLogs


## Description
Obtain log file list of PostgreSQL<br>- Only support PostgreSQL, MySQL, Percona and MariaDB

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/log:describeLogs

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS Instance ID, the Unique Identifier of One RDS Instance|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |The page displaying the data, which is 1 by default, with value range: [-1,∞). When the pageNumber is -1, all data pages are returned; when it exceeds the total pages, the last page is displayed;|
|**pageSize**|Integer|False| |The data entries displayed on each page, which is 100 by default, with the value range: [10,100], which is used for searching interfaces of lists|
|**filters**|[Filter[]](describeLogs#Filter)|False| |Filtering parameters, the relationship between filtering parameters is "and"<br>Support filtering by the following attributes: logType, support operator option: eq, only support MySQL, Percona and MariaDB<br>|

### <a name="Filter">Filter</a>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeLogs#Result)| |

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**logs**|[Log[]](describeLogs#Log)| |
|**totalCount**|Integer| |
### <a name="Log">Log</a>
|Name|Type|Description|
|---|---|---|
|**id**|String|Log File id|
|**name**|String|Log file name|
|**sizeByte**|Integer|Log file size, unit Byte|
|**lastModified**|String|Last modification time of log|
|**publicURL**|String|Public network download link|
|**internalURL**|String|Intranet download link|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
