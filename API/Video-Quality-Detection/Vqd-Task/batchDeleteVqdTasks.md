# batchDeleteVqdTasks


## Description
Delete video quality detection tasks in batches. When deleting a task, the data, such as the task performance result, relevant to the task shall be simultaneously deleted. A maximum of 50 entries can be deleted at a time

## Request Method
POST

## Request Address
https://vqd.jdcloud-api.com/v1/vqdTasks:batchDelete


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**taskIds**|String[]|True| | |


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**500**|Internal server error|
|**503**|Service unavailable|

## Request Example
POST
```
https://vqd.jdcloud-api.com/v1/vqdTasks:batchDelete

```
```
{
    "taskIds": [
        "10001", 
        "10002"
    ]
}
```

