# Release Back-to-origin IP

The step is only applicable for the user whose origin server is provided with security protection policies such as firewall/security group/ACL/iptable, but **is not the required step**.
<Br/>If your origin server is configured with any security protection policy, to protect Anti-DDoS Pro service against impact, please add back-to-origin IP of Anti-DDoS Pro to the whitelist.

## Precondition
- The Anti-DDoS Pro has been successfully purchased and the billing status is normal.

## Operation Steps
1. Log in [Anti-DDoS Pro Console](https://ip-anti-console.jdcloud.com/instancelist).
2. On the "Instance List" page, select the target instance, then click **Instance Name** or **Forwarding Setting** to enter the Instance Details page.
![网站类实例](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/non-web%2004.png)
3. Get the IP segments of Anti-DDoS Pro back-to-origin that need to be added to the white list, as shown at the red box below.
![高防回源](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/instance06.png)
## Related Reference

- [Start Overview](Overview.md)
- [Create Instance](Create-Instance.md)
- [Non-Web Service Rule](Non-Web-Service-Forwarding-Rule.md)
- [Web Service Rule](Web-Service-Forwarding-Rule.md)
- [Billing Rules](../Pricing/Billing-Rules.md)
