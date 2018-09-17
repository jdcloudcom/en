# JD Cloud Resolution OpenAPI APIs


## 简介
JD Cloud Resolution OpenAPI APIs


### 版本
v1


## API
|接口名称|请求方式|功能描述|
|---|---|---|
|**addDomain**|POST|Add Main Domain Name|
|**addMonitor**|POST|Add monitoring items for subdomains, by default, all monitoring items of subdomains are added to the monitoring|
|**addMonitorTarget**|POST|Add certain monitoring objects as the monitoring items for the subdomains|
|**addRR**|POST|Add a resolution record of the domain name|
|**delDomain**|DELETE|Delete Main Domain Name|
|**getDomainQueryCount**|GET|View domain name resolutions|
|**getDomainQueryTraffic**|GET|View query traffic of domain names|
|**getDomains**|GET|Query the list of the main domain names under the username|
|**getMonitor**|GET|View the configuration and status of the monitoring items of the main domain|
|**getMonitorAlarmInfo**|GET|Alarm information for monitoring items of the main domain|
|**getTargets**|GET|Query available monitor objects of subdomains|
|**getViewTree**|GET|Query all basic cloud resolution lines|
|**operateMonitor**|POST|Operation collection for monitoring items, including: delete, pause, start, manual recovery and manual switch|
|**operateRR**|POST|Enable, disable, delete the resolution records under the main domain name|
|**searchRR**|GET|Query the resolution record of the main domain name|
|**updateDomain**|POST|Modify Main Domain Name|
|**updateMonitor**|POST|Modification of domain name monitoring items|
|**updateRR**|POST|Modify a resolution record of the main domain name|
