# Verify Configuration

This step **is not mandatory** 
<Br/>But to maximize the stability of your business, we recommend that you conduct a local test before you modify DNS resolution.

## Precondition
- The Anti-DDoS Pro has been successfully purchased, the billing status is normal, and the forwarding rules have been well configured.

## Local Test Procedures

**Verification of Non-web Service Forward Rules**
The user's origin server business can be accessed by using IP. After the four-layer IP + port forwarding rules are configured, please use the command Ping to view corresponding IP addresses of the Anti-DDoS Pro CNAME and then use the command telnet to access IP address and ports of Anti-DDoS Pro. If the connection succeeds, it means the forwarding configuration of Anti-DDoS Pro is successful.

**Verification of Web Service Forward Rules**

Method 1: Log in one Linux server and enter the following contents in the command line:</br>
curl -x cname:port DomainName
<Br/>E.g.: <Br/>
![验证配置生效](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/Verify-Local-Settings01.png)
<Br/>If you return to the page contents of access domain, it indicates that the configuration is successfully made.

Method 2: Modify the hosts file in a local computer, open the hosts file under the directory C:\Windows\System32\drivers\etc with the notepad and add the IP address and protection domain for Anti-DDoS Pro in the file.</br>
Save the hosts file, use the PING command to test the protection domain in a local computer. If the Anti-DDoS Pro CNAME and IP addresses are resolved, it indicates that the local hosts configuration is effective.</br>
Please access the domain via a browser. If page contents of accessed domain are returned, it indicates the configuration is successful.<Br/>
![验证配置生效](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/Verify-Local-Settings02.png)

## Related Reference
- [Start Overview](Overview.md)
- [Create Instance](Create-Instance.md)
- [Non-Web Service Rule](Non-Web-Service-Forwarding-Rule.md)
- [Web Service Rule](Web-Service-Forwarding-Rule.md)
- [Release Back-to-origin IP](Whitelist-local-IP-subnet.md)
- [Billing Rules](../Pricing/Billing-Rules.md)
