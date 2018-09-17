# rebuildInstance


## 描述
Virtual machine uses the specified image to reset the virtual machine image<br>
The status of the virtual machine must be stopped status. <br>
If the system disk type of the current virtual machine is a WORM type,  the replacement image must be an image of the current Disk type;Similarly,  if the system disk of the current virtual machine is cloud type,  the replacement image must be an image of the clyDisk type. Can query <a href = "https://www.jdcloud.com/help/detail/2874/isCatalog/1"> DescribeImages</a> interface gets the image information for the specified zone. <br>
If you do not specify the image ID,  the current machine's original image rebuild system is used by default. <br>
The specified image must be able to support the instanceType of the current machine, otherwise an error will occur. Query <a href="https://www.jdcloud.com/help/detail/2872/isCatalog/1">DescribeImageConstraints</a> API for instance type limit information about the specified image.


## 请求方式
POST

## 请求地址
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:rebuildInstance

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||VM ID|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**imageId**|String|False||Image ID. Can query <a href = "https://www.jdcloud.com/help/detail/2874/isCatalog/1"> DescribeImages</a> API for the image information of the specified zone.|
|**keyNames**|String[]|False||The key pair name; only one is currently supported.|
|**password**|String|True||VM password, <a href="https://www.jdcloud.com/help/detail/3870/isCatalog/1">Refer to the public parameter specification</a>.|


## 返回参数
|名称|类型|描述|
|---|---|---|



## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
