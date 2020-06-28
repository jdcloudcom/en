# Asset Verification Questions

### 1. What assets need to be verified?

- Information on domains/subdomains not registered under JD Cloud & AI Domain Name Resolution Service shall be manually added and certified.

### 2. How to verify domains to be scanned?

- Domains added shall be certified by CNAME

(1) Register a domain name

If you need to register a domain name in JD Cloud & AI, you can refer to the Domain Name Service document for operation.
Help Documentation: https://docs.jdcloud.com/en/domain-name-service/register-domain-name

(2) How to verify a primary domain name?

You need to add the new CNAME resolution record example.mysite.com under your primary domain name to testtest.verify.jdcloudscan.com in order to finish verification of the added asset.

![添加域名解析](../../../../image/Website-Threat-Inspector/wts-dnsverify-01.png)

| Field Contents to be Filled | Example                                   |
| ---------------- | -------------------------------------- |
| Record Type         | CNAME                                  |
| Machine Record         | c2a479945emachineb42536cf5c51d44af25a9f       |
| Record Value           | f5be287a4345f56.verify.jdcloudscan.com |
| Operation             | Save                                   |

- Subdomains added shall be certified by files

For FAQ, you can refer to the Help Documentation: [Questions on Addition of Verification Files to web Directory](../../../../documentation/Cloud-Security/Website-Threat-Inspector/FAQ/AddWebDirectory.md)

