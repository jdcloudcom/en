# getDisks


## Description
Search corresponding Cloud Disk resource information according to the cloud provider

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/disk_disks

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**disks**|CloudDataDisk[]| |
### CloudDataDisk
|Name|Type|Description|
|---|---|---|
|**attachments**|ArrayDiskAttachment[]|Attach Information|
|**az**|String|Corresponding AZ of Cloud Disk|
|**cloudID**|String|Cloud Registration Information ID|
|**createdTime**|String|Creation Time|
|**description**|String|Cloud Disk Description|
|**diskSizeGB**|Integer|Disk Size, Unit: GiB|
|**diskType**|String|Disk Type, with value of SSD or Premium-hdd|
|**id**|String|Cloud Disk Service ID|
|**name**|String|Cloud Disk Name|
|**snapshotId**|String|Create Snapshot ID of the Cloud Disk|
|**status**|String|Cloud Disk Status|
|**tags**|Tag[]| |
### ArrayDiskAttachment
|Name|Type|Description|
|---|---|---|
|**instanceId**|String|ID of Attached Instance|
### Tag
|Name|Type|Description|
|---|---|---|
|**tagKey**|String|KEY Value of Tag|
|**tagValue**|String|Value of Tag Value|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
