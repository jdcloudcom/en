# modifyResourceRecordStatus


## Description
Enable and disable resolution records under primary domain

## Request Method
PUT

## Request Address
https://domainservice.jdcloud-api.com/v2/regions/{regionId}/domain/{domainId}/ResourceRecord/{resourceRecordId}/status

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of Instances|
|**domainId**|String|True| |Domain ID, please get it by using the describeDomains API.|
|**resourceRecordId**|String|True| |Resolution record ID, please get it by using the describeResourceRecord API.|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**action**|String|True| |Status to be modified: enable and disable|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of Request at this time|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
