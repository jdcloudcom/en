# renewBillingOrder


## 描述
Renew the specified cluster in the specified renewal method

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/BillingOrder:renew

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**clusterId**|String|True||Renew the cluster clusterId|
|**type**|Integer|True||"Required parameters, billing type"<br>      "* 1: Pay By Configuration"<br>      "* 601-609: Monthly package for 1 month to 9 months"<br>      "* 610: Monthly package for 1 year"<br>      "* 620: Monthly package for 2 years"<br>|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**message**|String||
|**status**|String||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
