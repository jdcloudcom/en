# Broiler Server Processing Method
**What is Broiler?**

　　Broiler is a common type of attack. Specifically, a hacker puts a backdoor on your computer. After that, the hacker can view your computer information and remotely control the computer to make it a zombie computer of the hacker. Then, the hacker can do whatever he wants in your computer.

**What Should Users Do for Broiler Servers?**

　　Broiler can invade various systems, such as windows2003, linux and unix. Once encountering a broiler server, rescue the server immediately in following steps:

　　1. Change the password of the system administrator, and the password shall not be less than 8 digits and composed by capital or lowercase letters, numbers or special characters;

　　2. Change the remote login port and enable the IP address that was blocked by the firewall. The firewall configuration is only accessible to specific service ports, and it performs source IP IAM for services that are not required to be accessible to all users, such as FTP and database;

　　3. Check whether the unauthorized port is accessible.

　　Enter netstat /ano in CMD command line in Window and check the port. Check the process of the open port according to PID, delete the files of corresponding path (according to the PID check process: **Start**--> **Run**--> **Input into "msinfo32" Software Environment** --> **Running Tasks**.

　　Input Command netstat in Linux – ANP View

　　4. Install professional anti-virus and anti-Trojan software to perform full-disk virus scanning and killing on the server;

　　 5. Delete the unknown account in the system, check whether there are hidden accounts of SAM key in the registry of windows systems;

　　 6. Restrict the access of the web running account to the file system, and enable the read-only access only.



　　It should be noted that if the above method cannot clean the system, it can only be reset.

**How to Protect It Normally?**

　1. Change passwords for server login, database connection, website background, FTP and other service manager management software.

　2. Reinforce the operating system, disable dangerous system services, close Port 137, 138, 139 and 445, start the system audit strategy, put patches frequently and fix system vulnerabilities in a timely manner, as well as update the network programs. Although the virus database of anti-virus software can be updated through automatic update, it is recommended to manually update the virus database on time.



If the problem has not been resolved, please record the test results of the previous steps, related log information or screenshots, then contact after-sales for technical support.
