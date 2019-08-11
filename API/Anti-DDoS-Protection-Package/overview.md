# JD Cloud Anti-DDoS Protection Package APIs


## Introduction
JD Cloud Anti-DDoS Protection Package APIs


### Version
v1


## API
|Interface Name|Request Method|Function Description|
|---|---|---|
|**addProtectedIp**|POST|Add protection IP of protection package.<br>- The protection package can only protect public IP in the region where the protection package instances are located, and such public IP is not protected by other protection packages. If it is protected by other protection packages, please call protection IP API of protection package to delete protection IP<br>- Count of protection IPs to be added to protection package is less than or equal to the difference between the protective IP count of protection package minus protected IP count<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-protection-package/api/describeelasticipresources'>describeElasticIpResources</a> APIs to search elastic IP protected by the protection package<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-protection-package/api/describecpsipresources'>describeCpsIpResources</a> APIs to search public IP of Cloud Physical Server protected by the protection package<br>- Use <a href='http://docs.jdcloud.com/anti-ddos-protection-package/api/describeccsipresources’>describeCcsIpResources</a> APIs to search public IP of Cabinet Service protected by the protection package|
|**checkInstanceName**|GET|Detect if instance name is available, with the protection package instance name unrepeatable|
|**createInstance**|POST|Create Protection Package Instance|
|**deleteProtectedIp**|POST|Delete protection IP of protection package|
|**describeAttackLogs**|GET|Search attack record, with parameter ip priority greater than that of instanceId<br>- When ip parameters are appointed, ignore instanceId parameter and search ip related attack records.<br>- When no ip is appointed, search attack records related to instances appointed by instanceId.<br>- When neither ip nor instanceId is appointed, search all public IP attack records of users|
|**describeAttackSource**|GET|Search Attack Source|
|**describeAttackStatistics**|GET|Attack record statistics, with parameter ip priority greater than that of instanceId.<br>- Ignore instanceId parameter and count ip attacks when ip parameters are appointed.<br>- Count attacks related to instances appointed by instanceId when no ip is appointed.<br>- Search all public IP attacks of the user when neither ip nor instanceId is appointed|
|**describeAttackTypeCount**|GET|Search attack counts of each type for all public IP attack records, with parameter ip priority greater than that of instanceId.<br>- When ip parameters are appointed, ignore instanceId parameters and search attack counts of each type for ip related attack records.<br>- When no ip is appointed, search attack counts of each type for attack records of instances appointed by instanceId<br>- When neither ip nor instanceId is appointed, search attack counts of each type for all public IP attack records of users|
|**describeCcsIpResources**|GET|Search public IP of Cabinet Service protected by Anti-DDoS Protection Package|
|**describeCpsIpResources**|GET|Search public IP of Cloud Physical Server protected by Anti-DDoS Protection Package (including elastic IP of Cloud Physical Server and public IP of basic network instance of Cloud Physical Server)|
|**describeElasticIpResources**|GET|Search VPC elastic IP of Anti-DDoS Protection Package (excluding operator-level NAT reserved address and IPv6)|
|**describeGeoAreas**|GET|Search protection rule  Geo  Intercept settable regions|
|**describeInstance**|GET|Search protection package instance|
|**describeInstances**|GET|Search protection package instance list|
|**describeIpMonitorFlow**|GET|Search the EIP monitoring traffic|
|**describeOperationRecords**|GET|Search operation log|
|**describeProtectedIpList**|GET|Search IP list under protection|
|**describeProtectionOutline**|GET|Protection Information Summary of Protection Package|
|**describeProtectionRule**|GET|Get protection package instance or IP protection rule|
|**modifyInstance**|PATCH|Upgrade protection package instance|
|**modifyInstanceName**|PATCH|Modify protection package instance name|
|**modifyProtectionRule**|POST|Modify protection package instance or IP protection rule|
