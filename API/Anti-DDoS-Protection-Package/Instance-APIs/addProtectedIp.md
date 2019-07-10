# addProtectedIp


## Description
Add protection IP of protection package.
- The protection package can only protect public IP in the region where the protection package instances are located, and such public IP is not protected by other protection packages. If it is protected by other protection packages, please call protection IP API of protection package to delete protection IP
- Counts of protection IP to be added to protection package is less than or equal to the difference between the protective IP counts of protection package minus protected IP counts
- Use <a href="http://docs.jdcloud.com/anti-ddos-protection-package/api/describeelasticipresources">describeElasticIpResources</a> APIs to search Elastic IP protected by protection package
- Use <a href="http://docs.jdcloud.com/anti-ddos-protection-package/api/describecpsipresources">describeCpsIpResources</a> APIs to search public IP of Cloud Physical Server protected by protection package


## Request Method
POST

## Request Address
https://antipro.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:addProtectedIp

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Code|
|**instanceId**|String|True| |Protection package instance Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**protectedIpSpec**|ProtectedIpSpec|True| |Add protection IP request parameter of protection package|

### ProtectedIpSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ip**|String[]|True| |IP List Under Protection|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**err**|Err| |
### Err
|Name|Type|Description|
|---|---|---|
|**code**|Long|Same as http code|
|**details**|Object| |
|**message**|String| |
|**status**|String|Specific Error|
### Result
|Name|Type|Description|
|---|---|---|
|**code**|Integer|Protection IP Addition Result, 0: Addition failed, 1: Addition succeeded|
|**message**|String|Please specify reasons for addition failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
