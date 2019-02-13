# createRdsAccounts


## Description
Create an account with designated RDS instance according to provided information

## Request Method
POST

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/rds_instances/{instId}/accounts

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instId**|String|True| |RDS Instance ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**account**|CreateRDSAccount|True| |Create account information of RDS instance|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|

### CreateRDSAccount
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Account Name|
|**password**|String|True| |Password|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**task**|ResourceTFInfo| |
### ResourceTFInfo
|Name|Type|Description|
|---|---|---|
|**body**|String|Request Body|
|**cloudId**|String|cloud ID|
|**createdTime**|String|Creation Time|
|**provider**|String|cloud provider|
|**result**|String|Execution Results|
|**status**|String|Status|
|**updateTime**|String|Update Time|
|**userId**|String|user ID|
|**uuid**|String|uuid|

## Return Code
|Return Code|Description|
|---|---|
|**202**|ACCEPTED|
|**404**|RDS instance not found|
