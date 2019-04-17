# grantRdsAccount


## Description
Assign database permissions to the RDS account

## Request Method
PUT

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/rds_instances/{instId}/accounts/{accountName}:grant

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**accountName**|String|True| |Account Name|
|**instId**|String|True| |RDS Instance ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**dbPrivilegeInfo**|DbPrivilegeInfo|True| |Permission information that RDS account has to the database|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|

### DbPrivilegeInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**dbName**|String|True| |Database Name|
|**privilege**|String|True| |Permission, RO: Read-only, RW: Read-write|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**204**|OK|
|**404**|RDS instance not found or RDS accountName not found|
