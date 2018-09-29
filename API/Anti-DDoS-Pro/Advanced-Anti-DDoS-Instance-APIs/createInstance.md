# createInstance


## 描述
Create an instance

## 请求方式
POST

## 请求地址
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Belonging Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceSpec**|InstanceSpec|True| |Create instance request parameters|

### InstanceSpec
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**bp**|Integer|False| |Minimum Bandwidth: Unit: Gbps|
|**buyType**|Integer|False| |Purchase Type: 1->newly purchased  3->upgraded|
|**bw**|Integer|False| |Business Bandwidth: Unit: Mbps|
|**carrier**|String|False| |ISP Line: TELECOM->China Telecom's ISP Line  UNICOM->Unicom's ISP Line CMCC->CMCC's ISP Line|
|**ep**|Integer|False| |Elastic Bandwidth: Unit: Gbps|
|**name**|String|False| |Instance Name|
|**returnUrl**|String|False| |The page jumped to after the payment succeeds. The field is transferred in the console interaction mode|
|**timeSpan**|Integer|False| |Purchase Duration|
|**timeUnit**|Integer|False| |Purchase Duration Unit: 3->month  4->year|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**orderId**|String| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
