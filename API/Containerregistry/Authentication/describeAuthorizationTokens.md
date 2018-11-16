# describeAuthorizationTokens


## Description
<p>Query tokens in batches.</p> 
<p>Paging and filtering conditions are not supported now.</p>


## Request Method
GET

## Request Address
https://openapi.cr.jdcloud.com/v1/regions/{regionId}/registries/{registryName}/tokens

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**registryName**|String|True| |Registry Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |token - token ID, support several tokens <br>|
|**pageNumber**|Integer|False| |Page Number; 1 by Default|
|**pageSize**|Integer|False| |Page size; it is 20 by default; value range[10, 100]|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**authorizationTokens**|AuthorizationData[]| |
|**totalCount**|Number| |
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
