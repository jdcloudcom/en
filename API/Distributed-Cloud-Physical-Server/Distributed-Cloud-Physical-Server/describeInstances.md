# describeInstances


## Description
Search details of Distributed Cloud Physical Server in batches<br/>
Support paging search, with 20 entries per page by default<br/>


## Request Method
GET

## Request Address
https://edcps.jdcloud-api.com/v1/regions/{regionId}/instances

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, calling APIs (describeEdCPSRegions) to get regions supported by Distributed Cloud Physical Server|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; xxx by default1|
|**pageSize**|Integer|False|20|Page size; it is 20 by default; value range[20, 100]|
|**az**|String|False| |Availability Zone, accurate match|
|**name**|String|False| |Name of Distributed Cloud Physical Server, supporting fuzzing matching|
|**networkType**|String|False| |Network type, exact matching, supporting vpc|
|**deviceType**|String|False| |Instance type family, exact matching, getting instance type family by calling API (describeDeviceTypes)|
|**subnetId**|String|False| |Subnet ID|
|**enableInternet**|String|False| |Whether to enable Internet, yes/no|
|**keypairId**|String|False| |Key Pair id|
|**filters**|[Filter[]](#filter)|False| |instanceId - Distributed Cloud Physical Server ID, exact matching, supporting multiple IDs<br/><br>privateIp - Distributed Cloud Physical Server Private IP, exact match, supporting multiple IPs<br/><br>status - Distributed Cloud Physical Server Status, referring to Distributed Cloud Physical Server Status, exact match, supporting multiple statuses<br>|

### <div id="Filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**instances**|[Instance[]](#instance)| |
|**pageNumber**|Integer|Page Number; 1 by Default|
|**pageSize**|Integer|Page size; it is 20 by default; value range[20, 100]|
|**totalCount**|Integer|Search result amount|
### <div id="Instance">Instance</div>
|Name|Type|Description|
|---|---|---|
|**instanceId**|String|Cloud Physical Server Instance ID|
|**region**|String|Region code, e.g. cn-east-tz1|
|**az**|String|Availability Zone, e.g. cn-east-tz1a|
|**deviceType**|String|Instance type family, e.g. edcps.c.normal1|
|**name**|String|Name of Cloud Physical Server|
|**description**|String|Description of Cloud Physical Server|
|**status**|String|Life Cycle Status of Cloud Physical Server|
|**enableInternet**|String|Enable Internet or not, e.g., yes/no|
|**enableIpv6**|String|Whether to enable IPv6, e.g., yes/no|
|**bandwidth**|Integer|Bandwidth, Unit Mbps|
|**extraUplinkBandwidth**|Integer|Additional Uplink Bandwidth, unit: Mbps|
|**imageType**|String|Image type, e.g. standard|
|**osTypeId**|String|Operating System Type ID|
|**osName**|String|Operating System Name|
|**osType**|String|Operating system type, e.g. ubuntu/centos|
|**osVersion**|String|Operating system version, e.g. 16.04|
|**sysRaidTypeId**|String|System Disk RAID Type ID|
|**sysRaidType**|String|System disk RAID type, such as NORAID, RAID0, RAID1|
|**dataRaidTypeId**|String|Data Disk RAID Type ID|
|**dataRaidType**|String|Data disk RAID type, such as NORAID, RAID0, RAID1|
|**networkType**|String|Network type, e.g. basic, vpc|
|**vpcId**|String|VPC ID|
|**vpcName**|String|Name of VPC|
|**subnetId**|String|Subnet Number|
|**subnetName**|String|Subnet Name|
|**privateIp**|String|Private IP|
|**lineType**|String|Internet Link Type, such as bgp|
|**elasticIpId**|String|Elastic IPID|
|**publicIp**|String|Public IP|
|**publicIpv6**|String|Public IPv6|
|**keypairId**|String|Key Pair id|
|**agentStatus**|String|agent status|
|**charge**|[Charge](#charge)|Billing Information|
### <div id="Charge">Charge</div>
|Name|Type|Description|
|---|---|---|
|**chargeMode**|String|Payment model, the value shall be: prepaid_by_duration, postpaid_by_usage or postpaid_by_duration. prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and the default is taken as postpaid_by_duration|
|**chargeStatus**|String|Cost payment status, the value is respectively normal, overdue and arrear.|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time with the format of YYYY-MM-DDTHH:mm:ssZ adopted|
|**chargeExpiredTime**|String|Expiration time, i.e. the expiration time of Pay-In-Advance resource shall be up to ISO8601, with the UTC time with the format of YYYY-MM-DDTHH:mm:ssZ adopted. Pay-As-You-Go resource field is blank|
|**chargeRetireTime**|String|The expected release time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, using the UTC time and following the format of YYYY-MM-DDTHH:mm:ssZ|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
