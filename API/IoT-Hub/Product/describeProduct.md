# describeProduct


## Description
View product

## Request Method
GET

## Request Address
https://iothub.jdcloud-api.com/v2/regions/{regionId}/products/{productKey}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**productKey**|String|True| |Product Key|

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
|**productName**|String|Product Name|
|**productType**|Integer|Node type, value: <br>0: Device. The device cannot be attached with any child device. It can be directly connected to the IoT platform and also be connected to the IoT platform as the gateway child device<br>1: Gateway. The Gateway can be attached with a child device and has a child device management module maintaining child device topology and synchronizing topology to the IoT platform<br>|
|**productKey**|String|Product key|
|**productSecret**|String|Product Secret Key|
|**createdTime**|Long|Creation time, the time is based on UTC/GMT+08:00|
|**deviceCount**|Integer|Number of Devices Included|
|**dynamicRegister**|Integer|Dynamic registration, 0: Disabled, 1: Enabled|
|**productDescription**|String|Product Description Information|
|**templateName**|String|Product Type, such as customized, etc.|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
