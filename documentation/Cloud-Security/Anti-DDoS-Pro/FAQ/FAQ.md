# FAQ

**Q: The IP access of which regions is supported by Anti-DDoS Pro?**

A: Anti-DDoS Pro supports IP access of all regions, including JD Cloud and users outside the Cloud.

**Q: Which forwarding protocols does Anti-DDoS Pro support?**

A: Anti-DDoS Pro supports the forwarding setting of protocols including TCP, UDP, HTTP and HTTPS, and supports websocket protocol access, covering all business scenarios.

**Q: What are the differences between non-web service forwarding and web service forwarding?**

A: The two forwarding settings correspond to different application scenarios and usage protocols. Specific differences are as follows:
- Non-web service: Mainly applied to business scenarios such as games, e-commerce, finance, APP, etc.; supported protocols: TCP protocol and UDP protocol.

Provides 3 to 4 layers of SYN Flood, ACK Floods, ICMP Flood, UDP Flood, NTP Floods, SSDP Flood and other attacks protection. The DDoS protection for application layer is not supported.
- Web Service: Mainly applied to Web Service business. Supported protocols: http/https protocol; supports websocket access, port accesses of 80 and 443, and non-standard port access.

In addition to providing SYN Flood, ACK Floods, ICMP Flood, UDP Flood, NTP Floods, SSDP Flood and other attacks protection, it also supports application-layer protection against attacks such as CC attacks, HTTP Flood, etc.

**Q: What ISP-Lines does Anti-DDoS Pro support?**

A: Anti-DDoS Pro supports purchase of Telecom + Unicom + Mobile line and GBP line.

By default, the China Telecom's ISP-Lines will be resolved to the China Telecom Machine Room, the China Unicom's ISP-Lines to the China Unicom Machine Room, and the CMCC's ISP-Lines to the CMCC Machine Room. If the attack traffic exceeds the maximum capacity of China Unicom Machine Room or CMCC Machine Room, the ISP-Lines will be resolved to the China Telecom's ISP-Lines to complete the cleaning.

**Q: Does Anti-DDoS Pro support extensive domains?**

A: In Web Service forwarding rules configuration of Anti-DDoS Pro, it supports the protection of the extensive domains.

Extensive domain name resolution refers to the use of wildcard (*) as secondary domain name to enable all secondary domain names to point to the same IP. For example, it supports configurating *.jdcloud.com.

**Q: What is business bandwidth, and what happens it is exceeded?**

A: Business bandwidth purchased by Anti-DDoS Pro is for the entire instance, meaning the bandwidth in the IN or OUT direction of all normal traffic for the instance.

In default, Anti-DDoS Pro gifts 100M business bandwidth, and if it is exceeded, it would trigger traffic speed limit, which may lead to random data loss. If the bandwidth goes beyond the business bandwidth, the system will send alarm notification and recommend you upgrade it timely.

**Q: What are the requirements for access to domains of Anti-DDoS Pro?**

A: According to relevant laws and regulations of Ministry of Industry and Information Technology, Anti-DDoS Pro only protects filed domains. If the domain is not filed, the Anti-DDoS Pro service will not be available.

**Q: What is the main business of CC defense?**

A: CC defense is mainly for Web Service business, and is closed by default. CC defense does not take effect when closed.

**Q: Why would a black hole occur?**

A: When the attack traffic reaches the upper limit of the Anti-DDoS Pro package that you purchase, a black hole will be triggered and shield all access to the server.

It is recommended that you buy a better protection packages for greater protection. After the package has been upgraded, the system will automatically become unbanned in seconds.

**Q: How long will the black hole be lasting, and how to unban it?**

A: By default of the black hole policy of Anti-DDoS Pro, it would last for 2 hours. If the server has not been attacked in 2 hours, it will automatically become unbanned.

The duration before the server is unbanned is related to the number of times the black hole is triggered and the peak value of the attack. If the server continues to receive attack, the duration of the ban will continue to lengthen.

If the attack traffic so excessive that the operator's ban is triggered, the duration of the ban is determined by the operator's policy and becomes uncertain.

**Q: What error status codes does Anti-DDoS Pro support?**

A: Anti-DDoS Pro sets up error code pages for the following special cases, and you can view and troubleshoot the problems according to the notification on the page.

| Status Code	| Meaning	| Reasons for Occurring | What to do |
| :- | :- | :- | :- |
|ERROR 493 |	Request intercepted |	The same access from you has passed through the node of Anti-DDoS Pro of JD for several times or has been intercepted by CC defense. |	Please confirm CC defense configuration and if the website is configured with multiple proxy servers and the proxy path has a ring circuit.|
|ERROR 500/502/504 | Origin servers return errors |Origin server returns error codes 500, 502 and 504 | Origin Server Detection Service|
|ERROR 590/592/594 | Anti-DDoS Pro Return Error  | Back-to-origin connection creation of Anti-DDoS Pro node failed or is overtime	| Detect origin server service and configuration of Anti-DDoS Pro |

The example of default pattern of the status code return page is as shown in the figure below:
![错误码](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/error%20page01.png)

**Q: What is backup IP? What's the benefit of configuring a backup IP?**

A: The backup IP is the standby to the back-to-origin IP. The definitions are as follows:

Back-to-origin IP: Refers to the back-to-origin address of Anti-DDoS Pro in case of attacks, which can be an IP address or a domain. It is recommended that the back-to-origin IP be externally invisible.

Backup IP: Refers to the back-to-origin IP address of Anti-DDoS Pro in case of non-attack state. It is an externally visible backup IP. Backup IP is not mandatory.

The benefits of configuring backup IP are:

- When the user's normality is not at the Anti-DDoS Pro, the traffic will reach the backup IP address. When the normality is ensured, the service delay will be lower and the access will be faster; only when attacked will JD Cloud Intelligent Dispatching Center dispatch traffic to  for filter and cleaning, before forwarding clean traffic to the Origin Server.
- The IP of normal use is separated from the back-to-origin IP. This effectively improves the user's business availability.

As an example of non-web service settings, the schematic diagram is as follows:

![](https://github.com/jdcloudcom/en/blob/edit/image/Advanced%20Anti-DDoS/instruction%2001.png)

You can expand the "Product Graphic Instructions" on the Instance Details page to view the diagram.

Eg：

The back-to-origin IP address is 100.10.10.1 and the backup IP address is 100.10.10.2. The back-to-origin/defense status bar can be switched according to the network status.

- In the normal status, please select back-to-origin in the "Back-to-origin/Defense Status" bar, then the traffic will directly point to the backup IP address 100.10.10.2;
- When an attack is found, switch to Defense in the "Back-to-origin/Defense Status" bar, and the traffic will go to the IP address 100.10.10.1 through back-to-origin after being cleaned by high defense.


**Q: Does Anti-DDoS Pro support non-80-port website access?**

A: It supports.Anti-DDoS Pro supports custom port to meet access requirements for the non-standard-port Web Service business.

**Q: What is an HTTP back-to-origin?**

A: As shown in the figure below, after the HTTP back-to-origin is turned on, it returns to server via  Anti-DDoS Pro and will be translated into the protocol back-to-origin of HTTP. The back-to-origin port used by default is 80.
![](https://github.com/jdcloudcom/en/blob/edit/image/Advanced%20Anti-DDoS/HTTP%20rule%2001.png)

If the port is customized by HTTP, the port back-to-origin of custom port will be used.

**Q: Whether Anti-DDoS Pro supports IPv6, are there any special restrictions?**

A: The China Telecom Line of Anti-DDoS Pro has already supported IPv6 ISP-Lines, you can only select IPv4 addresses or select both IPv4 and IPv6 addresses according to your needs when you purchase new instances.

Restrictions: Unicom and CMCC ISP-Lines temporarily do not support IPv6; the purchased IPv4 instances temporarily do not support to upgrade to IPv6; IP addresses of back-to-origin do not support to configure IPv6. If you have special requirements, please submit ticket feedback.

**Q: After Advanced Anti-DDoS Pro is accessed, how to get the true client IP?**

A: For the (four-layer) non-web service access, the origin server needs to get the true client IP with the TOA module, if traffic is forwarded via the TCP port. When the UDP port is used for forwarding, the origin server cannot get the true client IP.

For the (seven-layer) web service access, as the seven-layer server is used as the agent, the origin server will observe the IP Address of the proxy server by default. We can get the client’s true IP Address via the field X-Forwarded-For in the HTTP header. The format is as follows: **X-Forwareded-For: user’s true IP, IP of proxy server 1, IP of proxy server 2, IP of proxy server 3,...**

Regardless of how many proxy servers are applied (for example, the traffic passes through Anti-DDoS Pro at first, then WAF, LB and other proxy servers), the user’s true request IP will always be located at the first location of X-Forwareded-For.
