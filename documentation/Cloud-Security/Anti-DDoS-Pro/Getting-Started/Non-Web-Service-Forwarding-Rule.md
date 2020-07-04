# Non-Web Service Forwarding Rules

The non-web service is a defense against the IP address of the user, only supports four-layer forwarding and does not support seven-layer protection like CC defense.

## Precondition
- The Anti-DDoS Pro has been successfully purchased and the billing status is normal.

## Operation Steps
1. Select a purchased instance. Click the "Instance Name" or "Forwarding Setting" of operation bar to enter the Forwarding Setting page.
![非网站转发规则](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/non-web%2004.png)

2. Configure forwarding rules
In the Forwarding Setting page, the forwarding rules can be configured according to the business situation. Up to 60 forwarding rules can be configured here.
![非网站转发规则](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/non-web%2005.png)

3. Click the "Add a single rule" button.
You can configure the forwarding rules according to the following pop-upnotifications. We support the configuration of TCP and UDP protocols.
![非网站转发规则](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/non-web%2006.png)

Rule configuration fields are interpreted as below:

- **Anti-DDoS Pro IP**: If purchasing the BGP line, the Anti-DDoS Pro BGP IP address can be selected. If purchasing multiple BGP IPs, the business traffics from different origin servers can be forwarded to different BGP IPs for protection. **This configuration item is not supported in Telecom, Unicom and Mobile lines**.

- Forwarding Protocol: TCP/UDP protocols can be selected.

- Forwarding Port: Support the configuration of Anti-DDoS Pro forwarding ports, which shall be the same as the origin server ports as recommended. **Ports configured in the web service forwarding rules do not support duplicate configuration in the non-web service forwarding rules**.

- Forwarding Rules: Support round robin, weighted round robin and source IP hash.

- Back-to-origin Mode: IP back-to-origin and domain name back-to-origin can be selected. IP back-to-origin (inside cloud + outside cloud) supports 20 IP addresses, while domain name back-to-origin supports 1 IP address only. The origin server IP cannot be the Intranet address.

- Origin Server Port: The business port of the user’s origin server.

- Backup IP: Backup IP is not required. If backup IP is configured, then under normal conditions, cname will direct to this IP. It is recommended that backup IP shall be the IP displayed to the public daily while IP back-to-origin shall be the IP closed to the public. The concealment and high availability of origin server can be ensured by configuring backup IP. Please refer to the flow chart in **Product Design Description** below.

![产品设计说明](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/ip-anti-design-cn.png)

## Related Reference

- [Create Instance](Create-Instance.md)
- [Billing Rules](../Pricing/Billing-Rules.md)
