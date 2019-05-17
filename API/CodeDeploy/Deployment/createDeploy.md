# createDeploy


## Description
Create a deployment task

## Request Method
POST

## Request Address
https://deploy.jdcloud-api.com/v1/regions/{regionId}/deploy

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**groupId**|String|True| |Deployment Group ID, Unique Identifier of Deployment Group|
|**desc**|String|False| |Description|
|**deploySource**|Integer|True| |Deployment Source: 1url,2CodeBuild,3Cloud Storage|
|**deployCmd**|String|False| |Deployment Operation|
|**cmdSource**|Integer|False|1|1Use the operation entered, 2Use the operation contained in the program|
|**cmdType**|Integer|False|1|Display Format of Deployment Operation: 1form,2ymal|
|**productType**|Integer|False| |Project Type 1tomcat,2|
|**downloadUrl**|String|False| |Download url|
|**md5**|String|False| |md5|
|**compileProject**|String|False| |Item Name of CodeBuild|
|**compileSeries**|String|False| |CodeBuild Building SN|
|**ossSpace**|String|False| |Cloud Storage Space|
|**ossDir**|String|False| |Cloud Storage Directory|
|**fileType**|Integer|False|1|File Type: 1.tar,2.zip,3.tar.gz|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**deployId**|String|Online Order ID|

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
