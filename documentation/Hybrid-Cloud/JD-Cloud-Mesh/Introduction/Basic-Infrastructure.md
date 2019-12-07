# Basic Architecture
   The main interaction method between JD Cloud Mesh and the user includes the Console interface, CLI and API, wherein:
 - Console: It is the main delivery method provided by Hybrid Cloud, providing visual and concise operation experiences to the user.
 - CLI tool: Based on the command line tool under the Bash environment, it can access the JDFusion via scripts.
 - API: Refer to the standard RestfulAPI interfaces based on HTTP protocol and other systems can be integrated with the JDFusion via API. Functions realized via the console can also be realized via API by the user.
 
 The basic architecture is as shown below:
![创建实例](../../../../image/JD-Cloud-Mesh/JD-Cloud-Mesh-Architecture.jpg)

- JD Cloud Mesh will be designed in strict accordance with JD Distributed Service architecture, covering multi-cloud management, migration service, disaster recovery service, verification and authorization service, notification service, user service, JDFusion service, monitoring service, alarm service etc.
- Each JD Distributed Service shall remain self-control on its own functions, providing system with nature distribution capacities. Moreover, with service realization methods such as stateless service, each service of Hybrid Cloud can achieve horizontal expansion capacity.
- Each service is divided as per business, overall divided into multiple service groups independent to each other. In principle, API interaction or MQ message interaction can be only made between service groups and service groups do not highly rely on each other in principle. Good fault tolerance treatment shall be made as required.
- Each service group consists of different services, each of which are detailed and split as per business. In addition, each service shall be split into two types, i.e. stateful/stateless types, and be subject to high availability design as per multi-instance/cluster scheme.

# Related References
- [Core Concepts](Core-Concepts.md)
- [Application Scenarios](Application-Scenarios.md)
- [Features](Features.md)

