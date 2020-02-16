# modifyInstance


## Description
Modify instance information

## Request Method
POST

## Request Address
https://edgesecurity.jdcloud-api.com/v1/modifyInstance


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**businessBandwidth**|Integer|True| |Business acceleration bandwidth (normal business consumption bandwidth, Mbps)|
|**basicBandwidth**|Integer|True| |Basic Bandwidth (Gbps)|
|**elasticBandwidth**|Integer|True| |Elastic Bandwidth (Gbps)|
|**businessQps**|Integer|True| |Normal Business qps|


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
