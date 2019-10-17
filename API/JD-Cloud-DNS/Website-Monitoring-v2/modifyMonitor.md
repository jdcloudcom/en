# modifyMonitor


## Description
Modification of Domain Monitoring Item

## Request Method
PUT

## Request Address
https://domainservice.jdcloud-api.com/v2/regions/{regionId}/domain/{domainId}/monitor

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of Instances|
|**domainId**|String|True| |Domain ID, please get it by using the describeDomains API.|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**updateMonitor**|UpdateMonitor|True| |Monitoring Item Setting Information|

### UpdateMonitor
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**alarmLimit**|Integer|True| |"Trigger the alarm successively for several times"|
|**id**|Integer|True| |Monitoring Item ID|
|**ipBackup01**|String|True| |Backup Address 1|
|**ipBackup02**|String|True| |Backup Address 2|
|**backupAddressList**|String[]|False| |Backup address list, if this parameter is provided, parameter backup addresses 1 and 2 are not required|
|**monitorEnable**|Integer|True| |Monitoring status Enabling Monitoring: 2, Suspending Monitoring: 4|
|**monitorFreq**|Integer|True| |Monitoring frequency, unit: second|
|**monitorPort**|Integer|True| |Monitoring Port|
|**monitorRule**|Integer|True| |No Modification: 0, Suspending Resolution Record by Force: 1, Automatically Switching to Backup Address: 2|
|**monitorUri**|String|True| |Monitoring Path|
|**notifyEmailEnable**|Integer|True| |Send No Email: 0, Send An Email: 1|
|**notifyMsgBarEnable**|Integer|True| |Send No Notification Bar: 0, Send a Notification Bar: 1|
|**notifySmsEnable**|Integer|False| |Send No SMS: 0, Send an SMS: 1|
|**protocol**|Integer|True| |https 0，https 1|
|**stopRecoverRule**|Integer|True| |0 for automatic recover 1 for manual recovery|
|**switchRecoverRule**|Integer|True| |0: Automatically recover to main host 1: Manually recover to main host|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of Request at this time|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
