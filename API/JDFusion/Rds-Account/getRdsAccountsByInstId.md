# getRdsAccountsByInstId


## Description
Get the account information on the designated RDS instance according to the filtering conditions

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/rds_instances/{instId}/accounts

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instId**|String|True| |RDS Instance ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**accounts**|RdsAccountInfo[]| |
### RdsAccountInfo
|Name|Type|Description|
|---|---|---|
|**name**|String|Account Name|
|**status**|String|Account Status|
|**accountPrivileges**|RdsAccountPrivilege[]| |
|**cloudID**|String|Provider ID of the Cloud|
### RdsAccountPrivilege
|Name|Type|Description|
|---|---|---|
|**dbName**|String|Database Name|
|**privilege**|String|Permission that the account has to the database|
|**cloudID**|String|Provider ID of the Cloud|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|RDS instance not found|
