# queryTemplateList


## Description
Search content list APIs of Rich Media SMS

## Request Method
POST

## Request Address
https://rms.jdcloud-api.com/v1/regions/{regionId}/queryTemplateList

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**appId**|String|False| |Application Id|
|**searchKey**|String|False| |SMS Title for Search, optional|
|**pageNum**|String|False| |Page XX|
|**pageLimit**|String|False| |Data Count per Page|
|**status**|String|False| |SMS Audit Status|
|**startTime**|String|False| |Start Time, in the format of YYYY-MM-DD|
|**endTime**|String|False| |End Time, in the format of YYYY-MM-DD|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request Id|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|RespQueryTemplateListData[]| |
|**message**|String|Response Message|
|**totalElements**|String|Total Entry|
|**status**|String|Request Status|
### RespQueryTemplateListData
|Name|Type|Description|
|---|---|---|
|**reason**|String|Unapproved Reason|
|**createTime**|String|SMS Creation Time|
|**contentSize**|String|SMS Size|
|**description**|String|SMS Description|
|**templateId**|String|SMS Id|
|**title**|String|SMS Title|
|**status**|String|SMS Audit Status|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|INVALID_ARGUMENT|
|**500**|INTERNAL|
