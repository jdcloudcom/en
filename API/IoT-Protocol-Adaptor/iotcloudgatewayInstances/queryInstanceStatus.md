# queryInstanceStatus


## Description
Search current status of instance

## Request Method
POST

## Request Address
https://iotcloudgateway.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:queryInstanceStatus

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |regionId|
|**instanceId**|String|True| |Instance ID|

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
|**status**|String|iotcloudgateway Instance Status|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
