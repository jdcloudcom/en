# listInstanceInfo


## Description
Search the instance information of the user

## Request method
GET

## Request address
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwInstance

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|DwInstance[]||
|**message**|String||
|**status**|Boolean||
### <a name="DwInstance">DwInstance</a>
|Name|Type|Description|
|---|---|---|
|**area**|String|Instance zone|
|**comments**|String|Instance description|
|**createTime**|String|Instance creation time|
|**instanceName**|String|Instance name|
|**instanceOwnerName**|String|Instance owner|
|**uname**|String|Instance alias (shown on the page)|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
