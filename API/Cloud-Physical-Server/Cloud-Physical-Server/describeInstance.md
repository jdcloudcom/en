# describeInstance


## Description
Query the details of a single Cloud Physical Server

## Request method
GET

## Request address
https://cps.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Cloud Physical Server ID|
|**regionId**|String|True| |Region ID, the Region and Availability Zone Supported by the Cloud Physical Servers can be Called by Calling APIs (describeRegions)|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**instance**|Instance| |
### Instance
|Name|Type|Description|
|---|---|---|
|**az**|String|Availability Zone, such as cn-east-1a|
|**bandwidth**|Integer|Bandwidth, Unit: Mbps|
|**charge**|Charge|Billing Information|
|**dataRaidType**|String|Data Disk RAID Type ID, such as NORAID, RAID0, and RAID1|
|**dataRaidTypeId**|String|Data Disk RAID Type ID|
|**description**|String|Description of Cloud Physical Server|
|**deviceType**|String|Instance Type Family, such as cps.c.normal|
|**enableInternet**|String|Whether to Enable Internet, such as yes/no|
|**imageType**|String|Image Type, such as Standard/Standard_app|
|**instanceId**|String|Cloud Physical Server Instance ID|
|**lineType**|String|Internet Link Type, such as bgp|
|**name**|String|Name of Cloud Physical Server|
|**networkType**|String|Network Type, such as Basic|
|**osName**|String|Operating System Name|
|**osType**|String|Operating System Type Id, such as Ubuntu/Centos|
|**osTypeId**|String|Operating System Type ID|
|**osVersion**|String|Operating System Version, such as 16.04|
|**privateIp**|String|Private IP|
|**publicIp**|String|Public IP|
|**region**|String|Region Code, such as cn-east-1|
|**status**|String|Life Cycle Status of Cloud Physical Server|
|**subnetId**|String|Subnet Number|
|**sysRaidType**|String|System Disk RAID Type ID, such as NORAID, RAID0, and RAID1|
|**sysRaidTypeId**|String|System Disk RAID Type ID|
### Charge
|Name|Type|Description|
|---|---|---|
|**chargeExpiredTime**|String|Expiration Time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeMode**|String|Payment Model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeRetireTime**|String|The Expected Release Time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStatus**|String|Cost Payment Status, the value is respectively normal, overdue and arrear.|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
