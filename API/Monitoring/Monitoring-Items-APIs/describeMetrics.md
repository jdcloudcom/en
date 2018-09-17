# describeMetrics


## 描述
Query metric list to get monitoring data list based on product type

## 请求方式
GET

## 请求地址
https://monitor.jdcloud-api.com/v1/metrics

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**serviceCode**|String|True||Product name: <br>vm--> virtual machine<br>disk-->cloud disk<br>ip--> public IP<br>balance-->load balancer<br>database-->MySQL Service revision<br>cdn-->JD CDN<br>redis-->redis cloud cache<br>mongodb-->mongoDB cloud cache<br>storage-->cloud storage<br>sqlserver-->cloud database sqlserver revision <br>nativecontainer-->container<br>|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**metrics**|[MetricDetail[]](##MetricDetail)||
### <a name="MetricDetail">MetricDetail</a>
|名称|类型|描述|
|---|---|---|
|**calculateUnit**|String|Computing unit of metric, such as bit/s, %, byte|
|**downSample**|String|Sampling frequency|
|**metric**|String|Metric|
|**metricName**|String|Metric name|
|**serviceCode**|String|Identifier of resource type|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
