# describeOS


## Description
Search operating system supported by Distributed Cloud Physical Server

## Request Method
GET

## Request Address
https://edcps.jdcloud-api.com/v1/regions/{regionId}/os

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, calling APIs (describeEdCPSRegions) to get regions supported by Distributed Cloud Physical Server|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**deviceType**|String|True| |Instance type family, getting instance type family (e.g. edcps.c.normal1) of designated region by calling API (describeDeviceTypes)|
|**osType**|String|False| |OS type, value range: CentOS, Ubuntu|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeos#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**oss**|[Os[]](describeos#os)| |
### <div id="os">Os</div>
|Name|Type|Description|
|---|---|---|
|**osTypeId**|String|Operating System Type ID|
|**osName**|String|Operating system name, e.g. Ubuntu 16.04(x86_64)|
|**osType**|String|Operating system type, e.g. ubuntu/centos|
|**osVersion**|String|Operating system version, e.g. 14.04/16.04|
|**deviceType**|String|Instance type family, e.g. edcps.c.normal1|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
