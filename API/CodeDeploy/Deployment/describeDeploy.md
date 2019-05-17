# describeDeploy


## Description
Search the details of a deployment task

## Request Method
GET

## Request Address
https://deploy.jdcloud-api.com/v1/regions/{regionId}/deploy/{deployId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**deployId**|String|True| |Deploy Id|

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
|**deploy**|Deploy| |
### Deploy
|Name|Type|Description|
|---|---|---|
|**deployId**|String|Online Order ID|
|**appId**|String|Application ID|
|**appName**|String|Application Name|
|**groupId**|String|Name of Deployment Group|
|**groupName**|String|Deployment Group ID|
|**regionId**|String|Region|
|**startTime**|Integer|Deployment Start Time|
|**endTime**|Integer|Deployment End Time|
|**deployStatus**|Integer|Deployment Status 0To be Deployed, 1In Deployment, 2Succeeded, 3Failed, 4In Rollback, 5Rollback Succeeded, 6Rollback Failed, 7Canceled|
|**desc**|String|Description|
|**deployMethod**|Integer|Deployment Method: 1Rolling Deployment,2Blue and Green Deployment|
|**deploySource**|Integer|Deployment Source: 1url,2CodeBuild,3Cloud Storage|
|**deployCmd**|String|Deployment Operation|
|**cmdSource**|Integer|1Use the operation entered, 2Use the operation contained in the program|
|**cmdType**|Integer|Display Format of Deployment Operation: 1form,2ymal|
|**productType**|Integer|Project Type 1tomcat,2|
|**downloadUrl**|String|Download url|
|**md5**|String|md5|
|**compileProject**|String|Item Name of CodeBuild|
|**compileSeries**|String|CodeBuild Building SN|
|**ossSpace**|String|Cloud Storage Space|
|**ossDir**|String|Cloud Storage Directory|
|**fileType**|Integer|File Type: 1.tar, 2.zio, 3.tar.gz|
|**rollbackAble**|Integer|Rollback Possible or not 1Yes,2No|
|**threshold**|Integer|Deployment Threshold|
|**concurrencyUnit**|Integer|Development Unit|
|**concurrencyNum**|Integer|Number of Concurrent Machines|
|**concurrencyPct**|Integer|Concurrency Level|
|**lbStatus**|Integer|Load Balancer: 1Enabled,2Disabled|
|**lbInstance**|String|lb Instance|
|**lbBackend**|String|Ib Backend Instance|
|**repeatPolicy**|Integer|Processing Method for Files of the Same Name: 1Deployment Failed,2Replaced,3Reserved|
|**noticeTrigger**|Integer|Notification Frequency: 1Exception Sent,2Sent Every Time|
|**noticeMethod**|String[]|Notification Method: 1Message,2Email,3SMS|
|**jdsfEnabled**|Integer|Use JD Distributed Service Framework: 0not used,1used|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
