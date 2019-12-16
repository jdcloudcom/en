# describeIntercept


## Description
View security mode enabled in current instance. If high security mode of database is enabled, configuration information will be returned<br>- Only support MySQL

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/intercept

|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|String|True| |Instance ID|

## Request Parameters
None


## Returned Parameters
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeIntercept#Result)| |

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**available**|Boolean| |

## Return Code
|Return Code|Descripton|
|---|---|
|**200**|OK|
