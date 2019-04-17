# describeNetworkSecurityGroups


## Description
Query security group list

## Request method
GET

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkSecurityGroups/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page; it is 1 by default. Value Range: [1,∞); when the pages exceed total pages, show the last page|
|**pageSize**|Integer|False|20|Paging Size: 20 by default. Value Range: [10, 100]|
|**filters**|Filter[]|False| |networkSecurityGroupIds - Security group ID list, support multiple IDs<br>networkSecurityGroupNames - Security Group name list, support multiple names<br>vpcId	- VPC ID of Security Group, support single Id<br>|

### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Returned Results|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**networkSecurityGroups**|NetworkSecurityGroup[]|Security group resource information list|
|**totalCount**|Number|Total Number|
### NetworkSecurityGroup
|Name|Type|Description|
|---|---|---|
|**networkSecurityGroupId**|String|Security Group ID|
|**networkSecurityGroupName**|String|Security Group Name|
|**description**|String|Security Group Description Information|
|**vpcId**|String|VPC ID of Security Group|
|**securityGroupRules**|SecurityGroupRule[]|Security Group Rule Information|
|**createdTime**|String|Creation Time of Security Group|
### SecurityGroupRule
|Name|Type|Description|
|---|---|---|
|**ruleId**|String|Security Group Rule ID|
|**direction**|Number|Security Group Rule Direction. 0: Inbound Rule; 1: Outbound Rule|
|**protocol**|Number|Rule Limits Protocol. 300:All; 6:TCP; 17:UDP; 1:ICMP|
|**addressPrefix**|String|Prefix of Matching Address|
|**ipVersion**|Number|Matching Address Protocol Revision 4: IPv4|
|**fromPort**|Number|The start transport layer port of rule limit, the default value is 1, if protocol is not a transport layer protocol, the value is constantly 0|
|**toPort**|Number|The end transport layer port of rule limit, the default value is 1, if protocol is not a transport layer protocol, the value is constantly 0|
|**createdTime**|String|Creation Time of Security Group Rule|
|**description**|String|Description, allow all characters under UTF-8 coding, which cannot exceed 256 characters|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**401**|Authentication failed|
