# deleteVqdTask


## Description
Delete video quality detection tasks. When deleting a task, the data, such as the task performance result, relevant to the task shall be simultaneously deleted

## Request Method
DELETE

## Request Address
https://vqd.jdcloud-api.com/v1/vqdTasks/{taskId}


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**taskId**|String|True| |Task ID, path parameter|


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
DELETE
```
https://vqd.jdcloud-api.com/v1/vqdTasks/10000

```

