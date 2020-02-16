# queryAuthGroupList


## Description
Search the deployment list that can be associated

## Request Method
GET

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/accessAuths:groupList

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**authUserType**|String|True| |User type to be associated|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](queryauthgrouplist#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**bindGroups**|[BindGroups[]](queryauthgrouplist#bindgroups)|Search the deployment list that can be associated|
### <div id="bindgroups">BindGroups</div>
|Name|Type|Description|
|---|---|---|
|**deploymentId**|String|Deploy ID|
|**groupName**|String|Group Name|
|**environment**|String|Environment: test, preview and online|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
