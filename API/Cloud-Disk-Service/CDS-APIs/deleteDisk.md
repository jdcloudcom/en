# deleteDisk


## 描述
-   delete a cloud disk service billing by configuration. The disk types include the Premium Hdd Cloud Disk and the SSD Cloud Disk.
-   After the hard disk is deleted, the cloud disk snapshot can be retained.
-   When the disk is released, the state of the cloud disk is to-be-attached (Available).
-   If the disk of the specified ID does not exist, the request will be ignored.


## 请求方式
DELETE

## 请求地址
https://disk.jdcloud-api.com/v1/regions/{regionId}/disks/{diskId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**diskId**|String|True||Cloud Disk Service ID|
|**regionId**|String|True||Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|



## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
