# modifyEPB


## Description
Update the Instance Elastic Protection Bandwidth

## Request Method
POST

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyEPB

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Instance ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**modifyInstanceEPBSpec**|ModifyInstanceEPBSpec|True| |Modify instance name request parameter|

### ModifyInstanceEPBSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ep**|Integer|True| |Elastic bandwidth: unit: Gbps|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**err**|Err| |
### Err
|Name|Type|Description|
|---|---|---|
|**code**|Long|Same as http code|
|**details**|Object| |
|**message**|String| |
|**status**|String|Specific Error|
### Result
|Name|Type|Description|
|---|---|---|
|**code**|Integer|0: Modification failed, 1: Modification succeeded|
|**message**|String|Please specify reasons for modification failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
