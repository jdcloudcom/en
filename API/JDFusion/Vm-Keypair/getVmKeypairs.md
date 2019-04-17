# getVmKeypairs


## Description
Search Information of corresponding key pair resource according to the cloud provider

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vm_keypairs

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**keypairs**|KeypairInfo[]| |
### KeypairInfo
|Name|Type|Description|
|---|---|---|
|**cloudID**|String|Cloud Registration Information ID|
|**keyFingerprint**|String|Key Fingerprint|
|**name**|String|Key Pair Name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
