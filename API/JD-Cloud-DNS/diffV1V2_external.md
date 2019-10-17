### Terminology

| Chinese Name   | English Name                |
| ---------- | ----------------------- |
| Primary Domain     | Domain                  |
| Resolution Record   | Resource Record, RR for short |
| Website Monitoring Item | Monitor                 |

New SDK service code of JD Cloud DNS: domainservice

For most APIs, the API names are changed only and the input parameters remain the same.

For some API resource IDs placed in URI, their input parameters shall be changed. For example, if resolution record API modifyResourceRecord is changed, the resolution record ID parameter shall be arranged in URI and the input parameters shall be combined with RRId.

Specific API changes are as follows:

### Domain Type API

| v1 API Name                                 | v2 API Name                          | Remark |
| ----------------------------------------- | ---------------------------------- | --------- |
| getDomains Search primary domain                     | Please use describeDomains API | Add unavailable parameter domainName |
| addDomain Add primary domain                       | createDomain                       | Change API name only |
| delDomain Delete primary domain                      | deleteDomain           | Place domainId in URI |
| updateDomain Modify primary domain                   | modifyDomain                       | Place domainId in URI |
| getDomainQueryCount View resolution times of primary domain  | describeDomainQueryCount           | Change API name only |
| getDomainQueryTraffic  view domain query traffic | describeDomainQueryTraffic         | Change API name only |
| getAllNoticeItem Search warning information             | describeNoticeItems                | Change API name only |



### Resolution Record Type API

| v1 API Name                          | v2 API Name                         | Remark                                            |
| --------------------------------- | --------------------------------- | ----------------------------------------------- |
| searchRR Search resolution record of primary domain     | describeResourceRecord            | Add unavailable parameter search                            |
| addRR Add primary domain resolution record        | createResourceRecord              | Change API name only                                  |
| getViewTree  Search all DNS Resolution ISP Lines  | describeViewTree                  | Change API name only                                  |
| updateRR Modify domain resolution record       | modifyResourceRecord              | Place RRId in  URI                                   |
| operateRR  Domain Resolution Record Operation Set | deleteResourceRecord              | Place RRId in URI and use this API to delete resolution records        |
| operateRR APIs are used for deletion and other conditions | modifyResourceRecordStatus        | Place RRId in URI and please use this API to change resolution record status. |
| setLB Load Balancer for Setting Domain Resolution Record  | createResourceRecordLoadBalance   | Change API name only                                  |
| getLB View Load Balancer of Domain Resolution Record | describeResourceRecordLoadBalance | Change API name only                                  |



### Customized ISP Line API

| v1 API Name      | v2 API Name          | Remark              |
| ------------- | ------------------ | ----------------- |
| addUserView   | createUserView     | Place domainId in URI |
| delUserView   | deleteUserView     | Place domainId in URI |
| getUserView   | describeUserView   | Place domainId in URI |
| addUserViewIP | createUserViewIP   | Place domainId in URI |
| delUserViewIP | deleteUserViewIP   | Place domainId in URI |
| getUserViewIP | describeUserViewIP | Place domainId in URI |



### Website Monitoring

| v1 API Name            | v2 API Name                | Remark |
| ------------------- | ------------------------ | ------------------------ |
| getMonitor          | describeMonitor          | Change API name only |
| addMonitor          | createMonitor            | Change API name only |
| updateMonitor       | modifyMonitor            | Change API name only |
| getTargets          | describeSubDomainTargets | Change API name only |
| addMonitorTarget    | createMonitorTarget      | Change API name only |
| operateMonitor      | modifyMonitorStatus      | Place monitorId in URI and delete monitoring items with is API |
|                     | deleteMonitor            | Place monitorId in URI and please carry out other operations of monitoring items with this API |
| getMonitorAlarmInfo | describeMonitorAlarm | Change API name only |

### Other APIs

| v1 API Name     | v2 API Name         | Remark           |
| ------------ | ----------------- | -------------- |
| getActionLog | describeActionLog | Change API name only |

