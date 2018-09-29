# updateNamespace


## Description
Update namespace

## Request method
PUT

## Request address
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/namespace

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**namespaceStr**|Namespace|True| | |

### Namespace
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**createTime**|String|False| | |
|**deleted**|Integer|False| | |
|**id**|Integer|False| | |
|**name**|String|False| | |
|**pods**|String|False| | |
|**podsUpdateTime**|String|False| | |
|**resourceId**|String|False| | |
|**sourceId**|String|False| | |
|**status**|String|False| | |
|**type**|String|False| | |
|**typeValue**|String|False| | |
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
|**status**|Boolean|Update the successful marker|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|INTERNAL_ERROR|
