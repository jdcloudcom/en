# FAQ

**1. Q: What is the application scenario for Anti-DDoS Basic?**

A: JD Cloud Anti-DDoS Basic is applied to attack protection scenarios with the highest attacking flow rate not exceeding 2G. Once the attack flow exceeds the Anti-DDoS Basic capability of the machine room, the black hole will be triggered to limit the IP of the black hole for a certain period of time.

**2. Q: How to start Anti-DDoS Basic?**

A: Anti-DDoS Basic does not need to be started. As long as the public network IP of JD Cloud is purchased, the DDos defense is automatically opened for each public network IP, and the defense bandwidth of 2G is provided.

**3. Q: How to close Anti-DDoS Basic?**

A: DDos Anti-DDoS Basic is automatically opened and cannot be closed. Anti-DDoS Basic protects your public network IP from DDos and does not have any impact on normal business access.

**4. Q: What are the requirements for the defense's public network IP?**

A: Anti-DDoS Basic can only defend the domain name that has been filed. If the domain name is not filed, the defense will be stopped immediately, and the warning notification will be sent.

**5. Q: How long the public network IP will stay in black hole if a black hole is triggered?**

A: JD Cloud Security Protection System will constantly monitor the public IP traffic, which will automatically trigger the black hole status when detecting traffic attack exceeding the Anti-DDoS Basic capability of this data center. After the black hole status is triggered, the duration of the public IP entering the black hole status for the first time is 60 minutes. During this period, the public IP is still being monitored. Once a traffic attack exceeding the Anti-DDoS Basic capability of this data center is detected for the second time, the duration of the black hole status will be increased by 2 hours. At the moment, the public IP is still being monitored. If a traffic attack exceeding the Anti-DDoS Basic capability of this data center is detected for the third time when the public IP is still in black hole status, the duration of the black hole status will be increased by another 48 hours. In extreme cases, when the attack traffic of public IP is relatively large, it may trigger the black hole protection system of network operators, and the black hole status will last for 24 hours after entering the system. For individual users whose black hole status is frequently triggered, JD cloud reserves the right to extend the black hole duration and reduce the black hole threshold.
  
**6. Q: How does the attack flow exceed 2G?**

A: The black hole is triggered when the attack exceeds 2G, and the access to the IP is shielded for a period of time.

Recommend you purchase JD Cloud's [Anti-DDoS Protection Package](https://www.jdcloud.com/en/products/anti-ddos-protection-package) service or [Anti-DDoS Pro](https://www.jdcloud.com/products/ipanti) service to get more powerful defense capability.

**7. Q: What attack types are supported by Anti-DDoS Basic?**

A: Include but not limited to SYN Flood, ACK Floods, TCP Floods, UDP Flood, DNS reflection attacks, NTP reflection attacks, SSDP reflection attacks, and other common attacks.

**8、Q: What will you do if the 2G protection capacity of Anti-DDoS Basic cannot meet the demand?**

A: It is suggested that you shall buy the Anti-DDoS Protection Package service to improve your protection capacity.

At present, the Anti-DDoS Protection Package only supports maximum 50G protection capacity in cn-north-1 and cn-east-2. If you need more protection capacity and web attack protection, it is suggested that the Anti-DDoS Pro shall be purchased.

If the above cannot solve your problem, consult the after-sales of the product: [after-sales consultation](https://ticket.jdcloud.com/myorder/form?cateId=4&questionId=23)

# Related Documents

- [What is Anti-DDoS Basic? ](../Introduction/Product-Overview.md)
- [Anti-DDoS Basic Architecture](../Introduction/Basic-Infrastructure.md)
