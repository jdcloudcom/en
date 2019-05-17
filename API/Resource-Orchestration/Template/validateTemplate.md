# validateTemplate


## Description
Template verification

## Request Method
POST

## Request Address
https://jdro.jdcloud-api.com/v1/regions/{regionId}/templateValidate

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**environment**|Environment|False| | |
|**template**|Object|True| |Template|
|**validateMode**|String|False| |The value can be: (validateTemplate (detection template), validateStack (detection template and environment)) default validateTemplate|

### Environment
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**disableRollback**|Boolean|False| |Rollback is prohibited, default false, namely rollback upon failure of creating resource stack|
|**name**|String|True| |Resource Stack Name|
|**params**|Object|False| |Customized parameter value map, the content is in key-value pair form, the key is the parameter, and the value is the customized parameter value. The parameter values in Params will cover the default values of parameters in template files.|
|**timeout**|Long|True| |Time-out period in minutes, with the range of 10-180|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested identifier id|

### Result
|Name|Type|Description|
|---|---|---|
|**describe**|String| |
|**result**|Object|Verification template result information, in JSON format|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Verification template is passed|
