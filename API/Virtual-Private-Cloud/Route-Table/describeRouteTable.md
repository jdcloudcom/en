# describeRouteTable


## 描述
Query route table information details

## 请求方式
GET

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/routeTables/{routeTableId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**routeTableId**|String|True| |RouteTable ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|

### Result
|名称|类型|描述|
|---|---|---|
|**routeTable**|RouteTable|Route table resource information|
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
