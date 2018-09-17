# createInstance


## 描述
Create an instance

## 请求方式
POST

## 请求地址
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Belonging region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceSpec**|[InstanceSpec](##InstanceSpec)|True||Instance type parameter|

### <a name="InstanceSpec">InstanceSpec</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**bp**|Integer|False||Minimum bandwidth: unit: Gbps|
|**buyType**|Integer|False||Purchase type, 1->newly purchased  3->upgraded|
|**bw**|Integer|False||Business bandwidth: unit: Mbps|
|**carrier**|String|False||ISP Line: TELECOM->China Telecom's ISP line  UNICOM->Unicom's ISP line CMCC->CMCC's ISP line|
|**ep**|Integer|False||Elastic bandwidth: unit: Gbps|
|**name**|String|False||Instance Name|
|**returnUrl**|String|False||The page jumped to after the payment succeeds. The field is transferred in the console interaction mode|
|**timeSpan**|Integer|False||Purchase duration|
|**timeUnit**|Integer|False||Purchase duration unit, 3->month  4->year|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**orderId**|String||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
