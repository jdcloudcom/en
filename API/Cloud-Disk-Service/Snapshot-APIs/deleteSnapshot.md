# deleteSnapshot


## 描述
-   Delete a single cloud disk snapshot: The snapshot status must be available or error status.
-   The snapshot is independent from life cycle of the cloud disk service. Deleting a snapshot does not have any effect on the cloud disk that created the snapshot.
-   After the snapshot is deleted, it cannot be recovered. Please be cautious.


## 请求方式
DELETE

## 请求地址
https://disk.jdcloud-api.com/v1/regions/{regionId}/snapshots/{snapshotId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|
|**snapshotId**|String|True||Snapshot ID|

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
