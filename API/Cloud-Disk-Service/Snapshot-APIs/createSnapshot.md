# createSnapshot


## 描述
-   Create a snapshot for the specified cloud disk, and the status of the newly generated snapshot is creating.
-   The quota for single-user snapshots in the same region is 15.
-   To ensure data integrity, please stop writing to the cloud disk before creating a snapshot to ensure the integrity of snapshot data.
-   Before creating a snapshot, we suggest you uninstall the cloud disk and reattach the disk to the virtual machine after the snapshot is created.
-   The life cycle of manual snapshots is independent from the cloud disk. Please delete unnecessary snapshots in time.
-   The time demanded to create a snapshot depends on the capacity of the cloud disk. The larger the capacity is, the longer it will take.


## 请求方式
POST

## 请求地址
https://disk.jdcloud-api.com/v1/regions/{regionId}/snapshots

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**clientToken**|String|True| |Idempotence Check Parameter|
|**snapshotSpec**|SnapshotSpec|True| |Create snapshot specification|

### SnapshotSpec
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**description**|String|False| |Snapshot Description|
|**diskId**|String|True| |Cloud Disk ID used to create the Snapshot|
|**name**|String|True| |Snapshot Name|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Result Set|

### Result
|名称|类型|描述|
|---|---|---|
|**snapshotId**|String|ID of the Created Snapshot|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**500**|Internal server error|
|**503**|Service unavailable|
|**200**|OK|
|**404**|Not found|
|**429**|Quota exceeded|
