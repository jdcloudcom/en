## 2. Network and Infrastructure Guarantee
Network security is the basis to guarantee data security transmission and exchange, while infrastructure security is the footstone of data security. JD Cloud network and infrastructure provides powerful protection measures to protect user data and business. JD Cloud provides users with a cloud data center of global deployment, multiple regions and multiple availability zones and realizes disaster recovery capacity of region level, AZ level and FD level. It uses multi-line BGP network to improve network access experience. The distributed cloud operating system provides all cloud products with high available basic architecture and multi-replica data redundancy. Guarantee high availability and high reliability of entire basic framework of cloud computing and high availability of Virtual Machines, and make sure that service of cloud platform is not interrupted. In this way, not only data reliability is improved, but also data security is enhanced.
### 2.1 Security Guarantee to Cloud Platform
Cloud data security relies on safe and reliable cloud platform environment. JD Cloud provides a mature network security architecture and multi-layer protection security scheme. It provides security isolation and strict IAM between production network and non-production network, business network and management network, as well as virtual network and physical network. In order to guarantee the security of cloud platform, JD Cloud starts with basic architecture security of underlayer cloud platform, combining with big data processing capability and the excellent third-party security manufactures in the industry to create the complete security ecosystem so as to realize overall security coverage of the cloud platform, network, system, data and application system.

- Network Security Guarantee

The provision of reliable security components in the border region among the Internet and cloud platform service as well as resource groups may prevent the untrusted network from accessing the internal network resources. The cloud platform applies anti-denial service (DDoS), Application Security Gateway, Web Application Firewall and VPN Device Protection, and also implements security strategies such as firewall policy, access control list (ACL) or specific routes.

-	Security Isolation and Guarantee

For network isolation of cloud platform, effective isolation between networks varying in levels and virtual devices refer to key control guaranteeing user data security. Through network access control list (ACL) technology, JD Cloud provides "Cloud Service Network" service externally and supports security isolation of "Physical Network" of cloud service.

As for network isolation service, JD Cloud’s virtual private network (VPC) is a network space which is customized and logically isolated on public cloud of JD Cloud, and the private network space completely controlled by user. Users can build the logically-isolated network environment on JD Cloud, can plan network deployment on their own and realize multi-level security protection through security groups, network ACL, etc. The instance is deployed in a user-customized VPC by default, and network isolation protection is performed directly at the TCP layer to ensure data security.

As for user isolation, user instance isolation relies on management for Virtual Machines based on hardware virtualization technology, with Virtual Machines isolated in the system level. Through the abstraction of the physical resources of the server, the physical resources such as CPU, memory, I/O are transformed into a set of logical resources that can be uniformly managed, flexibly scheduled and dynamically assigned, based on which multiple virtual machine execution environments that run simultaneously and are isolated from each other are constructed on a single physical server. In the virtualization layer, it ensures that Virtual Machines can only access the physical disk space assigned to it, thus implementing security isolation of different disk spaces of Virtual Machines.

-	Cloud Platform Monitoring and Protection

JD Cloud security operation mechanism can timely get and solve external security threats and internal security vulnerability. By utilizing the automatic security monitoring system and supported by threat intelligence, anti-fraud function and situation awareness analysis module, the cloud platform can effectively hold back hacker invasion, malicious attack and other issues, process relevant security incidents at first time, guarantee security, stability and user data business security for JD Cloud platform.

-	Cloud Security Auditing

JD Cloud audit mechanism can apply monitoring, audit and analysis and can timely discover abnormal data flow direction and operation behavior. Once any malicious behavior possible to cause data leakage and destruction is found, the audit mechanism can send threat alarms at first time. Operation and maintenance of production environment can be made through bastion hosts, unified logs and records are made for background operation and maintenance and automatic security audit is made. Meanwhile, operation records can be transmitted to the central log platform in real time. Through violation audit rules, exceptions or violation behaviors can be actively discovered.

### 2.2 Security Service Provided to Users
To ensure that the user has the real-time data protection in the use of cloud service, JD Cloud has provided the user with the Cloud Security products and services to be sensed and applied in each level of the cloud platform, aiming to help the cloud user deploy Cloud security protection quickly and efficiently.

![products-services](https://user-images.githubusercontent.com/51605713/59268566-8e70c080-8c7f-11e9-874e-25d436e14080.jpg)

-	Network Security

JD Cloud provides users with maximum 2Gb Anti-DDoS Basic capacities for free by default. For users subject to mass-traffic DDoS attacks, the Data Center cluster has the cleaning ability up to 1.5T, being capable of easily coping with various mass-traffic DDoS attacks and guaranteeing stable and safe operation of users’ business. The private network is set up via VPN connection with public network. Therefore, access to Intranet by external users and cross-region Intranet interconnection and others are realized via encrypted tunnels. VPC supports users to build logically-isolated network environment on JD Cloud. In such environment, users can implement autonomous planning for network deployment, including network scope, subnet segment, routing policy, etc., and implement multilevel security protection through security group and network ACL, etc.

-	System Security

Endpoint Security provides security management of Virtual Machines to users. Light weight grade security protection process is adopted to monitor risks of Virtual Machines in real time, give security threat warning in time, apply precise protection against malicious invasion, effectively improve defense capacity of Endpoint Security and guarantee business security of users’ Virtual Machines.

-	Application Security

Web Application Firewall can recognize and protect malicious features of network business traffics and return normal and safe traffics back to servers. It can protect web servers against malicious invasion, guarantee core business data security for users, and solve server performance exceptions due to malicious attacks.

Application Security Gateway is the product used for applying visual security analysis and application layer threat protection to the website or APP service. By improving such functions as WAF, user access audit and business safety visual and compliance check, the steady and sustainable operation of business is ensured, the user experience is improved and the exception or compliance problem resulted from HTTP/HTTPS business being attacked is solved.

-	Data Security

Key Management Service (KMS) refers to a safety management product provided by JD Cloud to the users, which uses the hardware security module (HSM) to secure the safety of user's key. The users can use the key in a safe, controllable and convenient way under escrow, and focus on developing scenarios that require encryption and decryption.

SSL Certificate provides users with the one-stop service of secure sockets layer (SSL) certificate, including certificate uploading, downloading, management, application for purchase and other functions. Based on cooperation between JD Cloud, top-level digital certificate authorization (CA) organizations and authoritative distributors, it provides users with full life cycle management on digital certificates and realizes credible identity verification for website and data security transmission.

For data encryption, the encryption service relies on hardware encryption equipment certified by State Cryptography Administration Office of Security Commercial Code Administration. Cloud data encryption and decryption solutions are provided. Users can realize safe and reliable management to keys and also make reliable encryption and decryption operation to cloud business data with various encryption algorithms.

-	Security Management

The Situation Awareness system provides users with big data security analysis. Through data modeling, behavior learning and intelligence correlation analysis, we can fully monitor the all security scenarios, discover intrusions and attack threats, and help user build their own security monitoring and defense systems. By making rapid and automatic association analysis to multi-dimensional and massive security and business data, the overall security situation of threats and exceptions are provided to the user with the graphic and visual technology.

-	Security Service

As for baseline check service, with the user’s full authorization, an overall security baseline check is made to the user’s cloud system, helping the user grasp the overall security vulnerability of its cloud system. Besides, objective security fix-up suggestions are provided according to check results and features of user’s business mode, reducing security threats of systems.

As for vulnerability scanning service, under full authorization by the user, a comprehensive vulnerability scan service is provided for the user-specified operating system, Web service, database, etc. JD Cloud security experts will interpret the scan results and provide professional vulnerability scan reports and fix guidance recommendations, to help users effectively reduce business security risks.

Penetration test service is to, without causing any damage to the existing system, carry out a comprehensive and in-depth attack test of the user-specified system simulating the hacker intrusion technical means from the perspective of the attacker to identify potential risk threats in the system to help users reduce economic losses caused by hacker intrusion.

As for Incident Response Service, when users encounter network attacks, Webshell viruses, data theft and other hacker invasion incidents, JD Cloud can provide incident response services including suppression of loss, incident analysis, system reinforce, incident traceability, etc., to help users reduce the impact and loss of itself caused by the security incidents.
