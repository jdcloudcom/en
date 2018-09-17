# describeStorage


## 描述
Query the assigned input

## 请求方式
GET

## 请求地址
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/storage

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**storageId**|Integer|True||storageId|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**data**|[Storage](##Storage)||
### <a name="Storage">Storage</a>
|名称|类型|描述|
|---|---|---|
|**createTime**|String||
|**deleted**|String||
|**id**|Integer||
|**name**|String||
|**namespaceId**|String||
|**storageParameterList**|[StorageParameter[]](##StorageParameter)|Specific parameters of Storage. <br>1. When the created source type is streaming data input, source, topicName, duration, format, delimiter, and schema need to be transmitted. <br> 2. When creating output, if the output location is the streaming data bus, topicName, format, delimiter, ossFlag, bucketName, directory and objectName need to be transmitted. <br> 3. When creating output, if the output location is the data computing service, database, table, ossFlag, bucketName, directory and objectName need to be transmitted.|
|**storageType**|String|This parameter has two optional values, input and ouput, depending on whether the input or output is created|
|**type**|String||
|**uid**|String||
|**updateTime**|String||
|**userName**|String||
### <a name="StorageParameter">StorageParameter</a>
|名称|类型|描述|
|---|---|---|
|**createTime**|String||
|**deleted**|String||
|**id**|Integer||
|**pKey**|String||
|**pValue**|String||
|**storageId**|Integer||
|**uid**|String||
|**updateTime**|String||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**401**|UNAUTHENTICATED|
|**500**|internal error|
