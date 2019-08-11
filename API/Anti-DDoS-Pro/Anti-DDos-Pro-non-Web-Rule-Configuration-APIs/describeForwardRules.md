# describeForwardRules


## Description
Search the non-web forwarding configuration under an instance

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/forwardRules

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Anti-DDoS Pro instance Id|

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
|**dataList**|ForwardRule[]| |
|**currentCount**|Integer|Current Page Counts|
|**totalCount**|Integer|Total Amount|
|**totalPage**|Integer|Total Number of Pages|
### ForwardRule
|Name|Type|Description|
|---|---|---|
|**id**|String|Rule Id|
|**instanceId**|String|Instance Id|
|**protocol**|String|TCP or UDP|
|**cname**|String|CNAME of Rules|
|**originType**|String|Back-to-origin Type: ip or domain|
|**port**|Integer|Port Number|
|**algorithm**|String|Forwarding rules. <br>- wrr: Round robin with weight<br>- rr:  Round robin without weight<br>- sh:  Source address hash|
|**originAddr**|OriginAddrItem[]| |
|**onlineAddr**|String[]|Backup Back-to-origin Address List|
|**originDomain**|String|Back-to-origin Domain Name|
|**originPort**|Integer|Back-to-origin Port Number|
|**status**|Integer|0: Defense Status<br>1: Back-to-origin Status|
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
