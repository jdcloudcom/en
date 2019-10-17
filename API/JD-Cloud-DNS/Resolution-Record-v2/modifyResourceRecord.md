# modifyResourceRecord


## Description
Modify a specific resolution record of primary domain

## Request Method
PUT

## Request Address
https://domainservice.jdcloud-api.com/v2/regions/{regionId}/domain/{domainId}/ResourceRecord/{resourceRecordId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of Instances|
|**domainId**|String|True| |Domain ID, please get it by using the describeDomains API.|
|**resourceRecordId**|String|True| |Resolution record ID, please get it by using the describeResourceRecord API.|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**req**|UpdateRR|True| |updateRR Parameter|

### UpdateRR
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainName**|String|True| |Primary Domain|
|**hostRecord**|String|True| |Machine Record|
|**hostValue**|String|True| |Value of Resolution Record|
|**jcloudRes**|Boolean|False| |Whether is JD Cloud resource|
|**mxPriority**|Integer|False| |Priority level is only existed in MX and SRV resolution record types|
|**port**|Integer|False| |Port is only existed in SRV resolution record type|
|**ttl**|Integer|True| |Resolution record TTL, unit: second|
|**type**|String|True| |For resolution type, please refer to<a href="https://docs.jdcloud.com/en/jd-cloud-dns/detailed-interpretation-of-parsed-records">detailed annotation of resolution record type</a>|
|**weight**|Integer|False| |Resolution record weights, weights supported now include: A/AAAA/CNAME/JNAME, A/AAAA weight range is: 0-100, and CNAME/JNAME weight range is: 1-100.|
|**viewValue**|Integer|True| |For ID of Resolution ISP Line, please call describeViewTree API to get the ID of basic resolution ISP Line and call describeUserView API to get ID of customized ISP Line.|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of Request at this time|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
