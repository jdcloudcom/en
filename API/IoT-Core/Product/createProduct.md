# createProduct


## Description
Create Product

## Request Method
POST

## Request Address
https://iotcore.jdcloud-api.com/v2/regions/{regionId}/instances/{instanceId}/products

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|String|True| |ID Information of IoT Engine Instance|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**productName**|String|True| |Product name, the name cannot be null, comprises 3-30 characters, only supports Chinese characters, English letters, numbers, underline "_", line-through "-" and must start and end with Chinese characters, English letters or numbers|
|**productType**|Integer|True| |Node type, value: <br>0: Device. The device cannot be attached with any sub-device. It can be directly connected to the IoT platform and also be connected to the IoT platform as the gateway sub-device<br>1: Gateway. The Gateway can be attached with a sub-device and has a sub-device management module maintaining device topology and synchronizing topology to the IoT platform<br>|
|**productDescription**|String|False| |Product description, less than 80 characters|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**productKey**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
