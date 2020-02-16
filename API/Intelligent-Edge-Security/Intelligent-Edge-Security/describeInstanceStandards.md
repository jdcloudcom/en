# describeInstanceStandards


## Description
Search information based on instance

## Request Method
GET

## Request Address
https://edgesecurity.jdcloud-api.com/v1/describeInstanceStandards


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|False| |Start Time|
|**endTime**|String|False| |End Time|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**iesServiceType**|Integer|Intelligent Edge Security Service types (0-> not enabled 1-> enabled but not purchased 2-> purchased on line 3-> purchased off line)|
|**cdnServiceType**|Integer|cdn service type (0-> not enabled 1-> online user 2-> offline user)|
|**billType**|Integer|Billing types (0-> intelligent edge security bill 1-> other bills)|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
