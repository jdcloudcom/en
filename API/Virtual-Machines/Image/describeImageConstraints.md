# describeImageConstraints


## 描述
Query the instance type limit of the image. <br>
This API allows you to view the type of specifications that are not supported by the image. Only the public image, the third-party image has a specification type restriction, and the private image of the individual does not have this limit.


## 请求方式
GET

## 请求地址
https://vm.jdcloud-api.com/1.0.3/regions/{regionId}/images/{imageId}/constraints

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**imageId**|String|True| |Image ID|
|**regionId**|String|True| |Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**imageConstraints**|ImageConstraint|Image Restriction|
### ImageConstraint
|名称|类型|描述|
|---|---|---|
|**imageId**|String|Image ID|
|**imageInstanceTypeConstraint**|ImageInstanceTypeConstraint|Specification limit for instance type created by image|
### ImageInstanceTypeConstraint
|名称|类型|描述|
|---|---|---|
|**constraintsType**|String|Restricted specification type. Value: excludes: exclude specified instance types; includes: only the specified instance type is included, which is not supported temporarily|
|**instanceTypes**|String[]|Instance Type List|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not Found  |
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
