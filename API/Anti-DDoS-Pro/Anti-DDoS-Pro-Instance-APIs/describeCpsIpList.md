# describeCpsIpList


## Description
Search users can be set as JD Cloud's Cloud Physical Server public IP resources of web service rule back-to-origin IP

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/cpsIpResources

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page number, 1 by default|
|**pageSize**|Integer|False| |Paging size, 10 by default, value range [0, 100], 0 means full|


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
|**dataList**|CpsIpResource[]| |
|**currentCount**|Integer|Current Page Counts|
|**totalCount**|Integer|Total Amount|
|**totalPage**|Integer|Total Number of Pages|
### CpsIpResource
|Name|Type|Description|
|---|---|---|
|**ip**|String|Cloud Physical Server Public IP Address|
|**resourceType**|Integer|Public IP type or associated resource type.<br>- 0: Unknown type<br>- 1: Elastic IP (IP is elastic IP, and associated resource type is unknown)<br>- 10: Elastic IP (IP is elastic IP, and no resource is associated)<br>- 11: Elastic IP, associated with Virtual Machines<br>- 12: Elastic IP, associated with Load Balancer<br>- 13: Elastic IP, associated with Native Container Instance<br>- 14: Elastic IP, associated with Native Container Pod<br>- 2: Cloud Physical Server Public IP|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
