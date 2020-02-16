# createInstance


## Description
Create instance

## Request Method
POST

## Request Address
https://edgesecurity.jdcloud-api.com/v1/createInstance


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**businessBandwidth**|Integer|True| |Business acceleration bandwidth (normal business consumption bandwidth, Mbps)|
|**basicBandwidth**|Integer|True| |Basic Bandwidth (Gbps)|
|**elasticBandwidth**|Integer|True| |Elastic Bandwidth (Gbps)|
|**businessQps**|Integer|True| |Normal Business qps|
|**timeSpan**|Integer|True| |Purchase Duration|
|**timeUnit**|Integer|True| |Purchase duration (3->month 4->year)|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**buyId**|String|Purchase ID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
