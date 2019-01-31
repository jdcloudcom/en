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
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**accounts**|RdsAccountInfo[]| |
### RdsAccountInfo
|Name|Type|Description|
|---|---|---|
|**accountPrivileges**|RdsAccountPrivilege[]| |
|**cloudID**|String|Provider ID of the Cloud|
|**name**|String|Account Name|
|**status**|String|Account Status|
### RdsAccountPrivilege
|Name|Type|Description|
|---|---|---|
|**cloudID**|String|Provider ID of the Cloud|
|**dbName**|String|Database Name|
|**privilege**|String|Permission that the account has to the database|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|RDS instance not found|
