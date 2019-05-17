# createStack


## Description
Create Resource Stack

## Request Method
POST

## Request Address
https://jdro.jdcloud-api.com/v1/regions/{regionId}/stacks

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**environment**|Environment|True| | |
|**template**|Object|True| |Template, JSON object|

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
|**stackID**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|Detection Results|
