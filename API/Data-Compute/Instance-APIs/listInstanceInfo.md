# listInstanceInfo


## 描述
Search the instance information of the user

## 请求方式
GET

## 请求地址
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwInstance

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**data**|[DwInstance[]](##DwInstance)||
|**message**|String||
|**status**|Boolean||
### <a name="DwInstance">DwInstance</a>
|名称|类型|描述|
|---|---|---|
|**area**|String|Instance zone|
|**comments**|String|Instance description|
|**createTime**|String|Instance creation time|
|**instanceName**|String|Instance name|
|**instanceOwnerName**|String|Instance owner|
|**uname**|String|Instance alias (shown on the page)|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
