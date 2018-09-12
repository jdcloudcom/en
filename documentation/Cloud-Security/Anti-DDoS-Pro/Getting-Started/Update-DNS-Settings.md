# Update DNS Resolution

After this step is completed, all users' access traffic will be forwarded back to the user's source station after being through advanced anti-DDoS.

## Precondition
- The Advanced Anti-DDoS has been successfully purchased and the billing status is normal. <Br/>
- All Forwarding Settings have been completed and been verified to take effect.

## Operation Steps
1. Log in [Advanced Anti-DDoS Console](https://ip-anti-console.jdcloud.com/instancelist).
2. On the "Instance List" page, select the target instance, then click ** Instance Name ** or ** Forwarding Setting ** to enter the Instance Details page. Copy the cname value to be modified in the web service or non-web service forwarding rule. <Br/>
Take non-web service forwarding rules as an example, find the cname to be copied at the red box as follows:
![Modify DNS](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/update%20dns%2001.png).
3. At the provider of domain, you need to modify the domain resolution configuration to resolve the domain name to the IP of advanced anti-DDoS.
Take the "Cloud Resolution" of JD Cloud as an example, on ** Console ** –>> ** Domain Name Service ** –>> ** Cloud Resolution **, enter JD Cloud [Cloud Resolution Console](https://dns-console.jdcloud.com/list). <Br/>
![Modify DNS](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/update%20dns%2002.png) <Br/>
Find the domain name to be resolved, as follows:
![Modify DNS](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/update%20dns%2003.png) <Br/>
Click to enter the resolution configuration:
![Modify DNS](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/update%20dns%2004.png) <Br/>
Change the record value to the cname address of advanced anti-DDoS.


## Special Instructions
- If the ** return/defense ** status in the forwarding rules is a back-to-source, the access traffic will not be to the advanced protection, but directly to the source station.


## Related Reference
- [Start Overview](Overview.md)
- [Create Instance](Create-Instance.md)
- [Non-Web Service Rule](Non-Web-Service-Forwarding-Rule.md)
- [Web Service Rule](Web-Service-Forwarding-Rule.md)
- [Release Back-to-source IP](Whitelist-local-IP-subnet.md)
- [Billing Rules](../../Pricing/Billing-Rules.md)
