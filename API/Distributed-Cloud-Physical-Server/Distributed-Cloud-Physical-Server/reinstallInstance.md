# reinstallInstance


## Description
To reinstall the Distributed Cloud Physical Server, only the stopped servers can be reinstalled<br/>
- The API (describeOS) may be called to obtain the operating system list supported by Distributed Cloud Physical Server
<br>For sensitive operation, <a href="https://docs.jdcloud.com/en/security-operation-protection/operation-protection">MFA operation protection can be enabled</a>

## Request Method
PUT

## Request Address
https://edcps.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:reinstallInstance

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, calling APIs (describeEdCPSRegions) to get regions supported by Distributed Cloud Physical Server|
|**instanceId**|String|True| |Distributed Cloud Physical Server ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**clientToken**|String|False| |Generated by the client to guarantee idempotence of request, and the length cannot exceed 36 characters;<br/><br>if multiple requests use the same clientToken, only the first request will be executed and the following requests will directly return the result of the first request<br/><br>|
|**instanceSpec**|[ReinstallInstanceSpec](reinstallinstance#reinstallinstancespec)|True| |Configuration of Distributed Cloud Physical Server|

### <div id="reinstallinstancespec">ReinstallInstanceSpec</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**az**|String|True| |Availability zone, e.g. cn-east-tz1a|
|**imageType**|String|True| |Image type, value range: standard|
|**osTypeId**|String|True| |Operating System Type ID|
|**sysRaidTypeId**|String|True| |System Disk RAID Type ID|
|**keepData**|String|True| |Whether to reserve data on the data disk, values: yes, no|
|**dataRaidTypeId**|String|True| |Data Disk RAID Type ID|
|**password**|String|True| |Password|
|**hostname**|String|False| |Machine Name|
|**userData**|String|False| |Coded contents of executable script Base64, supporting scripts shell and python|
|**keypairId**|String|False| |Key Pair id|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](reinstallinstance#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**success**|Boolean|Whether the reinstallation operation succeeded|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
