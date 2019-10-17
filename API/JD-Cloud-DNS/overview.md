# JD Cloud DNS OpenAPI APIs


## Introduction
JD Cloud DNS OpenAPI APIs


### Version
v2

## API

## Domain-related API

| Interface Name                  |Request Method | Function Description                   |
| ------------------------- | -------- | -------------------------- |
|**describeDomains**|GET|Get the primary domain list of the user.   <br>Please call this API to get related domainId and domainName before calling a domain-related API.  <br>For relevant concepts of primary domain, please refer to<a href="https://docs.jdcloud.com/en/jd-cloud-dns/product-overview">the JD Cloud DNS document</a>|
|**createDomain**|POST|Add a primary domain  <br>For details about how to add a free domain, please refer to the<a href="https://docs.jdcloud.com/en/jd-cloud-dns/domainadd">document</a><br>For details of adding a charged domain, please refer to the<a href="https://docs.jdcloud.com/en/jd-cloud-dns/purchase-process">document</a>,<br>Before adding a charged domain, please ensure that the user’s JD Cloud account has sufficient funds. Openapi API returns the order number, with which details can be reviewed in a charging system. <br>|
|**modifyDomain**|PUT|Modify primary domain|
|**deleteDomain**|DELETE|Delete primary domain|
|**describeDomainQueryCount**|GET|View resolution times of primary domain|
|**describeDomainQueryTraffic**|GET|View Domain Search Traffic|
## Resolution Record Related API

| Interface Name        | Request Method | Function Description                           |
| --------------- | -------- | ---------------------------------- |
|**describeResourceRecord**|GET|Search resolution record of primary domain.  <br>Please call this API to get the resolution record list before using a resolution record related API. <br>|
|**describeViewTree**|GET|Query all basic resolution ISP lines of JD Cloud resolution.  <br>Please call this API to get ID of resolution ISP Line before using parameters of the resolution ISP Line.|
|**createResourceRecord**|POST|Add resolution record of primary domain|
|**batchSetDnsResolve**|POST|Create, update and import resolution records in batches under the same domain<br></br>For ID of the resolution record, value 0 means adding resolution records, while other values other than 0 mean updating resolution records. </br>|
|**modifyResourceRecord**|PUT|Modify a specific resolution record of primary domain|
|**modifyResourceRecordStatus**|PUT|Enable and disable resolution records under primary domain|
|**deleteResourceRecord**|DELETE|Delete resolution records under primary domain|
|**describeUserView**|GET|Search customized resolution ISP Line of primary domain|
|**describeUserViewIP**|GET|Search customized resolution ISP Line IP segments of primary domain|
|**createUserView**|POST|Add customized resolution ISP Line of primary domain|
|**createUserViewIP**|POST|Add customized resolution ISP Line IP segments of primary domain|
|**deleteUserView**|POST|Delete customized resolution ISP Line of primary domain|
|**deleteUserViewIP**|POST|Delete customized resolution ISP Line IP segments of primary domain|

## Website Monitoring Related APIs

| Interface Name                | Request Method | Function Description                                                     |
| ----------------------- | -------- | ------------------------------------------------------------ |
|**describeMonitor**|GET|View monitoring item configuration and status of primary domain|
|**describeMonitorAlarm**|GET|Monitoring item alarm information of primary domain|
|**describeMonitorTarget**|GET|Search available monitoring object of sub-domain|
|**createMonitor**|POST|Add sub-domain monitoring item, with monitoring added to all sub-domain monitoring items by default|
|**createMonitorTarget**|POST|Add some specific monitoring objects of a sub-domain as the monitoring items|
| **addMonitorTarget**    | POST     | Add some specific monitoring objects of a sub-domain as the monitoring items                         |
|**modifyMonitor**|PUT|Modification of Domain Monitoring Item|
|**modifyMonitorStatus**|PUT|Monitoring item operation set, include: suspension, starting, manual recovery and manual switch|
|**deleteMonitor**|DELETE|Deletion of Monitoring Item|
## Operation and Record Log API

| Interface Name                | Request Method | Function Description                                                     |
| ----------------------- | -------- | ------------------------------------------------------------ |
|**describeActionLog**|GET|View users' operation records under JD Cloud resolution|