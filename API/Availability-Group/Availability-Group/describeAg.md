# describeAg


## Description
Search Availability Group details based in id

## Request Method
GET

## Request Address
https://ag.jdcloud-api.com/v1/regions/{regionId}/availabilityGroups/{agId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region|
|**agId**|String|True| |Availability Group ID|

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
|**ag**|AvailabilityGroup| |
### AvailabilityGroup
|Name|Type|Description|
|---|---|---|
|**id**|String|Availability Group id|
|**name**|String|Availability Group name|
|**description**|String|Description, length:0-256|
|**instanceTemplateId**|String|Instance Template Id|
|**azs**|String[]|Availability Zone.|
|**agType**|String|Availability group type, supporting vm|
|**createTime**|String|Creation Time|
|**count**|Number|Instance Counts of Availability Group|
|**autoScaling**|Boolean|Enable auto scaling or not|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
