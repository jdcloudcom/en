# describeErrorLogs


## Description
Obtain error logs of SQL Server and download information<br>- only support SQL Server

## Request method
GET

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/errorLogs

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeErrorLogs#Result)| |

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**errorLogs**|[ErrorLog[]](describeErrorLogs#ErrorLog)|Error Log File Set|
### <a name="ErrorLog">ErrorLog</a>
|Name|Type|Description|
|---|---|---|
|**name**|String|Error Log File Name|
|**sizeByte**|Long|Error Log File Size in Bytes|
|**lastUpdateTime**|String|Last Update Time of the Error Log, Format: YYYY-MM-DD HH:mm:ss|
|**uploadTime**|String|Error Log Upload Time, Format: YYYY-MM-DD HH:mm:ss|
|**publicURL**|String|Download Link of Public Network|
|**internalURL**|String|Download Link of Intranet|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
