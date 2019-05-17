# previewCertificate


## Description
Preview certificate

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/certificate

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**content**|String|False| | |


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**sigAlgName**|String| |
|**issuer**|String| |
|**startDate**|String| |
|**endDate**|String| |
|**user**|String| |
|**sigHashAlgName**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
