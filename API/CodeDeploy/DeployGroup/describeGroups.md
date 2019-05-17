# describeGroups


## Description
Search the information of deployment groups in batches. This interface supports query in pages, with 20 entries per page by default.

## Request Method
GET

## Request Address
https://deploy.jdcloud-api.com/v1/regions/{regionId}/groups

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; xxx by default1|
|**pageSize**|Integer|False|20|Page size; it is 20 by default; value range[10, 100]|
|**filters**|Filter[]|False| |appId - Application ID, Exact Matching<br>groupId - Deployment Group ID, Exact Matching<br>groupName - Name of Deployment Group, Exact Matching<br>|
|**sorts**|Sort[]|False| |createTime - Creation Time, asc (Ascending), desc (Descending)<br>|

### Sort
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Name of Sorting Conditions|
|**direction**|String|False| |Direction of Sorting Conditions|
### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**groups**|Group[]| |
|**totalCount**|Number| |
### Group
|Name|Type|Description|
|---|---|---|
|**groupId**|String|Deployment Group ID|
|**groupName**|String|Name of Deployment Group|
|**appId**|String|Application ID|
|**appName**|String|Application Name|
|**regionId**|String|Region|
|**status**|Integer|Status|
|**platform**|Integer|Deployment Platform: 1Virtual Machines,2Native Containers|
|**desc**|String|Description|
|**deployMethod**|Integer|Deployment Method: 1Rolling Deployment,2Blue and Green Deployment|
|**instances**|String[]|Deployment Instance (Rolling)|
|**blueInstances**|String[]|Deployment Instance (Blue)|
|**greenInstances**|String[]|Deployment Instance (Green)|
|**threshold**|Integer|Deployment Threshold|
|**concurrencyUnit**|Integer|Development Unit|
|**concurrencyNum**|Integer|Number of Concurrent Machines|
|**concurrencyPct**|Integer|Concurrency Level|
|**lbStatus**|Integer|Load Balancer: 1Enabled,2Disabled|
|**lbInstance**|String|lb Instance|
|**lbBackend**|String|lb lb_backend|
|**repeatPolicy**|Integer|Processing Method for Files of the Same Name: 1Deployment Failed,2Replaced,3Reserved|
|**noticeTrigger**|Integer|Notification Frequency: 1Exception Sent,2Sent Every Time|
|**noticeMethod**|Integer[]|Notification Method: 1Message,2Email,3SMS.|
|**rollback**|Integer|Automatic Rollback: 1Enabled,2Disabled|
|**jdsfEnabled**|Integer|Use JD Distributed Service Framework: 0not used,1used|
|**jdsfRegisterId**|String|JD Distributed Service Framework ID|
|**lastDeployTime**|Integer|Last Deployment Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
