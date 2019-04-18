# getDeploymentsResultsByIdRecord


## Description
Search historical execution results for a given time (for internal use)

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/deployments/{id}/results/{record}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |deployment ID|
|**record**|String|True| |deployment ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**task**|TaskInfo| |
### TaskInfo
|Name|Type|Description|
|---|---|---|
|**beginTime**|String|Start Time of Task Execution|
|**endTime**|String|End Time of Task Execution|
|**taskStatus**|String|Statuses of Task Execution: running, finished|
|**taskResult**|String|Results of Task Execution: done, error, nochange|
|**lastCode**|String|Final Coding of Task Execution:<br>CREATEING_RESOURCE_INFO->Incompleted: Constructing target resource information<br>CREATE_RESOURCE_INFO_ERROR->Failed Completion: Target resource description information creation failed. <br>CREATE_RESOURCE_INFO_SUCCESS->Incompleted: Target resource description information creation succeeded. Start to initial construction program<br>PROGRAM_INITING->Incompleted: Initialing construction program<br>PROGRAM_INIT_ERROR->Completion failed: Failed to initial construction program. <br>PROGRAM_INIT_SUCCESS->Incompleted: Initial construction program successfully. Start to analyze the construction task<br>TASK_PLAN_ERROR->Completion failed: Analysis construction error. <br>TASK_PLAN_NOCHANGE->Completed: No available operation for the construction<br>TASK_PLAN_SUCCESS->Incompleted: Analysis is completed. Start to execute resource construction<br>TASK_RUN_FAILED->Completion failed: Failed to execute resource construction task. <br>TASK_RUN_NOCHANGE->Completion: No operation is executed in the construction<br>TASK_RUN_SUCCESS->Completed: finished to execute resource construction task.|
|**taskLastInfo**|String|Coding Description after Task Execute|
|**resourceIDs**|Object[]|Returned ID List after Task Execution Success|
|**msg**|Object[]|Log Information of Task Execution|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|not found|
