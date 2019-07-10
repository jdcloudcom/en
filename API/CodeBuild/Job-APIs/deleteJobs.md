# deleteJobs


## Description
Delete compilation tasks in batches

## Request Method
DELETE

## Request Address
https://compile.jdcloud-api.com/v1/regions/{regionId}/jobs

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**jobIds**|String[]|True| |The UUID List of the Job to Be Deleted|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**result**|Boolean|true indicates the deletion succeeded, and false indicates the deletion failed|
|**ids**|String[]| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
