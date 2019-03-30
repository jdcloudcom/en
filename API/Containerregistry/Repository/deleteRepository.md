# deleteRepository


## Description
Delete a Repository under a specified user.
</br>For sensitive operation, <a href="https://docs.jdcloud.com/IAM/Operation-Protection”>MFA operation protection can be enabled</a>

## Request Method
DELETE

## Request Address
https://containerregistry.jdcloud-api.com/v1/regions/{regionId}/registries/{registryName}/repositories/{repositoryName}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**registryName**|String|True| |Registry Name|
|**repositoryName**|String|True| |Repository Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**force**|Boolean|False| |Whether to delete the Container Registry with images by force|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
