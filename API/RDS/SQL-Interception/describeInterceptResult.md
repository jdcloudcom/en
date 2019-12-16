# describeInterceptResult


## Description
View SQL interception records of current instance after enabling high security mode<br>- Only support MySQL

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/intercept:describeInterceptResult

|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|String|True| |Instance ID|

## Request Parameters
|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Pages displaying data, which is 1 by default with value range: [-1,∞).   When pageNumber is 1, return all data page numbers; when exceeding total pages, display the last page;|
|**pageSize**|Integer|False| |Data entries displayed on each page, which is 10 by default with the value range: [10,100] and a multiple of 10.|


## Returned Parameters
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeInterceptResult#Result)| |

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**interceptResult**|[InterceptResult[]](describeInterceptResult#InterceptResult)| |
|**totalCount**|Integer| |
### <a name="InterceptResult">InterceptResult</a>
|Name|Type|Description|
|---|---|---|
|**startTime**|String|Execution Start Time of SQL|
|**ip**|String|Source IP|
|**accountName**|String|Account Name|
|**threadId**|String|Thread ID|
|**dbName**|String|Database Name|
|**sql**|String|sql Statement|

## Return Code
|Return Code|Descripton|
|---|---|
|**200**|OK|
