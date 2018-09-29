# modifyRouteTableRules


## 描述
Modify route table rule

## 请求方式
POST

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/routeTables/{routeTableId}:modifyRouteTableRules

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**routeTableId**|String|True| |RouteTable ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**modifyRouteTableRuleSpecs**|ModifyRouteTableRules[]|True| |Route Table Rule Information|

### ModifyRouteTableRules
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**addressPrefix**|String|False| |Prefix of route table rule, addressPrefix of internet type route and other types of routes is not allowed to be duplicate|
|**nextHopId**|String|False| |Next ID|
|**nextHopType**|String|False| |Type of Next. Value Range: instance: Virtual Machine, internet: public network, VPC_peering: VPC peering connection, bgw: border gateway|
|**priority**|Number|False| |Rule Matching Priority. Value Range: [1,255]. When routing rule subnet masks are different, the longest routing will match the priority; when routing rule subnet masks are the same, forwarding is based on priority matching, where the smaller the priority number is, the higher priority it is; when the routing rule subnet masks and the priority are the same but the next is different, the equal-cost routing is constituted and the load of next is balanced.|
|**ruleId**|String|True| |Route Table Rule ID|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|


## 返回码
|返回码|描述|
|---|---|
|**200**|Successful operation|
|**400**|invalid parameter|
|**404**|RouteTable or RouteTableRule not found|
|**500**|Internal server error|
