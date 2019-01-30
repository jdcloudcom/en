# Parameter Modification

Parameter modification opens nine parameters for user modification. Parameter modification operation steps are:

1. Log in Redis management console and select the target instance;

2. Click instance name to go to the instance resource information page;

3. Select parameter modification tag in the tag field;

4. Click **Modify Current Running Value** on the top right corner and users can enter a new current running value;

5. Click **Save Modification** on the top right corner after entering.

- Parameter Description Sheet is attached

Parameter Name|Parameter Description|Default Value|Parameter Range
:--|:--|:--|:--
maxmemory-policy|Data removal policy at maximum memory utilization rate|volatile-lru|volatile-lru,allkeys-lru,volatile-random,allkeys-random,volatile-ttl,noeviction, 4.0 version multiple allkeys-lfu,volatile-random
hash-max-ziplist-entries|When the count of key of hash is not greater than the specified value, use special storage (ZIPLIST) to save space|512|0-10000
hash-max-ziplist-value|When the length of FIELD and VALUE is not greater than the specified value, use special storage (ZIPLIST) to save bucket|64|0-10000
list-max-ziplist-entries(2.8 version)|When the list data is not greater than the specified value, use special code (ziplist) to save bucket|512|0-10000
list-max-ziplist-value(2.8 version)|When the length of value is not greater than the specified value, use special code (ziplist) to save bucket|64|0-10000
list-max-ziplist-size(4.0 version)|Use the list object implemented by ziplist code to limit the length of ziplist based on the number of data items or occupied bytes|-2|-5-10000
list-compress-depth(4.0 version)|Use the list object implemented by ziplist code, the number of nodes that are not compressed at both ends of quicklist|0|0-10000
set-max-intset-entries|When the count of set is not greater than the specified value, use special code (intset) to save bucket|512|0-10000
zset-max-ziplist-entries|When the count of zset element is not greater than the specified value, use special code (ziplist) to save bucket|128|0-10000
zset-max-ziplist-value|When the maximum length of element value is not greater than the specified value, use special code (ziplist) to save bucket|64|0-10000
slowlog-log-slower-than|The maximum execution time of slow log function record command, unit: μs|10000|0-10000

