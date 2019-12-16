# describeMetricsForAlarm


## Description
Search indicator list for creating monitoring rules, metric introduction: <a href="https://docs.jdcloud.com/en/monitoring/metrics">Metrics</a>

## Request Method
GET

## Request Address
https://monitor.jdcloud-api.com/v2/groupAlarms:metrics


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**serviceCode**|String|False| |Product Line|
|**product**|String|False| |Product types include redis2.8cluster (cluster)\redis2.8MS (master-slave) When serviceCode and product are designated at the same time, product shall have higher priority|
|**dimension**|String|False| |The product dimension can only come into force when serviceCode or product is designated.|
|**metricType**|Long|False| |metric type values include 0 and 1; the default value is 0 (conventional indicator, used for creating alarm rules for the Console), 1 (refers to others)|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**metrics**|RuleMetricDetail[]|List of rules|
### RuleMetricDetail
|Name|Type|Description|
|---|---|---|
|**calculateUnit**|String|Computing unit of indicator, such as bit/s, %, k|
|**dimension**|String|Dimension Identifier|
|**metric**|String|Unique monitoring item identifier, monitoring items available for each product line can be searched according to the DescribeMetricsForCreateAlarm APIs (use the Metric field when the rules are created) Format: metric:downsample|
|**metricName**|String|Name of Monitoring Item|
|**product**|String|Product Identifier|
|**serviceCode**|String|Product Line Identifier|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Query indicator list result of available creating monitoring rules|






