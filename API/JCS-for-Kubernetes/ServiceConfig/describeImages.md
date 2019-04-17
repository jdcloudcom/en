# describeImages


## Description
Search service configuration information; provide detailed master and node image information.

## Request Method
GET

## Request Address
https://kubernetes.jdcloud-api.com/v1/regions/{regionId}/images

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**masterVersion**|String|False| |Big version of cluster, such as 1.8.12|
|**masterImageCode**|String|False| |Image code of master, such as 1.8.12-jke|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**masterImages**|MasterImage[]| |
### MasterImage
|Name|Type|Description|
|---|---|---|
|**code**|String|Image Code|
|**imageId**|String|Image id of Virtual Machines|
|**mainVersion**|String|Primary Version Number|
|**innerVersion**|String|Internal Version Number|
|**isDefault**|Boolean|Whether or not default image|
|**visibility**|Integer|Visibility: 0: Visible for all; 1: Visible for authorized users; 2: Visible for users in White List only|
|**defaultNodeImageCode**|String|node Image Code by Default|
|**nodeImages**|NodeImage[]|Configuration of node|
### NodeImage
|Name|Type|Description|
|---|---|---|
|**code**|String|Image Code|
|**imageId**|String|Image id of Virtual Machines|
|**imageOs**|String|Image Operating System|
|**mainVersion**|String|Primary Version Number|
|**innerVersion**|String|Internal Version Number|
|**visibility**|Integer|Visibility|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
