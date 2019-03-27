# addCustomLiveStreamRecordTemplate


## Description
Add live record template

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/recordCustoms:template


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**recordFileType**|String|True| |Record File Format|
|**recordPeriod**|Integer|True| |Automatic Record Cycle|
|**saveBucket**|String|True| | |
|**saveEndpoint**|String|True| | |
|**template**|String|True| |Record Template Customized Name|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ruquestId|


## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
