# getPipelines


## Description
Search and obtain the CodePipeline task list, and display the status or result information about the final execution


## Request Method
GET

## Request Address
https://pipeline.jdcloud-api.com/v1/regions/{regionId}/pipeline

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page Number; 1 by Default|
|**pageSize**|Integer|False| |Segmentation size; it is 10 by default; value range[10, 100]|
|**sorts**|Sort[]|False| | |
|**filters**|Filter[]|False| |Search based on the CodePipeline name|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|
### Sort
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Name of Sorting Conditions|
|**direction**|String|False| |Direction of Sorting Conditions|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**totalCount**|Integer| |
|**pipelines**|SimplePipeline[]| |
### SimplePipeline
|Name|Type|Description|
|---|---|---|
|**uuid**|String|uuid of CodePipeline|
|**name**|String|Name of CodePipeline|
|**startedAt**|Integer|Start Time of CodePipeline Execution|
|**latestStatus**|String|Status of Last Execution (Data Structure to be Agreed)|
|**latestInstanceUuid**|String|Instance ID of Recent Execution|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
