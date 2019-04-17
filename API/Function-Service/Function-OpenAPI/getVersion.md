# getVersion


## Description
Obtain Version Details

## Request Method
GET

## Request Address
https://function.jdcloud-api.com/v1/regions/{regionId}/functions/{functionName}/versions/{versionName}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**functionName**|String|True| |Function Name|
|**regionId**|String|True| |Region ID|
|**versionName**|String|True| |Version Name|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|This Request Id|
|**result**|Result|Obtain Version Details Return Value|

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
