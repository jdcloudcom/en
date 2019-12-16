# createProduct


## Description
Create Product

## Request Method
POST

## Request Address
https://iothub.jdcloud-api.com/v2/regions/{regionId}/products

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**productName**|String|True| |Product name, the name cannot be null, comprises 3-30 characters, only supports Chinese characters, English letters, numbers, underline "_", line-through "-" and must start and end with Chinese characters, English letters or numbers|
|**productType**|Integer|True| |Node type, value: <br>0: Device. The device cannot be attached with any child device. It can be directly connected to the IoT platform and also be connected to the IoT platform as the gateway child device<br>1: Gateway. The Gateway can be attached with a child device and has a child device management module maintaining child device topology and synchronizing topology to the IoT platform<br>|
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
