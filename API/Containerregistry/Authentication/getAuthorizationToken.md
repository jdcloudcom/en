# getAuthorizationToken


## Description
<p>Apply for a token with 12-hour valid period. Use <code>docker</code> CLI push and pull image.</p>
<p><code>authorizationToken</code> returns a base64 code character string for each registry, and <code>docker login</code>command
may complete the assigned registry authentication after decoding. JCR CLI provides <code>jcr get-login</code> for verification.</p>


## Request method
POST

## Request address
https://containerregistry.jdcloud-api.com/v1/regions/{regionId}/registries/{registryName}:getAuthorizationToken

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**registryName**|String|True| |Registry Name|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**expiredAfterHours**|Integer|False| |Expiration time to issue a new token, the selectable parameter shall be the expiration time to generate a new token, of which the maximum time is 24 hours and the minimum time is 1 hour, and in case of blank, it is considered to be 12 hours by default. <br>|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**authorizationToken**|String| |
|**loginCmdLine**|String| |
|**expiresAt**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
