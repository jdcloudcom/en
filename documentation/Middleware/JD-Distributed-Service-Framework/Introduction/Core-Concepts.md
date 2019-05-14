# Core Concepts


## Relevant Glossaries of Microservice


| Concept | Interpretation |
| :- | :- |
|  Microservice |  Microservice consists of some small and autonomous services working cooperatively, which have advantages such as easy elastic extension, simple deployment, being composable, etc. A microservice can be either a service provider, or a service consumer. |
| Cluster  |  Cluster refers to the set of cloud resource for running applications. The cloud resources in a cluster can be containers or Virtual Machines. Resources within the same cluster can communicate with each other. |
|  Spring Boot  |  Spring Boot It is a framework used for initial setting up and development process of simplified Spring application, which the framework uses the principle of convention over configuration to greatly simplify development.  |
|  Spring Cloud  | Spring Cloud It is a set of service governance functions, which uses Spring Boot development style to simplify the development of distributed system infrastructure and provides functions including Service Registration and Discovery, Configuration Center, Messages Bus, Load Balancer, Breaker, Gateway, Data Monitoring, etc. |
|  Microservice Instance  |  One minimum running and deployment unit of microservice usually corresponds to one application process. |
|  Service Provider  |  A service that is at the side of being called in the calling relationship of microservice |
|  Service Consumer  |  A service that is at the side of calling in the calling relationship of microservice. |
|  Calling Chain  | Based on the idea of Google Dapper thesis, every request will generate a global ID that can link different isolated calling data together for reforming calling path data. |
| Node   | 	A specific service instance in the cluster.  |
| Configuration Management   |  Configuration management is used for settling unified configuration management of several service instances under the distributed environment. Now, the supported configurations include multi-version management, release and rollback. |

	

## Product Function Glossaries

| Concept | Interpretation |
| :- | :- |
|  Registration Center | Registration Center mainly provides functions of service registration and discovery, and the creation process of Registration Center is the process for discovering service instance on user VPC. In the creation process, the user can select to automatically allocate availability zones with the system or manual select availability zones; in the deletion process, the current Registration Center is not open to service. Now, this product supports 3AZ deployment, providing reliability guarantee. |
|  Service Management  |Provide the information view function for running service instance information, service registration information, source data and others.  |              
|  Region  | Different regions mean different geographic regions. Now, this product can be subscribed in cn-north-1. |
|  Cluster Network  | Customized Virtual Network Space can implement logical separation between resources. |
|  Calling Chain Analysis Service   |  Calling Chain Analysis Service can trace the calling path for every request of distributed service, which helps user understand and analyze the time consuming and status of each stage for request processing, so as to completely grasp  the service calling relationships and accurately discover the bottleneck of the system and the services with hidden trouble. |
|  Service Dependent Map  | Obtain calling roles and processes between services according to Calling Chain Data Analysis, which help the users understand the calling paths, service performance and status statistics between services, providing the users with data support for problem positioning, troubleshooting and optimization. |

