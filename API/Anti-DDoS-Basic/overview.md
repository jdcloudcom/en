# Anti-DDoS Basic APIs


## Introduction
Anti-DDoS Basic protection IP and attack record APIs


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**describeAttackLogs**|GET|Search attack record|
|**describeAttackStatistics**|GET|Attack Statistics|
|**describeAttackTypeCount**|GET|Search attack counts of various types|
|**describeCcsIpResources**|GET|Search security information of Cabinet Service IP protected by Anti-DDoS Basic|
|**describeCpsIpResources**|GET|Search security information of Cloud Physical Server public IP protected by Anti-DDoS Basic, including public IP and elastic IP of Cloud Physical Server.<br>|
|**describeElasticIpResources**|GET|Search security information of elastic IP of VPC protected by Anti-DDoS Basic, including VPC elastic IP (except reserved address of operator-level NAT)<br>|
|**describeIpCleanThresholdRange**|GET|Search public IP to set cleaning threshold range, supporting ipv4 and ipv6|
|**describeIpMonitorFlow**|GET|Search monitoring traffic of multiple public IPs, supporting ipv4 and ipv6|
|**describeIpResourceFlow**|GET|Search monitoring traffic within 15 minutes before endTime of public IP, only supporting ipv4. (obsolete, <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeipmonitorflow'>describeIpMonitorFlow</a> APIs are recommended)<br>|
|**describeIpResourceInfo**|GET|Search public IP security information, only supporting ipv4. (obsolete, <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeipsafetyinfo'>describeIpSafetyInfo</a> APIs are recommended)<br>|
|**describeIpResourceProtectInfo**|GET|Search public IP attack record, only supporting ipv4. (obsolete, <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeattacklogs'>describeAttackLogs</a> APIs are recommended)<br>|
|**describeIpResources**|GET|Search security information list of public IP protected by Anti-DDoS Basic, including VPC elastic IP (except reserved address of operator-level NAT), public IP and elastic IP of Cloud Physical Server. (obsolete, <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describeelasticipresources'>describeElasticIpResources</a>, <a href='http://docs.jdcloud.com/anti-ddos-basic/api/describecpsipresources'>describeCpsIpResources</a> APIs are recommended)|
|**describeIpSafetyInfo**|GET|Search security information of public IP protected by Anti-DDoS Basic, supporting ipv4 and ipv6|
|**setCleanThreshold**|POST|Set cleaning threshold of public IP protected by Anti-DDoS Basic, only supporting ipv4. (obsolete, <a href='http://docs.jdcloud.com/anti-ddos-basic/api/setipcleanthreshold'>setIpCleanThreshold</a> APIs are recommended)<br>|
|**setIpCleanThreshold**|POST|Set cleaning threshold of public IP protected by Anti-DDoS Basic, supporting ipv4 and ipv6|
