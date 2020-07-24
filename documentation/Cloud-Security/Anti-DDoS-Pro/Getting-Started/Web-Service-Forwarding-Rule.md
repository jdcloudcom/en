# Web Service Forwarding Rules

The Web Service is the protection designed to protect the business of website domains. It supports volumetric attacks and Application Layer attacks protection, including CC attack protection.

## Precondition
- The Anti-DDoS Pro has been successfully purchased and the billing status is normal.

## Operation Steps
1. Select a purchased instance. Click the "Instance Name" or "Forwarding Setting" of operation bar to enter the Forwarding Setting page.
![网站转发规则](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/non-web%2004.png)

2. On the Instance Details page, switch to the "Website Forwarding Setting".
![网站转发规则](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/web-rule%2007.png)

3. Click the "Add Rules" button to configure the forwarding rules according to the pop-up notifications as follows.
![网站转发规则](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/web-rule%2008.png)

Rule configuration fields are interpreted as below:

- **Anti-DDoS Pro IP**: If purchasing the BGP line, the Anti-DDoS Pro BGP IP address can be selected. If purchasing multiple BGP IPs, the business traffics from different origin servers can be forwarded to different BGP IPs for protection. **This configuration item is not supported in Telecom, Unicom and Mobile lines**.

- Domain: Supports configuration of multi-level domain, including support for extensive domain name.  

- Forwarding protocol: Supports both HTTP and HTTPS, and can be selected according to the site protocol. When you select the HTTPS protocol, you will be asked to submit the certificate by the system. The protection takes effect only when the certificate is successfully submitted.

- Enable websocket: If you need to access the websocket protocol, please enable the websocket switch.

- Forwarding port/origin server port: The origin server ports of web service rules support ports 80 and 443 by default. Customized ports are allowed and the HTTP protocol and the HTTPS protocol respectively support 5 different parts. **Ports configured in the non-web service forwarding rules do not support duplicate configuration in the web service forwarding rules**.

- HTTP access redirection: **The switch is visible after the HTTPS protocol is checked**. Once being enabled, all accesses from the HTTPS protocol will be redirected to HTTPS domains again.

- Enabling HTTPS back-to-origin: **The switch is visible after the HTTPS protocol is checked**. If your website does not support HTTPS back-to-origin, please be sure to enable this option and the default back-to-origin port is 80.

- Forwarding rules: Support round robin and Source IP hash.

- Back-to-origin method: You can select either the back-to-origin IP or the back-to-origin domain. The back-to-origin IP (inside JD cloud + outside JD cloud) supports 20 IP addresses, and one back-to-origin domain. The domain name of Origin Server cannot be the same as the protection domain name, the Origin Server IP is not allowed to be an Intranet address.

- GEO back-to-origin: Support region-based access back-to-origin.

- Backup IP: Backup IP is not required. After backup IP is configured, in case of Non-DDOS attacks, the back-to-origin model can be enabled and the Anti-DDoS Pro cname will direct to this IP. It is recommended that backup IP shall be the IP displayed to the public daily while IP back-to-origin shall be the IP closed to the public. The concealment and high availability of origin server can be ensured by configuring backup IP. Please refer to the flow chart in **Product Design Description** below.

![产品设计说明](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/ip-anti-design-cn.png)

4. After website forwarding rules are successfully created, click to copy CNAME in the list of rules, modify the resolution in DNS and switch traffic to Anti-DDoS Pro. For details, refer to [Update DNS Resolution](Update-DNS-Settings.md)
![网站转发规则](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/web-rule%2011.png)

5. After the configuration for website forwarding rules is completed, the protection on-off will be on by default, and you can click to switch to the back-to-origin mode. Under the back-to-origin mode, traffic will directly be back to Origin Server IP without through Anti-DDoS Pro cleaning.
![网站转发规则](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/web-rule%2012.png)

6. If HTTPS is checked in the configuration for website forwarding rules, you need to click to associate SSL Certificate in the list of rules. Click the **Upload** button, and select the uploaded certificate in the Certificate Management interface. If the certificate is uploaded for the first time, click the **Certificate Management** button to redirect to the SSL Certificate Console interface to upload the certificate. For details, refer to [Upload SSL Certificate](https://github.com/jdcloudcom/cn/blob/edit/documentation/Cloud-Security/SSL-Certificate/Operation-Guide/Upload-SSL-Certificate.md)
![网站转发规则](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/web-rule%2013.png)
![网站转发规则](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/web-rule%2014.png)

## Related Reference

- [Create Instance](Create-Instance.md)
- [Billing Rules](../Pricing/Billing-Rules.md)
- [FAQ](../FAQ/FAQ.md)

