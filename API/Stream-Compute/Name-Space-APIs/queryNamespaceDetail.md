# queryNamespaceDetail


## Description
Query the details of a certain application

## Request Method
GET

## Request Address
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/namespaceDetail

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**namespaceId**|Integer|True|||


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**namespace**|[Namespace](##Namespace)|namespace objects queried out|
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

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**500**|INTERNAL_ERROR|
