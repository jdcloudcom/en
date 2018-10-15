# addOrUpdateJob


## Description
Add or update iob

## Request method
POST

## Request address
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/job

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**jobStr**|JobStr|True| |Details of creating job|

### JobStr
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**appName**|String|False| | |
|**createTime**|String|False| | |
|**deleted**|String|False| | |
|**description**|String|False| | |
|**duration**|Integer|False| | |
|**id**|Integer|False| | |
|**jobType**|String|False| | |
|**name**|String|False| | |
|**namespaceId**|String|False| | |
|**resourceConsume**|Integer|False| | |
|**sqlStatement**|String|False| | |
|**status**|String|False| | |
|**uid**|String|False| | |
|**updateTime**|String|False| | |
|**userName**|String|False| | |

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**okInfo**|OkInfo|Successful Result Object|
### OkInfo
|Name|Type|Description|
|---|---|---|
|**message**|String|Status Information|
|**status**|Boolean| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|INTERNAL_ERROR|
