# FAQ

**1, Q: Which scenario is the basic protection applicable to?**

A: JD Cloud Anti-DDoS Basic Protection applies to attack protection scenarios with the highest attacking flow rate of 2G. Once the attack flow exceeds the basic protection capability of the machine room, the black hole will be triggered. The black hole will limit the flow for the public network IP for a certain period of time.

**2, Q: How do I start the basic protection?**

A: The basic protection does not need to be started. As long as the public network IP of JD Cloud is purchased, the DDos defense is automatically running for each public network IP, and the defense bandwidth is 2G.

**3, Q: How to turn off the basic protection?**

A: The DDos basic protection is automatically on and cannot be turned off. The Basic Anti-DDoS protects your public network IP from DDos and does not have any impact on normal business access.

**4, Q: What are the requirements for the defense's public network IP?**

A: Basic protection can only defend the domain name that has been filed. If the domain name is not filed, the defense will stop immediately, and a warning notification will be sent.

**5, Q: How long does a black hole last?**

A: Once a black hole is triggered, it will last at least 60 minutes, during which the IP of the public network is still monitored. If detecting again the attacking flow exceeding the protection capacity, the black hole time will be extended by 60 minutes counting from the last time point the attack was monitored.
  
**6, Q: What if the attack flow exceeds 2G?**

A: The black hole is triggered when the attack flow exceeds 2G, and the access to the IP is shielded for a period of time. It is recommended that you purchase JD Cloud [Advanced Anti-DDoS](https://www.jdcloud.com/products/ipanti) services from JD Cloud for greater defense.

**7, Q: Which attack types are supported for underlying protection**

A: Including and not limited to SYN Flood, ACK Floods, TCP Floods, UDP Flood, DNS reflection attacks, NTP reflection attacks, SSDP reflection attacks, and other common attacks.

If the above cannot solve your problem, consult the after-sales of the product: [after-sales consultation](https://ticket.jdcloud.com/myorder/form?cateId=2&questionId=13)

# Related Documents

- [What is the basic protection? ](https://github.com/jdcloudcom/cn/blob/edit/documentation/Cloud-Security/Basic-Anti-DDoS/Introduction/Overview.md)
- [Basic Protection Structure](https://github.com/jdcloudcom/cn/blob/edit/documentation/Cloud-Security/Basic-Anti-DDoS/Introduction/Basic-Infrastructure.md)
- [Quick Start](https://github.com/jdcloudcom/cn/blob/edit/documentation/Cloud-Security/Basic-Anti-DDoS/Getting-Started/Basic-Anti-DDos-Started.md)
