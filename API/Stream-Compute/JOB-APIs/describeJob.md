# describeJob


## Description
Query the details of Assigned Job

## Request method
GET

## Request address
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/job

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**jobId**|Integer|True| | |
|**namespaceId**|Integer|True| | |


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**jobStr**|JobStr| |
### JobStr
|Name|Type|Description|
|---|---|---|
|**appName**|String| |
|**createTime**|String| |
|**deleted**|String| |
|**description**|String| |
|**duration**|Integer| |
|**id**|Integer| |
|**jobType**|String| |
|**name**|String| |
|**namespaceId**|String| |
|**resourceConsume**|Integer| |
|**sqlStatement**|String| |
|**status**|String| |
|**uid**|String| |
|**updateTime**|String| |
|**userName**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|INTERNAL_ERROR|
