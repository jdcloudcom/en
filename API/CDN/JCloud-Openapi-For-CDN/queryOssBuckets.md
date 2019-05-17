# queryOssBuckets


## Description
Search oss storage domain

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/ossBuckets


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
|**total**|Integer| |
|**ossBuckets**|Object[]| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
