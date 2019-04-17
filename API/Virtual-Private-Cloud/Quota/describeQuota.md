# describeQuota


## Description
Query quota information

## Request method
GET

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/quotas/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**type**|String|True| |Resource Type. Value Range: VPC, elastic_ip, subnet, security_group, VPCpeering, network_interface (quota only sums up secondary network interface)|
|**parentResourceId**|String|False| |If the type is VPC, elastic_ip, network_interface, do not set; if the type is subnet, security_group, VPCpeering, set as VPCId|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Returned Results|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**quota**|Object| |

## Response code
|Return code|Description|
|---|---|
|**200**|Successful operation|
|**400**|invalid parameter|
|**500**|Internal server error|
