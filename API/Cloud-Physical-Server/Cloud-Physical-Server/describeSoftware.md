# describeSoftware


## Description
Query the list of software to be pre-installed on the physical server<br/>
The API (describeOS) may be called to obtain the operating system list supported by the Cloud Physical Server, and acquire the software list that supports to be pre-installed by different operating system types<br/>


## Request method
GET

## Request address
https://cps.jdcloud-api.com/v1/regions/{regionId}/os/{osTypeId}/softwares

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**osTypeId**|String|True| |Operating System Type ID, the operating systems supported by the Cloud Physical Server can be obtained by calling API (describeOS)|
|**regionId**|String|True| |Region ID, the Region and Availability Zone Supported by the Cloud Physical Servers can be Obtained by Calling API (describeRegions)|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**softwares**|Software[]| |
### Software
|Name|Type|Description|
|---|---|---|
|**description**|String|Software Package Description|
|**name**|String|Software Package Name|
|**osTypeId**|String|Operating System Type ID|
|**version**|String|Software Package Version|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
