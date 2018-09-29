# describeRouteTables


## 描述
Query route table information

## 请求方式
GET

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/routeTables/

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**filters**|Filter[]|False| |routeTableIds - Route table ID list, support multiple IDs<br>routeTableNames - Route table name list, support multiple names<br>VPCId	- VPC ID of route table, support single Id<br>|
|**pageNumber**|Integer|False|1|Page: 1 by default. Value Range: [1,∞); when the pages exceed total pages, show the last page|
|**pageSize**|Integer|False|20|Paging Size; 20 by default. Value Range: [10, 100]|

### Filter
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|

### Result
|名称|类型|描述|
|---|---|---|
|**routeTables**|RouteTable[]|Route Table Resource Information List|
|**totalCount**|Number|Total Number|
### RouteTable
|名称|类型|描述|
|---|---|---|
|**createdTime**|String|Creation Time of Route Table|
|**description**|String|Route table description information, allow all characters under UTF-8 coding, which cannot exceed 256 characters.|
|**routeTableId**|String|Route Table ID|
|**routeTableName**|String|Route table name, only allow Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, must provide a name which cannot exceed 32 characters.|
|**routeTableRules**|RouteTableRule[]|Route Table Rule Information|
|**routeTableType**|String|Route Table Type, Default: default route table, Custom: customized route table|
|**subnetIds**|String[]|Route Table Associated Subnet List|
|**vpcId**|String|VPC ID|
### RouteTableRule
|名称|类型|描述|
|---|---|---|
|**addressPrefix**|String|Prefix of matching address, addressPrefix of internet type route and other types of routes is not allowed to be duplicate|
|**nextHopId**|String|Next ID|
|**nextHopType**|String|Type of Next. Value Range: local:local, instance: Virtual Machine, internet: public network, VPC_peering: VPC peering connection, bgw: border gateway|
|**priority**|Number|Rule Matching Priority. Value Range: [1,255], default value is 100. When routing rule subnet masks are different, the longest routing will match the priority; when routing rule subnet masks are the same, forwarding is based on priority matching, where the smaller the priority number is, the higher priority it is; when the routing rule subnet masks and the priority are the same but the next is different, the equal-cost routing is constituted and the load of next is balanced.|
|**ruleId**|String|Route Table Rule ID|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**401**|Authentication failed|
