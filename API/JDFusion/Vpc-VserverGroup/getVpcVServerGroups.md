# getVpcVServerGroups


## Description
Obtain information of the server group according to the filter conditions

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_vserverGroups

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**slbid**|String|False| |id of Load Balancer|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**vserverGroups**|VserverGroupInfo[]| |
### VserverGroupInfo
|Name|Type|Description|
|---|---|---|
|**cloudID**|String|ID of Cloud|
|**vserverGroupId**|String|ID of Server Group|
|**vserverGroupName**|String|Name of Server Group|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
