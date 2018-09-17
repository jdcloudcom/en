# JMongoDB Service Interface


## 简介
MongoDB Related Interface


### 版本
v1


## API
|接口名称|请求方式|功能描述|
|---|---|---|
|**backupDownloadURL**|GET|Get Backup Download Link|
|**createBackup**|POST|Create Backup|
|**createInstance**|POST|Create Instance|
|**deleteBackup**|DELETE|Delete Backup|
|**deleteInstance**|DELETE|Delete Instance|
|**describeAvailableZones**|GET|Get AZ|
|**describeBackupPolicy**|GET|Get Backup Policy|
|**describeBackups**|GET|View Backup|
|**describeFlavors**|GET|Get Type|
|**describeInstances**|GET|Query Instance Information|
|**describeSecurityIps**|GET|Query Instance Access Whitelist|
|**modifyBackupPolicy**|POST|Modify Backup Policy|
|**modifyInstanceName**|POST|Modify Instance Name|
|**modifyInstanceSpec**|POST|Change Instance Type|
|**modifySecurityIps**|POST|Modify Instance Access Whitelist|
|**resetPassword**|POST||
|**restoreInstance**|POST|Data Recovery|
