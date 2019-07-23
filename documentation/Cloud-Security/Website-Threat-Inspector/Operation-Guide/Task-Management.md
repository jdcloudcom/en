# Task management

#### Create Task

  ![](../../../../image/Website-Threat-Inspector/webscan-task.png)

Scan target: The single IP, domain and sub-domain are supported by importing asset management  

Scan module: Scan of port vulnerabilities and scan of Web vulnerabilities. (support scope of plug-ins: Please refer to the plug-in support list below) 

Execution method: Immediate execution, periodic execution  

Port configuration: Port scan policy, the user can edit and start by default the scanned port: 21-25,80-89,110,143,443,513,873,1080,1433,1521,1158,3306-3308,3389,3690,5900,6379,7001,8000-8090,9000,9418,27017-27019,50060,111,11211,2049  

          Whether to start UDP scan, the user is requested to cautiously decide whether to enable it, since enabling the configuration can affect the scan speed.  
         
Configuration of Web scan: Crawler depth: 3 by default and 6 as the maximum, the user is requested to cautiously decide whether to enable it, since enabling the configuration can affect the scan speed.   

           Maximum crawling count: 50 by default, 100 as the maximum configurable  
            


#### Task management

  ![](../../../../image/Website-Threat-Inspector/webscan-task.png)

  ![](../../../../image/Website-Threat-Inspector/webscan-task2.png)


#### Reports

Click **Download** on the task bar

  ![](../../../../image/Website-Threat-Inspector/webscan-task3.png)

#### Plug-in Support List


| Category |	Name |
| ------ | ------ |
| Scan of Port Vulnerability |	 Demolition of MySQL Database Weak Password
| Scan of Port Vulnerability | Demolition of MSSQL Database Weak Password
| Scan of Port Vulnerability | Demolition of PostgrSQL Database Weak Password
| Scan of Port Vulnerability | 	Unauthorized Access Testing and Weak Password Demolition of MongDB
| Scan of Port Vulnerability | Unauthorized Access Testing and Weak Password Demolition of Redis
| Scan of Port Vulnerability |	Unauthorized Access Testing and Weak Password Demolition of Memcached
| Scan of Port Vulnerability |	Weak Password Demolition of Ftp
| Scan of Port Vulnerability |	Weak Password Demolition of SSH
| Scan of Port Vulnerability |	Weak Password Demolition of Telnet
| Scan of Port Vulnerability | Weak Password Demolition of RDP
| Scan of web Vulnerability | Remote Code Execution Vulnerability Microsoft RDP CVE-2019-0708
| Scan of web Vulnerability	 | Scan of Web Sensitive Information - phpinfo
| Scan of web Vulnerability |	Unauthorized Access of Elsaticsearch
| Scan of web Vulnerability	 | Weak Password Demolition of Apache Tomcat Manager
| Scan of web Vulnerability	 | Weak Password Demolition of phpMyAdmin
| Scan of web Vulnerability |	Test for Server-Side Request Forgery (SSRF)
| Scan of web Vulnerability |	Injection of XML External Entity (XXE)
| Scan of web Vulnerability |	Redirected Test for Unverified Opening
| Scan of web Vulnerability |	Test for Code Execution
| Scan of web Vulnerability |	Test for Cross Site Script Attack (XSS)
| Scan of web Vulnerability |	Test for SQL Injection Attack
| Scan of web Vulnerability |	Test for Local File Inclusion (LFI)
| Scan of web Vulnerability |	Test for Historic High Risk Vulnerability of Struts2
| Scan of web Vulnerability |	 Test for Vulnerability in HeartBleed
| Scan of web Vulnerability |	 Test for ShellShock Vulnerability
| Scan of web Vulnerability  |	Test for Vulnerability in Remote Code Execution of WordPress (CVE-2016-10033)
| Scan of web Vulnerability	| Test for Vulnerability in Service Denying Attack of WordPress (CVE-2018-6389)
| Scan of web Vulnerability	| Unserialized Vulnerability in weblogic (CVE-2015-4852, CVE-2016-0638, CVE-2016-3510, CVE-2017-3248, CVE-2018-2628, CVE-2018-2893)
| Scan of web Vulnerability	| Vulnerability in Remote Code Execution of weblogic XMLDecoder (CVE-2017-10271)	
| Scan of web Vulnerability	| Vulnerability in Remote Code Execution of ThinkPHP5.X (CVE-2018-20062)
| Scan of web Vulnerability	| Identification of Low Version of DedeCms
| Scan of web Vulnerability	| Vulnerability in Injection of DedeCms guestbook
| Scan of web Vulnerability	| Public Agent
| Scan of web Vulnerability	| Amplification of NTP Reflection
| Scan of web Vulnerability	| Discuz X3.4 Arbitrary File Deletion
| Scan of web Vulnerability	| Discuz X3.1 Convert RCE
| Scan of web Vulnerability	 | ElasticSearch RCE CVE-2014-3120
| Scan of web Vulnerability	 | ElasticSearch Directory Traversal CVE-2015-3337
| Scan of web Vulnerability	 | Amplification of Memcached Reflection
| Scan of web Vulnerability	| Discuz! Vulnerability in Cross Site Script of DiscuzX (CVE-2018-10298)
| Scan of web Vulnerability	| Discuz! x3.4 Foreground SSRF
| Scan of web Vulnerability	| ElasticSearch RCE (CVE-2015-1427)
| Scan of web Vulnerability	| ElasticSearch Directory Traversal(CVE-2015-5531)
| Scan of web Vulnerability	| Apache Solr RCE(CVE-2019-0192)
| Scan of web Vulnerability	| ColdFusion Unserialized (CVE-2017-3066)
| Scan of web Vulnerability	| ColdFusion RMI Unserialized (CVE-2018-4939)
| Scan of web Vulnerability	| Uploading of ColdFusion File (CVE-2018-15961)
| Scan of web Vulnerability	| Unauthorization of Hadoop YARN ResourceManager (json)
| Scan of web Vulnerability | Unauthorization of Storm UI (json)
| Scan of web Vulnerability	 | Vulnerability in Cross Site Script Attack (XXS) SWFUpload Upload Control
| Scan of web Vulnerability	| Vulnerability in Improper Configuration of Flash
| Scan of web Vulnerability	| Vulnerability in user.php XSS of ECShop Member Center
| Scan of web Vulnerability	| Vulnerability in Injection of Wide Character SQL of ECShop GBK Version
| Scan of web Vulnerability	| Vulnerability in Ecshop pages.lbi.php XSS
| Scan of web Vulnerability	| Vulnerability in ECShop receive.php XSS
| Scan of web Vulnerability	| Vulnerability in Injection of Alipay SQL of ECShop
| Scan of web Vulnerability	| Vulnerability in Local File Inclusion of ECShop calendar.php
| Scan of web Vulnerability	| Vulnerabilities in SQL Injection and RCE of ECShop user.php
| Scan of web Vulnerability	| Vulnerability in XSS of Profile under Directory of DedeCMS Dialog
| Scan of web Vulnerability	| Information Leakage Vulnerability DedeCMS mysql_error
| Scan of web Vulnerability	| Vulnerability in XSS of DedeCMS recommend.php title
| Scan of web Vulnerability	| Vulnerability in XSS of DedeCMS wap
| Scan of web Vulnerability	| Vulnerability in Local File Inclusion of DedeCMS carbuyaction.php
| Scan of web Vulnerability	| Vulnerability in XSS of DedeCMS bshare
| Scan of web Vulnerability	| Vulnerability in Variable Replacement of DedeCMS install/index.php
| Scan of web Vulnerability	| Vulnerability in SQL Injection of Hishop Brand.aspx sortOrderBy
| Scan of web Vulnerability	| Vulnerability in SQL Injection of Hishop ShoppingHandler.aspx options
| Scan of web Vulnerability	| Cross Site Script Attack (XSS) of phpMyAdmin error.php
| Scan of web Vulnerability	| Sensitive Information about Installation Directory of Shopex
| Scan of web Vulnerability	| Cross Site Script Attack (XSS) of Discuz!7x showmessage
| Scan of web Vulnerability	| Leakage of Sensitive Information - Apache solr Management Background
| Scan of web Vulnerability	| Leakage of Sensitive Information - JetBrains IDE workspace.xml
| Scan of web Vulnerability	| Leakage of Sensitive Information - Version Control System - SVN
| Scan of web Vulnerability	| Leakage of Sensitive Information - Version Control System - Git 
| Scan of web Vulnerability	| Vulnerability in Leakage of Local Path Information of Wordpress theme template
| Scan of web Vulnerability	 | Vulnerability in WordPress Social Warfare Plugin(<=3.5.3) XSS/RCE (CVE-2019-9978)
| Scan of web Vulnerability	| Leakage of Sensitive Information - Probe File
| Scan of web Vulnerability	| Leakage of Sensitive Information - SSH Key and Credential
| Scan of web Vulnerability	| Vulnerability in Remote Code Execution (RCE) of MS-15034 IIS HTTP.SYS
| Scan of web Vulnerability	 | Leakage of Key Sensitive Information of Cormail

