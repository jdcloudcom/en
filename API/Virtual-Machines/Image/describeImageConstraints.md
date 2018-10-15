# describeImageConstraints


## Description
Query the instance type limit of the image. <br>
This API allows you to view the type of specifications that are not supported by the image. Only the public image, the third-party image has a specification type restriction, and the private image of the individual does not have this limit.


## Request method
GET

## Request address
https://vm.jdcloud-api.com/1.0.3/regions/{regionId}/images/{imageId}/constraints

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**imageId**|String|True| |Image ID|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**imageConstraints**|ImageConstraint|Image Restriction|
### ImageConstraint
|Name|Type|Description|
|---|---|---|
|**imageId**|String|Image ID|
|**imageInstanceTypeConstraint**|ImageInstanceTypeConstraint|Specification limit for instance type created by image|
### ImageInstanceTypeConstraint
|Name|Type|Description|
|---|---|---|
|**constraintsType**|String|Restricted specification type. Value: excludes: exclude specified instance types; includes: only the specified instance type is included, which is not supported temporarily|
|**instanceTypes**|String[]|Instance Type List|

## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not Found  |
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
