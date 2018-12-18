# FAQ

**Q: Which ISP-line does Anti-DDoS Protection Package support?**

A: The line of Anti-DDoS Protection Package is consistent with the one of the bound Elastic IP. If the original Elastic IP is BGP line, we will provide protection of BGP line.

**Q: What does the infinite IP protection of Anti-DDoS Protection Package mean?**

A: After the infinite IP package of Anti-DDoS Protection Package is bought, the protection package will provide anti-D protection for all Public IP in JD Cloud under this user account, without limitation to the quantity of Protection Public IPs. Binding of protection IP needs users to configure by themselves.

**Q: After the infinite IP package of Anti-DDoS Protection Package is bought, will the buying quota of Elastic IP be released automatically?**

A: No. Currently, each JD Cloud account supports a maximum of 10 Elastic IPs applied for each region. If more quotas are required, please apply in the ticket of Elastic IP.

**Q: Does Anti-DDoS Protection Package support IP access outside the cloud?**

A: No. Anti-DDoS Protection Package provides protection support only for Public IP in the cloud. Please buy Anti-DDoS Pro if protection outside the cloud is required.

**Q: Does Anti-DDoS Protection Package support protection of domain name?**

A: No. In case of demands on domain name protection and application level protection, please buy Anti-DDoS Pro.

**Q: What’s the difference between Anti-DDoS Protection Package and Anti-DDoS Pro?**

A:

- Anti-DDoS Protection Package promotes anti-ddos capacity only for the service in JD Cloud; Anti-DDoS Pro faces all users in and outside the cloud.
- Anti-DDoS Protection Package can only defense traffic type attacks, not support attack protection of application level; if application level protection scenarios such as CC attacks are required, please buy Anti-DDoS Pro.
- The access of Anti-DDoS Protection Package is simpler, without changing Public IP address. Anti-DDoS Pro can be accessed upon completion of cname change, and support telecom+unicom+mobile multi-line route.

**Q: What will happen if the bound resource has been expired, Anti-DDoS Protection Package has not been expired?**

A: The protection package is bought monthly, if no protection object is configured, or the protection object has been expired, it cannot provide protection.

Suppose the user has bound IP of some virtual machine, if the virtual machine resource is expired and deleted, whether Anti-DDoS Protection Package bills normally or not, the protection for IP in the protection package will lose efficacy at once. Relevant configuration of this IP in the protection package will be deleted automatically.



**Q: The protection bandwidth of the original Anti-DDoS Basic is 2G, and I bought the package of Anti-DDoS Protection Package, then will the final protection peak value be superimposed?**

A: The final protection peak value of the protection package bought by you will not be superimposed, dominated by those in the package of Anti-DDoS Protection Package.

Eg: IP of some virtual machine originally has 2G free Anti-DDoS Basic, because it is often attacked, and the user bought 5G Anti-DDoS Protection Package for this IP. The maximum protection capability of this user is 5G, without superimposing the free quota of the original Anti-DDoS Basic.