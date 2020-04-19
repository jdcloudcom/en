# Features 


### Intrusion Threats 

#### Virus Webshell

The virus Webshell function adopts the Cloud + Client searching and killing mechanism. The client is responsible for collecting progress information and reporting the same to the cloud control center for virus sample detection. If any process is determined as malicious, actions such as file isolation by user are supported. The cloud searching and killing service integrates mainstream virus searching and killing engines at home and overseas, cloud sandbox and threat intelligence detection capacities.

#### Webshell

The Webshell function adopts the local + cloud searching and killing mechanism, the local client discovers Webshell via static detection engine and reports suspicious program to the cloud for judgment. The Webshell searching and killing engine for cloud web page includes: AI searching and killing engine and Webshell sand box detection engine.

#### System Back Door Detection

rootkit, a sort of malicious software hiding itself in the computer operating system, provides such security capabilities as kernel level rootkit detection, application level rootkit detection, etc. through the Endpoint Security backdoor detection function.

#### Suspicious Operations

Audit suspicious operations and actions entered in the command line by the user, including: password file modification, malicious file downloading, agent software misuse, system log tampering, ssh key pair tampering, hacker tool running, bounce shell, information leakage, high risk command, security damaging program, plaintext password login, etc.

#### Sensitive File Tampering

Support system file tampering: Detect if command processes such as Bash and ps are maliciously hidden, run by illegal processes, and support monitoring on user-customized file tampering.


### Risk Discovery 


#### Compliance Baseline

The best practices of linux compliance baseline show basic configuration which is mostly frequently used by public cloud tenants to users from aspects of file permission, service configuration, identity authentication, intrusion prevention and control as well as security audit, giving the visual understanding of operating system security configuration of Virtual Machines to tenants and preventing intrusion incidents due to configuration omissions.

#### Account Risks

The account password will be detected based on the rules of the weak password dictionary by built in the system. The weak password risk will be displayed through the cloud platform to remind the users to perform modification so as to protect the system account against cracking.

#### Machine Vulnerabilities

linux vulnerability detection: For the standard CVE official vulnerability library, the self-developed version match engine is compared with the software version, so as to give warnings about existing vulnerabilities of the current software version. Support one-click repair. windows vulnerability detection: Synchronize patch sources from the Microsoft official website, detect and remind vulnerabilities of high risks and influences. Support one-click repair.

#### Abnormal Login

The user can set preferred login location, legal login IP and legal login time. When the login address is not the preferred login location, such login IP is illegal and such login time is illegal time. In such case, alarm records will be produced and reported to the cloud platform to reminder the user of the abnormal login risk.

#### Brute Force

Obtain IPs attempting to make brute force attacks via means such as system logs, network data package protocol analysis and ports, and judge if the IPs reach requirements of protection rules. If yes, they will be intercepted and reported to the cloud platform. Meanwhile, user-customized brute force attack rule will be supported. Finally, the brute force attack is successful.
