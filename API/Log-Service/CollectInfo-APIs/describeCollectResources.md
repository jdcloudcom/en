# describeCollectResources


## Description
Search instance list while collecting configuration

## Request Method
GET

## Request Address
https://logs.jcloud.com/v1/regions/{regionId}/collectinfos/{collectInfoUID}/resources

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id|
|**collectInfoUID**|String|True| |Collection Configuration UID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Long|False| |Current page, 1 by default|
|**pageSize**|Long|False| |Page size, 20 by default; value range [1, 100]|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested Identifier id|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|ResourceEnd[]|Resource List|
|**numberPages**|Long|Total Number of Pages|
|**numberRecords**|Long|Number of Total Records|
|**pageNumber**|Long|Current Page Number|
|**pageSize**|Long|Paging Size|
### ResourceEnd
|Name|Type|Description|
|---|---|---|
|**agentStatus**|Long|agent status: 0-abnormal, 1-normal|
|**name**|String|Resource Name|
|**region**|String|Resource Region|
|**resourceId**|String|Resource ID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Search collection configuration resource list results|
