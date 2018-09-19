# queryNamespaces


## Description
Query the application list under the tenant

## Request Method
GET

## Request Address
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/namespaces

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**keyword**|String|False|||


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**namespaces**|Object[]|namespaces information|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**500**|INTERNAL_ERROR|
