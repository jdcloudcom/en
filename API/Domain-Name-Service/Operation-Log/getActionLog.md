# getActionLog


## Description
View users' operation records under JD Cloud resolution

## Request Method
GET

## Request Address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/log/actionLog

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**endTime**|String|True| |Record the end time, format: UTC time, e.g., 2017-11-10T23:00:00Z|
|**keyWord**|String|False| |Keywords that log needs to be matched|
|**pageNumber**|Integer|True| |Paging Parameter, the SN of page, the default value is 1|
|**pageSize**|Integer|True| |Paging parameter, the number of results contained in each page, the default value is 10|
|**startTime**|String|True| |Recorded start time, format: UTC time, e.g., 2017-11-10T23:00:00Z|
|**success**|Boolean|False| |Whether the results in log are successful or failed|
|**type**|Integer|False| |Type of Log|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**currentCount**|Integer|Number in operation record list of current page|
|**dataList**|Actionlog[]|Operation Record List|
|**totalCount**|Integer|Number of all Operation Records|
|**totalPage**|Integer|Total Pages based on Paging parameters of Operation Record List|
### Actionlog
|Name|Type|Description|
|---|---|---|
|**clientIp**|String|IP of Operator|
|**detail**|String|Details of Operation|
|**domain**|String|Domain Name of Operation|
|**failReason**|String|Causes of Operation Failed|
|**id**|Integer|ID of Operation Record|
|**success**|Boolean|Result of Operation, true for success and f for failurealse|
|**time**|Long|Time of Operation|
|**type**|Integer|Operation Types: 1 New 2 Modify 3 Delete|
|**userPin**|String|User Name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
