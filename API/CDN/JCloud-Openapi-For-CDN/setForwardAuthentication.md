# setForwardAuthentication


## Description
Set forward pushing authentication information

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomain/{domain}/forwardAuthentication

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**accesskeyType**|Integer|True| |Authentication type, where 0 represents without authentication, 1 represents parameter authentication, 2 represents path authentication|
|**accesskeyKey**|String|False| |Password, the length is from 8 to 32|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**ignoreQueryString**|String|Ignore parameters or not|
|**pushIpWhiteList**|String|Pushing streaming IP white lists (separated with commas)|
|**publishNormalTimeout**|Integer|Pushing Streaming Time-out Period|
|**notifyCustomUrl**|String|When the pushing streaming is off, please inform URL to the customer system|
|**notifyCustomAuthKey**|String|Inform the authentication key of customer system|
|**forwardAccessKeyType**|Integer|Forward Pushing Authentication Type (0: No Authentication, 1: Parameter Authentication, 2: URL Authentication)|
|**forwardPrivateKey**|String|Forward Pushing Authentication key|
|**originAccessKeyType**|Integer|Back-to-origin Authentication Type (0: No Authentication, 1: Parameter Authentication, 2: URL Authentication)|
|**originPrivateKey**|String|Back-to-origin Authentication key|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
