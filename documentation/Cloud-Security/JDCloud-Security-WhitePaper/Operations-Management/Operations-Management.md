# Operation Management Security

## 1. Process Management

### 1.1 SDL Process

JD Cloud pays a lot of attention to the security of the internal process. All the cloud products providing services for users are strictly subject to the security development life cycle (SDL) security development process of the products during the development. The security development of JD Cloud is based on the best practices of security development in the industry and has been optimized specifically for several links. In each stage of product development, information security and privacy problems are to be eliminated, to ensure all the cloud products able to obtain sufficient security management, control and evaluation within their life cycle.

![图 11 京东云安全开发流程示意图](https://github.com/jdcloudcom/cn/blob/edit/image/Security-Information/SDL11.jpg)


As shown in the above figure, the entire cloud product security life cycle is divided into seven stages: training stage, analysis status, design stage, development stage, verification stage, release stage and incident response stage.

· Training stage: All the members in the development team accept proper security training and get to know about the relevant security knowledge, and the training objects include development personnel, test personnel, project manager and product manager etc.

· Analysis stage: Before the establishment of project, advance communication with the project manager or product owner is done to determine the security requirements and matters to be done and confirm the project plan and milestones.

· Design stage: The security team makes threat modeling, evaluates the existing demands and design architecture, and communicates the security problems and response methods in design.

· Development stage: The project team strictly abides by security coding specifications or guidelines, and minimizes the security vulnerabilities arising during coding. The project team uses the security evaluation tool provided by the security team to ensure the security of development coding.

· Verification stage: The security team provides artificial penetration test and white-box code audit to products and patch its vulnerabilities.

· Release stage: Before the product becomes on-line, it shall be finally reviewed by the product security department before being released to the on-line environment. When the security team finds that any security demand is not executed in place, it shall inform the project team of the termination of the release process of the project.

· Incident response: Each piece of software bound by SDL requirements must include the incident response plan at the time of release.

### 1.2 Operation and Maintenance Process

The operation and maintenance process of JD Cloud operation management team includes release management, change management, problem management and configuration management. Release management is the accurate process of products and services before and after going on-line. Change management is the ordered process proposed for the change in production environment. Problem management includes vulnerability management, incident disposal process and emergency response process. Configuration management is the management for the configuration of all components required in the business.

## 2. Risk Management

Through the cloud security operation platform independently researched and developed with over ten years of Internet e-commerce security experience, by multi-layer and multi-dimensions of real-time monitoring and off-line analysis, JD Cloud provides systematic security service for cloud users, and solves all kinds of unexpected security incidents, to enhance the risk-resistant ability of cloud user business system and prevent the system from material security incidents It also provides targeted security patch schemes based on vulnerabilities, and guarantees the cloud user business system free from security intrusion incidents after it accesses the cloud if possible, so that the system can safely and reliably run and guarantee the security of cloud users.

To guarantee the safe and stable running of the data center infrastructure and cloud platform, JD Cloud security team is responsible for the daily running and operation of JD Cloud, and provides technical support and remote operation for the JD Cloud. JD Cloud security operation mechanism can be informed of the latest network security, monitoring, as well as attack and defense means, and will settle the relevant security incidents instantly, to make sure the security and stability of JD Cloud platform and user data business security.

JD Cloud security operation service system is mainly divided into two sectors:

· Basic security operation service: Relying on the basic security operation service provided by the platform protection system, it provides users with more dedicated and reliable basic security operation service.

· Value-added security operation service: By building a senior and customized protection service based on the basic security operation service, it provides users with more dedicated service. It includes user cloud access security protection service, senior emergency response service, security training service, security consulting service and other services.

### 2.1 Asset Management

JD Cloud is devoted to masters and visually presents all the network device asset information throughout the network for users. Asset maintenance includes the discovery of assets and asset management. A set of practical and effective asset detection system is provided for asset discovery, and the space scanning technology based on big data is adopted, in order to obtain the full asset information of users at different sites. Asset management carries out centralized management on all the asset information, provides a unified management platform, and builds a complete and scientific asset maintenance system for users to master and monitor the assets.

### 2.2 Permission Management

JD Cloud team builds a strict and fine-grained permission management system to assure the stable running of cloud platform. In combination with the automatic operation management mechanism, JD Cloud provides a unified cloud security operation and maintenance specifications, and all the operation and maintenance operations to products are under strict permission control and monitoring.

JD Cloud requires separating the permission management into specific operation and maintenance operations. For example, during the platform management of operation contents, operation steps are required to be subject to the operation specifications, operations are only allowed after being approved by the evaluation of two or more persons, and testing the operation contents on-line is prohibited. JD Cloud attaches the same importance to the permission management of each operation management team member. For the permissions necessary to their responsibilities, such as bastion host management audit permission, JD Cloud requires that the operation and maintenance personnel must reapply for the bastion host management audit permission at an interval of three months. In case of change of responsibilities, JD Cloud will immediately revoke the permission given to the employee related to his or her original responsibilities.

To guarantee the security quality of the operation and maintenance management, JD Cloud concerns a lot about the cultivation of security awareness of the operation management team. The operation management team assigns a mentor for each new member, and the mentors are security experts with rich experience in the industry, and are responsible for the operation and maintenance operation results. JD Cloud regularly carries out security awareness training for the running management team, and regularly updates the operation and maintenance operation specifications and carries out the study of the team specifications, so that the security awareness and security technology of the team are improved sustainably.

### 2.3 Business Continuity Management

JD Cloud also concerns a lot about the user’s business continuity, to avoid influence of problems on the user’s business running to the most extent. JD Cloud provides DNS, load balancer and other network services; application, database, cache, cloud storage, cloud disk and others are deployed in cluster architecture to ensure the redundancy and high availability of each application layer, data layer, network layer and other layers and assure the business continuity. JD Cloud elaborately designs different business solutions of basic architecture, information architecture and application structure for different scenarios for users, to provide business continuity and disaster recovery management service.

## 3. Security Operation

### 3.1 Security Information

JD Cloud builds a multi-layer stereoscopic security information system. In combination with the internal threat information analysis system, JD Cloud will carry out association analysis in the Internet on the characteristics of the network attack, and instantly locate the source of the network attack. The security information of JD Cloud is collected from the external threat information sources verified by authorities, including the security incident information, threat incident grade, IP address reputation, etc. The internal information analysis is from JD’s situation awareness system, and the specific operation logs and threat characteristics can be collected.

### 3.2 Vulnerability Management

JD Cloud vulnerability management includes vulnerability awareness and vulnerability response mechanism. Relying on the strong and complete vulnerability management platform, JD Cloud security operation team guarantees to respond and patch from its self-research and third-party vulnerabilities of infrastructure, server, network device, operating system, application system and cloud service within the time of SLA, to assure the user business free from risks of being impacted by vulnerabilities.

JD Cloud vulnerability awareness system scans the public cloud server and important network devices with the security scanning evaluation tool to carry out security vulnerability detection and analysis on network devices, reminds the administrator to perfect the security policies in time for the vulnerabilities identified as able to be utilized by intruders to illegally enter into the network or illegally obtain the information assets, and reduces the security risks.

In the process of vulnerability awareness, the following principles shall be followed:

· Standardization

The implementation of security scanning is carried out by professional security scanning personnel according to the operation process of specifications. Standardized records shall be provided for the operation process and results, and complete service records, reports and achievements shall be formed.

· Controllability

Security scanning tools, methods and processes shall guarantee the controllability of the service process by the parties with the range recognized by the parties. The security engineer shall provide service support under the circumstances agreed by the parties.

· Minimal Impact

The possible influence of security scanning on the normal running of system and network within the scope of the Project is minimized to the lowest extent without marked impact on the running of network and normal provision of business.

JD Cloud vulnerability response ticket system directly accepts the vulnerability alarm from the vulnerability awareness system. The emergency response team preliminarily determines the intrusion path, webshell actions, whether data are influenced or not, influence range and infected users, preliminarily determines whether it is a security incident, and the incident grade (catastrophic, material, severe, moderate), and respond instantly.

The emergency response team and the research and development, business operation and maintenance as well as IT resource service security officer and involved personnel of the business parties jointly participate the discussion on the feasibility of stop-loss policies, impacted environment scale, further determination of risks, business environment, etc. Meanwhile, the emergency response team determines the patch scheme for the vulnerability in combination with external information and professional analysis.

### 3.3 Security Response

Cloud security incidents are incidents that cause harm to brands, data, users, finances, businesses, systems, or negatively affect society due to natural or manual and hardware or software defects or failures. It generally refers to security incidents caused by hackers intruding systems. These attacks include, but are not limited to the implantation of viruses and backdoors, IDC server multiple machines infected with webshells, suspended webshell and other behaviors that successfully control the server.

The JD Cloud security operation team will rectify and advance the potential of the intrusion such as hidden dangers, vulnerabilities, risks and blind spots before the incident is discovered, so as to reduce the occurrence of security incidents. Once a security incident occurs, the security operation team will discover the intrusion as soon as possible and make response immediately. The security operation team assesses the impact scope and harm degree of the incident, gives emergency response according to the impact scope and harm degree, deeply analyzes the root cause of the security incident, further investigates the business and systems involved in the incident, and reduces the impact and loss of the incident. Security patch and retesting for systems with problems and hidden dangers will be conducted, and the users will be helped quickly resolve security issues.

## 4. Monitoring and Audit

JD Cloud requires full-automatic monitoring of the operations of the internal operation management team, the monitoring scope covering the internal and external key service components, key upstream and downstream service components. The utilization rates of core resources such as memory, disk, and network interface for different service components are monitored, and a stricter exception threshold line is set. The operation team shall be informed in a timely manner to quickly solve the problems through the wrong statistics. New additions, deletions, and edits of monitoring require a clear process. The monitoring level, target, monitoring receiver, and exception disposal plan shall be specified for monitoring additions to ensure that the emergency response plan in case of alarms can be performed immediately. In order to make sure the effectiveness of the monitoring, JD Cloud will periodically trigger a test alarm to confirm the effectiveness of the monitoring.

JD Cloud independently developed an online machine verification login system based on the service tree role authorization. Through this system, it performs Identity and Access Management and operation history records for all machines of the cloud platform. When the operation management team personnel perform operation and maintenance operations on the server through the system, the system can audit the alarm in real time in the event of a high risk command. The unified log audit system encrypts all background operation and maintenance operations records of the operation management team, and the internal audit team regularly further reviews the operation and maintenance operations records.

Security operation and maintenance should have complete log records for user management, system verification, system authorization, system login, data acquisition / access / modification. The recorded content contains the following necessary information: Log tag, time, operation, user ID, user name, user group, IP address, access method, access content, and access result. The log field shall be ensured to be able to locate the specific operations when the user accesses the component. The security log shall keep the incidents for at least 180 days as required.

## 5. Service Support

JD Cloud's operational security capabilities are strong and capable of providing 7x24h professional technical support service; the powerful solution support capabilities can maximize user need. Based on standard service, for large users or special users, JD Cloud can ensure one-on-one expert service to help users better apply the cloud products provided by JD Cloud.

JD Cloud escorts users in 365 days, and pushes notifications, alarms and security incidents for users through SMS, email, intra-website message, announcement and other channels.
