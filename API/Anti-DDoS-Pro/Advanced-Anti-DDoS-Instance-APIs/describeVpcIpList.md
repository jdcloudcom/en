# describeVpcIpList


## Description
Query the JD Cloud IP Resources of Users

## Request method
GET

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instance/describeVpcIpList

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Belonging Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False||Page number; 1 by default|
|**pageSize**|Integer|False||Paging Size, 10 by Default; Value Range [0, 100], 0 Means Full|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### Result
|Name|Type|Description|
|---|---|---|
|**currentCount**|Integer|Current page counts|
|**dataList**|VpcIpResource[]||
|**totalCount**|Integer|Total number of instances|
|**totalPage**|Integer|Total number of pages|
### VpcIpResource
|Name|Type|Description|
|---|---|---|
|**binded**|Boolean|Associate or Not|
|**ip**|String|In-cloud IP Address|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
