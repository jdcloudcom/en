# describeRegiones


## Description
Cloud Physical Server Region List Query

## Request method
GET

## Request address
https://cps.jdcloud-api.com/v1/regions


## Request parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**networkType**|String|False| |Network type basic/vpc, basic by default|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeregiones#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**regions**|[Region[]](describeregiones#region)| |
### <div id="region">Region</div>
|Name|Type|Description|
|---|---|---|
|**region**|String|Region Code, such as cn-east-1|
|**regionName**|String|Region Name, such as East China Region 1|
|**azs**|[Az[]](describeregiones#az)|Availability Zone List|
### <div id="az">Az</div>
|Name|Type|Description|
|---|---|---|
|**region**|String|Region Code, such as cn-east-1|
|**az**|String|Availability Zone Code, such as cn-east-1a|
|**azName**|String|Availability Zone Name|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
