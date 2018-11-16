# describeImageConstraintsBatch


## Description
Batch query image instance type constraints. <br>
This API allows you to view the instance types that are not supported by the image. Only the public image and the third-party image have restrictions for instance type, and the private image of the individual does not have this limit.


## Request method
GET

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/imageConstraints

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ids**|String[]|False| |Image ID List|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**imageConstraints**|ImageConstraint[]|Image Restriction|
### ImageConstraint
|Name|Type|Description|
|---|---|---|
|**imageId**|String|Image ID|
|**imageInstanceTypeConstraint**|ImageInstanceTypeConstraint|Specification limit for instance type created by image|
### ImageInstanceTypeConstraint
|Name|Type|Description|
|---|---|---|
|**constraintsType**|String|Restricted type family. Value: excludes: the instance type family that is not supported; includes: the instance type family that is supported. |
|**instanceTypes**|String[]|Instance Type List|

## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
