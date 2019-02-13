# Basic Architecture
JD Cloud Distributed Service Framework in each region adopts cross-availability zone deployment. Each service of each user is deployed in the VPC of the user independently, completely separated from data of other users. After service deployment, the user can call all functions through RESTful API. Apart from currently supported Registration Center, Configuration Center, Call Chain Analysis, JD Cloud Distributed Framework will provide Message Queue, API Gateway and other services to meet diversified requirements of users.



## Business Architecture

![](../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsf-struct.png)



## Product Function Glossaries

| Concept | Interpretation |
| :- | :- |
|  Service Registration  |  Provide function module interfaces of "Registration Center" and "Service Management". |
|  Registration Center | Provide functions of creation, created service registration center view and management that serve the Registration Center in creating JD Cloud Distributed Service Framework. |
|  Service Management  | Provide running service instance information view, service registration data, source data and other information view functions.  |
|  Region  | Different regions mean different geographic regions. At present, JD Cloud has four regions, including cn-north-1, cn-south-1, cn-east-1 and cn-east-2. |
|  Cluster Network  | Customized Virtual Network Space can implement logical separation between resources. |
|  Calling Chain Analysis Service   |  Calling Chain Analysis Service can trace the calling path for every request of distributed service, which helps user understand and analyze the time consuming and status of each stage for request processing, so as to completely grasp  the service calling relationships and accurately discover the bottleneck of the system and the services with hidden trouble. |
|  Service Dependent Map  | Obtain calling roles and processes between services according to Calling Chain Data Analysis, which help the users understand the calling paths, service performance and status statistics between services, providing the users with data support for problem positioning, troubleshooting and optimization. |



## Related References

- [Product Advantage](../Introduction/Benefits.md)
- [Product Function](../Introduction/Features.md)
- [Purchase Process](../Pricing/Purchase-Process.md)
- [Billing Method](../Pricing/Billing-Overview.md)




