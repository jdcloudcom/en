# JD Cloud Anti-DDoS Pro APIs


## Introduction
JD Cloud Anti-DDoS Pro APIs


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**ccGraph**|GET|Forwarding Traffic Report|
|**checkName**|GET|Detect Whether the Instance Name is Legal|
|**createForwardRule**|POST|Add a non\-web service rule|
|**createInstance**|POST|Create an instance|
|**createWebRule**|POST|Add a web service rule|
|**ddosGraph**|GET|DDos Protection Report|
|**deleteForwardRule**|DELETE|Delete a non\-web service rule|
|**deleteWebRule**|DELETE|Delete a web service rule|
|**describeAlarmConfig**|GET|Query Alarm Configuration|
|**describeAttackStatistics**|GET|Query the attack counts and traffic peak value|
|**describeAttackTypeCount**|GET|Query the Attack Counts of Various Types|
|**describeCCDefaultThresholds**|GET|Query the CC Customized Default Threshold|
|**describeCcAttackLogDetails**|GET|Search the cc attack log details|
|**describeCcAttackLogs**|GET|Search the cc attack log|
|**describeCertInfo**|POST|Query the Certificate Preview Information|
|**describeDDosAttackLogs**|GET|Search the DDos attack log|
|**describeForwardRule**|GET|Search a non\-web service rule|
|**describeForwardRules**|GET|Search the non\-web forwarding configuration under an instance|
|**describeInstance**|GET|Search instances|
|**describeInstances**|GET|Search the instance list|
|**describeNameList**|GET|Query the List of Advanced Anti\-DDoS Instance Names|
|**describeProtectionStatistics**|GET|Query the Statistic Information of Advanced Anti\-DDoS Instance Protection|
|**describeVpcIpList**|GET|Query the JD Cloud IP Resources of Users|
|**describeWebRule**|GET|Search a web service rule|
|**describeWebRules**|GET|Search web service rules under an instance|
|**disableCcIpLimit**|POST|Disable the speed limit of each IP of CC defense|
|**disableCcObserverMode**|POST|Disable the observer mode of instance CC defense|
|**disableInstanceCC**|POST|Disable the instance CC defense|
|**disableInstanceIpBlackList**|POST|Disable the instance IP blacklist|
|**disableInstanceIpWhiteList**|POST|Disable the instance IP white list|
|**disableInstanceUrlWhiteList**|POST|Disable the instance url white list|
|**disableWebRuleCC**|POST|Web service rules disable CC|
|**downloadCcAttackLogDetails**|GET|Download the CC attack log details|
|**downloadCcAttackLogs**|GET|Download the CC attack log|
|**downloadDDosAttackLogs**|GET|Download the DDos attack log|
|**enableCcIpLimit**|POST|Enable the speed limit of each IP of CC defense|
|**enableCcObserverMode**|POST|Enable the observer mode of instance CC defense|
|**enableInstanceCC**|POST|Enable the instance CC defense|
|**enableInstanceIpBlackList**|POST|Enable the instance IP blacklist|
|**enableInstanceIpWhiteList**|POST|Enable the instance IP white list|
|**enableInstanceUrlWhiteList**|POST|Enable the instance url white list|
|**enableWebRuleCC**|POST|Web service rules enable CC|
|**fwdGraph**|GET|Forwarding Traffic Report|
|**modifyAlarmConfig**|POST|Update Alarm Configuration|
|**modifyCertInfo**|POST|Edit Certificate|
|**modifyEPB**|POST|Update the Instance Elastic Protection Bandwidth|
|**modifyForwardRule**|PATCH|Update a non\-web service rule|
|**modifyInstanceCC**|POST|Set the instance CC defense|
|**modifyInstanceIpBlackList**|POST|Set the instance IP blacklist|
|**modifyInstanceIpWhiteList**|POST|Set the instance IP white list|
|**modifyInstanceName**|POST|Modify the instance name|
|**modifyInstanceUrlWhiteList**|POST|Set the instance url white list|
|**modifyWebRule**|PATCH|Update a web service rule|
|**setCcIpLimit**|POST|Set the speed limit of each Ip of instance CC defense|
|**switchForwardRuleOrigin**|POST|Switch non\-web service rules into back\-to\-origin status|
|**switchForwardRuleProtect**|POST|Switch non\-web service rules into defense status|
|**switchWebRuleOrigin**|POST|Switch web service rules into back\-to\-origin status|
|**switchWebRuleProtect**|POST|Switch web service rules into defense status|
