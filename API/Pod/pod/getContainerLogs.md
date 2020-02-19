# getContainerLogs


## Description
Search a container log


## Request Method
GET

## Request Address
https://pod.jdcloud-api.com/v1/regions/{regionId}/pods/{podId}/containers/{containerName}:getContainerLogs

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**podId**|String|True| |Pod ID|
|**containerName**|String|True| |container name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**tailLines**|Integer|False| |Return the tailLines in log file. If no tail line is specified, the log file will be read from the container starting time or the time specified by sinceSeconds by default. <br>|
|**sinceSeconds**|Integer|False| |Return logs in sinceSeconds relatively before current time. <br>|
|**limitBytes**|Integer|False| |Restrict byte number in returned log file within [1-4]KB, with 4KB at most.<br>|
|**startTime**|String|False| |Cap of log time; no uploading indicates that the time is unlimited<br>|
|**endTime**|String|False| |Lower limit of log time; no uploading indicates that the time is unlimited<br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](getcontainerlogs#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**logs**|[Logs](getcontainerlogs#logs)| |
### <div id="logs">Logs</div>
|Name|Type|Description|
|---|---|---|
|**content**|String|Container log contents; return 4KB at most|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
