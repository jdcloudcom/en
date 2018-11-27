#Best Practice of Anti-DDoS Pro-Application Security Gateway


**Combine Anti-DDoS Pro with Application Security Gateway**

**Plan Description:**

Anti-DDoS Pro +Application Security Gateway provides comprehensive security protection for JD Cloud users without additional performance overhead.

 

**Deployment Plan:**

![img](https://img1.jcloudcs.com/cms/c7a75244-9169-43a6-9059-70ff4240947920180413181942.png) 

​                                                  

Best deployment architecture of Anti-DDoS Pro +Best Application Security Gateway Practice is as follows:

Ø  The security scheduling center of JD Cloud resolves the user domain name to Anti-DDoS Pro CNAME through DNS resolution.

Ø  User normal access traffic and DDoS attack traffic cleaned through Anti-DDoS Pro are backed to the source to JD Cloud Virtual Private Cloud Network Load Balancer Cluster.

Ø  Application Security Gateway is deployed on the Load Balancer to be responsible for Web application layer security protection.

Ø  Application Security Gateway is associated with the Load Balancer, so that it can be used to defend attacks from Internet and internal attacks from VPC.

 

**Plan Advantages:**

1.     Application Security Gateway provides the user exclusive resources, dynamic expansion, whose rules are subject to independent customization, without mutual influence.

2.     Application Security Gateway does not need to depend on DNS scheduling, without additional bandwidth resource consumption, and the network delay is lower than 1ms.

3.     HTTPS Certificate is saved inside the user VPC, and Internet cannot listen and thieve it.

 