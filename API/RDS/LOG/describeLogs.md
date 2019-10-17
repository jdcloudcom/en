# describeLogs


## Description
Obtain log file list of PostgreSQL

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


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**dbInstances**|Log[]| |
|**totalCount**|Integer| |
### Log
|Name|Type|Description|
|---|---|---|
|**id**|Integer|Log file id|
|**name**|String|Log file name|
|**sizeByte**|Integer|Log file size, unit Byte|
|**lastModified**|String|Last modification time of log|
|**publicURL**|String|Public network download link|
|**internalURL**|String|Intranet download link|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
