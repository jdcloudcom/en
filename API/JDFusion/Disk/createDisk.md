# createDisk


## Description
Create Cloud Disk according to the cloud provider

## Request Method
POST

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/disk_disks

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**body**|CreateDataDiskReq|True| |Create Cloud Disk|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|

### CreateDataDiskReq
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**disk**|CreateDataDisk|False| | |
### CreateDataDisk
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**attachments**|ArrayDiskAttachment[]|False| |Attach Information|
|**az**|String|True| |Corresponding AZ of Cloud Disk|
|**cloudID**|String|False| |Cloud Registration Information ID|
|**createdTime**|String|False| |Creation Time|
|**description**|String|False| |Cloud Disk Description|
|**diskSizeGB**|Integer|True| |Disk Size, Unit: GiB|
|**diskType**|String|False| |Disk Type, with value of SSD or Premium-hdd|
|**id**|String|False| |Cloud Disk Service ID|
|**name**|String|False| |Cloud Disk Name|
|**snapshotId**|String|False| |Create Snapshot ID of the Cloud Disk|
|**status**|String|False| |Cloud Disk Status|
|**tags**|Tag[]|False| | |
### ArrayDiskAttachment
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceId**|String|False| |ID of Attached Instance|
### Tag
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**tagKey**|String|False| |KEY Value of Tag|
|**tagValue**|String|False| |Value of Tag Value|

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
|**201**|CREATED|
