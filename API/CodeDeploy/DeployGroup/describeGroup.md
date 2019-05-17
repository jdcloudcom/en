# describeGroup


## Description
Search the information of a deployment group

## Request Method
GET

## Request Address
https://deploy.jdcloud-api.com/v1/regions/{regionId}/group/{groupId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**groupId**|String|True| |Group Id|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**group**|Group| |
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
