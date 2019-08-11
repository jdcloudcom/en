# deletePod


## Description
The pod must be in status of stopped, running or error. <br>
The instance paid by volume will keep running until it is deleted. The instance not used anymore can be passively stopped through this interface.<br>
Only the instance with the billing type by volume can be passively deleted. The pod with monthly package expired can also be deleted. Please report to the ticket system for other situations. The container with billing status exception can’t be deleted.
<br>For sensitive operation, <a href="https://docs.jdcloud.com/en/security-operation-protection/operation-protection">MFA operation protection can be enabled</a>

## Request Method
DELETE

## Request Address
https://pod.jdcloud-api.com/v1/regions/{regionId}/pods/{podId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**podId**|String|True| |Pod ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
