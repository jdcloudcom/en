# getDiskById


## Description
Search corresponding Cloud Disk resource information according to the cloud provider

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/disk_disks/{id}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |Cloud Disk ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**disk**|CloudDataDisk| |
### CloudDataDisk
|Name|Type|Description|
|---|---|---|
|**cloudID**|String|Cloud Registration Information ID|
|**id**|String|Cloud Disk Service ID|
|**name**|String|Cloud Disk Name|
|**description**|String|Cloud Disk Description|
|**diskSizeGB**|Integer|Disk Size, Unit: GiB|
|**attachments**|ArrayDiskAttachment[]|Attach Information|
|**az**|String|Corresponding AZ of Cloud Disk|
|**diskType**|String|Disk Type, with value of SSD or Premium-hdd|
|**snapshotId**|String|Create Snapshot ID of the Cloud Disk|
|**status**|String|Cloud Disk Status|
|**tags**|Tag[]| |
|**createdTime**|String|Creation Time|
### Tag
|Name|Type|Description|
|---|---|---|
|**tagKey**|String|KEY Value of Tag|
|**tagValue**|String|Value of Tag Value|
### ArrayDiskAttachment
|Name|Type|Description|
|---|---|---|
|**instanceId**|String|ID of Attached Instance|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|not found|
