# describeInstances


## Description
Search iotcloudgateway instance list

## Request Method
GET

## Request Address
https://iotcloudgateway.jdcloud-api.com/v1/regions/{regionId}/instances

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |regionId|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page|
|**pageSize**|Integer|False| |Paging Size|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**instances**|Instance[]|iotcloudgateway Instance-related Information|
|**totalCount**|Integer|iotcloudgateway Total Number of Instances|
### Instance
|Name|Type|Description|
|---|---|---|
|**instanceId**|String|Instance ID|
|**instanceName**|String|Instance Name|
|**instanceVersion**|String|Instance Version|
|**instanceRegion**|String|Region|
|**instanceStatus**|String|Instance status, running, error, creating, changing|
|**instanceFlavor**|String|Instance hardware configuration specification, such as 2C4G20G|
|**azId**|String|az information|
|**vpcId**|String|VPC ID|
|**subnetId**|String|Subnet ID|
|**exposedDomain**|String|Downlink Control Management Domain and Device Uplink Internet Domain|
|**replica**|Integer|Node Number|
|**cloudstorage**|Integer|Cloud Disk Service Size|
|**serviceConfig**|String|Instance Service Configuration|
|**createTime**|String|Creation Time|
|**gw_dev_id**|String|Gateway Device ID|
|**gw_dev_num**|Integer|Gateway Sub-device Number|
|**chargeType**|Integer|Billing Type|
|**chargeExpired**|String|Billing Expiration Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
