# getMonitor


## Description
View the configuration and status of the monitoring items of the main domain

## Request method
GET

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/monitor

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainId**|String|True||Domain Name ID|
|**regionId**|String|True||Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageIndex**|Integer|False||Current page, starting value of 1, default value of 1|
|**pageSize**|Integer|False||Number of rows per page set during paged query|
|**searchValue**|String|False||Query Value|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of this request|
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**currentCount**|Integer|Number of monitoring items of current website page|
|**dataList**|Monitor[]|list of website monitoring items of the current page|
|**totalCount**|Integer|Number of monitoring items of all websites|
|**totalPage**|Integer|Pages for all website monitoring items|
### <a name="Monitor">Monitor</a>
|Name|Type|Description|
|---|---|---|
|**alarmLimit**|Integer|Trigger an alarm several times|
|**canRecover**|Boolean|Is it possible to recover now?|
|**canSwitch**|Boolean|Is it possible to switch now?|
|**clusters**|String|Collection of machine room probe points|
|**domainName**|String|Main Domain Name|
|**hostStatus**|Integer|Machine status, 0 normal, 1 exception|
|**hostValue**|String|Monitoring Object|
|**id**|Integer|Monitor Item ID|
|**ipBackup01**|String|Alternate Address 1|
|**ipBackup01Status**|Integer|Status of the alternate address 1, 0 normal, 1 exception|
|**ipBackup01Type**|Integer|Type of the alternate address 1, 1 ip, 2 domain name|
|**ipBackup02**|String|Alternate Address 2|
|**ipBackup02Status**|Integer|Status of the alternate address 2, 0 normal, 1 exception|
|**ipBackup02Type**|Integer|Type of the alternate address 1, 1 ip, 2 domain name|
|**manualBackup**|String|Manually switched address|
|**manualBackupStatus**|Integer|Status of the manually switched address, 0 normal, 1 exception|
|**manualBackupType**|Integer|Type of the manually switched address, 1 ip, 2 domain name|
|**monitorEnable**|Integer|Monitoring status, turn on monitor 2, suspend monitor 4|
|**monitorFreq**|Integer|Monitoring frequency, in s|
|**monitorPort**|Integer|Monitoring Port|
|**monitorRule**|Integer|Do not modify any 0, forcibly suspend Resolution Record 1 to switch to Alternate Address 2 automatically|
|**monitorUri**|String|Monitoring Path|
|**notifyEmail**|String|Email Address|
|**notifyEmailEnable**|Integer|Do not send mail 0, send mail 1|
|**notifyMsgBarEnable**|Integer|Do not send notification bar 0, send notification bar 1|
|**notifySms**|String|Mobile Number|
|**notifySmsEnable**|Integer|Do not send SMS 0, send SMS 1|
|**protocol**|Integer|https 0，https 1|
|**stopRecoverRule**|Integer|0 automatic recovery, 1 manual recovery|
|**subDomainName**|String|Subdomain|
|**switchRecoverRule**|Integer|0 restore to the main host automatically, 1 restore to the main host manually|
|**type**|Integer|1 A record, 2 CNAME|
|**usedType**|Integer|Usage record, host_value 0, ip_backup_01 1, ip_backup_02 2 and cname_backup 3|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
