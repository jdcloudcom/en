# addOrUpdateStorage


## 描述
Create or update storage

## 请求方式
POST

## 请求地址
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/storage

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**storageStr**|[Storage](##Storage)|True||Details of creating or updating storage|

### <a name="Storage">Storage</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**createTime**|String|False|||
|**deleted**|String|False|||
|**id**|Integer|False|||
|**name**|String|False|||
|**namespaceId**|String|False|||
|**storageParameterList**|[StorageParameter[]](##StorageParameter)|False||Specific parameters of Storage. <br>1. When the created source type is streaming data input, source, topicName, duration, format, delimiter, and schema need to be transmitted. <br> 2. When creating output, if the output location is the streaming data bus, topicName, format, delimiter, ossFlag, bucketName, directory and objectName need to be transmitted. <br> 3. When creating output, if the output location is the data computing service, database, table, ossFlag, bucketName, directory and objectName need to be transmitted.|
|**storageType**|String|False||This parameter has two optional values, input and ouput, depending on whether the input or output is created|
|**type**|String|False|||
|**uid**|String|False|||
|**updateTime**|String|False|||
|**userName**|String|False|||
### <a name="StorageParameter">StorageParameter</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**createTime**|String|False|||
|**deleted**|String|False|||
|**id**|Integer|False|||
|**pKey**|String|False|||
|**pValue**|String|False|||
|**storageId**|Integer|False|||
|**uid**|String|False|||
|**updateTime**|String|False|||

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**message**|String||
|**status**|Boolean||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
|**500**|INTERNAL_ERROR|
|**400**|UNAUTHENTICATED|
