# describeActionLog


## Description
View users' operation records under JD Cloud resolution

## Request Method
GET

## Request Address
https://domainservice.jdcloud-api.com/v2/regions/{regionId}/actionLog

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|True| |Paging Parameter, the SN of page, the default value is 1|
|**pageSize**|Integer|True| |Paging parameter, the number of results contained in each page, the default value is 10|
|**startTime**|String|True| |Record start time, format: UTC time, e.g., 2017-11-10T23:00:00Z|
|**endTime**|String|True| |Record end time, format: UTC time, e.g., 2017-11-10T23:00:00Z|
|**keyWord**|String|False| |Keywords that log needs to be matched|
|**success**|Boolean|False| |Whether the results in log are successful or failed|
|**type**|Integer|False| |Type of Log|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|Actionlog[]|Operation Record List|
|**currentCount**|Integer|Number in operation record list of current page|
|**totalCount**|Integer|Number of all Operation Records|
|**totalPage**|Integer|Total Pages based on Paging parameters of Operation Record List|
### Actionlog
|Name|Type|Description|
|---|---|---|
|**id**|Integer|ID of Operation Record|
|**userPin**|String|User Name|
|**domain**|String|Domain Name of Operation|
|**type**|Integer|Operation Types: 1 New 2 Modify 3 Delete|
|**detail**|String|Details of Operation|
|**time**|Long|Time of Operation|
|**success**|Boolean|Result of operation, true for success and false for failure|
|**failReason**|String|Causes of Operation Failed|
|**clientIp**|String|IP of Operator|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
