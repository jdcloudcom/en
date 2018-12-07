# Web Service Forwarding Rules

The Web Service is the protection designed to protect the business of website domains. It supports volumetric attacks and Application Layer attacks protection, including CC attack protection.

## Precondition
- The Anti-DDoS Pro has been successfully purchased and the billing status is normal.

## Operation Steps
1. Select a purchased instance. Click the "Instance Name" or "Forwarding Setting" of operation bar to enter the Forwarding Setting page.
![Website Forwarding Rules](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/non-web%2001.png)

2. On the Instance Details page, switch to the “Website Forwarding Setting”.
![Website Forwarding Rules](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/web-rule%2002.png)

3. Click the "Add Rules" button to configure the forwarding rules according to the pop-up notifications as follows.
![Website Forwarding Rules](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/web-rule%2003.png)

The field of rule configuration section is explained as follows:


- Domain: Supports configuration of multi-level domain, including support for extensive domain name.  

- Protocol type: Supports both HTTP and HTTPS, and can be selected according to the site protocol. When you select the HTTPS protocol, you will be asked to submit the certificate by the system. The protection takes effect only when the certificate is successfully submitted. If you need websocket protocol access, please turn on the websocket switch.

- Back-to-origin method: You can select either the back-to-origin IP or the back-to-origin domain. The back-to-origin IP (inside JD cloud + outside JD cloud) supports 20 IP addresses, and one back-to-origin domain. The domain name of Origin Server cannot be the same as the protection domain name; the Origin Server IP is not allowed to be an Intranet address.
If the HTTP back-to-origin is turned on, all protocols returning to the Origin Server will be all converted to the HTTP protocol.

- The rules of Web Service Origin Server port support 80 and 443 ports by default. Custom port is allowed. HTTP and HTTPS protocols respectively support customizing 5 different ports.

- backup IP is not mandatory. If the backup IP is configured, the cname will point to it in normal status. It is recommended that the backup IP be the IP of the daily external display, and the back-to-source IP be non-external. Configuring a backup IP ensures higher availability of the source station. You may refer to the flowchart in the **Product Graphic Instructions** of the page.

## Related Reference

- [Create Instance](Create-Instance.md)
- [Billing Rules](../Pricing/Billing-Rules.md)
- [FAQ](../FAQ/FAQ.md)

