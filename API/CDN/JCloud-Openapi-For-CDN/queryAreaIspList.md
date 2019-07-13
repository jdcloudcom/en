# queryAreaIspList


## Description
Search region operator list

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/console:areaIspList


## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**mainLand**|AreaIspItem[]| |
|**overseas**|AreaIspItem[]| |
|**isp**|AreaIspItem[]| |
### AreaIspItem
|Name|Type|Description|
|---|---|---|
|**description**|String| |
|**code**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
