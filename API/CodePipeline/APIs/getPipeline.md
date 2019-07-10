# getPipeline


## Description
Obtain the configuration information about the CodePipeline task based on uuid

## Request Method
GET

## Request Address
https://pipeline.jdcloud-api.com/v1/regions/{regionId}/pipeline/{uuid}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**uuid**|String|True| |uuid of CodePipeline|
|**regionId**|String|True| |Region ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**pipeline**|Pipeline| |
### Pipeline
|Name|Type|Description|
|---|---|---|
|**uuid**|String|uuid of CodePipeline|
|**createdAt**|Integer|Creation Time Stamp of CodePipeline|
|**updatedAt**|Integer|Last Update Time Stamp of CodePipeline|
|**name**|String|CodePipeline Name|
|**content**|String|The json Character String Defined by CodePipeline. It supports the method configuration for the user’s directly uploading the json configuration file due to configuration flexibility. So, it isn’t analyzed or reversely analyzed.|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
