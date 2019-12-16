# describeMetrics


## Description
Query metric list to get monitoring data list based on product type, metric reference <a href="https://docs.jdcloud.com/en/monitoring/metrics">Metrics</a>

## Request Method
GET

## Request Address
https://monitor.jdcloud-api.com/v2/metrics


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**serviceCode**|String|True| |Type of resource, taking values such as vm, lb, ip, database. <a href="https://docs.jdcloud.com/en/monitoring/api/describeservices?content=API&SOP=JDCloud">describeServices</a>: Search the list of product lines accessed to Monitoring|
|**dimension**|String|False| |Resource dimension. Filter metric according to the dimension. Please search available dimensions under serviceCode with the describeServices APIs|



## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**metrics**|MetricDetail[]| |
### MetricDetail
|Name|Type|Description|
|---|---|---|
|**calculateUnit**|String|Computing unit of metric, such as bit/s, %, and byte|
|**dimension**|String|Dimension Identifier|
|**downSample**|String|Sampling Frequency|
|**metric**|String|Metric|
|**metricName**|String|Name of Monitoring Item|
|**serviceCode**|String|Identifier of Resource Type|

## Return Code
|Return Code|Description|
|---|---|
|**200**|get Metric list of serviceCode |


