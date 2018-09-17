# queryNamespaces


## Description
Query the application list under the tenant

## Request method
GET

## Request address
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/namespaces

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**keyword**|String|False|||


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**namespaces**|Object[]|namespaces information|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|INTERNAL_ERROR|
