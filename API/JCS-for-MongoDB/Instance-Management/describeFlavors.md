# describeFlavors


## 描述
Get Type

## 请求方式
GET

## 请求地址
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/flavors

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**flavors**|[Flavor[]](##Flavor)||
### <a name="Flavor">Flavor</a>
|名称|类型|描述|
|---|---|---|
|**cpu**|Integer|Number of CPU Cores|
|**diskStep**|Integer|Disk Step Size|
|**iops**|Integer|iops|
|**maxDisk**|Integer|Maximum Number of Disks, in GB|
|**maxLink**|Integer|Maximum Connections|
|**memory**|Integer|Memory, in GB|
|**minDisk**|Integer|Minimum Number of Disks, in GB|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
