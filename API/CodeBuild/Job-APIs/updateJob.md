# updateJob


## Description
Update the compilation task

## Request Method
PUT

## Request Address
https://compile.jdcloud-api.com/v1/regions/{regionId}/jobs/{id}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |job uuid|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**data**|JobRequest|False| | |

### JobRequest
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Project Name|
|**codeType**|String|True| |Source Provider, Type of Code Storage, Only the Type of Code Storage github Supported Currently|
|**codeRepoUrl**|String|True| |Repository Address, Path of Code clone|
|**codeRepoBranch**|String|True| |Code Branch|
|**ossPath**|String|False| |Obtain the user cloud storage path for the user OSS base. If the cloud storage path of the user is null, use the public cloud storage|
|**ossHost**|String|True| |The uploading region, i.e., the cloud storage machines of the user, is actually the region of the cloud storage of the user|
|**ossBucket**|String|False| |Obtain the cloud storage bucket for the user OSS base. If it is null, use the public cloud storage|
|**buildImage**|String|True| |Form this item with the selection type and running version, and compile the image address|
|**isUserBuildSetConfig**|Boolean|False| |The building specification is false, if build.yml in source code is chosen to be used for the directory; it is true, if the build command is chosen to be inserted. If the item is true, buildSetConfig requires content; if it is false, buildSetConfig doesn’t take effect even if with content|
|**buildSetConfig**|String|False| |Insert the building command, and when isUserBuildSetConfig is chosen to be true, this item shall be stated by the user, with the content obtained from the interface /regions/{regionId}/jobs/default/buildSet|
|**buildTimeOut**|Integer|False| |Time-out Period (Unit: Second)|
|**buildResourceCpu**|Integer|False| |Calculate the number of CPU cores assigned in the type|
|**buildResourceMem**|Integer|False| |Calculate the memory size assigned in the type, (Unit: MB)|
|**noticeMail**|String|False| |Notification Email|
|**noticeType**|String|False| |Notification Frequency, a notice is sent when MAIL_FAILED fails, and at the time of each MAIL_EVERY building|
|**compilerType**|String|False| |Building Type|
|**dockerRegistry**|String|False| |Image Registry Name|
|**dockerRepository**|String|False| |Image Repository Name|
|**dockerRegistryUri**|String|False| |URI of Registry|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**id**|String|uuid of Building Task|
|**codeRepoUrlLabel**|String|Project Owner/Project Name|
|**result**|Boolean|true if the update succeeded|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
