# extendDisk


## 描述
-   Expansion of the cloud disk requires it in available status.
-   Capacity expansion is not allowed while the disk is creating a snapshot.


## 请求方式
POST

## 请求地址
https://disk.jdcloud-api.com/v1/regions/{regionId}/disks/{diskId}:extend

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**diskId**|String|True| |Cloud Disk ID|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**diskSizeGB**|Integer|True| |The size of the cloud disk after expansion is in GiB|


## 返回参数
无


## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
