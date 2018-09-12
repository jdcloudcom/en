# FAQ

**Q: Load balancer quota for a single user? **

A: Support the single user to create up to 20 LB in the same region now, if you need to increase the quota, please open ticket or contact the customer service staff.


**Q: Quota limit for load balancer relevant resource? **

A: 20 listeners, 20 backend services, 20 virtual server groups can be created under one load balancer instance at most, each virtual server group can be added with 100 sets of backend servers at most.


**Q: Load balancer cannot communicate with backend server instance? **

A: Security Group, ACL of backend VM/container instance must display communication allowed between load balancer and server instance, it is noted that ACL is stateless rule, which needs to configure inflow and outflow load balancing policies separately.

**Q: Load balancer cannot get client real IP through listening under HTTP/HTTPS Protocol? **

A: Load balancer supports to get client real IP under HTTP/HTTPS Protocol by default, which requests the user to configure correspondingly in web server.

Take nginx as an example: need to install http_realip module, and add the following two configuration items in nginx.conf:

set_real_ip_from subnet IP section where load balancer is located

real_ip_header X-Forwarded-For

![nginx XFF配置](https://github.com/jdcloudcom/cn/blob/master/image/Networking/ALB/ALB-010.png)

**Q: How do multiple availability zones ensure high availability? **

A: It can only add VM/container in the availability zone where load balancer is located as backend service, and conduct traffic forwarding according to set scheduling algorithm; when one availability zone has an error, traffic will be automatically converted to other availability zone server.


**Q: How load balancer backend service to select to associate the virtual server group or availability group? **

A: The virtual server group can add or delete VM instance by the user manually or through associating AS, the manual configuration method is easy to use; the virtual server group can be associated with AS (Auto Scaling) for use to realize high availability across availability zones, but high availability across racks in the same availability zone cannot be ensured. The availability group automatically realizes high availability assignment and auto scaling according to rules for machine instance across AZ, across racks, provides more flexible and more automatic machine assignment service than virtual server group. Therefore, the user can select to associate with virtual server group when requiring simple use, fast command; it is suggested that the user selects to associate with availability group when requiring high availability service.


**Q: Intranet ip resource occupied by one load balancer instance? **

A: The load balancer adopts high availability frame architecture in each availability zone, enables two instance resources by default, it also occupies the ip resources of two located subnets, except for vip, thus, the single availability zone will occupy 3 Intranet ips in total, the double availability zone will occupy 5 Intranet ips in total, it needs to occupy 2 more ip resources of two located subnets for supporting one more availability zone, the rest can be done in the same manner.