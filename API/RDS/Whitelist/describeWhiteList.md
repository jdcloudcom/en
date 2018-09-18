# describeWhiteList


## Description
View the current whitelist of RDS instances. The whitelist is a list of IP/IP segments that are allowed to access the current instance. By default, the whitelist is open to the VPC. If the user has enabled the internet access, you need to configure a whitelist for the IP of the internet.

## Request method
GET

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/whiteList

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**whiteLists**|WhiteList[]|Whitelist|
### <a name="WhiteList">WhiteList</a>
|Name|Type|Description|
|---|---|---|
|**ips**|String|For IP or IP segment, different IP/IP segments shall be separated by commas, for example 0.0.0.0/0,192.168.0.10|
|**name**|String|Whitelist Name|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
