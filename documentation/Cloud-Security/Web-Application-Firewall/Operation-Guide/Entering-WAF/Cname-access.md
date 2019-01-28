## **CNAME** Access Guide

To protect your site through the Web Application Firewall (WAF), you must complete the domain configuration in the Web Application Firewall console, and make the Domain Resolution target at the CNAME address assigned by WAF for the domain to let all traffic accessing to the site be filtered by WAF.

The traffic logic before and after accessing into WAF is shown below.

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/cname%E6%8E%A5%E5%85%A5%E6%8C%87%E5%8D%97-1.png)

**Preparation Before Access**

Before you can access your website domain to the Web Application Firewall through CNAME for protection, you need to complete the following preparations:

- The website domain must be accessible through the public network.
- The website domain must have completed ICP filing.
- Confirm whether the website domain has been accessed to other proxy system.
- Prepare DNS administrator permissions for the protected domain to modify DNS records to switch traffic of the protected site.
- If the website domain needs to be accessed through the HTTPS Protocol, you also need to have the corresponding certificate content and private key ready.

**Description: ** Generally, the certificate related content you need to prepare include:

- - *.pem (certificate file)
  - .key (Private Key File)

**Access Process**

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/cname%E6%8E%A5%E5%85%A5%E6%8C%87%E5%8D%97-2.png)

**Step 1: Website Configuration**

Log in [JD Cloud Web Application Firewall console](https://cloudwaf-console.jdcloud.com), go to the **Website Configuration** page, click **Add Website ** and configure according to the notifications in combination with the business situation.

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/cname%E6%8E%A5%E5%85%A5%E6%8C%87%E5%8D%97-3.png)

Configuration description is as follows:

| Configuration            | Description                                                    |
| ---------------- | ------------------------------------------------------------ |
| Domain           | Fill in the website domain to be accessed.                                       |
| Protocol Type       | Select **HTTP** and/or **HTTPS** according to the website protocol, and depending on the actual situation, select whether to enable the HTTPS mandatory jump, and whether to enable the HTTP back-to-origin. |
| Server address     | -Select **IP**, and fill in origin server Public IP.    Description: the server address is the IP Address to which you wish WAF to forward the request.    - If you wish the target of WAF protection to use domain access, you need to select other addresses, fill in the corresponding source domain , note that it does not mean to access the WAF protection website domain (it shall be guaranteed the back-to-origin domain added here shall be resolved on the public network, otherwise the domain configuration will not take effect). |
| Server port     | Fill in port of server listening. The HTTP protocol currently supports ports: 80, 8080; and the HTTPS protocol currently supports ports: 443, 8443 |
| Whether the proxy is used   | Determine whether the proxy is used                                         |
| Load Balancer algorithm   | Select IP hash or round robin algorithm.                              |

**Enable HTTPS**

If the website domain is required to support the access through the HTTPS Protocol, you also need to upload the corresponding certificates in the WAF console by referring to the following steps.

1. Prepare information of required certificates. **Description:** The certificates downloaded generally include two files of *.pem (certificate file) and *.key (private key file).
2. Log in [JD Cloud Web Application Firewall console](https://cloudwaf-console.jdcloud.com), go to **Certificate Management** page, upload designated content in the **Certificate File** and **Certificate Private Key** respectively.

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/cname%E6%8E%A5%E5%85%A5%E6%8C%87%E5%8D%97-4.png)

**View domain access status**

After configuring the website, you can log in JD Cloud Web Application Firewall console](https://cloudwaf-console.jdcloud.com), view the **DNS Resolution Status** of the added website domain on the **Website Configuration** page, to confirm whether it has been accessed into WAF correctly. If the DNS resolution status is set as exception, and exception notifications such as **No CNAME Access Detected **, **No Traffic** are received, it means that the website domain you configured has not been accessed into WAF correctly. <https://cloudwaf-console.jdcloud.com> ! [img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/cname%E6%8E%A5%E5%85%A5%E6%8C%87%E5%8D%97-5.png)

- DNS resolution status will automatically detect whether the resolution of this website domain points to CNAME, whether the access traffic of this domain goes through the Web Application Firewall in recent minutes.
- The CNAME access detection of DNS resolution status will be executed at regular time. If you confirm that the website domain resolution has correctly accessed the CNAME of WAF, you may check the DNS resolution status after one hour.

**Step 2: Local Test**

Before you formally switch the service traffic to WAF, it is recommended that you shall ensure the normal configuration of WAF forwarding rules by means of local verification and then modify the DNS resolution record of the website domain, in order to prevent your services from suspending due to configuration errors.

For specific methods of local test, please check the local verification.

**Step 3: Switch DNS resolution record (formally access Web Application Firewall protection)**

Modify the DNS resolution of your website domain to connect the website domain to WAF for protection.

Move the mouse to the added website domain record to obtain the CNAME address assigned by WAF for this domain.

**Description: ** Click**Copy** to copy this CNAME address to the clipboard.

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/cname%E6%8E%A5%E5%85%A5%E6%8C%87%E5%8D%97-6.png)

The below operation steps are described by taking JD Cloud DNS for example. If other domain providers are used by the website, refer to the following operation steps to modify the DNS resolution record of your website domain based on the actual domain management console.

1. Log in to [JD Cloud DNS console](https://dns-console.jdcloud.com) to modify the resolution record of your website domain.

| **Configuration**     | **Description**                                                     |
| ------------ | ------------------------------------------------------------ |
| **Machine record** | Fill in corresponding subdomain (for example, the machine record of www.jdclouddemo.cn is “www” and the machine record ofjdclouddemo.cn is “@”). |
| **Record type** | Modify to CNAME.                                                |
| **Record value**   | Fill in the CNAME address assigned by Web Application Firewall.                           |
| **TTL**    | Namely, the domain cache time; you may fill as per your actual needs (it is generally recommended to set to 600 seconds).   |

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/cname%E6%8E%A5%E5%85%A5%E6%8C%87%E5%8D%97-7.png)

1. After filling, click **OK**to complete the modification of resolution record.

For more specific operation description, please refer to [Resolution Record Operation](https://docs.jdcloud.com/cn/jd-cloud-dns/domain-record-add).

**Note**

- For one machine record, only one CNAME resolution record value can be filled in. You need to modify it to the CNAME address assigned by WAF.
- For one machine record, A record and CNAME record are mutually exclusive. You need to modify it to a CNAME type and fill in the CNAME address assigned by WAF.
- If the DNS service provider does not allow directly modifying the resolution record of A record to a CNAME record, you need to delete this A record and then add the resolution record of CNAME type.

**Description: ** The entire process of deletion and addition shall be completed in a period as short as possible to ensure the continuity of website access. If you fail to add a resolution record of CNAME type for a long time after deleting A record, the domain resolution may be failed.

- **MX** **record and CNAME record are mutually exclusive.** If your website domain must keep the MX record, you can use A record to point to the IP of WAF to access WAF protection. You can use the Ping command for the CNAME address assigned by WAF to obtain the assigned WAF IP and then modify the record value in the resolution record of A record type to this WAF IP.

**Description: ** If you connect the website domain to WAF protection by means of A record, then WAF will not be able to conduct fault cluster scheduling and fault bypass operation.





 
