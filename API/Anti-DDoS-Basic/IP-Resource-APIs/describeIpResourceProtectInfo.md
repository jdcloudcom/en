# describeIpResourceProtectInfo


## Description
Search public IP attack record, only supporting ipv4. (obsolete, <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeattacklogs'>describeAttackLogs</a> APIs are recommended)


## Request Method
GET

## Request Address
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources/{ip}/protectInfo

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code. Anti-DDoS Basic is supported in cn-north-1, cn-east-1, cn-east-2, and cn-south-1|
|**ip**|String|True| |Public IP protected by Anti-DDoS Basic, only supporting ipv4 format .<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeelasticipresources'>describeElasticIpResources</a> APIs to search elastic IP of VPC protected by Anti-DDoS Basic<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describecpsipresources'>describeCpsIpResources</a> APIs to search public IP and elastic IP of Cloud Physical Server protected by Anti-DDoS Basic <br>- Use <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeccsipresources'>describeCcsIpResources</a> APIs to search public IP of Cabinet Service protected by Anti-DDoS Basic|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**start**|Integer|False| |Start Range of Limited Search|
|**limit**|Integer|False| |Number of Records of Limited Search|


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
|**dataList**|IpResourceProtectInfo[]| |
### IpResourceProtectInfo
|Name|Type|Description|
|---|---|---|
|**startTime**|String|Start Time of Attack|
|**endTime**|String|End Time of Attack|
|**status**|Integer|Security Status, <br>- 0: Secure<br>- 1: Clean<br>- 2: Black Hole|
|**cause**|Integer|Trigger reason.<br>- 0: Unknown<br>- 1: Four-layer<br>- 2: Seven-layer<br>- 3: Four-layer and seven-layer|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
