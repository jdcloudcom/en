# resizePod


## Description
Adjust pod Instance Type Family configuration.
- pod phase needs to be stopped;
- Configuration upgrade and downgrade is supported; **original specifications are not supported**
- Billing type is not changed
    - Monthly Package: Configuration price difference shall be calculated. If the price of the selected configuration is high, it is necessary to make up the price difference before expiration, and the expiration time remains unchanged; if the price of the selected configuration is low, the expiration time shall be extended
    - Pay by Configuration: It shall be billed in accordance with selected specifications
- Resource restriction and resource requirement adjustment to containers in pod is supported
    - The utilization of total resources required by containers shall not exceed the pod Instance Type Family
    - The container resource restriction shall not exceed the pod Instance Type Family


## Request Method
POST

## Request Address
https://pod.jdcloud-api.com/v1/regions/{regionId}/pods/{podId}:resize

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**podId**|String|True| |Pod ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceType**|String|True| |New Instance Type Family shall not be same as original Instance Type Family|
|**containerResources**|[ContainerResourceSpec[]](resizepod#containerresourcespec)|False| |New Instance Type Family shall not be same as original Instance Type Family|

### <div id="containerresourcespec">ContainerResourceSpec</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Container Name|
|**resources**|[ResourceRequestsSpec](resizepod#resourcerequestsspec)|True| |Container Computing Resource Configuration|
### <div id="resourcerequestsspec">ResourceRequestsSpec</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**requests**|[RequestSpec](resizepod#requestspec)|False| |Computing Resource Necessary for Container|
|**limits**|[RequestSpec](resizepod#requestspec)|False| |Cap of Computing Resource Used by Container|
### <div id="requestspec">RequestSpec</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cpu**|String|False| |Computing resource necessary for container, for instance: 300m, 1000m|
|**memoryMB**|String|False| |Cap of computing resource used by container, for instance: 1024Mi, 16384Mi|

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
