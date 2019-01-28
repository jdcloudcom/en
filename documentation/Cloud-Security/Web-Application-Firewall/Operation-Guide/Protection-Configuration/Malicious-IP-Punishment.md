## Malicious IP Punishment

Malicious IP punishment helps you automatically block the client IP making several Web attacks in a short period.

### **Feature Description**

The traditional Web Application Firewall takes interception against IP-URL dimension. When a request is determined to be attack behavior, block this request for one time. But actually attackers may constantly scan and attack your website, study the protection policy and attempt to bypass the firewall. Therefore, the one-time block often is not efficient under this circumstance.

For this circumstance, JD Cloud Web Application Firewall provides the malicious IP punishment feature. When an IP is recognized by WAF to constantly attack, WAF will automatically block this malicious IP.

**Operation Steps**

Refer to the following steps to enable the malicious IP punishment feature:

**Description: **Prior to the following operations, please ensure that the website has accessed WAF for protection. Please refer to CNAME Access Guideline for specific operations.

1. Log in to [JD Cloud Web Application Firewall Console](https://cloudwaf-console.jdcloud.com).
2. Go to **Website Configuration** page.
3. Select the domain required to be operated; click **Protection Configuration** under its operation list.
4. In **Malicious IP Punishment**, enable the protection. The default protection rule is that: When WAF intercepts 2 Web attacks launched by an IP within 1 minute, it will block the access request of this IP for 6 minutes.

**Description: ** If there is an exception during the use, you can disable the protection on this page.

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E6%81%B6%E6%84%8FIP%E6%83%A9%E7%BD%9A-1.png)

**Test Example**

After the malicious IP punishment is enabled, when your website is scanned by a scanner or constantly attacked by a hacker, WAF will recognize and block all access behaviors of the attack IP in a very short period, which will largely increase the attack cost of the hacker.


 
