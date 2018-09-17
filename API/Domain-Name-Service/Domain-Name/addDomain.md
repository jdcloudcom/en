# addDomain


## 描述
Add Main Domain Name

## 请求方式
POST

## 请求地址
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domainAdd

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID to which the instance belongs|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**billingType**|Integer|False||Billing type, domain name of the paid package is required|
|**buyType**|Integer|False||1->new purchase, 2->upgrade, domain name of the paid package is required|
|**domainId**|Integer|False||Domain name ID, required for upgraded and advanced version|
|**domainName**|String|True||Domain name to be added|
|**packId**|Integer|True||Type of the domain name package,  0->free, 1->Enterprise Edition, 2->Advanced Edition|
|**timeSpan**|Integer|False||1,2,3 , duration, domain name of the paid package is required|
|**timeUnit**|Integer|False||Time unit, domain name of the paid package is required|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ID of this request|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**data**|[Domain](##Domain)|Newly added domain name structure|
|**order**|String|Add the order number of the paid domain name|
### <a name="Domain">Domain</a>
|名称|类型|描述|
|---|---|---|
|**createTime**|Integer|Creation time, format Unix timestamp|
|**domainName**|String|Domain Name String|
|**expirationDate**|Integer|Expiration time, format Unix timestamp|
|**id**|Integer|Unique ID of the domain name|
|**packId**|Integer|Package type, 0->free 1->Enterprise Edition 2->Advanced Edition|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
