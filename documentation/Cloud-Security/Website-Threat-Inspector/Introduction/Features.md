# Features

## Visual Overview of Threats
| Feature Item|Feature Description | 
|-----|----|
|Asset Risk Assessment	 |Visualize the risk level (high, moderate, low) of all current assets | 
|Asset Vulnerability Statistics	 |Visualize the vulnerability count of all current assets | 
|Risk Asset Statistics	 |Visualize the count of IPs and domains of all current risk assets | 
|Vulnerability Change Analysis	 |Visualize the current development and change trend for the found vulnerability summary and the IPs & domains of risk assets based on time dimension | 
|TOP10 Risk Assets	|Visualize the current TOP 10 risk assets in terms of IP assets and domain assets based on time dimensions of last one week and last one month | 
|TOP10 Vulnerability Types	|Visualize the current TOP 10 vulnerability types in the customer assets in terms of category of vulnerability types based on time dimensions of last one week and last one month | 

## Scan Asset Management
| Feature Item|Feature Description | 
|-----|----|
|Multiple Types of Adding Scanning Assets	|Support adding user assets to be scanned by domain, subdomain and IP and support currently http assets|
|Automatic Asset Association Discovery	|Automatically associate, discover and import domains and IP assets purchased by customers on JD Cloud|
|Asset Certification and Management	|Support certifying assets by certification files|
|Asset Login Status Management	|Support cookies setting of asset login status|
|URI White List Setting Customization|Set prohibiting from scanning path keywords to designate pages not to crawled, e.g. /logout.php, fill in logout here. Perfect matching mode, in which logout1.php will not be excluded|
|Asset Search by Fuzzy Matching	|Retrieve and search assets information by asset names in fuzzy matching mode|
|Asset Management Visualization	|Visualize assets information for cookies and URI white list of asset names, asset types, certification status, discovery mode and login status|

##  Scan Task Management	
| Feature Item|Feature Description | 
|-----|----|
|Quickly Add Scan Target Asset	|Multiple scan target assets can be quickly checked and added to the scan tasks in one time|
|Select Multiple Scan Modes on Demand	|Scan modes such as port vulnerability scan, web vulnerability scan are supported|
|Flexibly Select Multiple Scan Methods	|Scan methods such as single scan and periodical scan are supported and the periodical scan supports monthly, weekly, daily scans and scans by fixed hour, minute and second|
|Select Customized Scan Speed	|Three speeds (high, moderate, low) are available according to actual scan tasks|
|                 |High: 500 HTTP requests every second, having a high impact on service server|
|                 |Moderate: 200 HTTP requests every second, having a low impact on service server|
|                 |Low: 50 HTTP requests every second, having a very low impact on service server|
|Select Customized Port Configuration	|Users can customize the ports to be scanned based on actual needs and the default configurations are as follows: 21-25,80-89,110,143,443,513,873,1080,1433,1521,1158,3306-3308,3389,3690,5900,6379,7001,8000-8090,9000,9418,27017-27019,50060,111,11211,2049|
|Support UDP Advanced Scan Mode |UDP advanced scan mode is provided to effectively detect vulnerability reflected and enlarged by ntp, vulnerability of memcache unauthorized access and other vulnerabilities based on UDP protocol|
|                 |Remark: Users should be cautious when they select to enable UDP configuration because this will affect the scan speed| 
|Customize web Scan Configuration	  |Make flexible choices according to web crawl speed (default is 3, users can configure it between 1-7) and maximum crawls (default is 50, users can configure it between 1-1000)|
|Scan Task Search by Fuzzy Matching	|Assets information can be retrieved and searched by scan task names in fuzzy matching mode|
|Scan Task Visualization	    |Scan task information can be visualized in terms of task name, scan cycle, scan status and vulnerability distribution (high|moderate|low)|

##  Scan Risk Management
| Feature Item|Feature Description | 
|-----|----|
|Security Vulnerability Risk Management	    |Present risk ratings (high risk, moderate risk, low risk) of hundreds of security vulnerabilities that can be verified by PoC test|
|                   |and visualize the asset quantity affected by this type of vulnerabilities, inform customers of the scan results (no risk currently and at risk) and the latest scan time of this type of vulnerabilities|
|                   |Support retrieving and searching by vulnerability name in fuzzy matching mode|
|                   |Support retrieving and searching according to different risk levels (high, moderate, low)|
|IP Asset Risk Management	    |Present scan vulnerability count of different risk levels (high, moderate, low) included in each IP asset (address) scanned|
|                 |and visualize the scan results (no risk currently and at risk) and the latest scan time of each IP asset (address)|
|                 |Support retrieving and searching by IP asset (address) in fuzzy matching mode|
|Domain Asset Risk Management	   |Present scan vulnerability count of different risk levels (high, moderate, low) included in each domain asset (link) scanned|
|                 |and visualize the scan results (no risk currently and at risk) and the latest scan time of each domain asset (link)|
|                 |Support retrieving and searching by domain asset (link) in fuzzy matching mode|

##  Security Assessment Report
| Feature Item|Feature Description | 
|-----|----|
|Clear Assessment Report Summary	|Clearly describe information of this scan task (scan task name, scan task object, scan mode, start and end time, etc.)|
|                 |Present risk levels (high, moderate, low) of available vulnerabilities existing in TOP 10 risk assets (IP dimension, domain dimension)|
|                 |Present TOP 10 vulnerable types and organization of assets marketed by each type of vulnerability|
|Detailed Asset Fingerprint Information	|Present each type of port services enabled by assets in this scan, and count up the IPs/domains associated with each service|
|                 |Present classification of web applications enabled by assets in this scan, and count up the IPs/domains associated with each web application|
|Sound Asset Vulnerability Information	|Present vulnerabilities in this scan by vulnerability name, affected asset information and asset details|
|                 |Present vulnerability count of different risk levels (high, moderate, low) corresponding to assets in this scan (IP dimension, domain dimension)|
