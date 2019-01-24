# batchSetDnsResolve


## Description
Add and update imported resolution records in batch under the same primary domain<br>
For ID of the resolution record, value 0 presents added one while other values other than 0 present updated ones.


## Request Method
POST

## Request Address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/BatchSetDnsResolve

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of Instances|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**req**|BatchSetDNS[]|True| |Resolution record list to be set|

### BatchSetDNS
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainId**|Integer|True| |Domain IDs corresponding to resolution records DomainIds in one request shall be the same.|
|**hostRecord**|String|True| |Machine Record|
|**hostValue**|String|True| |Value of Resolution Record|
|**id**|Integer|True| |For ID of resolution record, enter 0 for added one and use searchRR interface to query resolution record ID for updated one.|
|**jcloudRes**|Boolean|False| |Whether is JD Cloud resource|
|**mxPriority**|Integer|False| |Priority level is only existed in MX and SRV resolution record types|
|**port**|Integer|False| |Port is only existed in SRV resolution record type|
|**ttl**|Integer|True| |TTL of Resolution Record|
|**type**|String|True| |Type of Resolution|
|**viewValue**|Integer|True| |ID of Resolution ISP Line|
|**weight**|Integer|False| |Weight of Resolution Record|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of Request at This Time|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**data**|String[]|Result of Resolution List Corresponding to Each Setting|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
