# JD Cloud Resolution OpenAPI APIs


## Introduction
JD Cloud Resolution OpenAPI APIs


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**addDomain**|POST|Add Main Domain Name|
|**addMonitor**|POST|Add monitoring items for subdomains, by default, all monitoring items of subdomains are added to the monitoring|
|**addMonitorTarget**|POST|Add certain monitoring objects as the monitoring items for the subdomains|
|**addRR**|POST|Add a Resolution Record of the Domain Name|
|**addUserView**|POST|Add customized resolution ISP line of domain name|
|**addUserViewIP**|POST|Add customized resolution ISP line of domain name|
|**delDomain**|DELETE|Delete Main Domain Name|
|**delUserView**|POST|Delete customized resolution ISP line of domain name|
|**delUserViewIP**|POST|Delete IP segment of customized resolution ISP line of domain name|
|**getActionLog**|GET|View users' operation records under JD Cloud Resolution|
|**getDomainQueryCount**|GET|View Domain Name Resolutions|
|**getDomainQueryTraffic**|GET|View query traffic of domain names|
|**getDomains**|GET|Query the list of the main domain names under the username. <br>    </br>Please call the API to get related domianId and domainName before calling related API. </br>|
|**getMonitor**|GET|View the configuration and status of the monitoring items of the main domain|
|**getMonitorAlarmInfo**|GET|Alarm Information for Monitoring Items of the Main Domain|
|**getTargets**|GET|Query available monitor objects of subdomains|
|**getUserView**|GET|Query customized resolution ISP line of domain name|
|**getUserViewIP**|GET|Query IP segment of customized resolution ISP line of domain name|
|**getViewTree**|GET|Query all basic resolution ISP lines of JD Cloud Resolution. <br></br>Please call this interface to get the ID of resolution ISP lines before using parameters of resolution ISP lines. </br>|
|**operateMonitor**|POST|Operation Collection for Monitoring Items, including delete, pause, start, manual recovery and manual switch|
|**operateRR**|POST|Enable, disable, or delete the resolution records under the main domain name|
|**searchRR**|GET|Query the Resolution Record of the main domain name. <br></br>Please call this interface to get list of resolution record before using interfaces related to resolution records. </br>|
|**updateDomain**|POST|Modify Main Domain Name|
|**updateMonitor**|POST|Modification of Domain Name Monitoring Items|
|**updateRR**|POST|Modify a Resolution Record of the Main Domain Name|
