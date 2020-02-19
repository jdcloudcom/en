# describeInstances


## Description
Batch query the details of Cloud Physical Server<br/>
Support paging search, with 20 entries per page by default<br/>


## Request method
GET

## Request address
https://cps.jdcloud-api.com/v1/regions/{regionId}/instances

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, the Region and Availability Zone Supported by the Cloud Physical Servers can be Obtained by Calling API (describeRegions)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page; 1 by default|
|**pageSize**|Integer|False|20|Segmentation size; it is 20 by default; value range[20, 100]|
|**az**|String|False| |Availability Zone, Exact Matching|
|**name**|String|False| |Name of the Cloud Physical Server, support fuzzy matching|
|**networkType**|String|False| |Network type, exact match, supporting basic, vpc|
|**deviceType**|String|False| |Instance Type, exact matching, the instance type family can be obtained by calling API (describeDeviceType)|
|**subnetId**|String|False| |Subnet ID|
|**keypairId**|String|False| |Key Pair ID|
|**enableInternet**|String|False| |Whether to enable Internet, yes/no|
|**privateIp**|String|False| |Private IP|
|**filters**|[Filter[]](describeinstances#filter)|False| |instanceId - Cloud Physical Server ID, exact matching, supporting multiple IDs<br/><br>status - Cloud Physical Server status, referring to the status of Distributed Cloud Physical Server, exact matching, supporting multiple statuses<br>|

### <div id="filter">Filter</div>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeinstances#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**instances**|[Instance[]](describeinstances#instance)| |
|**pageNumber**|Integer|Page; 1 by default|
|**pageSize**|Integer|Segmentation size; it is 20 by default; value range[20, 100]|
|**totalCount**|Integer|Query Result of Total Amount|
### <div id="instance">Instance</div>
|Name|Type|Description|
|---|---|---|
|**instanceId**|String|Cloud Physical Server Instance ID|
|**region**|String|Region Code, such as cn-east-1|
|**az**|String|Availability Zone, such as cn-east-1a|
|**deviceType**|String|Instance Type Family, such as cps.c.normal|
|**name**|String|Name of Cloud Physical Server|
|**description**|String|Description of Cloud Physical Server|
|**status**|String|Life Cycle Status of Cloud Physical Server|
|**enableInternet**|String|Whether to Enable Internet, such as yes/no|
|**enableIpv6**|String|Whether to enable IPv6, e.g., yes/no|
|**bandwidth**|Integer|Bandwidth, Unit: Mbps|
|**imageType**|String|Image type, e.g. standard|
|**osTypeId**|String|Operating System Type ID|
|**osName**|String|Operating System Name|
|**osType**|String|Operating System Type Id, such as Ubuntu/Centos|
|**osVersion**|String|Operating System Version, such as 16.04|
|**sysRaidTypeId**|String|System Disk RAID Type ID|
|**sysRaidType**|String|System Disk RAID Type ID, such as NORAID, RAID0, and RAID1|
|**dataRaidTypeId**|String|Data Disk RAID Type ID|
|**dataRaidType**|String|Data Disk RAID Type ID, such as NORAID, RAID0, and RAID1|
|**networkType**|String|Network type, e.g. basic, vpc|
|**vpcId**|String|VPC ID|
|**vpcName**|String|Name of VPC|
|**subnetId**|String|Subnet Number|
|**subnetName**|String|Subnet Name|
|**privateIp**|String|Private IP|
|**lineType**|String|Internet Link Type, such as bgp|
|**elasticIpId**|String|Elastic IPID|
|**publicIp**|String|Public IP|
|**publicIpv6**|String|Internet IPv6|
|**keypairId**|String|Key Pair id|
|**agentStatus**|String|agent status|
|**charge**|[Charge](describeinstances#charge)|Billing Information|
### <div id="charge">Charge</div>
|Name|Type|Description|
|---|---|---|
|**chargeMode**|String|Payment Model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeStatus**|String|Cost Payment Status, the value is respectively normal, overdue and arrear.|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeExpiredTime**|String|Expiration Time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeRetireTime**|String|The Expected Release Time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
