# describeErrorLogs


## Description
Obtain error log of SQL Server and download information<br>- only support SQL Server

## Request method
GET

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/errorLogs

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**errorLogs**|ErrorLog[]|Collection of Error Log Files|
### <a name="ErrorLog">ErrorLog</a>
|Name|Type|Description|
|---|---|---|
|**internalURL**|String|Download Link of Intranet|
|**lastUpdateTime**|String|Last update time of the error log, format: YYYY-MM-DD HH:mm:ss|
|**name**|String|Error Log File Name|
|**publicURL**|String|Download Link of Public Network|
|**sizeByte**|Integer|Error Log File Size in Bytes|
|**uploadTime**|String|Error log upload time, format: YYYY-MM-DD HH:mm:ss|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
