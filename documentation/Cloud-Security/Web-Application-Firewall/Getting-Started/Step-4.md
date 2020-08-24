# Modify DNS Resolution

After a website is added to the Web Application Wall, you must use the CNAME address of the Web Application Wall to modify the DNS resolution setting of the domain, resolving the Web request of the website to the Web Application Firewall for safe cleaning. Then, the Web Application Firewall will return safe traffic to the origin server, realizing website protection. The document specifies how to modify related contents of DNS resolution.

## Prerequisites

- Information of website to be protected has been added in Web Application Fire Wall (WAF). Please refer to [Add a Website](Step-1.md) for more details.

- The back-to-origin IP segment of Web Application Firewall has been released. Please refer to [Release Back-to-origin IP](Step-2.md) for more details.

  > Note: If the origin server uses any security software (such as Safedog and Cloud Chain), you need to set the back-to-origin IP segment releasing the Web Application Firewall on the software, preventing the normal business traffic forwarding from Web Application Firewall to the origin server from being intercepted.

- The local verification has been approved. Please ensure the forwarding configuration of the Web Application Firewall has taken effect and prevent business interruption caused by configuration error. Please refer to [Local Verification](Step-3.md) for more details.

- Have the permission of modifying domain resolution setting at the DNS service provider of the domain.

## Background Information

The Web Application Firewall supports access via CNAME, that is, resolving the domain to the WAF CNAME address. In some extreme conditions (such as failures of node, data center, etc.), CNAME access can realize node IP switch and even directly return requests to the origin server, ensuring stable operation of the origin server business to the largest extent and realizing high availability and disaster tolerance capacity.

The document mainly specifies how to enable the Web Application Firewall protection for the website independently, that is, other proxy services such as CDN and Anti-DDoS Pro are not accessed to the website.

## Operation Steps

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).

2. Click **Website Configuration** on the left side navigation bar.

3. Obtain the CNAME value. On the **Website Configuration** page, position the domain added by you, move the icon to the top of CNAME and then you can view the CNAME value. Click ![image](../../../../image/WAF/join-in-WAF/Local Verification/Checking-Click-Cname.png) and obtain and copy CNAME.

![image](../../../../image/WAF/join-in-WAF/本地验证/Checking-Get-Cname.png)

4. Modify DNS resolution of the domain. Set the alias resolution for the domain under protection at the DNS service provider of the domain. For operation details, please consult you domain service provider.

   The operation below is conducted on the basis of JD Cloud & AI DNS. The domain resolution record modification method is specified below. If your domain resolution is hosted on the JD Cloud & AI DNS, you can carry out the operation by directly referring to the steps below. If you use the DNS service of another service provider, please make similar configuration on the system of the domain DNS service provider by referring to the steps below.

i. Log in [JD Cloud DNS Console](https://dns-console.jdcloud.com/list).

ii. Click **Domain Resolution** on the left navigation bar. Position the domain to be set on the **Domain Resolution** page and click **Resolution Setting** under the operation setting.

iii. On the **Resolution Setting** page, position to the host record to be set and click **Modify** under the operation bar.

iv. Select to modify the record by using the CNAME access method in the **Edit Resolution** dialogue box.

- Host record: Domain configured in WAF
- Record type: Select "CNAME - Direct the domain to another one".
- Record value: CNAME value of WAF. Resolution line: Default.
- TTL: The setting is 10min in general. The greater the TTL value, the slower the synchronization and update speed of DNS records.
- Weight: Select 1 by default.

CNAME access: Set **Record Type** as **CNAME**, modify the **Record Value** as **WAF CNAME** address and keep other settings unchanged.

![image](../../../../image/WAF/join-in-WAF/本地验证/DNS-modify.png)

Please note the conditions below for conflicts between different record types:

- For the same host record, only one CNAME resolution and record value can be filled in. In such case, you need to modify the address to be the WAF CNAME address.

- There are conflicts between different DNS resolution record types. For example, for records of the same host, there are conflicts between the CNAME record and the A record/MX record/TXT record/other records. If the record type cannot be directly modified, you can delete other conflicted records at first and add one new CNAME record.

  > Warning: The process of deletion of other resolution records and addition of CNAME resolution record shall be completed in a short period as much as possible. If the A record is deleted and no CNAME resolution record is added after a long time interval, the domain may not be resolved normally.