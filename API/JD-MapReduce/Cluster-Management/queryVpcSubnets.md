# queryVpcSubnets


## 描述
Query Vpc subnet collection

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/vpcSubnets/{vpcId}:query

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**vpcId**|String|True| | |

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
|**data**|QueryVpcSubnets[]|VPC Subnet Information Collection|
|**message**|String| |
|**status**|String| |
### QueryVpcSubnets
|名称|类型|描述|
|---|---|---|
|**vpcSubnetId**|String|VPC Subnet ID|
|**vpcSubnetName**|String|VPC Subnet Name|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
