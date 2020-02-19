# checkPodName


## Description
Whether podName conforms to the naming convention, and search whether it already exists in the assigned podName region.


## Request Method
POST

## Request Address
https://pod.jdcloud-api.com/v1/regions/{regionId}/pods:checkPodName

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**podName**|String|True| |pod name defined by the user, complying with the DNS-1123 subdomain specification.|
|**maxCount**|Integer|False| |Total number of pod that needs to be created; create one by default; different total number will affect the verification results.|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](checkpodname#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**code**|Integer|Whether the podName assigned by the user passes the verification, 0 means pass, 1 means that the name is blank, 2 means that the specifications are not met, and 3 means the name is duplicate.|
|**reason**|String|Where the code field is not zero, please give the detailed reason.|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
