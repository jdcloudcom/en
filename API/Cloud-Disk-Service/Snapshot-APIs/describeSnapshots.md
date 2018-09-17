# describeSnapshots


## 描述
Query the list of cloud disk snapshots. Filters, between multiple filter conditions is logic AND, and multiple values ​​inside each condition is logic OR

## 请求方式
GET

## 请求地址
https://disk.jdcloud-api.com/v1/regions/{regionId}/snapshots

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**filters**|[Filter[]](##Filter)|False||snapshotId - cloud disk snapshot ID, support multiple<br>diskId - the cloud disk service ID of the snapshot to be generated, support multiple<br>Status - snapshot status, accurate match, support multiple, creating, available, in-use, deleting, error_create or error_delete<br>name - snapshot name, fuzzy match, support single<br>|
|**pageNumber**|Integer|False|1|Page number, defaults is 1; value range: [1, ∞)|
|**pageSize**|Integer|False|20|Page size, default is 20; value range: [10,100]|

### <a name="Filter">Filter</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True||Name of filter requirements|
|**operator**|String|False||Operator of filter requirements is eq by default|
|**values**|String[]|True||Value of filter requirements|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)|Query Result Set|


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**snapshots**|[Snapshot[]](##Snapshot)|List of snapshot information details queried|
|**totalCount**|Integer|Number of snapshots queried|
### <a name="Snapshot">Snapshot</a>
|名称|类型|描述|
|---|---|---|
|**createTime**|String|Creation Time|
|**description**|String|Snapshot Description|
|**diskId**|String|Cloud disk service ID used to create the snapshot|
|**name**|String|Snapshot Name|
|**snapshotId**|String|Cloud Disk Snapshot ID|
|**snapshotSizeGB**|Integer|Snapshot Size, in GiB|
|**status**|String|Snapshot state, creating, available, in-use, deleting, error_create or error_delete|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**500**|Internal server error|
|**401**|Authentication failed|
|**503**|Service unavailable|
