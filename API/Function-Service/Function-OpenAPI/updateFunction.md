# updateFunction


## Description
Update Function

## Request Method
PUT

## Request Address
https://function.jdcloud-api.com/v1/regions/{regionId}/functions/{functionName}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**functionName**|String|True| |Function Name|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**code**|Code|True| |Function Code Package|
|**description**|String|True| |Function Description Information|
|**entrance**|String|True| |Function Entrance, the format is entrance file.entrance function name|
|**environment**|Env|True| |Environment Variable Upon Function Running|
|**logSetId**|String|True| |Log Collection Id Designated by Function|
|**logTopicId**|String|True| |Log Subject Id Designated by Function|
|**memory**|Integer|True| |Maximum Memory Upon Function Running|
|**overTime**|Integer|True| |Time-out Period Upon Function Running|
|**runTime**|String|True| |Function Running Environment|
|**subnetId**|String|True| |Subnet Id of Function Configuration|
|**version**|String|False| |Function Version|
|**vpcId**|String|True| |VPCId of Function Configuration|

### Env
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**data**|Object|False| | |
### Code
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**bucketName**|String|False| |bucket Name of Object Storage Service where code is located|
|**objectName**|String|False| |object Name of Object Storage Service where code is located|
|**onlineCode**|String|False| |Online Edit Code|
|**zipFile**|String|False| |Code Compression File, base64 coding|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|This Request Id|
|**result**|Result|Update Function Return Value|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|Function| |
### Function
|Name|Type|Description|
|---|---|---|
|**code**|Code|Function Package|
|**codeCheckSum**|String|Code Package Verification Sum|
|**codeSize**|Integer|Code Package Size, the unit is byte|
|**createTime**|String|Function Creation Time|
|**description**|String|Function Description|
|**downloadUrl**|String|url Address Downloaded by Code Package|
|**entrance**|String|Function Entrance, the format is entrance file.entrance function name|
|**environment**|Env|Function Environment Variable|
|**functionId**|String|FunctionId|
|**logSetId**|String|Log Collection id Designated by Function|
|**logTopicId**|String|Log Subject id Designated by Function|
|**memory**|Integer|Maximum Memory Upon Function Running|
|**name**|String|Function Name|
|**overTime**|Integer|Function Time-out Period|
|**runTime**|String|Function Running Environment, currently there is python3.6|
|**subnetId**|String|Subnet of Function Configuration id|
|**updateTime**|String|Last Update Time of Function|
|**version**|String|Function Version Name|
|**vpcId**|String|VPCid of Function Configuration|
### Code
|Name|Type|Description|
|---|---|---|
|**bucketName**|String|bucket Name of Object Storage Service where code is located|
|**objectName**|String|object Name of Object Storage Service where code is located|
|**onlineCode**|String|Online Edit Code|
|**zipFile**|String|Code Compression File, base64 coding|
### Env
|Name|Type|Description|
|---|---|---|
|**data**|Object| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|A successful response.|
|**404**|NOT_FOUND|
