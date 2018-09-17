# attachNetworkInterface


## 描述
A virtual machine attaches an elastic network interface <br>
The virtual machine status must be running or stopped status without being operated,  the task is available. <br>
If the public IP is associated with the elastic network interface,  the az of the public IP needs to be consistent with the az of the virtual machine,  or the public network IP belongs to the full available zone to be attached. <br>
The number of the virtual machine to attach the elastic network interface cannot exceed the limit of the instance type. Can query <a href = "https://www.jdcloud.com/help/detail/2901/isCatalog/1"> DescribeInstanceTypes</a> interface gives specification information for the specified zone or availability zone. <br>
The elastic network interface and the virtual machine must be under the same vpc.


## 请求方式
POST

## 请求地址
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:attachNetworkInterface

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||VM ID|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**autoDelete**|Boolean|False|False|Auto-delete with the machine, False by default.|
|**networkInterfaceId**|String|True||ENI ID|


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
