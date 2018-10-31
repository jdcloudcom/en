## **TTL Introduction** 

### **I. What is the TTL Value of the Domain Name?**

TTL is the lifecycle of domain name resolution, and the full name of the TTL value is Time To Live, which represents the cached time of DNS records on the DNS server in brief. Every time you access website A, the DNS server domain name is not resolved every time. The DNS server is resolved when first accessing, the results of the resolution are cached on the local recursive DNS server, and when the second local user accesses website A, the recursive server will return the resolution result directly, instead of requesting resolution from the DNS server. So how long before the recursive server updates this resolution result? This is determined by TTL.

E.g.:

There is a domain name www.aaa.com, the corresponding IP address is 1.1.1.1, and its TTL is set to 3600 seconds. This record is stored on a DNS server. Now when a user accesses www.aaa.com, the network service provider's DNS will try to resolve www.aaa.com for the user. Of course, the DNS server of the network service provider does not contain the information www.aaa.com. Therefore, it cannot be resolved immediately. But after recursive query through the global DNS, the IP address corresponding to the DNS server of www.aaa.com is finally 1.1.1.1, and the result is informed to the network server provider's DNS server, then informed to the user by the network server provider. In order to speed up the resolution of the record ofwww.aaa.com in the future, the network service provider will retain the previous 1.1.1.1 results for a period of time, which is the TTL value. During this time, if the user has a resolution request for the record www.aaa.com, it will inform the user that the IP address is 1.1.1.1, and the above process will be repeated when the TTL expires.

### **II. What is the Appropriate Value for Setting TTL Usually?**

So it seems that I set the TTL to a very small value such as 1 second, wouldn't it be best, then when I modifies the resolution, it can immediately take effect for the user. The answer is no, if the TTL is set to 1 second, then it means that the recursive server should submit resolution request to the DNS server for the user's resolution almost every time, which will take a lot of time, and because the authoritative server resolution shall determine the source of the user for intelligent resolution, It takes longer than using the cached answers, and the failure rate is higher, so both the access experience and resolution stability are damaged.

The current TTL value of the JD Cloud interface can be set in the range of 60-604800 seconds.

The following table gives some suggestions for your reference:

| IP Change Frequently | Dynamic IP | Downtime Detection | Server Architecture         | Recommended TTL Value (seconds) |
| ---------- | ------ | -------- | ------------------ | --------------- |
| No         | No     | Not used   | Single Server           | 600             |
| No        | No     | Use     | Multiple Servers           | 180             |
| Yes         | No     | Not used   | Single Server           | 300             |
| Yes         | Yes     | Not Limited     | Not Limited               | 120             |
| No         | No     | Yes       | Large Website           | 60              |
| No         | No     | No       | Hot Standby, Disaster Tolerance, IP Fixation | 3600            |

 