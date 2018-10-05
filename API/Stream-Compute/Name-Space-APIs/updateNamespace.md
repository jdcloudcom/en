# updateNamespace


## Description
Update namespace

## Request Method
PUT

## Request Address
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/namespace

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**namespaceStr**|[Namespace](##Namespace)|True|||

### <a name="Namespace">Namespace</a>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**createTime**|String|False|||
|**deleted**|Integer|False|||
|**id**|Integer|False|||
|**name**|String|False|||
|**pods**|String|False|||
|**podsUpdateTime**|String|False|||
|**resourceId**|String|False|||
|**sourceId**|String|False|||
|**status**|String|False|||
|**type**|String|False|||
|**typeValue**|String|False|||
|**updateTime**|String|False|||
|**userName**|String|False|||

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**status**|Boolean|Update the successful marker|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**500**|INTERNAL_ERROR|
