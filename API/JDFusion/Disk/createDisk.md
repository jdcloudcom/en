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
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|
|**disk**|CreateDataDisk|True| |Create Cloud Disk|

### CreateDataDisk
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cloudID**|String|False| |Cloud Registration Information ID|
|**id**|String|False| |Cloud Disk Service ID|
|**name**|String|False| |Cloud Disk Name|
|**description**|String|False| |Cloud Disk Description|
|**diskSizeGB**|Integer|True| |Disk Size, Unit: GiB|
|**attachments**|ArrayDiskAttachment[]|False| |Attach Information|
|**az**|String|True| |Corresponding AZ of Cloud Disk|
|**diskType**|String|False| |Disk Type, with value of SSD or Premium-hdd|
|**snapshotId**|String|False| |Create Snapshot ID of the Cloud Disk|
|**status**|String|False| |Cloud Disk Status|
|**tags**|Tag[]|False| | |
|**createdTime**|String|False| |Creation Time|
### Tag
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**tagKey**|String|False| |KEY Value of Tag|
|**tagValue**|String|False| |Value of Tag Value|
### ArrayDiskAttachment
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceId**|String|False| |ID of Attached Instance|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**task**|ResourceTFInfo| |
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
|**201**|CREATED|
