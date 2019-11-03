# Restrictions

When you use Message Queue, there are some restrictions to pay attention.

### Resource Restriction  
| Restriction Items	| Adjust or Not	| Adjust Method |
| :- | :- | :- |
|TPS of each Topic is 5000 (Public Network Area is 500)|Yes|Ticket|
|The quota for single-region user-created topics is 10|Yes|Ticket|
| The life cycle ( persistent storage time ) of the message is 3 days|No|－|
|Time-out period receiving message confirmation (extract message hidden duration) is 30s|Yes	|Console or OpenAPI modification, range 30s-600s|
| The maximum size of the message is 256KB|No|－|
| After the failure of message consumption, the maximum number of attempts to retry is 16 times|Yes|Console or OpenAPI modification, range 0-16 times|


### Network Restriction  
| Restriction Items	| Adjustable or Not	| Description |
| :- | :- | :- |
|Region: cn-north-1, cn-east-2, users can only access services from VPC|No|A user's VPC can access Message Queue service by default. If you need to specially set ACL rules for VPC, please add the following rules in inbound rules and outbound rules in order to guarantee the access linkage with the Message Queue service:<br/> 1. If messages are received and sent through TCP SDK, the rule type shall be ALL TCP, the target/source IP shall be set as 100.72.13.0/24 and the policy shall be acceptance<br/> 2. If messages are received and sent through Http, the rule type shall be http, the target/source IP shall be set as 100.72.13.0/24 and the policy shall be acceptance|
|Region: Public network (North China), users can only access services from public network|No|—|
