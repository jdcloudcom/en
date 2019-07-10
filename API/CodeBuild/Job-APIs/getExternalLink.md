# getExternalLink


## Description
Generate packet addresses with term of validity

## Request Method
GET

## Request Address
https://compile.jdcloud-api.com/v1/regions/{regionId}/jobs/{jobid}/builds/{id}/externalLink

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**jobid**|String|True| |job uuid|
|**id**|String|True| |uuid of Building Task|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**expires**|Integer|False| |Expiration Time (Unit: Second), 1,800s by Default|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**url**|String| |
|**token**|String| |
|**urlValid**|Int| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
