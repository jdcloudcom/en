# deleteRdsDatabase


## Description
Delete the database information with designated database name on the designated RDS instance

## Request Method
DELETE

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/rds_instances/{instId}/databases/{dbName}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**dbName**|String|True| |Database Name|
|**instId**|String|True| |RDS Instance ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**204**|OK|
|**404**|instance not found, or dbName not found|
