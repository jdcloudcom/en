# registCloudInfo


## Description
Associate cloud for designated users

## Request Method
POST

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/cloud_info

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cloud**|CloudInfo|True| | |

### CloudInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|False| | |
|**name**|String|True| | |
|**vendor**|String|True| | |
|**info**|Object|True| | |
|**metadata**|Object|False| | |

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**cloud**|CloudInfo| |
### CloudInfo
|Name|Type|Description|
|---|---|---|
|**id**|String| |
|**name**|String| |
|**vendor**|String| |
|**info**|Object| |
|**metadata**|Object| |

## Return Code
|Return Code|Description|
|---|---|
|**201**|Created|
|**404**|User not found|
