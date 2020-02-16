# authorizedApiGroupList


## Description
Search all authorized api group list

## Request Method
GET

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/accessAuths:authorizedApiGroupList

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|page; it is 1 by default, the value range: [1,∞)|
|**pageSize**|Integer|False|20|Paging size; it is 20 by default; value range: [10, 100]|
|**filters**|[Filter[]](authorizedapigrouplist#filter)|False| |apiGroupName - name, fuzzy matching<br>|

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](authorizedapigrouplist#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**apiGroups**|[UserBindedGroups[]](authorizedapigrouplist#userbindedgroups)|Search API group information|
### <div id="userbindedgroups">UserBindedGroups</div>
|Name|Type|Description|
|---|---|---|
|**apiGroupId**|String|Group ID|
|**groupName**|String|Group Name|
|**region**|String|Zone|
|**authtime**|String|Authorization Time|
|**authUserType**|String|Authorized User Type|
|**accessKey**|String|Access Key|
|**appId**|String|appid of api Caller|
|**environment**|String|Environment deployed by api|
|**revision**|String|api Version|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
