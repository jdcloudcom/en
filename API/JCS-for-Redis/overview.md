# JDCloud Redis API


## Introduction
Relevant APIs of JCS for Redis


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**createBackup**|POST|Create and execute Redis instance backup instance, which can only be manually backed up. The backup file name can be set|
|**createCacheInstance**|POST|Create one Redis instance with designated configuration: The master-slave version or the cluster version is available, each type is divided into several specifications (divided according to CPU core number, memory capacity, disk capacity, bandwidth, etc.) and please refer to the product specification code for details, https://docs.jdcloud.com/en/jcs-for-redis/specifications<br>|
|**deleteCacheInstance**|DELETE|Delete Redis instances with expired Pay By Configuration or Monthly Package and those with unexpired Monthly Package cannot be deleted. <br>Instances in the running or error status only can be deleted, while cannot be deleted in other status. <br>For the White List user, the expired Redis instance in Monthly Package cannot be deleted. <br>|
|**describeBackupPolicy**|GET|Search automatic backup policy of Redis instance|
|**describeBackups**|GET|Search Redis instance backup result (backup file list), with start time or backup task ID displayed by pages and designated|
|**describeCacheInstance**|GET|Search detailed information of Redis instances|
|**describeCacheInstances**|GET|Search Redis instance list, with available functions such as paging, ranking, search and filter|
|**describeClusterInfo**|GET|Search internal cluster information of Redis instance|
|**describeDownloadUrl**|GET|Backup file temporary download link for getting Redis instance|
|**describeInstanceClass**|GET|Search Redis Instance Type List under one region|
|**describeInstanceConfig**|GET|View current configuration parameter of Redis instance|
|**describeSlowLog**|GET|Get slog search log of Redis instance|
|**describeUserQuota**|GET|Search Redis quota information of the account|
|**modifyBackupPolicy**|PATCH|Modify automatic backup policy for Redis instances, with backup period and backup time modifiable|
|**modifyCacheInstanceAttribute**|PATCH|Modify the resource name and description of Redis instance, alternatively|
|**modifyCacheInstanceClass**|POST|Change Redis instance type (configuration change), only the running instance type can be changed and the specification shall be different to the original one after change. <br>If the Pay-In-Advance user intends to change the configuration from the cluster version to the master-slave version, the memory size of new specification shall be greater than that of the original specification, while the memory size of new specification shall be no less than that of the original specification for configuration change from the master-slave version to the cluster version. <br>|
|**modifyInstanceConfig**|POST|Modify configuration parameter of Redis instance and support modification to a part of parameters|
|**resetCacheInstancePassword**|POST|Reset Redis instance password which can be null|
|**restoreInstance**|POST|Recover to a backup of Redis instance|
