# Configuration of Non-web Service Protection Rules
Protection rules of Anti-DDoS Pro non-web service are the protection function to mitigate small traffic connection attacks by restricting connection speed, package length and other parameters of non-web service IPs and ports connected to Anti-DDoS Pro IPs based on protection of IP addresses & ports.

Configuration steps are as below:

- First log in to [Anti-DDoS Pro Console](https://ip-anti-console.jdcloud.com/instancelist).
- Find the instance to be configured, and click the instance name to enter the **Instance Details** page.
- Switch to **Non-web Service Forwarding Configuration** 
    ![非网站转发规则](../../../../../image/Advanced%20Anti-DDoS/net-service-protection-rule-03.png)

### Operation Steps

1. Click **Protection Rules** and enter the Web Service Protection Rules Configuration Page.</br>
    ![非网站防护规则](../../../../../image/Advanced%20Anti-DDoS/net-service-protection-rule-02.png)
    
2. Click the **Edit** icon to enter the Protection Rules Edition Page.</br>
    ![非网站防护规则](../../../../../image/Advanced%20Anti-DDoS/net-service-protection-rule-04.png)    
    
3. Enable each rule switch according to business features and set thresholds, with description of each configuration item as below.</br>
    ![非网站防护规则](../../../../../image/Advanced%20Anti-DDoS/net-service-protection-rule-05.png)    

|Configuration Item             |Description |
|----------------------|---------------|
|IP Address Spoofing and Empty Connection          |IP address spoofing and empty connection protection, only applicable to TCP protocol rules, and enabled by default.|
|Speed limit for source new connections          |Count of new connections created every second for one source IP, new connections exceeding the limit will be discarded.|
|Speed limit for source concurrent connections          |Count of concurrent connections created every second for one source IP, concurrent connections exceeding the limit will be discarded.|
|Speed limit for target new connections          |Maximum count of new connections created every second for destination IPs and ports, new connections exceeding the limit will be discarded. As the protection devices are clustered, there are errors in speed limit for new connections.|
|Speed limit for target concurrent connections          |Maximum count of concurrent connections created every second for destination IPs and ports, connections exceeding the limit will be discarded.|
|Package Length Filter              |Length of payload included in packets, unit: byte, the package less than the minimum length or more than the maximum length will be discarded.|
|Geo Interception                 |Interception is carried out depending on traffic source. Not selected by default. Support Overseas+China for country and provinces for China. Support multi-choice.|
