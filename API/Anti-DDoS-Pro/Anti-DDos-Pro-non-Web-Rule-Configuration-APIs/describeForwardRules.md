# describeForwardRules


## Description
Search the non-web forwarding configuration under an instance

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/forwardRules

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|Long|True| |Anti-DDoS Pro Instance Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page Number: 1 by default|
|**pageSize**|Integer|False| |Paging Size: 10 by default; value range [10, 100]|
|**searchType**|String|False| |Query type name, domain: origin server domain name, ip: origin server IP, port: forwarding port, originPort: origin server port|
|**searchValue**|String|False| |Query Type Value|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**code**|Integer|Request Error Status Code|
|**status**|String|Request Error Status Code|
|**message**|String|Request Error Notification|
### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|ForwardRule[]| |
|**currentCount**|Integer|Current Page Counts|
|**totalCount**|Integer|Total Amount|
|**totalPage**|Integer|Total Number of Pages|
### ForwardRule
|Name|Type|Description|
|---|---|---|
|**id**|Long|Rule ID|
|**instanceId**|Long|Instance ID|
|**protocol**|String|TCP or UDP|
|**cname**|String|cname of Rules|
|**originType**|String|Back-to-origin Type: ip or domain|
|**port**|Integer|Port Number|
|**algorithm**|String|Forwarding rules<br>- wrr Round robin with weights <br>- wlc Minimum weighted connection<br>- rr  Round robin without weights<br>- sh  Source address hash<br>|
|**originAddr**|OriginAddrItem[]| |
|**onlineAddr**|String[]|Backup Back-to-origin Address List|
|**originDomain**|String|Back-to-origin Domain Name|
|**originPort**|Integer|Back-to-origin Port Number|
|**status**|Integer|0 defense Status  1 back-to-origin Status|
### OriginAddrItem
|Name|Type|Description|
|---|---|---|
|**ip**|String|Back-to-origin IP address|
|**weight**|Integer|Weight|
|**inJdCloud**|Boolean|Confirm whether it is the Private IP/EIP address of JD Cloud?|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
