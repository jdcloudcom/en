# getLB


## Description
View all resolution records of load balancer under current domain<br>
List of Resolution Records Displayed in Paging


## Request Method
GET

## Request Address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/GetLB

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainId**|String|True| |Domain ID, please get it by using getDomains interface.|
|**regionId**|String|True| |Region ID of Instances|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|True| |Load balancer records the number of pages displayed in paging, default is 1|
|**pageSize**|Integer|True| |Load balancer records the records of each page displayed in paging, default is 10|
|**type**|String|True| |Types of resolution records Types with weight include: A, AAAA, CNAME, JNAME|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of Request at This Time|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**currentCount**|Integer|Number of Load Balancer Records of Current Page|
|**dataList**|Getlb[]|Load Balancer List of Resolution Records|
|**totalCount**|Integer|Number of All Load Balancer Records|
|**totalPage**|Integer|Number of Pages of All Load Balancer Records|
### Getlb
|Name|Type|Description|
|---|---|---|
|**isBalance**|Boolean|Whether resolution records in list of resolution record of load balancer have a same weight<br><br>true: assign load according to the weight<br><br>false: equal load<br>|
|**items**|HostRRlb[]|List of Resolution Record of Load Balancer|
|**record**|String|Machine Record|
|**type**|String|Type of Resolution|
|**viewName**|String|Name of Resolution ISP Line|
|**viewValue**|Integer|ID of Resolution ISP Line|
### HostRRlb
|Name|Type|Description|
|---|---|---|
|**hostValue**|String|Value of Resolution Record|
|**id**|Integer|ID of Resolution Record|
|**rate**|Double|100 Times of Ratio of the Record in Total Balancers|
|**weight**|Integer|Weight of Resolution Record|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
