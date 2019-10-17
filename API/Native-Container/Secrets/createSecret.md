# createSecret


## Description
Create a secret for storing secrets.


## Request method
POST

## Request address
https://nativecontainer.jdcloud-api.com/v1/regions/{regionId}/secrets

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Secrets name, cannot be repeated<br>|
|**secretType**|String|True| |Secrets type, now only support: docker-registry type which is the docker registry verification type. <br>|
|**data**|DockerRegistryData|True| |Secrets data. <br><br>Fields such as server, username and password must be contained and the field of email is optional. <br><br>|

### DockerRegistryData
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**server**|String|True| |Registry Server Address|
|**username**|String|True| |User Name|
|**password**|String|True| |Password |
|**email**|String|False| |Email Address|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**secretName**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**429**|Quota exceeded|
|**500**|Internal server error|
|**503**|Service unavailable|
