 

###  Endpoint Security

![01-intr-functions.png](https://github.com/jdcloudcom/cn/blob/edit/image/Endpoint-Security/01-intr-functions.png)

#### Anti-brute Force

It includes remote login anti-brute force, database anti-brute force, FTP anti-brute force. It obtains the IP of brute force by system logs, network data package protocol analysis and other methods. It also determines whether the results meet the protection rules and it will block the IP and report to the cloud platform if the rules are met, with the users to be informed with the password crack incident suffering the them and the crack results.

#### Weak Password Detection

The account password will be detected by the rules of the weak password dictionary that built-in the system. The weak password risk will be displayed through the cloud platform to remind the users to perform modification so as to avoid the system account to be cracked.

#### Login Anomaly Reminder

Abnormal login behavior can be automatically identified according to the rules set by system, followed by early warning. The user can set preferred login location, when the login address is not the preferred login location, warning record will generate and report to the cloud platform to remind the user that there is long-distance login risk.

#### High Risk Vulnerability Detection

Regularly detect system high risk vulnerabilities and report the vulnerability details of the Virtual Machines. The product provides Windows system with vulnerability fix function while it provides Linux with vulnerability fix recommendation for manual repair. Prevent Virtual Machines from system risks caused by high risk vulnerabilities.

#### Webshell Detection

JD Cloud Endpoint Security will perform risk determination for the new Web program files on the servers. It provides early warning for WebShell files with risks and users may treat the Webshell files according to the early warning information.

#### Upgrade Maintenance

During the course of Endpoint Security process running, if anomaly occurs (main process deadlock, suspension, endless loop, occupying over high resources, etc), the daemon process will monitor the agent of the machine, perform protective operations such as reboot and upgrade for the abnormal process to prevent the machine agent anomaly from impacting the business of the machine; JD Cloud security team will regularly perform security update and maintenance for Endpoint Security agent and machine vulnerabilities to ensure the security of machines. The users need not participate in this course.
