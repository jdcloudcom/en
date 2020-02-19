# setAutoUpgrade


## Description
Set automatic upgrade

## Request Method
POST

## Request Address
https://kubernetes.jdcloud-api.com/v1/regions/{regionId}/clusters/{clusterId}:setAutoUpgrade

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**clusterId**|String|True| |Cluster ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**autoUpgrade**|Boolean|True| |Enable or disable cluster automatic upgrade, and maintenancePolicy shall be specified when enabling|
|**maintenanceWindow**|[MaintenanceWindowSpec](setautoupgrade#maintenancewindowspec)|False| |Cluster maintenance policy must be configured when cluster automatic upgrade is enabled|

### <div id="maintenancewindowspec">MaintenanceWindowSpec</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**periodType**|String|False| |daily, weekly and monthly, weekly is set by default|
|**startDay**|Integer|False| |Specific starting date of maintenance operation is only valid for periodType with value of weekly or monthly, the numbers from 1 to 7 are available for periodType with value of weekly, and the numbers from 1 to 28 are available for periodType with value of monthly <br>|
|**startTime**|String|True| |The format of the specific starting date of maintenance operation shall comply with RFC3339, and UTC time shall be used with the accuracy to minute, i.e. 23: 27|
|**timeZone**|String|False| |Time zone, IANA data format, i.e. "Asia/Shanghai" or "America/Los_Angeles", shall be used, and "UTC" is set by default|
|**duration**|Integer|False| |Maintenance running period: 4-24 hours, the step length is one hour, 4 hours is set by default|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**429**|Quota exceeded|
|**500**|Internal server error|
|**503**|Service unavailable|
