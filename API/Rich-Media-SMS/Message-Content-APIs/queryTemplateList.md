# queryTemplateList


## Description
Search content list APIs of Rich Media SMS

## Request Method
POST

## Request Address
https://rms.jdcloud-api.com/v2/regions/{regionId}/queryTemplateList

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True|cn-north-1|Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**appId**|String|True| |Application ID|
|**title**|String|False| |Search title key words|
|**pageNum**|Integer|True| |Page XX|
|**pageLimit**|Integer|True| |Record Counts per Page|
|**status**|String|False| |Review status: 0: Reviewing 1: Pass 2: Failed 4: To Be Submitted|
|**startTime**|String|False| |Start Time, in the format of YYYY-MM-DD|
|**endTime**|String|False| |End Time, in the format of YYYY-MM-DD|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**data**|RespTemplatePageResult| |
|**status**|Boolean|Request Status|
|**code**|String|Error Code|
|**message**|String|Error Message|
### RespTemplatePageResult
|Name|Type|Description|
|---|---|---|
|**count**|Long|Total Entry|
|**pageNum**|Integer|Current Page|
|**pageSize**|Integer|Entry Counts per Page|
|**pageCount**|Integer|Total Number of Pages|
|**list**|RespQueryTemplateListData[]|Data|
### RespQueryTemplateListData
|Name|Type|Description|
|---|---|---|
|**templateId**|String|SMS ID|
|**title**|String|SMS Title|
|**status**|String|Review Status  0: Reviewing  1: Pass  2: Failed  4: To Be Submitted|
|**reason**|String|Unapproved Reason|
|**createTime**|String|SMS Creation Time yyyy-MM-dd HH:mm:ss|
|**contentSize**|String|SMS Size|
|**aptitudesId**|String|Qualification Id|
|**description**|String|SMS Description|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|INVALID_ARGUMENT|
|**500**|INTERNAL|
