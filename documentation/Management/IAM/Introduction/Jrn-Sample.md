# Cloud product JRN examples supporting IAM

 | Product Line Name   |                           JRN Example                            |
| :----------- | :---------------------------------------------------------- |
| DDoS         |        jrn:baseanti:region:accountid:ipResources/{ip}        |
| Application Security Gateway |      jrn:vpcwaf:region:accountid:instances/{instanceId}      |
| Load Balancer     | jrn:lb:region:accountid:loadBalancers/{loadBalancerId}<br>jrn:lb:region:accountid:loadBalancers/{loadBalancerId}/backends/{backendId}<br>jrn:lb:region:accountid:loadBalancers/{loadBalancerId}/listeners/{listenerId}<br>jrn:lb:region:accountid:loadBalancers/{loadBalancerId}/targetGroups/{targetGroupId}<br>jrn:lb:region:accountid:ruleMaps/{ruleMapId} |
| POD          | jrn:pod:region:accountid:pods/{podId}<br>jrn:pod:region:accountid:pods/{podId}/containers/{containerName}<br/>jrn:pod:region:accountid:secrets/{name} |
| Message Queue JCQ  | jrn:jcq:region:accountid:/topics/{topicName}<br/>jrn:jcq:region:accountid:/topics/{topicName}/subscriptions/{consumerGroupId} |
