# listInstanceInfo


## Description
Search the instance information of the user

## Request method
GET

## Request address
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwInstance

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|DwInstance[]| |
|**message**|String| |
|**status**|Boolean| |
### DwInstance
|Name|Type|Description|
|---|---|---|
|**area**|String|Instance Zone|
|**comments**|String|Instance Description|
|**createTime**|String|Instance Creation Time|
|**instanceName**|String|Instance Name|
|**instanceOwnerName**|String|Instance Owner|
|**uname**|String|Instance Alias (shown on the page)|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
