# Isolation Protection and Security Advice for Zombie Machine

**Zombie Machine Concept**: Due to the potential security vulnerabilities of the Virtual Machine's open service to the public network, the hacker may eavesdrop the control of the machine or implant a Trojan horse to further exploit the machine to launch a network attack. Zombie machine is also known as "puppet machine”.

**JD Cloud Isolation Mechanism**: If the machine is found to continuously conduct external network attacks, JD Cloud security protection system will perform network isolation on the machine, which will lead to network exceptions such as users cannot access the virtual machine through the EIP and the machine cannot communicate with DHCP, so that the private IP addresses cannot be obtained. After the user achieves the object of clearing the attack behavior by rebuilding (operable on the console) or clearing Trojan horse, the user needs to contact JD Cloud customer service personnel to help cancel the network isolation.

**Note**:

(1) After cancelling isolation, the machine may still be unable to connect due to the failure of obtaining private IP. The user needs to reboot the network interface (operable on VNC) or reboot the machine (both operable on the console and VNC) to reconnect to DHCP to obtain private IP.

(2) Some application vulnerabilities can form reflection amplification attacks, and will also be identified and isolated by the security protection system, such as Memcached UDP amplification attack, NTP Monlist vulnerability amplification attack, etc.

**Common Security Vulnerabilities**: Machine login or weak password/empty password of application, system vulnerabilities, application vulnerabilities, web vulnerabilities, language running environment vulnerabilities. These vulnerabilities provide a prerequisite for hackers to intrude.

**General Troubleshooting Method**: Whether there is a remote management weak password; whether services with non-security configuration are open to public; whether there are abnormal files and processes.

**Security Advice**: Back up important files on the machine; reinstall operating system deployment service; enhance password complexity, do not use passwords that can be easily guessed; enable security group policy, with only the necessary ports 22, 3389, 80, and 443 opened; update system security patches regularly; and back up important data files regularly.

If the user needs to apply for intrusion analysis tracing, please keep the site and open the technical ticket.

**Description of Backup Data and Rebuild**

In order to completely clear malicious programs, users can consider rebuilding after backing up data and redeploying the environment.

1. Backup data: You can back up data to the cloud disk. Rebuilding will clear the data on the system disk without affecting the data on the cloud disk; you can also back up the data to your local.

2. Rebuild: After the virtual machine is shut down, you can select Rebuild in the virtual machine's menu options.

**Description of Virtual Machine Security Baseline**

1. System Patch Management: The system shall update the security patches regularly. When there are new high-risk and severe vulnerability being exposed, the security patches shall be updated immediately;

2. System Service Configuration: Disable unnecessary services, and configure necessary identity and access management policies for non-public network services (such as SSH, MYSQL, etc.);

3. File Permission Configuration: File permissions shall be applied to the minimum permission reason; the system configuration files shall be locked after the configuration is completed;

4. Verification and Authorization Configuration: SSH shall use the certificate method for identity verification, and prohibit the root users from using passwords to log in; and perform access permission configuration of adapted files and directories on the users;

5. Password Policy Configuration: The appropriate password security policy shall be configured, and the reference is as follows: Number of attempts (5), minimum different characters (3), minimum password length (8), minimum capital letters (1), minimum lowercase letters (1), and the least number (1);

6. User Account Configuration: Delete or disable the useless accounts in the system, and delete the accounts of the dimission personnel in time;

7. Application Permission Configuration: Application programs shall be started with minimum permission (at least not by the root users);

8. Web Application Security: Web applications shall be ensured that there are no security vulnerabilities such as file upload, SQL injection, and code execution; the above vulnerabilities may cause the system intrusion;

9. If you need further and more targeted security services, you can contact customer service personnel or purchase “JD Cloud Security Consulting Service".

**Best Practices of JD Cloud Security Group**

1. All rules shall comply with the principle of minimum permission;

2. For Web services, only port 80 or 443 is allowed to be open to the public network by default;

3. It is strictly forbidden to open non-public network service ports to the public network (such as background service, and intermediate layer service);

4. It is strictly forbidden to configure the database service port (such as mysql port 3306) to be accessible to public network;

5. It is strictly forbidden to configure the remote management service port (such as rpd port 3389, and ssh port 22) to be accessible to public network;

6. For the management background service that must be accessed by public network, the access source IP shall be strictly limited in the entrance rules, and the service must not be open to all public IPs;

7. Appropriate identity and access management shall also be conducted to exit rules.

**Good Backup Habit**

1. System backup: Regularly capture the private images as restore points

2. Data backup: The data is placed on the cloud disk, and the cloud disk snapshot shall be regularly performed.
