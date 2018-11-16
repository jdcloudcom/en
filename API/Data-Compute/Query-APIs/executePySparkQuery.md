# executePySparkQuery


## Description
Execute the PySpark script written by the user

## Request method
POST

## Request address
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwQuery:executePySparkQuery

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceName**|String|True| |Instance Name|
|**instanceOwnerName**|String|False| |Instance Owner Name|
|**script**|String|True| |PySpark Script|
|**scriptType**|String|False| |Script Type Name|
|**userName**|String|True| |User Name|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|Integer| |
|**message**|String| |
|**status**|Boolean| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
