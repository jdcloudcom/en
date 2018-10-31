# describeStorage


## Description
Query the assigned input

## Request method
GET

## Request address
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/storage

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**storageId**|Integer|True| |storageId|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|Storage| |
### Storage
|Name|Type|Description|
|---|---|---|
|**createTime**|String| |
|**deleted**|String| |
|**id**|Integer| |
|**name**|String| |
|**namespaceId**|String| |
|**storageParameterList**|StorageParameter[]|Specific parameters of Storage. <br>1. When the created source type is streaming data input, source, topicName, duration, format, delimiter, and schema need to be transmitted. <br> 2. When creating output, if the output location is the Stream Hub, topicName, format, delimiter, ossFlag, bucketName, directory and objectName need to be transmitted. <br> 3. When creating output, if the output location is the data compute, database, table, ossFlag, bucketName, directory and objectName need to be transmitted.|
|**storageType**|String|This parameter has two optional values, input and ouput, depending on whether the input or output is created|
|**type**|String| |
|**uid**|String| |
|**updateTime**|String| |
|**userName**|String| |
### StorageParameter
|Name|Type|Description|
|---|---|---|
|**createTime**|String| |
|**deleted**|String| |
|**id**|Integer| |
|**pKey**|String| |
|**pValue**|String| |
|**storageId**|Integer| |
|**uid**|String| |
|**updateTime**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**401**|UNAUTHENTICATED|
|**500**|internal error|
