# describeCCAttackLogDetails


## Description
Search the cc attack log details
- Parameter attackId priority greater than that of instanceId, when attackId is not null, ignore instanceId


## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/attacklog:describeCCAttackLogDetails

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page Number: 1 by default|
|**pageSize**|Integer|False| |Paging Size: 10 by default; value range [10, 100]|
|**startTime**|String|True| |Start time, only data within the latest 90 days can be queried, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**endTime**|String|True| |Query end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|String|False| |Anti-DDoS Pro instance ID|
|**subDomain**|String[]|False| |Subdomain searched, multiple subdomains can be selected only when an instance is selected|
|**attackId**|String|False| |CC Attack Record Id|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**err**|Err| |
### Err
|Name|Type|Description|
|---|---|---|
|**code**|Long|Same as http code|
|**details**|Object| |
|**message**|String| |
|**status**|String|Specific Error|
### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|CCAttackLogDetail[]| |
|**currentCount**|Integer|Current Page Counts|
|**totalCount**|Integer|Total Number of Instances|
|**totalPage**|Integer|Total Number of Pages|
### CCAttackLogDetail
|Name|Type|Description|
|---|---|---|
|**key**|String|Feature Key|
|**num**|Integer|Attack Counts|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
