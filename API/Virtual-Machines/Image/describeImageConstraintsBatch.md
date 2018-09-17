# describeImageConstraintsBatch


## 描述
Batch query image specification type constraints. <br>
This interface allows you to view the type of specifications that are not supported by the image. Only the public image,  the third-party image has a specification type restriction,  and the private image of the individual does not have this limit.


## 请求方式
GET

## 请求地址
https://vm.jdcloud-api.com/v1/regions/{regionId}/imageConstraints

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**ids**|String[]|False||Image ID list|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**imageConstraints**|[ImageConstraint[]](##ImageConstraint)|image restriction|
### <a name="ImageConstraint">ImageConstraint</a>
|名称|类型|描述|
|---|---|---|
|**imageId**|String|Image ID|
|**imageInstanceTypeConstraint**|[ImageInstanceTypeConstraint](##ImageInstanceTypeConstraint)|Specification limit for instance type created by image|
### <a name="ImageInstanceTypeConstraint">ImageInstanceTypeConstraint</a>
|名称|类型|描述|
|---|---|---|
|**constraintsType**|String|Restricted specification type. excludes: exclude specified instance types; includes: only the specified instance type is included,  which is not supported temporarily|
|**instanceTypes**|String[]|Instance type list|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
