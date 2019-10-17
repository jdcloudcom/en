# describeMonitor


## Description
View monitoring item configuration and status of primary domain

## Request Method
GET

## Request Address
https://domainservice.jdcloud-api.com/v2/regions/{regionId}/domain/{domainId}/monitor

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of Instances|
|**domainId**|String|True| |Domain ID, please get it by using the describeDomains API.|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageIndex**|Integer|False| |Current page number, the starting value is 1 and default value is 1|
|**pageSize**|Integer|False| |Rows Set per Page for Search by Pages|
|**searchValue**|String|False| |Searched Value|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|ID of Request at this time|

### Result
|Name|Type|Description|
|---|---|---|
|**currentCount**|Integer|Number of Website Monitoring Item on the Current Page|
|**totalCount**|Integer|Number of All Website Monitoring Items|
|**totalPage**|Integer|Page Number of All Website Monitoring Items|
|**dataList**|Monitor[]|List of Website Monitoring Item on the Current Page|
### Monitor
|Name|Type|Description|
|---|---|---|
|**alarmLimit**|Integer|Trigger the alarm successively for several times|
|**canRecover**|Boolean|Recover now or not|
|**canSwitch**|Boolean|Switch now or not|
|**clusters**|String|Data Center Detection Point Set|
|**domainName**|String|Primary Domain|
|**hostStatus**|Integer|Host status, 0 for normal and 1 for abnormal|
|**hostValue**|String|Monitoring Object|
|**id**|Integer|Monitoring Item ID|
|**ipBackup01**|String|Backup Address 1|
|**ipBackup01Status**|Integer|Status of backup address 1, 0 for normal and 1 for abnormal|
|**ipBackup01Type**|Integer|Type of backup address 1, 1 or ip and 2 for domain|
|**ipBackup02**|String|Backup Address 2|
|**ipBackup02Status**|Integer|Status of backup address 2, 0 for normal and 1 for abnormal|
|**ipBackup02Type**|Integer|Type of backup address 1, 1 or ip and 2 for domain|
|**manualBackup**|String|Address for Manual Switch|
|**manualBackupStatus**|Integer|Status of address for manual switch, 0 for normal and 1 for abnormal|
|**manualBackupType**|Integer|Type of address for manual switch, 1 for ip and 2 for domain|
|**monitorEnable**|Integer|Monitoring Status Enabling Monitoring: 2, Suspending Monitoring: 4|
|**monitorFreq**|Integer|Monitoring frequency, unit: second|
|**monitorPort**|Integer|Monitoring Port|
|**monitorRule**|Integer|No Modification: 0, Suspending Resolution Record by Force: 1, Automatically Switching to Backup Address: 2|
|**monitorUri**|String|Monitoring Path|
|**notifyEmail**|String|Email Address|
|**notifyEmailEnable**|Integer|Send No Email: 0, Send an Email: 1|
|**notifyMsgBarEnable**|Integer|Send No Notification Bar: 0, Send a Notification Bar: 1|
|**notifySms**|String|Mobile Phone Number|
|**notifySmsEnable**|Integer|Send No SMS: 0, Send an SMS: 1|
|**protocol**|Integer|http protocol: 0, https protocol: 1|
|**stopRecoverRule**|Integer|Automatic recovery: 0 Manual recovery: 1|
|**subDomainName**|String|Subdomain|
|**switchRecoverRule**|Integer|Automatically recover to main host: 0, manually recover to main host: 1|
|**type**|Integer|1 refers to A record, 2 refers to CNAME|
|**usedType**|Integer|Use record, host_value 0, ip_backup_01 1, ip_backup_02 2 and cname_backup 3|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
