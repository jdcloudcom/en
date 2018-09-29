# addDomain


## 描述
Add Main Domain Name

## 请求方式
POST

## 请求地址
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domainAdd

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID to which the instance belongs|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**billingType**|Integer|False| |Billing Type, domain name of the paid package is required|
|**buyType**|Integer|False| |1->New Purchase, 2->Upgrade, domain name of the paid package is required|
|**domainId**|Integer|False| |Domain Name ID, required for upgraded and advanced version       |
|**domainName**|String|True| |Domain Name to be Added|
|**packId**|Integer|True| |Type of the Domain Name Package,  0->Free, 1->Enterprise Edition, 2->Advanced Edition|
|**timeSpan**|Integer|False| |1, 2, 3, Duration, domain name of the paid package is required|
|**timeUnit**|Integer|False| |Time Unit, domain name of the paid package is required|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ID of This Request|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|Domain|Newly Added Domain Name Structure|
|**order**|String|Add the order number of the paid domain name|
### Domain
|名称|类型|描述|
|---|---|---|
|**createTime**|Integer|Creation Time, Format Unix Timestamp |
|**domainName**|String|Domain Name String|
|**expirationDate**|Integer|Expiration Time, Format Unix Timestamp|
|**id**|Integer|Unique ID of the Domain Name|
|**packId**|Integer|Package Type, 0->Free 1->Enterprise Edition 2->Advanced Edition|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
