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
|**filters**|Filter[]|False| |networkSecurityGroupIds - Security group ID list, support multiple IDs<br>networkSecurityGroupNames - Security Group name list, support multiple names<br>vpcId	- VPC ID of Security Group, support single Id<br>|
|**pageNumber**|Integer|False|1|Page: 1 by default. Value Range: [1,∞); when the pages exceed total pages, show the last page|
|**pageSize**|Integer|False|20|Paging Size; 20 by default. Value Range: [10, 100]|

### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|


### Result
|Name|Type|Description|
|---|---|---|
|**networkSecurityGroups**|NetworkSecurityGroup[]|Security group resource information list|
|**totalCount**|Number|Total Number|
### NetworkSecurityGroup
|Name|Type|Description|
|---|---|---|
|**createdTime**|String|Creation Time of Security Group|
|**description**|String|Security Group Description Information|
|**networkSecurityGroupId**|String|Security Group ID|
|**networkSecurityGroupName**|String|Security Group Name|
|**securityGroupRules**|SecurityGroupRule[]|Security Group Rule Information|
|**vpcId**|String|VPC ID of Security Group|
### SecurityGroupRule
|Name|Type|Description|
|---|---|---|
|**addressPrefix**|String|Prefix of Matching Address|
|**createdTime**|String|Creation Time of Security Group Rule|
|**description**|String|Description, allow all characters under UTF-8 coding, which cannot exceed 256 characters|
|**direction**|Number|Security Group Rule Direction. 0: Inbound Rule; 1: Outbound Rule|
|**fromPort**|Number|The start transport layer port of rule limit, the default value is 1, if protocol is not a transport layer protocol, the value is constantly 0|
|**ipVersion**|Number|Matching Address Protocol Revision 4: IPv4|
|**protocol**|Number|Rule Limits Protocol. 300:All; 6:TCP; 17:UDP; 1:ICMP|
|**ruleId**|String|Security Group Rule ID|
|**toPort**|Number|The end transport layer port of rule limit, the default value is 1, if protocol is not a transport layer protocol, the value is constantly 0|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**401**|Authentication failed|
