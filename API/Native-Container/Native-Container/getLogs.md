# getLogs


## Description
Search a container log


## Request method
GET

## Request address
https://nc.jdcloud-api.com/v1/regions/{regionId}/containers/{containerId}:getLogs

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**containerId**|String|True| |Container ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**tailLines**|Integer|False| |Return the tailLines in log file. If no tail line is specified, the log file will be read from the container starting time or the time specified by sinceSeconds by default.<br>|
|**sinceSeconds**|Integer|False| |Return logs in sinceSeconds relatively before current time.<br>|
|**limitBytes**|Integer|False| |Restrict byte number in returned log file within [1-4]KB, with 4KB at most.<br>|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**logs**|Object| |

## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
