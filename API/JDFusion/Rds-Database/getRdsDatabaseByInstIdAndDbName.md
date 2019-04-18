# getRdsDatabaseByInstIdAndDbName


## Description
Get the database information on the designated RDS instance according to the filtering conditions

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/rds_instances/{instId}/databases/{dbName}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instId**|String|True| |RDS Instance ID|
|**dbName**|String|True| |Database Name|
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
|**db**|RdsDBInfo| |
### RdsDBInfo
|Name|Type|Description|
|---|---|---|
|**name**|String|Database Name|
|**status**|String|Database Status|
|**characterSetName**|String|Character Set|
|**accountPrivileges**|RdsDBAccessPrivilege[]| |
|**cloudID**|String|Provider ID of the Cloud|
### RdsDBAccessPrivilege
|Name|Type|Description|
|---|---|---|
|**accountName**|String|Account Name|
|**privilege**|String|Permission that the account has to the database|
|**cloudID**|String|Provider ID of the Cloud|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|instance not found, or database name not found|
