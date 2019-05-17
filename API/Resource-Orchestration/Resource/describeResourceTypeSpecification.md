# describeResourceTypeSpecification


## Description
Search supported resource structure details

## Request Method
GET

## Request Address
https://jdro.jdcloud-api.com/v1/regions/{regionId}/resourcetypes/{resourceType}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**resourceType**|String|True| |Resource Type|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested identifier id|

### Result
|Name|Type|Description|
|---|---|---|
|**propertyTypes**|Object| |
|**resourceTypes**|ResourceTypes| |
### ResourceTypes
|Name|Type|Description|
|---|---|---|
|**attributes**|Object|Resource Output Parameter Definition|
|**description**|String|Resource Description|
|**documentation**|String|Document Link|
|**properties**|Object|Resource Attribute Definition|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Search supported resource list results|
