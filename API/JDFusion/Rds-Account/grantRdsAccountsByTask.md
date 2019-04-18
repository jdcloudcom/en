# grantRdsAccountsByTask


## Description
Assign database permissions to the RDS account through asynchronous tasks

## Request Method
PUT

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/rds_instances/{instId}/accounts/{accountName}:grantByTask

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instId**|String|True| |RDS Instance ID|
|**accountName**|String|True| |Account Name|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**info**|DbPrivilegeInfo|True| |Permission information that RDS account has to the database|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|

### DbPrivilegeInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**dbName**|String|True| |Database Name|
|**privilege**|String|True| |Permission, RO: Read-only, RW: Read-write|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**cloud**|ResourceTFInfo| |
### ResourceTFInfo
|Name|Type|Description|
|---|---|---|
|**uuid**|String|uuid|
|**body**|String|Request Body|
|**status**|String|Status|
|**result**|String|Execution Results|
|**createdTime**|String|Creation Time|
|**updateTime**|String|Update Time|
|**provider**|String|cloud provider|
|**cloudId**|String|cloud ID|
|**userId**|String|user ID|

## Return Code
|Return Code|Description|
|---|---|
|**202**|ok|
|**404**|RDS instance not found or RDS accountName not found|
