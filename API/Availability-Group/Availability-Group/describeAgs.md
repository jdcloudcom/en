# describeAgs


## Description
Search one or more availability groups with filter conditions

## Request Method
GET

## Request Address
https://ag.jdcloud-api.com/v1/regions/{regionId}/availabilityGroups

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page Number; 1 by Default|
|**pageSize**|Integer|False| |Page size; it is 20 by default; value range[10, 100]|
|**filters**|Filter[]|False| |agName - ag name, supporting fuzzy match<br>agId - ag id, exact match<br>instanceTemplateId - instance template id, exact match<br>vpcId - vpc id, exact match<br>|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**ags**|AvailabilityGroup[]| |
|**totalCount**|Integer| |
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
