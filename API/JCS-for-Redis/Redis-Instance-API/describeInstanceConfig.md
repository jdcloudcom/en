# describeInstanceConfig


## Description
View current configuration parameter of Redis instance

## Request Method
GET

## Request Address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}/instanceConfig

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the region where the Redis instance is located. At present, there are three regions, with Region ID of cn-north-1, cn-south-1 and cn-east-2 respectively|
|**cacheInstanceId**|String|True| |Redis instance ID is the only identifier for instance access|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#Result)|Result|
|**requestId**|String|ID of This Request|

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**instanceConfig**|[ConfigItem[]](#ConfigItem)| |
### <a name="ConfigItem">ConfigItem</a>
|Name|Type|Description|
|---|---|---|
|**configName**|String|Now, configName supports the following parameters: <br>maxmemory-policy (both redis 2.8 and redis 4.0 are supported, but their configuration values are not the same): Maximum usage limit for memory elimination policy<br>hash-max-ziplist-entries (both redis 2.8 and redis 4.0 are supported): The hash object realized with the ziplist code, and the maximum entry count threshold in ziplist<br>hash-max-ziplist-value (both redis 2.8 and redis 4.0 are supported): The hash object realized with ziplist and maximum value length in ziplist<br>list-max-ziplist-entries (only redis 2.8 is supported): The list object realized with the ziplist code and maximum entry count threshold in ziplist<br>list-max-ziplist-value (only redis 2.8 is supported): The list object realized with the ziplist code and maximum value length in ziplist<br>list-max-ziplist-size (only redis 4.0 is supported): The list object realized with the ziplist code and the ziplist length defined according to data item count or occupied byte number<br>list-compress-depth (only redis 4.0 is supported): The list object realized with the ziplist code and the number of nodes whose both quicklist ends are not compressed<br>set-max-intset-entries (both redis 2.8 and redis 4.0 are supported): The set object realized with the intset code and the maximum entry count threshold in intset<br>zset-max-ziplist-entries (both redis 2.8 and redis 4.0 are supported): The ordered set object realized with the ziplist code and the maximum entry count threshold in ziplist<br>zset-max-ziplist-value (both redis 2.8 and redis 4.0 are supported): The ordered set object realized with the ziplist code and the maximum value length in ziplist<br>slowlog-log-slower-than (both redis 2.8 and redis 4.0 are supported): The slow query log time-out period, unit: microsecond (1000000 means 1 second), 0 refers to record all commands<br>notify-keyspace-events (only redis 4.0 is supported): incent notification<br>|
|**configValue**|String|Parameter configuration values, default values and reference values are as follows: <br>maxmemory-policy (the default value of both redis 2.8 and redis 4.0 is volatile-lru): The reference values of redis 4.0 include [volatile-lru, allkeys-lru, volatile-lfu, allkeys-lfu, volatile-random, allkeys-random, volatile-ttl, noeviction] and the reference values of redis 2.8 include [volatile-lru , allkeys-lru , volatile-random , allkeys-random , volatile-ttl , noeviction]<br>hash-max-ziplist-entries (the default value of both redis 2.8 and redis 4.0 is 512): [0-10000]<br>hash-max-ziplist-value (the default value of both redis 2.8 and redis 4.0 is 64): [0-10000]<br>list-max-ziplist-entries (the default value of redis 2.8 is 512 and redis 4.0 is not supported): [0-10000]<br>list-max-ziplist-value (the default value of redis 2.8 is 64 and redis 4.0 is not supported): [0-10000]<br>list-max-ziplist-size (the default value of redis 4.0 is -2 and redis 2.8 is not supported): [-5-10000]<br>list-compress-depth (the default value of redis 4.0 is 0 and redis 2.8 is not supported): [0-10000]<br>set-max-intset-entries (the default value of both redis 2.8 and redis 4.0 is 512): [0-10000]<br>zset-max-ziplist-entries (the default value of both redis 2.8 and redis 4.0 is 128): [0-10000]<br>zset-max-ziplist-value (the default value of both redis 2.8 and redis 4.0 is 64): [0-10000]<br>slowlog-log-slower-than (the default value of both redis 2.8 and redis 4.0 is 10000): [0-10000]<br>notify-keyspace-events (the default value of redis 4.0 is null and redis 2.8 is not supported): combination of letters [K , E , g , $ , l , s , h , z , x , e , A], case sensitive or null<br>|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
