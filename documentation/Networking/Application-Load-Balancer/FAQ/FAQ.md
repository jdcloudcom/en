# FAQ

**Q: How to choose among Application Load Balancer, Network Load Balancer or Distributed Network Load Balancer?**

A: We recommend the Load Balancer type as per the following process to maximize the performance experience and minimize the cost of users while satisfying user demands.
![LB类型选择](../../../../image/Networking/ALB/ALB-faq.png)

**Q: Application Load Balancer quota for a single user? **

A: Support the single user to create up to 20 LB in the same region now, if you need to increase the quota, please open ticket or contact the customer service staff.


**Q: Quota limit for Application Load Balancer relevant resource? **

A: 20 listeners, 20 backend services, 20 virtual server groups can be created under one Application Load Balancer instance at most, each virtual server group can be added with 100 sets of backend servers at most.


**Q: Application Load Balancer cannot communicate with backend server instance? **

A: Security Group, ACL of backend VM/container instance must display communication allowed between Application Load Balancer and server instance, it is noted that ACL is stateless rule, which needs to configure inflow and outflow load balancing policies separately.

**Q: Application Load Balancer cannot get client real IP through listening under HTTP/HTTPS Protocol? **

A: Application Load Balancer supports to get client real IP under HTTP/HTTPS Protocol by default, which requests the user to configure correspondingly in web server.

Take nginx as an example: need to install http_realip module, and add the following two configuration items in nginx.conf:

set_real_ip_from subnet IP section where Application Load Balancer is located

real_ip_header X-Forwarded-For

![nginx XFF配置](https://github.com/jdcloudcom/cn/blob/master/image/Networking/ALB/ALB-010.png)

**Q: How do multiple availability zones ensure high availability? **

A: It can only add VM/container in the availability zone where Application Load Balancer is located as backend service, and conduct traffic forwarding according to set scheduling algorithm; when one availability zone has an error, traffic will be automatically converted to other availability zone server.


**Q: How Application Load Balancer backend service to select to associate the virtual server group or availability group? **

A: The virtual server group can add or delete VM instance by the user manually or through associating AS, the manual configuration method is easy to use; the virtual server group can be associated with AS (Auto Scaling) for use to realize high availability across availability zones, but high availability across racks in the same availability zone cannot be ensured. The availability group automatically realizes high availability assignment and auto scaling according to rules for machine instance across AZ, across racks, provides more flexible and more automatic machine assignment service than virtual server group. Therefore, the user can select to associate with virtual server group when requiring simple use, fast command; it is suggested that the user selects to associate with availability group when requiring high availability service.


**Q: Intranet ip resource occupied by one Application Load Balancer instance? **

A: The Application Load Balancer adopts high availability frame architecture in each availability zone, enables two instance resources by default, it also occupies the ip resources of two located subnets, except for vip, thus, the single availability zone will occupy 3 Intranet ips in total, the double availability zone will occupy 5 Intranet ips in total, it needs to occupy 2 more ip resources of two located subnets for supporting one more availability zone, the rest can be done in the same manner.

**Q: When the forwarding rules group is used, why the Application Load Balancer will redirect some requested URLs?**

A: When the URL path of forwarding rules configured by Application Load Balancer ends with '/', and the prefix of another same URL path does not configure under the same domain and there is no forwarding rule with '/', the Application Load Balancer will execute 301 redirect for requests accessing URL path prefix without '/' and return a URL request with '/', so that access requests with '/' and without '/' can both be compatible with and forwarded by Application Load Balancer.

Example 1: Application Load Balancer has configured forwarding rule 1 (domain:aaa. bbb. com, URL path: /path1/abc/or/path/abc/\*, backend service: backend) but did not configure forwarding rule 2 (domain: aaa. bbb. com, URL path: /path/abc, backend service: backend). When the user accesses http:// aaa. bbb . com/path1/abc and the Application Load Balancer receives the access request, it will execute 301 redirect to return http:// aaa. bbb. com/path1/abc/ and the access traffic will match forwarding rule 1 and distribute to backend for processing.

If the user does not want Application Load Balancer to execute 301 redirect, he or she can configure forwarding rule 2 (domain: aaa. bbb. com, URL path: /path1/abc, backend service: backend) to specify the forwarding act of the designated access request http:// aaa. bbb. com/path1/abc through this forwarding rule.

