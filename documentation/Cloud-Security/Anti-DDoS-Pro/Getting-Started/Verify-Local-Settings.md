# Verify Configuration

This step ** is not mandatory ** 
<Br/>But to maximize the stability of your business, we recommend that you conduct a local test before you modify DNS resolution.

## Precondition
- The Advanced Anti-DDoS has been successfully purchased, the billing status is normal, and the forwarding rules have been well configured.

## Local Test Procedures
1. Log in to any one Linux server
2. Enter the following contents at the command line:
curl -x cname:port DomainName
<Br/>E.g.: <Br/>
![Verify Configuration](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/Verify-Local-Settings.png)
<Br/>If you return to the page contents of access domain, it indicates that the configuration is successfully made.

## Related Reference
- [Start Overview](Overview.md)
- [Create Instance](Create-Instance.md)
- [Non-Web Service Rule](Non-Web-Service-Forwarding-Rule.md)
- [Web Service Rule](Web-Service-Forwarding-Rule.md)
- [Release Back-to-source IP](Whitelist-local-IP-subnet.md)
- [Billing Rules](../../Pricing/Billing-Rules.md)
