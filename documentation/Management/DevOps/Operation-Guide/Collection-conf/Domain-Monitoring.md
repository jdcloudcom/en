# Domain Name Monitoring
## Monitoring Items Description
The purpose of monitoring domain is to detect domain name's availability, response time, etc.

Internet domain name monitoring is to use cdn nodes in different regions as detection source to simulate domain name requests, response time, access success rate of multiple different users; Internet domain name monitoring is to use Internet machines to detect Intranet domain name status in Intranet environment.

| Domain Name Monitoring               | Monitoring Items Name                    | Monitoring Items Meaning       | Unit | Description                                                         |
| --------------------- | ----------------------------- | ---------------- | ---- | ------------------------------------------------------------ |
| Intranet domain name -http semantics monitoring | $ {name}.res_time             | response time         | Millisecond |                                                              |
|                       | $ {name}.status               | Status             |      | 1 presents normal, 0 presents abnormal                                         |
|                       | $ {name}.reason               |                  |      | 0 presents normal, 1 presents connection time-out, 2 presents connection deny, 3 presents connection error, 4 presents request content return is not matched, 5 presents http status code is not matched, 6 presents request sending is failed, 7 presents that reading peer's response is failed |
|                       | ${name}.http_code             | Percentage occupied by status code  | %    | status code of http, which the monitoring item only available when http protocol communication is finished. Otherwise, response time and status code cannot be obtained |
| Internet domain name-http semantics monitoring | $ {name}.res_time             | response time          | millisecond |                                                              |
|                       | ${name} .status.success_ratio | Success rate of access       | %    | count the percentage of all accesses and normal accesses of each operators 0 - 100                  |
|                       | ${name}.http_code.ratio       | Percentage of status code | %    | count percentage of status codes and status codes + operators                        |
| Intranet domain name - tcp semantics monitoring  | $ {name}.res_time             | response time         | millisecond |                                                              |
|                       | $ {name}.status               | Status             |      | 1 presents normal, 0 presents abnormal                                         |
|                       | $ {name}.reason               |                  |      | 0 presents normal, 1 presents connection time-out, 2 presents connection deny, 3 presents connection error, 4 presents request content return is not matched, 5 presents http status code is not matched, 6 presents request sending is failed, 7 presents that reading peer's response is failed |
| Internet domain name - tcp semantics monitoring  | $ {name}.res_time             | response time         | millisecond |                                                              |
|                       | ${name} .status.success_ratio | Success rate of access       | %    | count the percentage of all accesses and normal accesses of each operators 0 - 100                  |
| Intranet domain name - port alive detection    | $ {name}.res_time             | response time         | millisecond |                                                              |
|                       | $ {name}.status               | Status             |      | 1 presents normal, 0 presents abnormal                                         |
|                       | $ {name}.reason               |                  |      | 0 presents normal, 1 presents connection time-out, 2 presents connection deny, 3 presents connection error, 4 presents request content return is not matched, 5 presents http status code is not matched, 6 presents request sending is failed, 7 presents that reading peer's response is failed |
| Internet domain name - port alive detection    | $ {name}.res_time             | response time         | millisecond |                                                              |
|                       | ${name} .status.success_ratio | Success rate of access       | %    | count the percentage of all accesses and normal accesses of each operators 0 - 100                  |
| Intranet domain name - ping monitoring    | $ {name}.res_time             | response time         | millisecond |                                                              |
|                       | $ {name}.status               | Status             |      | 1 presents normal, 0 presents abnormal                                         |
|                       | $ {name}.drop_rate            | percentage of packet loss rate     | %    | weighted average value of packet loss rate of each node 0 - 1                                   |
| Internet domain name - ping monitoring    | $ {name}.res_time             | response time         | millisecond |                                                              |
|                       | ${name} .status.success_ratio | Success rate of access       | %    | count the percentage of all accesses and normal accesses of each operators 0 - 100                  |
|                       | $ {name}.drop_rate            | percentage of packet loss rate     | %    | weighted average value of packet loss rate of each node 0 - 1                                   |



## Operation Guide


Step 1: Select [Intelligent Monitoring] - [Monitoring Configuration] in the menu, select nodes at or below product lines in the service tree at the left side, click **New** on the Acquisition Configuration page as shown in the following figure.

Step 2: Open acquisition configuration new window as shown in the figure. In which,

Monitoring type: Select domain name monitoring

Name: Name of this acquisition task, which will be regarded as the prefix of monitoring indicator, which supports letters, numbers and _, which it must begin with a letter

**Method**: HTTP semantics detection, port alive detection, TCP semantics detection, ping domain name can be used as domain detection methods. TCP semantics detection uses TCP semantics alive detection and port detection to check whether the status and returned contents are correct.

**Network**: Domain name detection scope, Internet domain name monitoring are to use cdn nodes in different regions as detection source to simulate domain name requests, response time, access success rate of multiple different users; Intranet domain name monitoring is to use Intranet machines to detect Intranet domain name status in Intranet environment.

**Domain Name**: Select the domain name to be monitored; please note that ** only domain name is associated with application node in the service tree first ** (Service Tree - Edit Application page), can associated domain name be configured when select corresponding service tree nodes.

Acquisition Cycle: Select acquisition cycle to be configured.

Address: Specific address of detected domain name

Request Method: HTTP request supports three methods of GET, POST, HEAD

Request Head: Enter field pair in http request packet

Matching Status Code: http status code to be matched.

Matching Contents: Fillable contents on the target page, monitor page status through matching results.

Redirection Times: Maximum redirection times allowed by request.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide36.jpg)
