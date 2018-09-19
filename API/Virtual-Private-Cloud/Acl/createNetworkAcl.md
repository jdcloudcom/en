# createNetworkAcl


## Description
Create NetworkAcl Interface

## Request method
POST

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkAcls/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**description**|String|False||Description, all characters allowed to enter under UTF-8 coding, which is not exceed 256 characters|
|**networkAclName**|String|True||NetworkAcl Name|
|**vpcId**|String|True||VPC ID|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|


### Result
|Name|Type|Description|
|---|---|---|
|**networkAclId**|String|networkAcl ID|

## Return code
|Return code|Description|
|---|---|
|**200**|Successful operation|
|**400**|Invalid parameter|
|**404**|Not found|
|**500**|Internal error|
|**429**|Quota exceeded|
