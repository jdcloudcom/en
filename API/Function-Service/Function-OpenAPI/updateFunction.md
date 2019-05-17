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
|**description**|String|True| |Function Description Information|
|**entrance**|String|True| |Function Entrance, the format is entrance file.entrance function name|
|**memory**|Integer|True| |Maximum Memory Upon Function Running|
|**runTime**|String|True| |Function Running Environment|
|**overTime**|Integer|True| |Time-out Period Upon Function Running|
|**version**|String|False| |Function Version|
|**code**|Code|True| |Function Code Package|
|**environment**|Env|True| |Environment Variable Upon Function Running|
|**logSetId**|String|True| |Log Collection Id Designated by Function|
|**logTopicId**|String|True| |Log Subject Id Designated by Function|
|**vpcId**|String|True| |VPCId of Function Configuration|
|**subnetId**|String|True| |Subnet Id of Function Configuration|

### Env
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**data**|Object|False| | |
### Code
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**zipFile**|String|False| |Code Compression File, base64 coding|
|**onlineCode**|String|False| |Online Edit Code|
|**bucketName**|String|False| |bucket Name of Object Storage Service where code is located|
|**objectName**|String|False| |object Name of Object Storage Service where code is located|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Update Function Return Value|
|**requestId**|String|This Request Id|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|Function| |
### Function
|Name|Type|Description|
|---|---|---|
|**functionId**|String|FunctionId|
|**name**|String|Function Name|
|**description**|String|Function Description|
|**entrance**|String|Function Entrance, the format is entrance file.entrance function name|
|**memory**|Integer|Maximum Memory Upon Function Running|
|**runTime**|String|Function Running Environment, currently there is python3.6|
|**overTime**|Integer|Function Time-out Period|
|**version**|String|Function Version Name|
|**code**|Code|Function Package|
|**environment**|Env|Function Environment Variable|
|**logSetId**|String|Log Collection id Designated by Function|
|**logTopicId**|String|Log Subject id Designated by Function|
|**codeCheckSum**|String|Code Package Verification Sum|
|**codeSize**|Integer|Code Package Size, the unit is byte|
|**downloadUrl**|String|url Address Downloaded by Code Package|
|**vpcId**|String|VPCid of Function Configuration|
|**subnetId**|String|Subnet of Function Configuration id|
|**createTime**|String|Function Creation Time|
|**updateTime**|String|Last Update Time of Function|
### Env
|Name|Type|Description|
|---|---|---|
|**data**|Object| |
### Code
|Name|Type|Description|
|---|---|---|
|**zipFile**|String|Code Compression File, base64 coding|
|**onlineCode**|String|Online Edit Code|
|**bucketName**|String|bucket Name of Object Storage Service where code is located|
|**objectName**|String|object Name of Object Storage Service where code is located|

## Return Code
|Return Code|Description|
|---|---|
|**200**|A successful response.|
|**404**|NOT_FOUND|
