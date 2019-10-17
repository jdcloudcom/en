# createSecret


## Description
Create a secret for storing relevant confidential information of image registry.


## Request Method
POST

## Request Address
https://pod.jdcloud-api.com/v1/regions/{regionId}/secrets

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Names of confidential data can’t be the same<br>|
|**secretType**|String|True| |Now, only the following confidential data type is supported: docker-registry, which is the docker registry verification type. <br>|
|**data**|DockerRegistryData|True| |Confidential data. <br><br>The valid characters of key include letters, figures, -, _, and.; <br><br>value is the character string encoded by Base64, which can’t comprise a line break (please use base64 -w 0 option under linux); the length cap of each value is 4KB; and the length of the entire data cannot exceed 256KB; <br><br>must contain server, username and password fields; email field is optional. <br><br>|

### DockerRegistryData
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**server**|String|True| |registry Server Address|
|**username**|String|True| |User Name|
|**password**|String|True| |Password|
|**email**|String|False| |Email Address|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**secretName**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**429**|Quota exceeded|
|**500**|Internal server error|
|**503**|Service unavailable|
