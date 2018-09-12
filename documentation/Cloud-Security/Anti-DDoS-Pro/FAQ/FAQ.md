# FAQ

**Q: The IP access of which regions is supported by advanced anti-DDoS?**

A: Advanced Anti-DDoS supports IP access of all regions, including JD Cloud and users outside the Cloud.

**Q: Which forwarding protocols does Advanced Anti-DDoS support?**

A: Advanced Anti-DDoS supports the forwarding setting of protocols including TCP, UDP, HTTP and HTTPS, and supports websocket protocol access, covering all business scenarios.

**Q: What are the differences between non-web service forwarding and web service forwarding?**

A: The two forwarding settings correspond to different application scenarios and usage protocols. Specific differences are as follows:
- Non-web service: Mainly applied to business scenarios such as games, e-commerce, finance, APP, etc.; supported protocols: TCP protocol and UDP protocol.

Provides 3 to 4 layers of SYN Flood, ACK Floods, ICMP Flood, UDP Flood, NTP Floods, SSDP Flood and other attacks protection. The DDoS protection for application layer is not supported.
- Web Service: Mainly applied to Web Service business. Supported protocols: http/https protocol; supports websocket access, port accesses of 80 and 443, and non-standard port access.

In addition to providing SYN Flood, ACK Floods, ICMP Flood, UDP Flood, NTP Floods, SSDP Flood and other attacks protection, it also supports application-layer protection against attacks such as CC attacks, HTTP Flood, etc.

**Q: What ISP lines does Advanced Anti-DDoS support?**

A: Advanced Anti-DDoS supports single and multiple ISP line purchase, and supports the single ISP line to upgrade to multi ISP lines.
- Single ISP line: The China Telecom's ISP line can support up to 400G of protection bandwidth.

- Multi ISP line: There are two optionalISP lines: Telecom + Unicom and Telecom + Unicom +CMCC, supporting up to 400G of protection bandwidth.

By default, the China Telecom's ISP line will be resolved to the China Telecom Machine Room, the China Unicom's ISP line to the China Unicom Machine Room, and the CMCC's ISP line to the CMCC Machine Room. If the attack traffic exceeds the maximum capacity of China Unicom Machine Room or CMCC Machine Room, the ISP line will be resolved to the China Telecom's ISP line to complete the cleaning.


**Q: Does Advanced Anti-DDoS support extensive domains?**

A: In Web Service forwarding rules configuration of advanced anti-DDoS, it supports the protection of the extensive domains.

Extensive domain name resolution refers to the use of wildcard (*) as secondary domain name to enable all secondary domain names to point to the same IP. For example, it supports configurating *.jdcloud.com.


**Q: What is business bandwidth, and what happens it is exceeded?**

A: Business bandwidth purchased by Advanced Anti-DDoS is for the entire instance, meaning the bandwidth in the IN or OUT direction of all normal traffic for the instance.

In default, Advanced Anti-DDoS gifts 100M business bandwidth, and if it is exceeded, it would trigger traffic speed limit, which may lead to random data loss. If the bandwidth goes beyond the business bandwidth, the system will send alarm notification and recommend you upgrade it timely.

**Q: What are the requirements for access to domains of advanced anti-DDoS?**

A: According to relevant laws and regulations of Ministry of Industry and Information Technology, Advanced Anti-DDoS only protects filed domains. If the domain is not filed, the Advanced Anti-DDoS service will not be available.

**Q: What is the main business of CC defense?**

A: CC defense is mainly for Web Service business, and is closed by default. CC defense does not take effect when closed.

After turning on the main switch, all the domains of this instance will turn on CC defense, and you can manually close the domains that do not require CC defense.

**Q: Why would a black hole occur?**

A: When the attack traffic reaches the upper limit of the Advanced Anti-DDoS package that you purchase, a black hole will be triggered and shield all access to the server.

It is recommended that you buy a better protection packages for greater protection. After the package has been upgraded, the system will automatically become unbanned in seconds.

**Q: How long will the black hole be lasting, and how to unban it?**

A: By default of the black hole policy of advanced anti-DDoS, it would last for 2 hours. If the server has not been attacked in 2 hours, it will automatically become unbanned.

The duration before the server is unbanned is related to the number of times the black hole is triggered and the peak value of the attack. If the server continues to receive attack, the duration of the ban will continue to lengthen.

If the attack traffic so excessive that the operator's ban is triggered, the duration of the ban is determined by the operator's policy and becomes uncertain.

**Q: What error status codes does advanced protection support?**

A: Advanced protection sets up error code pages for the following special cases, and you can view and troubleshoot the problems according to the prompt on the page .

| 错误码	| 含义	| 出现原因 | 该怎么办 |
| :- | :- | :- | :- |
|ERROR 422 |	禁止访问 | 	对不起，由于您的电脑或IP可能存在恶意行为，网站管理者已对您所在的区域或访问IP进行了访问控制，拒绝了您的访问。|	请联系网站管理员，修改访问策略。|
|ERROR 420 |	请求重入 |	您的同一访问多次经过京东IP高防的节点。|	请确认网站配置，是否配置了多重代理服务器，且代理路径发生环路。|
|ERROR 522 |	源站不可达	您的同一访问多次经过京东IP高防的节点。 |	源站服务器出错，常见原因是DNS设置出错、变更尚未生效或源站防火墙 |对请求进行了封禁。请稍后访问，或联系网站管理员。|
|ERROR 421 |	域名不存在	| 您访问的域名没有购买京东云IP高防服务或者配置未生效，因此无法提供服务。 |	请确认该网站已购买京东云的IP高防服务，且配置已生效。|
|ERROR 523 |	源站繁忙 |	有可能是源站由于遭受CC攻击而导致服务器繁忙。	| 源站服务器繁忙，请稍后访问。|
|ERROR 524 |	服务器繁忙	源站服务器繁忙。 |	源站服务器繁忙，请稍后访问。 |

An example of the error page style:
![](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/error%20page.png)

** Q: What is backup IP? What's the benefit of configuring a backup IP?**

A: The backup IP is the standby to the back-to-source IP. The definitions are as follows:

Back-to-source IP: Refers to the back-to-source address of advanced protection in case of attacks, which can be an IP address or a domain. It is recommended that the back-to-source IP be externally invisible.

backup IP: Refers to the back-to-source IP address of advanced protection in case of non-attack state. It is a externally visible backup IP. backup IP is not mandatory.

The benefits of configuring backup IP are:
- When the user's normality is not at the advanced protection, the traffic will reach the backup IP address. When the normality is ensured, the service delay will be lower and the access will be faster; Only when attacked will JD Cloud Intelligent Dispatching Center dispatch traffic to advanced protection for filter and cleaning, before forwarding clean traffic to the source station.
- The IP of normal use is separated from the back-to-source IP. This effectively improves the user's business availability.

As an example of non-web service settings, the schematic diagram is as follows:
![](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/instruction%2001.png)
You can expand the “Product Graphic Instructions” on the Instance Details page to view the diagram.

**Q: Does Advanced Anti-DDoS support non-80-port website access?**

A: It supports. Advanced Anti-DDoS supports custom port to meet access requirements for the non-standard-port Web Service business.

**Q: What is an HTTP back-to-source?**

A: As shown in the figure below, after the HTTP back-to-source is turned on, it returns to server via Advanced Anti-DDoS and will be translated into the protocol back-to-source of HTTP. The back-to-source port used by default is 80.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/HTTP%20rule%2001.png)

If the port is customized by HTTP, the port back-to-source of custom port will be used.

