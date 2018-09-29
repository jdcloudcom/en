# Enumeration Type Definition

- [engine RDS Engine Type](Enum-Definitions#engine-rds-engine-type)
- [engineVersion RDS Engine Version](Enum-Definitions#engineversion-rds-engine-version)
- [instanceStatus Instance Status](Enum-Definitions#instancestatus-instance-status)
- [dbStatus Database Status](Enum-Definitions#dbstatus-database-status)
- [accountStatus Account Status](Enum-Definitions#accountstatus-account-status)
- [privilege Database Access](Enum-Definitions#privilege-database-access)
- [characterSetName Database Character Set](Enum-Definitions#charactersetname-database-character-set)
- [sqlAuditStatus Data Audit Status](Enum-Definitions#sqlauditstatus-data-audit-status)
- [connectionMode Access Mode](Enum-Definitions#connectionmode-access-mode)
- [backupStatus Backup Status](Enum-Definitions#backupstatus-backup-status)
- [backupType Backup Type](Enum-Definitions#backuptype-backup-type)
- [backupMode Backup Mode](Enum-Definitions#backupmode-backup-mode)
- [backupUnit Backup Granularity](Enum-Definitions#backupunit-backup-granularity)

## engine RDS Engine Type
<div id="engine-rds-engine-type"></div>

|Value|Description|
|-|-|
|MySQL|MySQL Database Engine|
|MariaDB|MariaDB Database Engine|
|Percona|Percona Database Engine|
|SQL Server|SQL Server Database Engine, note that there are spaces in the middle|

## engineVersion RDS Engine Version
<div id="engineversion-rds-engine-version"></div>

|Value|Description|
|-|-|
|5.6|MySQL 5.6 Version|
|5.7|MySQL 5.7 Version|
|2008R2 EE|SQL Server 2008R2 Enterprise Version|
|2012 EE|SQL Server 2012 Enterprise Version|
|2014 EE|SQL Server 2014 Enterprise Version|
|2016 EE|SQL Server 2016 Enterprise Version|
|2012 SE|SQL Server 2012 Standard Version|
|2014 SE|SQL Server 2014 Standard Version|
|2016 SE|SQL Server 2016 Standard Version|
|2012 Web|SQL Server 2012 Web Version|
|2014 Web|SQL Server 2014 Web Version|
|2016 Web|SQL Server 2016 Web Version|

## instanceStatus Instance Status
<div id="instancestatus-instance-status"></div>

|Value|Description|
|-|-|
|BUILDING|Pending|
|RUNNING|Running|
|BUILD_ERROR|Create Error|
|DELETED|Deleted|
|DELETING|Deleting|
|DELETE_ERROR|Delete Error|
|FAILOVER|Failovering|
|FAILOVER_ERROR|Active/Failover Error|
|RESTORING|Local Replacing and Restoring |
|RESTORE_ERROR|Local Replace and Restore Error|
|DB_RESTORING|Cloud on Single Database/Backup of Single Database Restoring|
|DB_RESTOR_ERROR|Cloud on Single Database/Restoration of Single Database Backup Fails|
|MIGRATING|Migrating|
|MIGRATE_ERROR|Migration Error|
|GROWING_CLUSTER|Adding Instance|
|SHRINKING_CLUSTER|Reducing Instance|
|REBOOTING|Rebooting|
|REBOOT_ERROR|Reboot Error|

## dbStatus Database Status
<div id="dbstatus-database-statu"></div>

|Value|Description|
|-|-|
|BUILDING|Pending|
|RUNNING|Running|
|DELETING|Deleting|
|DELETE_ERROR|Delete Error|
|ERROR|Exception|

## accountStatus Account Status
<div id="accountstatus-account-status"></div>

|Value|Description|
|-|-|
|BUILDING|Pending|
|RUNNING|Running|
|DELETING|Deleting|
|DELETE_ERROR|Delete Error|
|ERROR|Exception|

## privilege Database Access Privilege
<div id="privilege-database-access"></div>

|Value|Description|
|-|-|
|ro|Read Only|
|rw|Read-Write|

## characterSetName Database Character Set
<div id="charactersetname-database-character-set"></div>

|Value|Description|
|-|-|
|utf8|MySQL Character Set|
|Chinese_PRC_CI_AS|SQL Server Character Set|
|Chinese_PRC_CS_AS|SQL Server Character Set|
|SQL_Latin1_General_CP1_CI_AS|SQL Server Character Set|
|SQL_Latin1_General_CP1_CS_AS|SQL Server Character Set|
|Chinese_PRC_BIN|SQL Server Character Set|

## sqlAuditStatus Data Audit Status
<div id="sqlauditstatus-data-audit-status"></div>

|Value|Description|
|-|-|
|off|Off (default)|
|on|On|

## connectionMode Access Mode
<div id="connectionmode-access-mode"></div>

|Value|Description|
|-|-|
|standard|Standard Access Mode (default)|
|security|High Security Access Mode|

## backupStatus Backup Status
<div id="backupstatus-backup-status"></div>

|Value|Description|
|-|-|
|COMPLETED|Backup Success|
|ERROR|Backup Error|
|BUILDING|In the Backup|
|DELETING|Deleting|
|DELETE_ERROR|Delete Error|
|RETAINED|Instance is deleted, and backup is reserved|

## backupType Backup Type
<div id="backuptype-backup-type"></div>

|Value|Description|
|-|-|
|full|Full Backup|
|diff|Incremental Backup|

## backupMode Backup Mode
<div id="backupmode-backup-mode"></div>

|Value|Description|
|-|-|
|auto|System Automatic Backup|
|manual|Manual Backup|

## backupUnit Backup Granularity
<div id="backupunit-backup-granularity"></div>

|Value|Description|
|-|-|
|instance|Instance Backup|
|database|Database Backup|
