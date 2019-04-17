# revokeRdsAccount


## Description
Assign database permissions to the RDS account

## Request Method
DELETE

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/rds_instances/{instId}/accounts/{accountName}/databases/{dbName}:revoke

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**accountName**|String|True| |Account Name|
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
|**404**|RDS instance not found, RDS accountName not found or RDS dbName not found|
