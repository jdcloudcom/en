# FAQ

**1, Q: Which scenario is Anti-DDoS Basic applicable to?**

A: JD Cloud Anti-DDoS Basic applies to all attack scenarios with the highest attacking flow rate of 2G. Once the attack flow exceeds the basic protection capability of the machine room, a black hole will be triggered. The black hole will limit the flow towards the public network IP for a certain period of time.

**2, Q: How do I start Anti-DDoS Basic?**

A: Anti-DDoS Basic does not need to be started. As long as the public network IP of JD Cloud is purchased, Anti-DDos Basic is automatically running for each public network IP, and the defense bandwidth is 2G.

**3, Q: How to turn off Anti-DDoS Basic?**

A: Anti-DDoS Basic is automatically on and cannot be turned off. It can protect your public network IP against DDos attacks and does not have any impact on normal business accesses.

**4, Q: What are the requirements of the public network IP in defense?**

A: Anti-DDoS Basic can only defend the domain name that has been filed. If the domain name is not filed, the defense will stop immediately, and a warning notification will be sent.

**5, Q: How long does a black hole last?**

A: Once a black hole is triggered, it will last at least 60 minutes, during which the IP of the public network is still monitored. If the attacking flow again goes beyond the protection capacity, the black hole time will be extended by 60 minutes counting from the last time point the attack was detected.
  
**6, Q: What if the attack flow exceeds 2G?**

A: A black hole is triggered when the attacking flow rate exceeds 2G, and the access to the IP is shielded for a period of time. It is recommended that you purchase [Anti-DDoS Pro](https://www.jdcloud.com/products/ipanti) service from JD Cloud for a stronger defense.

**7, Q: Which attack types are supported in Anti-DDoS Basic?**

A: Including and not limited to SYN Flood, ACK Floods, TCP Floods, UDP Flood, DNS reflection attacks, NTP reflection attacks, SSDP reflection attacks, and other common attacks.

If the above cannot solve your problem, consult the after-sales of the product: [after-sales consultation](https://ticket.jdcloud.com/myorder/form?cateId=2&questionId=13)

# Related Documents

- [What is Anti-DDoS Basic? ](https://github.com/jdcloudcom/cn/blob/edit/documentation/Cloud-Security/Basic-Anti-DDoS/Introduction/Overview.md)
- [Anti-DDoS Basic Structure](https://github.com/jdcloudcom/cn/blob/edit/documentation/Cloud-Security/Basic-Anti-DDoS/Introduction/Basic-Infrastructure.md)
- [Quick Start](https://github.com/jdcloudcom/cn/blob/edit/documentation/Cloud-Security/Basic-Anti-DDoS/Getting-Started/Basic-Anti-DDos-Started.md)
