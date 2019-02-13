# getTaskInfoHistoryById


## Description
Read running results and running status with designated ID

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/task_infos/{task}/history

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**task**|String|True| |ID of Executive Request|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**tasks**|TaskInfo[]| |
### TaskInfo
|Name|Type|Description|
|---|---|---|
|**beginTime**|String|Start Time of Task Execution|
|**endTime**|String|End Time of Task Execution|
|**lastCode**|String|Final Coding of Task Execution:<br>CREATEING_RESOURCE_INFO->Incompleted: Constructing target resource information<br>CREATE_RESOURCE_INFO_ERROR->Failed Completion: Target resource description information creation failed. <br>CREATE_RESOURCE_INFO_SUCCESS->Incompleted: Target resource description information creation succeeded. Start to initial construction program<br>PROGRAM_INITING->Incompleted: Initialing construction program<br>PROGRAM_INIT_ERROR->Completion failed: Failed to initial construction program. <br>PROGRAM_INIT_SUCCESS->Incompleted: Initial construction program successfully. Start to analyze the construction task<br>TASK_PLAN_ERROR->Completion failed: Analysis construction error. <br>TASK_PLAN_NOCHANGE->Completed: No available operations for the construction<br>TASK_PLAN_SUCCESS->Incompleted: Analysis is completed. Start to execute resource construction<br>TASK_RUN_FAILED->Completion failed: Failed to execute resource construction task! <br>TASK_RUN_NOCHANGE->Completion: No operations are executed in the construction<br>TASK_RUN_SUCCESS->Completed: finished to execute resource construction task.|
|**msg**|Object[]|Log Information of Task Execution|
|**resourceIDs**|Object[]|Returned ID List after Task Execution Succeeded|
|**taskLastInfo**|String|Coding Description after Task Executed|
|**taskResult**|String|Results of Task Execution: done, error, nochange|
|**taskStatus**|String|Status of Task Execution: running, finished|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|OK|
