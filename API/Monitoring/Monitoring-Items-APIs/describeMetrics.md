# describeMetrics


## 描述
Query metric list to get monitoring data list based on product type

## 请求方式
GET

## 请求地址
https://monitor.jdcloud-api.com/v1/metrics

无

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**serviceCode**|String|True| |Product Name: <br>vm--> Virtual Machine<br>disk-->Cloud Disk Service<br>ip--> Public IP<br>balance-->Load Balancer<br>database-->MySQL Service Version<br>cdn-->JD CDN<br>redis-->JCS for Redis<br>mongodb-->MongoDB Cloud Cache<br>storage-->Cloud Storage<br>sqlserver-->cloud Database Sqlserver Version <br>nativecontainer-->Container<br>|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**metrics**|MetricDetail[]| |
### MetricDetail
|名称|类型|描述|
|---|---|---|
|**calculateUnit**|String|Computing unit of metric, such as bit/s, %, and byte|
|**downSample**|String|Sampling Frequency|
|**metric**|String|Metric|
|**metricName**|String|Metric Name|
|**serviceCode**|String|Identifier of Resource Type|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
