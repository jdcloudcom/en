# describeCertInfo


## 描述
Query the Certificate Preview Information

## 请求方式
POST

## 请求地址
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRule:describeCertInfo

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Belonging Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**certInfoDescribeSpec**|CertInfoDescribeSpec|True| |Query the Request Parameter of Certificate Preview|

### CertInfoDescribeSpec
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domain**|String|False| |Domain Name|
|**httpsCertContent**|String|False| |Certificate Content|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|CertInfo| |
### CertInfo
|名称|类型|描述|
|---|---|---|
|**domain**|String|General Name|
|**from**|String|Certificate Effective Time|
|**issuer**|String|Issued By|
|**sigAlgName**|String|Encryption Algorithm|
|**to**|String|Certificate Expiration Time|
|**user**|String|Certificate Organization|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
