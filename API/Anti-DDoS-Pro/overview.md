# JD Cloud Anti-DDoS Pro APIs


## Introduction
JD Cloud Anti-DDoS Pro APIs


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**checkName**|GET|Detect Whether the Instance Name is Legal|
|**createForwardRule**|POST|Add a non\-web service rule|
|**createInstance**|POST|Purchase or upgrade Anti-DDoS Pro instance|
|**createWebRule**|POST|Add a web service rule|
|**deleteForwardRule**|DELETE|Delete a non\-web service rule|
|**deleteWebRule**|DELETE|Delete a web service rule|
|**describeAlarmConfig**|GET|Query Alarm Configuration|
|**describeAttackStatistics**|GET|Query the attack counts and traffic peak value|
|**describeAttackTypeCount**|GET|Query the Attack Counts of Various Types|
|**describeCCAttackLogDetails**|GET|Search the cc attack log details|
|**describeCCAttackLogs**|GET|Search the cc attack log|
|**describeCCDefaultThresholds**|GET|Query the CC Customized Default Threshold|
|**describeCCGraph**|GET|CC Defense Traffic Report|
|**describeCertInfo**|POST|Query the Certificate Preview Information|
|**describeDDoSAttackLogs**|GET|Search the DDos attack log|
|**describeDDoSGraph**|GET|DDos Protection Report|
|**describeForwardRule**|GET|Search a non\-web service rule|
|**describeForwardRules**|GET|Search the non\-web forwarding configuration under an instance|
|**describeFwdGraph**|GET|Forwarding Traffic Report|
|**describeGeoAreas**|GET|Query the protection rules of non-web service forwarding rules  Region code may be set for Geo interception|
|**describeInstance**|GET|Search instances|
|**describeInstances**|GET|Search the instance list|
|**describeNameList**|GET|Query the List of Advanced Anti\-DDoS Instance Names|
|**describeProtectionRuleOfForwardRule**|GET|Query the protection rules of non-web service forwarding rules|
|**describeProtectionStatistics**|GET|Query the Statistic Information of Advanced Anti\-DDoS Instance Protection|
|**describeVpcIpList**|GET|Query the JD Cloud IP Resources of Users|
|**describeWebRule**|GET|Search a web service rule|
|**describeWebRules**|GET|Search web service rules under an instance|
|**disableCCIpLimit**|POST|Disable the speed limit of each IP of CC defense|
|**disableCCObserverMode**|POST|Disable the observer mode of instance CC defense|
|**disableInstanceCC**|POST|Disable the instance CC defense|
|**disableInstanceIpBlackList**|POST|Disable instance IP blacklist|
|**disableInstanceIpWhiteList**|POST|关闭实例 IP 白名单|
|**disableInstanceUrlWhiteList**|POST|关闭实例 Url 白名单|
|**disableWebRuleCC**|POST|Web service rules disable CC|
|**downloadCCAttackLogDetails**|GET|Download the CC attack log details|
|**downloadCCAttackLogs**|GET|Download the CC attack log|
|**downloadDDoSAttackLogs**|GET|Download the DDos attack log|
|**enableCCIpLimit**|POST|Enable the speed limit of each IP of CC defense|
|**enableCCObserverMode**|POST|Enable the observer mode of instance CC defense|
|**enableInstanceCC**|POST|Enable the instance CC defense|
|**enableInstanceIpBlackList**|POST|Enable instance IP blacklist|
|**enableInstanceIpWhiteList**|POST|开启实例 IP 白名单|
|**enableInstanceUrlWhiteList**|POST|开启实例 Url 白名单|
|**enableWebRuleCC**|POST|Web service rules enable CC|
|**modifyAlarmConfig**|POST|Update Alarm Configuration|
|**modifyCertInfo**|POST|Edit web service rule certificate information|
|**modifyEPB**|POST|Update the Instance Elastic Protection Bandwidth|
|**modifyForwardRule**|PATCH|Update a non\-web service rule|
|**modifyInstanceCC**|POST|Set the instance CC defense|
|**modifyInstanceIpBlackList**|POST|Set the instance IP blacklist|
|**modifyInstanceIpWhiteList**|POST|Set the instance IP white list|
|**modifyInstanceName**|POST|Modify the instance name|
|**modifyInstanceUrlWhiteList**|POST|Set the instance url white list|
|**modifyProtectionRuleOfForwardRule**|POST|Modify the protection rules of non-web service forwarding rules|
|**modifyWebRule**|PATCH|Modify web service rules|
|**setCCIpLimit**|POST|Set the speed limit of each Ip of instance CC defense|
|**switchForwardRuleOrigin**|POST|Switch non\-web service rules into back\-to\-origin status|
|**switchForwardRuleProtect**|POST|Switch non\-web service rules into defense status|
|**switchWebRuleOrigin**|POST|Switch web service rules into back\-to\-origin status|
|**switchWebRuleProtect**|POST|Switch web service rules into defense status|
