# getRdsDatabasesByInstId


## Description
Get the database information on the designated RDS instance according to the filtering conditions

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/rds_instances/{instId}/databases

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
|**dbs**|RdsDBInfo[]| |
### RdsDBInfo
|Name|Type|Description|
|---|---|---|
|**accountPrivileges**|RdsDBAccessPrivilege[]| |
|**characterSetName**|String|Character Set|
|**cloudID**|String|Provider ID of the Cloud|
|**name**|String|Database Name|
|**status**|String|Database Status|
### RdsDBAccessPrivilege
|Name|Type|Description|
|---|---|---|
|**accountName**|String|Account Name|
|**cloudID**|String|Provider ID of the Cloud|
|**privilege**|String|Permission that the account has to the database|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|RDS instance not found|
