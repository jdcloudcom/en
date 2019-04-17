# 8. Security Product Service
## 8.1 DDoS Protection

### 8.1.1 Anti-DDoS Basic

JD Cloud provides users with free Anti-DDoS Basic protection capability of maximum 2Gb by default. After the user applies for public IP successfully, the protection automatically enable the basic service for the user, which can flexibly set cleaning triggering value and adjust protection policies according to the actual business requirements. When the attack traffic exceeds the cleaning triggering value, public IP will trigger black hole status. Withstand SYN Flood, ICMP Flood and other mass-traffic attacks.

### 8.1.2 Anti-DDoS Pro

Anti-DDoS Pro is a kind of security value-added service of anti-DDoS attack, depending on the strong technical strength of JD Cloud security team and practical experience of years in attack protection of JD Mall. The purpose of it is to protect the security of user servers when the user is subjected to a mass-traffic DDoS attack.

![图 8 DDoS 防护示意图](https://github.com/jdcloudcom/cn/blob/edit/image/Security-Information/DDoS11.jpg)


According to Internet business requirements of different users, it provides the following DDoS defense capabilities:

· Origin Server Concealing

After enabling Anti-DDoS Pro service, the IP addresses of Anti-DDoS Pro will act as the proxy for user Origin Server access, so that the user Origin Server will no longer be directly exposed to outside and the security of Origin Server can be effectively protected.

· Protect DDoS Attacks with Multiple Types

Support Telecom, Unicom, CMCC, BGP and other multiple ISP lines, the cleaning capability of Data Center cluster is up to 1,000G+ and support super large protection bandwidth of 400G for single ISP line. Easily withstand SYN Flood, ACK Flood, ICMP Flood and other types of mass-traffic DDoS attack and CC defense.

· Quick Access and Elastic Protection

Users only need to resolve domain to be protected in CNAME to JD Cloud Anti-DDoS Pro service at DNS service provider for accomplishing access.

After enabling Elastic Protection, the businesses of users can still be protected by JD Cloud when the attack suffered by the users exceeds the peak value of purchased package. By using elastic protection function, users will no longer worry about the problem of service interruption due to the attack exceeding the package peak value.

· Support all businesses

It covers non-web service + web service scenarios, supports TCP/UDP/HTTP/HTTPS protocol, and covers various business scenarios such as finance, e-commerce, government and mobile APP etc.

## 8.2 Endpoint Security

Endpoint Security is the Virtual Machines security management product provided by JD Cloud based on accumulation on e-commerce defense and security big data analysis. By deploying light level Agent on Virtual Machines, aware the Endpoint Security risks in real time, effectively defend malicious attack behaviors, provide Machine defense and detection functions including high risk vulnerability detection, long-distance login reminder, webshell searching and killing, anti-brute force to guarantee the security of Public Virtual Machines.

· Weak Password Detection

The account password will be detected by the rules of the weak password dictionary that built-in the system. The weak password risk will be displayed through the cloud platform to remind the users to perform modification so as to avoid the system account to be cracked.

· Abnormal Login Reminder

Exception login behavior can be automatically identified according to the rules set by system, followed by early warning. The user can set preferred login location, when the login address is not the preferred login location, alarm record will generate and report to the cloud platform to remind the user that there is remote login risk.

· Anti-brute Force

It can effectively block the brute force behaviors including remote login anti-brute force, database anti-brute force, FTP anti-brute force. It obtains the IP of brute force by system logs, network data package protocol analysis and other methods. It also determines whether the results meet the protection rules and it will block the IP and report to the cloud platform if the rules are met.

· High Risk Vulnerability Detection

Regularly detect system high risk vulnerability and report Virtual Machines vulnerability details, the product provides Windows System vulnerability patch function. For Linux, the product provides vulnerability patch suggestions for manual vulnerability patch.

· Webshell Detection

JD Cloud Endpoint Security will perform risk determination for the new Web program files on the servers. It provides early warning for WebShell files with risks and users may treat the webshell files according to the early warning information.

## 8.3 Situation Awareness

Cloud Situation Awareness is a kind of security decision capacity provided to the lessee, which based on the public cloud computing environment and with full authorization of the user and collects mass data of each security component, improves finding, identification, understanding, analysis, response and disposal to the security threat from the global view by big data association analysis and machine learning of technique, ultimately provides user with security decision-making capabilities.

Cloud Situation Awareness has the following functions:

· Security Capability

It provides the security incident closed-loop processing workflow, detecting 25 security threats such as application layer attack, brute force, system weak password, etc., offering detailed evidences and security suggestions, and providing hundreds of threat models.

· Data Access Capability

It provides Cloud Anti-DDoS Basic detection data, network intrusion detection engine data and machine invasion detection engine data.

· Big Data Analysis Capacity

It provides association analysis of massive repeated incidents aggregation and directional attacks.

· Threat Overview

It provides users with the quantitative indicators on business security status, single attack events from the perspective of attackers, directional attacks, security engine enabling coverage rate from the perspective of defenders, weakness incident indicators and changes. At the same time the Top 10 attacked assets and Top 10 threat categories are provided.

· Single Attack Event Analysis

Query based on account asset, time period of details, attack type, grade and processing status, list of incident details and more details of incident processing status are provided. At the same, details of specific incidents and fix-up suggestions are provided.

· Directional Attack Event Analysis

Query based on account assets, time period of details, threat models, grade and processing status, list of incident details, more details of incident processing status and details of specific incidents are provided.

· Weaknesses Incidents

The details based on machine vulnerability are provided and the machine weakness is exhibited for the user by using the vulnerability as the statistical dimensionality. Supervise and urge the user to fix up relevant vulnerability.

· Association Between Cloud Network and Machine Assets

Provide association between cloud network and Machine assets, query based on Intranet and Internet IPs, network detection engine enable/disable function.

## 8.4 Web Application Firewall

The Web Application Firewall (WAF for short) is the professional security protection service launched by JD Cloud. It can defend SQL injection, XSS cross-site scripts, common Web server plug-in vulnerability, webshell upload and other common OWASP attacks, withstand malicious CC attacks to avoid leakage of website asset data and ensure the safety and availability of the website.

Multi-region deployment of JD Cloud WAF service. Each WAF access node adopts BGP multi-line access, can select optimal path intelligently and achieves responding delay at millisecond level. It can select WAF access nodes with optimal access experience intelligently according to Origin Server address list. The site does not need to install any hardware and software and can enable protection for the site by only modifying DNS records. Moreover, it supports to configure WAF as bypass observation mode, which only record log and does not block the attack requests, so as to facilitate users to observe the working status of WAF in actual businesses.

![图 9 Web 应用防火墙安全防护示意图](https://github.com/jdcloudcom/cn/blob/edit/image/Security-Information/Web11.jpg)

Main functions of WAF:

· Site Concealing

Lead traffic by domain DNS and expose no Origin Server addresses to attackers to effectively protect the security of Origin Servers.

· Common Web Application Attack Protection

Defend common thread attack of top 10 OWASP, including but not limited to: SQL injection, XSS cross-site, webshell upload, back door isolation protection, command injection, illegal HTTP Protocol requests, common Web server vulnerability attack, core file non-authorization access, path traversal, scanning protection, etc.

· CC Attack Defense

Access frequency control for single source IP, redirect verification and human-machine identification. Quickly identify malicious traffic by establishing thread information and credible access.

· Accurate Identity and Access Management

Support IP, URL, Referer and other condition combination of HTTP common field to set accurate IAM policies and identify credible and malicious traffics as required easily.

· Regularly and Timely Update 0 Day Patch

Timely update latest vulnerability patches that will be distributed globally at the first time for site security protection.

## 8.5 Application Security Gateway

Application security gateway (VPC-WAF) is a Web application security protection product based on JD Cloud high-performance load balancer cluster, which guarantees stable and sustainable running of business and improve users’ experience by providing WAF function, business security visualization, BOT behavior management and compliance inspection and other functions so as to solve exception or compliance problems of Web or APP businesses caused by attacks for network service providers.

 ![图 10 应用安全网关防护示意图](https://github.com/jdcloudcom/cn/blob/edit/image/Security-Information/Application11.jpg)

Main Function of Application Security Gateway:

· Web Application Firewall

Top 10 OWASP threads protection: effectively defend top 10 OWASP attacks such as SQL injection, XSS attack, command/code execution, file include, webshell upload, path traversal, malicious scan.

0 day vulnerability protection: professional attack-defense team will follow up 0 day vulnerability 7\*24 hours, analyze vulnerability principle and develop security protection policies for timely protection.

· CC Attack Protection

JD Cloud Application Security Gateway provides multiple CC defense modes, which can effectively provide protection for CC attack behaviors through more challenge verification algorithms such as cookie verifications, and verification code challenges. It can protect specific URI or pages with CC refinement protection to meet application layer DOS protection requirements for specific pages of large Web sites through customized CC rules.

· Accurate IAM Policy

Support customized detection: support flexible detection object definition, including HTTP protocol field and HTTP BODY field, support various detection algorithm.

Support condition combination detection: support logical combination of multiple detection conditions to support definitions of complex rules.

Support customized protection rules: provide customized rules that fully cover complex application interaction scenarios, which can act on specific protection objects so as to greatly improve the effectiveness and accuracy of rules.

· BOT Management

It can conduct friendly and malicious judgment on search engine crawler behaviors, it can identify and deal with malicious machine behaviors so as to effectively provide the stability of website running. It can ensure the security of website business through modeling HTTP protocol analysis and big data, analyzing and dealing with brute force, library dragging, library hitting and other robot behaviors.

Predefine BOT behavior management:
It supports functions such as crawler protection, brute force protection to effectively ensure the safety of website business.

Customize BOT management policy: users can add customized BOT rules based on the Web site's business features, select access frequency and action type, make judgments about robot behavior of specific keywords or URI so as to provide business protection accuracy and effective rate.

· Web Site Compliance

JD Cloud Application Security Gateway provides functions such as website tamper-proofing, sensitive information leak proofing and protocol compliance check, provides Web site compliance inspection and protection.

· Business Security Visual

Attack Category Reports: the distribution of attack types is clear, which conduct classification according to attack types to develop security reinforcement policies.

Attack trend chart: view attack trend chart to understand the degree to which hackers pay attention to the businesses.

 CC attack protection trend: perform CC attack trend statistics for viewing protection effects and statistics in real time.

IAM trend: perform statistics and analysis for IAM rules developed by the users for querying user access status in real time.

· Convenient Management

RESTfulAPI support: provide full set of RESTfulAPI interfaces to realize customized page.

No DNS modification: require no modification for DNS
Implement business protection and monitoring and implement certificate self-management and SSL uninstall function with load balancer.

## 8.6 SSL Certificate

JD Cloud SSL Certificates provide certificate upload, download, management and other functions, which can issue Symantec, GlobalSign and GeoTrust certificates on the cloud to provide thorough HTTPS solutions for sites and mobile applications, improve the reliability of sites, effectively protect attack behaviors such as hijacking, tampering and listening, so that business security protection and good experience are on intimate terms with each other. Meanwhile, SSL certificate products can provide the user with abundant certificate brands and certificate types, which supports cloud certificate pair generation and application for certificate issuance & renewal. Besides, it can also provide the function of certificate management and detail search, and supports associating with other businesses and products (e.g. load balancer and CDN) on JD Cloud Platform, providing the service of one-stop secure certificate storage & management and convenient use for the users of JD Cloud.

· Site Security Protection

Implement HTTPS of website; encrypt the interactive access between the user and the website; strengthen the degree of trusted display on the user side of the website, and effectively prevent session hijacking and malicious listening.

· Online Certificate Issue

Different brands, different types and different security levels of digital certificates can be purchased in one JD Cloud platform, and you may buy digital certificates suitable for your business according to different usage requirements and habits.

· Online Certificate Management

Provide the function of online digital certificate management; the user may view the situations of all certificates in JD Cloud platform, including certificate type, domain name information, certificate issuance time, certificate expiration time, etc.

## 8.7 Key Management Service (KMS)

Key Management Service (KMS) is taken as a security management service product. By means of KMS, users can use the key pair securely and conveniently, and focus on the decryption function scenario and application required by businesses.

JD Cloud KMS provides the following functions for the users:

· Key Pair Management and Rotation

Customer Main Key (CMK) management provides full life cycle management of key pair on cloud, including creation, disabling, rotation, deletion, etc.

Data key pair provides generation, encryption and decryption of data key pair (DEK) for data encryption and decryption of data on cloud.

Service key pair (KMS) will create service key pair for services on cloud (e.g., OSS, EBS and RDS).

· Data Encryption and Decryption

KMS provides two methods, i.e. the small-size data encryption and decryption method and the envelop encryption and decryption method. The user can directly encrypt and decrypt the data smaller than 4K via CMK. The user can encrypt and decrypt the data larger than 4K via the envelope encryption mode.

KMS has realized integration of various cloud products. The user may user his/her own CMK to encrypt data of cloud products, to realize encryption storage of cloud data.

· Confidential Data Encryption Escrow

The confidential data escrow is a private data encryption management service, which encrypts and storages specified confidential data by using the service key pair and accesses application program, service and private information necessary for IT resources by replacing the plaintext data with the identifier ID. With such service, users can rotate, manage and retrieve database certificates, API key pairs and other confidential information during the complete life cycle. The user and the application program can retrieve confidential information by calling API, without encoding sensitive information in the plaintext form.

· Application Authorization for Multiple User and Fine Granularity, Elastic Resource Assignment

KMS can support application and identity authentication of multi users based on JD Cloud IAM system role authentication. Only by identity verification and application operation authentication, CMK stored by KMS can be operated. In addition, KMS conducts east-west direction isolation to CMK, which each user can only access and manage his/her CMK other than CMK of other users to guarantee the security of the user key pair.

· Key pair HSM hardware module protection

Key pairs created by KMS will be protected by the HSM hardware module of the server, and a true random number will be produced by the hardware, to guarantee randomness of key pairs.

· Support API Revocation

KMS provides diversified APIs. Users may revoke APIs depending on their demands and support authentication to operation toward API resources, guaranteeing reliability and security of resource operation.

· Operation Log Audit

For any operation of key pairs, logs will be produced and recorded in the server, and the user can audit any operation.

· High Availability and Disaster Tolerance Backup

By completing technical schemes, KMS guarantees high service availability and possesses complete disaster tolerance and backup measures, to guarantee that the key pair will not be lost due to the force majeure.
