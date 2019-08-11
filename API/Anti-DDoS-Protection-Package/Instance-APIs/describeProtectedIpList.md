# describeProtectedIpList


## Description
Search IP list under protection

## Request Method
GET

## Request Address
https://antipro.jdcloud-api.com/v1/describeProtectedIpList


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page|
|**pageSize**|Integer|False|10|Paging Size|
|**instanceId**|Integer|False| |Instance Id, search all protected IPs of user if it is the default|
|**type**|Integer|True| |Protected IP Type. <br>- 0: All<br>-1: Elastic IP<br>-2: Public IP of Cloud Physical Server<br>- 4: Public IP of Cabinet Service|
|**ip**|String|False| |Protected IP, supporting fuzzy search|


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
|**dataList**|ProtectedIp[]| |
|**currentCount**|Integer|Current Page Counts|
|**totalCount**|Integer|Total Instance Counts|
|**totalPage**|Integer|Total Number of Pages|
### ProtectedIp
|Name|Type|Description|
|---|---|---|
|**ip**|String|Protected IP|
|**safeStatus**|Integer|Security Status, <br>- 0: Secure<br>- 1: Clean<br>- 2: Black Hole|
|**resourceType**|Integer|Public IP type or associated resource type.<br>- 0: Unknown type,<br>- 1: Elastic IP (IP is elastic IP, and associated resource type is unknown),<br>- 10: Elastic IP (IP is elastic IP, and no resource is associated),<br>- 11: Virtual Machines,<br>- 12: Load Balancer,<br>- 13: Native Container Instance,<br>- 14: Native Container Pod,<br>- 2: Public IP of Cloud Physical Server,<br>- 4: Public IP of Cabinet Service|
|**protectionRuleType**|Integer|Protection Rules Type. <br>-0: Default (protection rule of protection package), <br>-1: Customized rule of IP|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
