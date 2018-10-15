# getMonitor


## Description
View the configuration and status of the monitoring items of the main domain

## Request method
GET

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/monitor

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainId**|String|True| |Domain Name ID|
|**regionId**|String|True| |Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageIndex**|Integer|False| |Current page, starting value is 1, default value is 1|
|**pageSize**|Integer|False| |Number of Rows Per Page Set During the Page Query|
|**searchValue**|String|False| |Query Value|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Request|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**currentCount**|Integer|Number of Monitoring Items of Current Website Page|
|**dataList**|Monitor[]|List of Website Monitoring Items of the Current Page|
|**totalCount**|Integer|Number of Monitoring Items of All Websites|
|**totalPage**|Integer|Pages for All Website Monitoring Items|
### Monitor
|Name|Type|Description|
|---|---|---|
|**alarmLimit**|Integer|Trigger an alarm several times|
|**canRecover**|Boolean|Is it possible to recover now?|
|**canSwitch**|Boolean|Is it possible to switch now?|
|**clusters**|String|Collection of machine room probe points|
|**domainName**|String|Main Domain Name|
|**hostStatus**|Integer|Machine Status, 0 Normal, 1 Exception|
|**hostValue**|String|Monitoring Object|
|**id**|Integer|Monitor Item ID|
|**ipBackup01**|String|Alternate Address 1|
|**ipBackup01Status**|Integer|Status of Alternate Address 1, 0 Normal, 1 Exception|
|**ipBackup01Type**|Integer|Type of Alternate Address 1, 1 ip, 2 Domain name|
|**ipBackup02**|String|Alternate Address 2|
|**ipBackup02Status**|Integer|Status of Alternate Address 2, 0 Normal, 1 Exception|
|**ipBackup02Type**|Integer|Type of Alternate Address 1, 1 ip, 2 Domain name|
|**manualBackup**|String|Manually Switched Address|
|**manualBackupStatus**|Integer|Status of Manually Switched Address, 0 Normal, 1 Exception|
|**manualBackupType**|Integer|Type of  Manually Switched Address, 1 ip, 2 Domain name|
|**monitorEnable**|Integer|Monitoring Status  Turn on monitor 2, Suspend monitor 4|
|**monitorFreq**|Integer|Monitoring Frequency, Unit: s|
|**monitorPort**|Integer|Monitoring Port|
|**monitorRule**|Integer|Do not modify any 0, forcibly suspend Resolution Record 1 to switch to Alternate Address 2 automatically|
|**monitorUri**|String|Monitoring Path|
|**notifyEmail**|String|Email Address |
|**notifyEmailEnable**|Integer|Do not send mail 0, send mail 1|
|**notifyMsgBarEnable**|Integer|Do not send notification bar 0, send notification bar 1|
|**notifySms**|String|Mobile Number|
|**notifySmsEnable**|Integer|Do not send SMS 0, send SMS 1|
|**protocol**|Integer|https 0, https 1|
|**stopRecoverRule**|Integer|0 Automatic Recovery, 1 Manual Recovery|
|**subDomainName**|String|Subdomain|
|**switchRecoverRule**|Integer|0 Restore to the main host automatically, 1 Restore to the main host manually|
|**type**|Integer|1 A record, 2 CNAME|
|**usedType**|Integer|Usage Record, host_value 0, ip_backup_01 1, ip_backup_02 2 and cname_backup 3|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
