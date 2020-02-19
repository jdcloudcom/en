# queryDomainAllConfigClassify


## Description
Search all type configurations of domain

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/queryDomainAllConfigClassify

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**configItems**|[ConfigItem[]](#configitem)| |
### <div id="ConfigItem">ConfigItem</div>
|Name|Type|Description|
|---|---|---|
|**configItemType**|String|Configuration Item Type|
|**configItemName**|String|Configuration Item Name|
|**configStatus**|Integer|Configuration Status|
|**configStatusName**|String|Configuration Status Name|
|**configItemDetails**|Object|Configuration item details, the type is Map<String,Object>|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
