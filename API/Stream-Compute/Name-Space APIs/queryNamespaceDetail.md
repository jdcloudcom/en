# queryNamespaceDetail


## Description
Query the details of a certain application

## Request method
GET

## Request address
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/namespaceDetail

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**namespaceId**|Integer|True|||


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**namespace**|Namespace|namespace objects queried out|
### <a name="Namespace">Namespace</a>
|Name|Type|Description|
|---|---|---|
|**createTime**|String||
|**deleted**|Integer||
|**id**|Integer||
|**name**|String||
|**pods**|String||
|**podsUpdateTime**|String||
|**resourceId**|String||
|**sourceId**|String||
|**status**|String||
|**type**|String||
|**typeValue**|String||
|**updateTime**|String||
|**userName**|String||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|INTERNAL_ERROR|
