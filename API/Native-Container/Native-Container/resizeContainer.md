# resizeContainer


## Description
Adjust Native Container Instance Type Family configuration.
- The status of Native Container is stopped;
- Configuration upgrade and downgrade is supported; **original specifications are not supported**
- Billing type is not changed
    - Monthly Package: Configuration price difference shall be calculated. If the price of the selected configuration is high, it is necessary to make up the price difference before expiration, and the expiration time remains unchanged; if the price of the selected configuration is low, the expiration time shall be extended
    - Pay by Configuration: It shall be billed in accordance with selected specifications


## Request Method
POST

## Request Address
https://nativecontainer.jdcloud-api.com/v1/regions/{regionId}/containers/{containerId}:resize

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**containerId**|String|True| |Container ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceType**|String|True| |New Instance Type Family shall not be same as original Instance Type Family|


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
