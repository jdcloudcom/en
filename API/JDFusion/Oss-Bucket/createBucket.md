# createBucket


## Description
Create OSS bucket according to the provided information

## Request Method
POST

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/oss_buckets

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**bucket**|CreateOSSBucket|True| |Create OSS bucket|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|

### CreateOSSBucket
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**acl**|String|False| |IAM, private\public-read\public-read-write|
|**cloudID**|String|False| |Cloud Information|
|**creationDate**|String|False| |Creation Time|
|**name**|String|True| |Bucket Name|

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
