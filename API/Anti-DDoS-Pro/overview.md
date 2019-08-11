# JD Cloud Anti-DDoS Pro APIs


## Introduction
JD Cloud Anti-DDoS Pro APIs


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**checkName**|GET|Detect Whether the Instance Name is Legal|
|**createBlackListRuleOfWebRule**|POST|Add blacklist rules of web service rules|
|**createCCProtectionRuleOfWebRule**|POST|Add CC defense rules of web service rules|
|**createForwardRule**|POST|Add a non\-web service rule|
|**createInstance**|POST|Purchase or upgrade Anti-DDoS Pro instance|
|**createIpSet**|POST|Add instance IP blacklist and whitelist, pre-defined IP blacklist and whitelist take effect after associating with the blacklist or whitelist of forwarding rules|
|**createWebRule**|POST|Add a web service rule|
|**createWhiteListRuleOfWebRule**|POST|Add whitelist rules of web service rules|
|**deleteBlackListRuleOfWebRule**|DELETE|Delete blacklist rules of web service rule, multiple webBlackListRuleId, separated by ',', can be uploaded in batch operations, when result.code returns 1, representing operation succeeded, when 0, representing all or part of the operations may fail|
|**deleteCCProtectionRuleOfWebRule**|DELETE|Delete CC defense rules of web rules|
|**deleteForwardRule**|DELETE|Delete non-web rule, in batch operations, when result.code returns 1, representing operation succeeded, when 0, representing all or part of the operations may fail|
|**deleteIpSet**|DELETE|Delete instance IP blacklist and whitelist. Support batch operations, multiple ipSetId, separated by ',', can be uploaded in batch operations. Deletion is not allowed when IP blacklist and whitelist rules are referenced|
|**deleteWebRule**|DELETE|Delete web rules. Support batch operations, multiple webRuleId, separated by ',', can be uploaded in batch operations, when result.code returns 1, representing operation succeeded, when 0, representing all or part of the operations may fail|
|**deleteWhiteListRuleOfWebRule**|DELETE|Delete whitelist rules of web service rule, multiple webWhiteListRuleId, separated by ',', can be uploaded in batch operations, when result.code returns 1, representing operation succeeded, when 0, representing all or part of the operations may fail|
|**describeAlarmConfig**|GET|Query Alarm Configuration|
|**describeAttackStatistics**|GET|Query the attack counts and traffic peak value|
|**describeAttackTypeCount**|GET|Query the Attack Counts of Various Types|
|**describeBlackListRuleOfForwardRule**|GET|Search blacklist rules of forwarding rules|
|**describeBlackListRuleOfWebRule**|GET|Search blacklist rules of web service rules|
|**describeBlackListRulesOfWebRule**|GET|Search blacklist rules list of web service rules|
|**describeCCAttackLogDetails**|GET|Search CC attack log detail.<br>- with parameter attackId priority greater than that of instanceId, when attackId is not null, ignore instanceId<br>|
|**describeCCAttackLogs**|GET|Search the cc attack log|
|**describeCCGraph**|GET|CC Defense Traffic Report|
|**describeCCProtectionConfigOfWebRule**|GET|Search CC defense configuration of web service rules|
|**describeCCProtectionDefaultConfigOfWebRule**|GET|Search CC defense default configuration of web service rules|
|**describeCCProtectionRuleOfWebRule**|GET|Search CC defense rules of web service rules|
|**describeCCProtectionRulesOfWebRule**|GET|Search CC defense rules list of web service rules|
|**describeCpsIpList**|GET|Search users can be set as JD Cloud's Cloud Physical Server public IP resources of web service rule back-to-origin IP|
|**describeDDoSAttackLogs**|GET|Search DDoS attack log|
|**describeDDoSGraph**|GET|DDos Protection Report|
|**describeForwardRule**|GET|Search a non\-web service rule|
|**describeForwardRules**|GET|Search the non\-web forwarding configuration under an instance|
|**describeFwdGraph**|GET|Forwarding Traffic Report|
|**describeGeoAreas**|GET|Query the protection rules of non-web service forwarding rules  Region code may be set for Geo interception|
|**describeInstance**|GET|Search instances|
|**describeInstances**|GET|Search the instance list|
|**describeIpSet**|GET|Search instance IP blacklist and whitelist|
|**describeIpSetUsage**|GET|Search instance IP blacklist and whitelist usage information|
|**describeIpSets**|GET|Search instance IP blacklist and whitelist database list|
|**describeNameList**|GET|Query the List of Advanced Anti\-DDoS Instance Names|
|**describeProtectionRuleOfForwardRule**|GET|Query the protection rules of non-web service forwarding rules|
|**describeProtectionStatistics**|GET|Query the Statistic Information of Advanced Anti\-DDoS Instance Protection|
|**describeVpcIpList**|GET|Search users can be set as elastic IP resources within JD Cloud of web service rule back-to-origin IP|
|**describeWebRule**|GET|Search a web service rule|
|**describeWebRuleBlackListGeoAreas**|GET|In searching blacklist of Geo mode of web service forwarding rules, the region code can be set|
|**describeWebRuleBlackListUsage**|GET|Search blacklist usage information of web service protection rules|
|**describeWebRuleWhiteListGeoAreas**|GET|In searching whitelist of Geo mode of web service forwarding rules, the region code can be set|
|**describeWebRuleWhiteListUsage**|GET|Search whitelist usage information of web service protection rules|
|**describeWebRules**|GET|Search web service rules under an instance|
|**describeWhiteListRuleOfForwardRule**|GET|Search whitelist rules of forwarding rules|
|**describeWhiteListRuleOfWebRule**|GET|Search whitelist rules of web service rules|
|**describeWhiteListRulesOfWebRule**|GET|Search whitelist rules list of web service rules|
|**disableBlackListRuleOfForwardRule**|POST|Disable blacklist rules of forwarding rules|
|**disableBlackListRuleOfWebRule**|POST|Disable blacklist rules of web service rule, multiple webBlackListRuleId, separated by ',', can be uploaded in batch operations, when result.code returns 1, representing operation succeeded, when 0, representing all or part of the operations may fail|
|**disableCCProtectionRuleOfWebRule**|POST|Disable CC defense rules of web service rules|
|**disableWebRuleBlackList**|POST|Disable blacklist of web service rules|
|**disableWebRuleCC**|POST|Disable CC defense of web service rules, CC defense rules of web service rules and CC defense configuration becomes invalid. Support batch operations, multiple webRuleId, separated by ',', can be uploaded in batch operations, when result.code returns 1, representing operation succeeded, when 0, representing all or part of the operations may fail|
|**disableWebRuleCCObserverMode**|POST|Disable CC observer mode of web service rules, CC defense only alarms and does not defense in observe mode. Support batch operations, multiple webRuleId, separated by ',', can be uploaded in batch operations, when result.code returns 1, representing operation succeeded, when 0, representing all or part of the operations may fail|
|**disableWebRuleWhiteList**|POST|Disable whitelist of web service rules|
|**disableWhiteListRuleOfForwardRule**|POST|Disable whitelist rules of forwarding rules|
|**disableWhiteListRuleOfWebRule**|POST|Disable whitelist rules of web service rule, multiple webWhiteListRuleId, separated by ',', can be uploaded in batch operations, when result.code returns 1, representing operation succeeded, when 0, representing all or part of the operations may fail|
|**enableBlackListRuleOfForwardRule**|POST|Enable blacklist rules of forwarding rules|
|**enableBlackListRuleOfWebRule**|POST|Enable blacklist rules of web service rule, multiple webBlackListRuleId, separated by ',', can be uploaded in batch operations, when result.code returns 1, representing operation succeeded, when 0, representing all or part of the operations may fail|
|**enableCCProtectionRuleOfWebRule**|POST|Enable CC defense rules of web service rules|
|**enableWebRuleBlackList**|POST|Enable blacklist of web service rules|
|**enableWebRuleCC**|POST|Enable CC defense for the web service rules, after enabling, protection rules configured for the web service rules and CC defense configuration take effect, when no CC defense is configured, the default CC defense configuration takes effect. Support batch operations, multiple webRuleId, separated by ',', can be uploaded in batch operations, when result.code returns 1, representing operation succeeded, when 0, representing all or part of the operations may fail|
|**enableWebRuleCCObserverMode**|POST|Enable CC observer mode of web service rules, CC defense only alarms and does not defense in observe mode. Support batch operations, multiple webRuleId, separated by ',', can be uploaded in batch operations, when result.code returns 1, representing operation succeeded, when 0, representing all or part of the operations may fail|
|**enableWebRuleWhiteList**|POST|Enable whitelist of web service rules|
|**enableWhiteListRuleOfForwardRule**|POST|Enable whitelist rules of forwarding rules|
|**enableWhiteListRuleOfWebRule**|POST|Enable whitelist rules of web service rule, multiple webWhiteListRuleId, separated by ',', can be uploaded in batch operations, when result.code returns 1, representing operation succeeded, when 0, representing all or part of the operations may fail|
|**modifyAlarmConfig**|POST|Update Alarm Configuration|
|**modifyBlackListRuleOfForwardRule**|PATCH|Modify blacklist rules of forwarding rules|
|**modifyBlackListRuleOfWebRule**|PATCH|Modify blacklist rules of web service rules|
|**modifyCCProtectionConfigOfWebRule**|PATCH|Modify CC defense configuration of web service rules|
|**modifyCCProtectionRuleOfWebRule**|PATCH|Modify CC defense rules of web service rules|
|**modifyCertInfo**|POST|Edit web service rule certificate information|
|**modifyEPB**|POST|Update the Instance Elastic Protection Bandwidth|
|**modifyForwardRule**|PATCH|Update a non\-web service rule|
|**modifyInstanceName**|POST|Modify the instance name|
|**modifyProtectionRuleOfForwardRule**|POST|Modify the protection rules of non-web service forwarding rules|
|**modifyWebRule**|PATCH|Modify web service rules|
|**modifyWhiteListRuleOfForwardRule**|PATCH|Modify whitelist rules of forwarding rules|
|**modifyWhiteListRuleOfWebRule**|PATCH|Modify whitelist rules of web service rules|
|**switchForwardRuleOrigin**|POST|Switch non\-web service rules into back\-to\-origin status|
|**switchForwardRuleProtect**|POST|Switch non\-web service rules into defense status|
|**switchWebRuleOrigin**|POST|Switch web service rules into back\-to\-origin status|
|**switchWebRuleProtect**|POST|Switch web service rules into defense status|
