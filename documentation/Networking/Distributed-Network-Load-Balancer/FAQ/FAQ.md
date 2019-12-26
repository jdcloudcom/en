# FAQ

**Q: How to choose among Application Load Balancer, Network Load Balancer or Distributed Network Load Balancer?**

A: We recommend the Load Balancer type as per the following process to maximize the performance experience and minimize the cost of users while satisfying user demands.
![LB类型选择](../../../../image/Networking/Distributed-Network-Load-Balancer/DNLB-022.png)

**Q: What are the distributed network load balancer quota of a single user and the quota of resources related to distributed network load balancer respectively?**

A: For information related to quota, please refer to load balancer [Restrictions](../Introduction/Restrictions.md), and if you need to increase the quota, please open ticket or contact the customer service staff.

**Q: What if the distributed network load balancer fails to communicate with the backend server instance?**

A: Security group and ACL of backend VMs/containers instance must display communication allowed between load balancer and server instance. It is noted that ACL is stateless rule, which needs to configure inflow and outflow load balancer policies separately.

**Q: How to obtain the client real IP when the distributed network load balancer uses TCP protocol listening?**

A: When the distributed network load balancer backend service attaches availability group or the virtual server group of instance type (adding VMs or containers object), the default of IP packet head can directly pass through the client real source IP without any special configuration or operation.
   
**Q: How do multiple availability zones guarantee high availability?**

A: The distributed network load balancer adopts all AZs deployment, to deploy VMs/containers attached to its backend service to multiple availability zones, and forward traffic according to the set scheduling algorithm. When an error occurs in one availability zone, traffic will be automatically converted to a backend server in another availability zone.

   
**Q: How does the distributed network load balancer backend service select to associate a virtual server group or an availability group?**

A: The virtual server group can add or delete VM instance manually by the user or automatically through being associated with AS (Auto Scaling), and the manual configuration method is easy to use; the virtual server group can be associated with AS for use to realize high availability across availability zones, but high availability across racks in the same availability zone cannot be ensured. Availability Group automatically realizes high availability assignment for VM Instance across AZ, across racks and Auto Scaling according to rules, provides more flexible and more automatic machines assignment service than the virtual server group. Therefore, the user can select to associate with the virtual server group when requiring simple use, fast command; it is suggested that the user selects to associate with Availability Group when requiring automatic high availability services.

   
**Q: What’s the quantity of the Private IP resources occupied by one Distributed Network Load Balancer Instance?**

A: The Distributed Network Load Balancer Instance adopts the distributed deployment architecture in all AZs, there isn’t any specific entity. Only VIP of Distributed Network Load Balancer Instance occupies a Subnet IP resource, it is recommended to reserve at least one Subnet IP resource to ensure available functions of Load Balancer.


**Q: The Load Balancer in South China Region has been associated with the Elastic IP in Availability Zone A, but why the traffic cannot be normally forward in some cases?**

A: When the Load Balancer is associated with the Elastic IP in Availability Zone A, the backend server attached to the Load Balancer can only be deployed in Availability Zone A. If the backend server is deployed in other AZs other than Availability Zone A, it will cause the inability of the traffic to normally forward; when the Load Balancer is associated with the Elastic IP in all AZs, there is no such limitation.
