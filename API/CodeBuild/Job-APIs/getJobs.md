# getJobs


## Description
Search and obtain the compilation task list, and display some information about the final compilation
/v2/regions/cn-south-1/jobs/?sorts.1.name=status&sorts.1.direction=asc&pageNumber=1&pageSize=10&filters.1.name=name&filters.1.values.1= my job


## Request Method
GET

## Request Address
https://compile.jdcloud-api.com/v1/regions/{regionId}/jobs

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**sorts**|Sort[]|False| |Sequence a column|
|**pageNumber**|Integer|False| |Page Number; 1 by Default|
|**pageSize**|Integer|False| |Segmentation size; it is 10 by default; value range[10, 100]|
|**filters**|Filter[]|False| |Compilation Task Name|

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

### Result
|Name|Type|Description|
|---|---|---|
|**totalCount**|Integer| |
|**jobs**|SimpleJob[]| |
|**requestId**|String| |
### SimpleJob
|Name|Type|Description|
|---|---|---|
|**uuid**|String|uuid of Building Task|
|**name**|String|Building Name|
|**buildStartAt**|Integer|Start Time of Building|
|**compilerType**|String|Building Type|
|**buildStatus**|String|Building Status|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
