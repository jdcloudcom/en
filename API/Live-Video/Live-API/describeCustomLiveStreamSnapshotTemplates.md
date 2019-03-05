# describeCustomLiveStreamSnapshotTemplates


## Description
Search live snapshot template list

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/snapshotCustoms


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |Domain list search filter requirements; return 10 by default when no paging parameters are passed on|
|**pageNum**|Integer|False|1|page; it is 1 by default; value range [1, 100000]|
|**pageSize**|Integer|False|10|Segmentation size; it is 10 by default; value range[10, 100]|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ruquestId|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**snapshotTemplates**|SnapshotTemplate[]|Code Rate Information|
|**totalCount**|Number|Search Total Amount|
### SnapshotTemplate
|Name|Type|Description|
|---|---|---|
|**fillType**|Integer|File Type|
|**format**|String|Snapshot Format|
|**height**|Integer|Height|
|**saveBucket**|String|Bucket|
|**saveEndpoint**|String|Storage endPoint|
|**saveMode**|Integer|Save Mode|
|**snapshotInterval**|Integer|Snapshot|
|**template**|String|Record template customized name|
|**width**|Integer|Width|

## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
