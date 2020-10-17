# Task management

### Create Task

  ![](../../../../image/Website-Threat-Inspector/wts-rwgl-11.png)

Scan target: 
- Public Network Asset: The single IP, domain and subdomain can be imported via asset management 
- Cloud VPC Intranet Asset
- External IDC Intranet Asset

Scanner module: Port vulnerability scan, Web vulnerability scan, weak password scan and WebService scan.

Execution method: Scan Now, Fixed-time Start-up and Periodic Scan  

Port Configuration: Port scan policy, you can flexibly configure or start by default the scanned port as needed: 21-25,80-89,110,143,443,513,873,1080,1433,1521,1158,3306-3308,3389,3690,5900,6379,7001,8000-8090,9000,9418,27017-27019,50060,111,11211,2049  

          You should be cautious when selecting to enable UDP scan configuration because this will affect the scan speed to a certain extent.  

Web Scan Configuration: Crawl speed: Default is 3 (1-7 are optional). You should be cautious because the faster the crawl speed is, the longer scan time it takes.   

           Maximum crawls: Default is 50 (1-1000 are optional)  

### Task management

  ![](../../../../image/Website-Threat-Inspector/wts-rwgl-12.png)


### Report Download

Click **Download** on the task bar

  ![](../../../../image/Website-Threat-Inspector/wts-rwgl-13-bb.png)