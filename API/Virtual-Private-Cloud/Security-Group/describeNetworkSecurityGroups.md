# describeNetworkSecurityGroups


## Description
Query security group list

## Request method
GET

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkSecurityGroups/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|[Filter[]](##Filter)|False||networkSecurityGroupIds - Security group ID list, support multiple IDs<br>networkSecurityGroupNames - Security group name list, support multiple names<br>vpcId	- vpc Id of security group, support single Id<br>|
|**pageNumber**|Integer|False|1|Page; it is 1 by default, the value range: [1,∞); when the pages exceed total pages, show the last page|
|**pageSize**|Integer|False|20|Paging size; it is 20 by default; value range[10, 100]|

### <a name="Filter">Filter</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True||Name of filter requirements|
|**operator**|String|False||Operator of filter requirements is eq by default|
|**values**|String[]|True||Value of filter requirements|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)|Returned results|


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**networkSecurityGroups**|[NetworkSecurityGroup[]](##NetworkSecurityGroup)|Security group resource information list|
|**totalCount**|Number|Total number|
### <a name="NetworkSecurityGroup">NetworkSecurityGroup</a>
|Name|Type|Description|
|---|---|---|
|**createdTime**|String|Creation time of security group|
|**description**|String|Security group description information|
|**networkSecurityGroupId**|String|Security group ID|
|**networkSecurityGroupName**|String|Security group name|
|**securityGroupRules**|[SecurityGroupRule[]](##SecurityGroupRule)|Security group rule information|
|**vpcId**|String|vpc Id of security group|
### <a name="SecurityGroupRule">SecurityGroupRule</a>
|Name|Type|Description|
|---|---|---|
|**addressPrefix**|String|Prefix of matching address|
|**createdTime**|String|Creation time of security group rule|
|**description**|String|Description, all characters allowed to enter under UTF-8 coding, which is not exceed 256 characters|
|**direction**|Number|Security group rule direction. 0: inbound rule; 1: outbound rule|
|**fromPort**|Number|The start transport layer port of rule limit, the default value is 1, if protocol is not a transport layer protocol, the value is constantly 0|
|**ipVersion**|Number|Matching address protocol revision 4：IPv4|
|**protocol**|Number|Rule limits protocol. 300:All; 6:TCP; 17:UDP; 1:ICMP|
|**ruleId**|String|Security group rule ID|
|**toPort**|Number|The end transport layer port of rule limit, the default value is 1, if protocol is not a transport layer protocol, the value is constantly 0|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**401**|Authentication failed|
