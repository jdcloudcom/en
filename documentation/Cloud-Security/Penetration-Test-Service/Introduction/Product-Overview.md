# Product Overview
Penetration test service is to, without causing any damage to the existing system, carry out a comprehensive and in-depth attack test of the user-specified system simulating the hacker intrusion technical means from the perspective of the attacker to identify potential risk threats in the system to help users reduce economic losses caused by hacker intrusion.


## Relevant Concepts
JD Cloud penetration test service can detect potential risk threats in the system for users and can cover the following general vulnerabilities:

#### Information Leakage
•	The automatic detection of general information leakage is mainly aimed at some known threat types, for example: the return page contains path information, an anonymous browsing directory exists in a directory, an automatic backup file exists in a file, and others.

•	Some information leakage vulnerabilities often require manual intervention to judge, for example, there is data in the return information that is highly relevant to the business of the target system; the leakage of these data is very dangerous, but they cannot be identified by automatic scanning tools. It is necessary to dig and verify this kind of information leakage manually.

#### Injection Vulnerability
•	There are many injection methods for injection vulnerability, such as SQL injection, XPath injection and LDAP injection.

•	Different types of injection vulnerability are similar in terms of utilization mode and principle. However, the data content and user permission stored in the background determine the benefit extent of injection vulnerability.

•	When injection vulnerability is tested by test personnel manually, it is necessary not only to verify whether the injection vulnerability is real, but also to analyze and judge the depth and extent of the harm caused by the injection vulnerability, and to set a reasonable risk level for the injection vulnerability in combination with its influence.

#### XSS and CSRF Depth Utilization
•	Most Web scanners have a single identification and testing mode for XSS and CSRF. In general, the scanner can only verify the existence of such vulnerabilities from the theoretical level. However, the security risks caused by these vulnerabilities need to be authenticated and evaluated by manual assistance.

#### Re-direction Detection and Utilization
•	Re-direction vulnerabilities are often exploited in combination with other vulnerabilities. In the traditional automatic evaluation process, it is difficult to perform identification and depth test of the re-direction vulnerabilities, but it is possible to re-evaluate and define the utilization mode and influence of the re-direction vulnerabilities by means of manual detection.

#### Parameter Error
•	Parameter errors are divided into many types, among which, errors involving logic and permissions are difficult to be automatically identified by scanners. For these errors, it is often necessary to identify and test these errors with the help of rich testing experience of penetration engineers.

#### Verification Error
•	Authentication errors have multiple meanings, and the simplest understanding is that the user login portal is exposed (especially the sensitive user's login portal, such as the management login portal), and there is the possibility of weak password or brute force (for example, the login page without a verification code can be verified by means of brute force). In addition, there are also some verification errors that cannot be recognized by the automatic programs. For example, after logging in a system, it will no longer check the identity of the user, and the user can perform any operation within the system. Or the user does not verify the original password when he/she modifies the password. These vulnerabilities may lead to act in excess of permission by ordinary users.



### Related References

 - [Product Advantage](../Introduction/Benefits.md)
 - [Product Function](../Introduction/Features.md)
 - [Getting Started](../Getting-Started/Getting-Started.md)

### Billing

At present, offline purchase is offered for JD Cloud vulnerability scan service.

For details, please refer to "[Billing Overview](../Pricing/Billing-Overview.md)". About the detailed charging standard, please open ticket for consultation
