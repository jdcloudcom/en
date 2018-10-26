# getAuthorizationToken


## Description
<p>Apply for a token with 12-hour valid period. Use <code>docker</code> CLI push and pull image.</p>
<p><code>authorizationToken</code> returns a base64 code character string for each registry, and <code>docker login</code>command
may complete the assigned registry authentication after decoding. JCR CLI provides <code>jcr get-login</code> for verification.</p>


## Request Method
POST

## Request Address
https://openapi.cr.jdcloud.com/v1/regions/{regionId}/registries/{registryName}:getAuthorizationToken

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**registryName**|String|True| |Registry Name|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**expiredAfterHours**|Integer|False| |Expiration time to issue a new token, the selectable parameter shall be the expiration time to generate a new token, of which the maximum time is 24 hours and the minimum time is 1 hour, and in case of blank, it is considered to be 12 hours by default. <br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**authorizationData**|AuthorizationData| |
### AuthorizationData
|Name|Type|Description|
|---|---|---|
|**authorizationToken**|String|A character string based on base64 code, including the authorization information of assigned JCR registry. After decoding, it may be used for docker login.|
|**expiresAt**|String|Unix clock, which records the expiration time of authorization token. The default valid period of Authorization tokens is 12 hours.|
|**loginCmdLine**|String|The docker login command line directly used by the user|

## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
