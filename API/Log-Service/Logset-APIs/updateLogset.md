# updateLogset


## Description
Update log sets. Log set names cannot be updated.

## Request Method
PUT

## Request Address
https://logs.jcloud.com/v1/regions/{regionId}/logsets/{logsetUID}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id|
|**logsetUID**|String|True| |Log Set UID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-pin**|String|True| |User (primary and secondary) account. base64 code. The format is base64(subuser-pin) @ base64(owner-pin). A space is respectively left in front and behind @. If primary and sub-account are not supported, @ is not required and the format is base64(owner-pin)|
|**x-jdcloud-erp**|String|False| |x-jdcloud-erp   base64(username)|
|**x-jdcloud-request-id**|String|True| |Request ID|
|**description**|String|False| |Log Set Description|
|**lifeCycle**|Long|False| |Saving period can only be 7, 15 or 30|


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**||
|**400**||
|**500**||
