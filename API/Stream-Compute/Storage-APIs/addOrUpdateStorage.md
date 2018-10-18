# addOrUpdateStorage


## Description
Create or update storage

## Request method
POST

## Request address
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/storage

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**storageStr**|Storage|True| |Details of creating or updating storage|

### Storage
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**createTime**|String|False| | |
|**deleted**|String|False| | |
|**id**|Integer|False| | |
|**name**|String|False| | |
|**namespaceId**|String|False| | |
|**storageParameterList**|StorageParameter[]|False| |Specific parameters of Storage. <br>1. When the created source type is streaming data input, source, topicName, duration, format, delimiter, and schema need to be transmitted. <br> 2. When creating output, if the output location is the Stream Hub, topicName, format, delimiter, ossFlag, bucketName, directory and objectName need to be transmitted. <br> 3. When creating output, if the output location is the data compute, database, table, ossFlag, bucketName, directory and objectName need to be transmitted.|
|**storageType**|String|False| |This parameter has two optional values, input and ouput, depending on whether the input or output is created|
|**type**|String|False| | |
|**uid**|String|False| | |
|**updateTime**|String|False| | |
|**userName**|String|False| | |
### StorageParameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**createTime**|String|False| | |
|**deleted**|String|False| | |
|**id**|Integer|False| | |
|**pKey**|String|False| | |
|**pValue**|String|False| | |
|**storageId**|Integer|False| | |
|**uid**|String|False| | |
|**updateTime**|String|False| | |

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**message**|String| |
|**status**|Boolean| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
|**500**|INTERNAL_ERROR|
|**400**|UNAUTHENTICATED|
