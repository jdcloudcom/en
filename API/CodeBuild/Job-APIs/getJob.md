# getJob


## Description
Obtain the configuration information about the building task based on id

## Request Method
GET

## Request Address
https://compile.jdcloud-api.com/v1/regions/{regionId}/jobs/{id}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |Job uuid|
|**regionId**|String|True| |Region ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**job**|Job| |
### Job
|Name|Type|Description|
|---|---|---|
|**uuid**|String|uuid of Building Task|
|**createdAt**|Integer|Creation Time Stamp|
|**updatedAt**|Integer|Last Update Time|
|**name**|String|Building Name|
|**codeType**|String|Type of Code Storage, only github Supported Currently|
|**codeRepoUrl**|String|Path of Code clone|
|**codeRepoUrlLabel**|String|Display Label of Code Name|
|**codeRepoBranch**|String|Branch|
|**createUserName**|String|Creator|
|**codeRepoPrivate**|Boolean|Whether it is a private Repository or not|
|**createUserPin**|String|Last Updated by|
|**ossPath**|String|Use the public cloud storage if the cloud storage path of the user is null|
|**ossHost**|String|The cloud storage machines of the user is actually the region of the cloud storage of the user|
|**ossBucket**|String|Use the public cloud storage if the cloud storage bucket of the user is null|
|**buildImage**|String|Compile the image address|
|**buildImageLabel**|String|Compile the display Label of the image|
|**isUserBuildSetConfig**|Boolean|Whether to configure the building method on the page. If the item is true, buildSetConfig requires content, if it is false, buildSetConfig doesn’t take effect even if with content|
|**buildSetConfig**|String|See the description about isUserBuildSetConfig|
|**buildTimeOut**|Integer|Time-out Period (Unit: Second)|
|**buildResourceCpu**|Integer|Number of cpu Cores Assigned|
|**buildResourceMem**|Integer|Memory Size Assigned (Unit: MB)|
|**noticeMail**|String|Notification Email|
|**noticeType**|String|Notification Frequency, a notice is sent when MAIL_FAILED fails, and at the time of each MAIL_EVERY building|
|**compilerType**|String|Building Type|
|**dockerRegistry**|String|Image Registry Name|
|**dockerRepository**|String|Image Repository Name|
|**dockerRegistryUri**|String|URI of Registry|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
