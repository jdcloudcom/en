# checkRepositoryName


## Description
Query whether the Repository name exists and is in conformity with the naming specification.


## Request Method
POST

## Request Address
https://containerregistry.jdcloud-api.com/v1/regions/{regionId}/repositories:checkRepositoryName

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**registryName**|String|True| |Registry Name|
|**repositoryName**|String|True| |Name of Repository to be Checked|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**reason**|String|Where the code field is not zero, please give the detailed reason.|
|**code**|Integer|It represents whether the Repository specified by the user passes the verification, 0 means pass, 1 means that the name is blank, 2 means that the specifications are not met, and 3 means the name is duplicate|

## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
