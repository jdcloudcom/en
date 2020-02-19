# describeQuota


## Description
Search resource quota and support native container pod and secret.


## Request Method
GET

## Request Address
https://pod.jdcloud-api.com/v1/regions/{regionId}/quotas

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**resourceType**|String|True| |resourceType - Resource type; support [container, pod, secret]<br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describequota#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**quota**|[Quota](describequota#quota)| |
### <div id="quota">Quota</div>
|Name|Type|Description|
|---|---|---|
|**resourceType**|String|Type|
|**limit**|Integer|Quota|
|**used**|Integer|Used Number|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
