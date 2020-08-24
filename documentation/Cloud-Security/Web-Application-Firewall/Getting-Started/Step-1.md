# Add a website

The document specifies how to add a website and access Web Application Firewall (hereinafter referred to as WAF) and enable WAF after WAF is subscribed.


## Background Information

Before the added website is accessed to WAF, you need to confirm the following conditions:

- The Web Application Firewall service has been subscribed and the domain supported (including Level I domain and the total domains) to be accessed by the current instance does not exceed the limit.

  > Note: The domains supported to be accessed depend on instance type of Web Application Wall and expansion domain packets. For more details, please refer to [Introduction to Version Function](../Pricing/Price-Overview.md) and [Introduction to Domain Expansion Packet](../Pricing/domain-Expansion-Pack.md).

- When the Web Application Firewall service of the mainland China is accessed, the website to be added must have been subjected to the ICP filling by the Ministry of Industry and Information Technology of the People's Republic of China.

## Steps to add a website

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).

2. Click **Website Configuration** on the left side navigation bar.

3. Select the current instance on the top of the **Website Configuration** page. Click **Add a Website** after the instance is selected.

![image](../../../../image/WAF/join-in-WAF/Add-Website-Select-Instance.png)

4. Enter the **Add a Website** page and fill in website information. Please refer to the table below for related description.

![image](../../../../image/WAF/join-in-WAF/Add-Website-Page.png)


| Parameter               | Description                                                      |
| :-------------          | ------------------------------------------------------------ |
| **Domain** | Please enter the domain to be protected. <br />1. Use of accurate domain is supported, such as `www.example.com`. <br />2. Use of extensive domain is supported (for flagship version only), such as `*.example.com`. <br />      a. If you have the following domains: a.example.com, b.example.com and c.example.com, and server IP addresses of respectively sub-domains are the same, you can directly add the extensive domain `*.example.com`<br />      b. After the extensive domain is added, the Web Application Wall will automatically match the extensive domain with all corresponding sub-domains. <br />      c. If the extensive domain and accurate domain are configured both, the forwarding rules and protection policy of accurate domain shall come into force with first priority. <br /> |
| **Protocol Type**              | Select the network protocol type used by the website. Optional values: <br />**1.HTTP**<br />**2.HTTPS**: If the website supports HTTPS encryption certification, please select the HTTPS protocol, add a website and then upload the certificate and private key of the domain on the Website Configuration page. Please refer to [Upload HTTPS Certificate](update-certificate.md) for more details. <br />Service protocols provided by the website are filled in above. If the HTTPS protocol is selected for the website, the menu in the figure below will be displayed. <br />![image](../../../../image/WAF/join-in-WAF/Add-Website-HTTPS-Setting.png)<br />  **a. Enabling forced redirecting of HTTPS**: The traffic request at the client is redirected to HTTPS by force and flows to WAF or not and is redirected to the port 443 by default. ** If you select **Yes**, please cancel the support to the HTTP protocol by the website before enabling the HTTPS forced redirection**. If you need to force the client to use the HTTPS requests to access the website and improve security, you can enable the function. <br />![image](../../../../image/WAF/join-in-WAF/Website-https.png)   <br />**b. Enabling HTTP back-to-origin**: After back-to-origin is enabled, the Web Application Firewall will use the HTTP protocol to send the back-to-origin requests and the default back-to-origin port is 80. By enabling of HTTP back-to-origin, HTTPS access can be realized via the Web Application Firewall without changing the origin server, thus reducing load loss of origin server. If your website does not support HTTPS back-to-origin, please be sure to enable the function. <br />![image](../../../../image/WAF/join-in-WAF/Website-http.png) |
| **Enable HTTP2.0** (Optional)       | After the HTTPS protocol is selected, the enabling option is supported. |
| **SSL Protocol Type** (Optional)       | After the HTTPS protocol is selected, the SSL and TSL protocol type supported can be selected. <br />By default, Versions TSL1.0, TSL1.1 and TSL1.2 will be selected. That is, the access request from the client, complying with the protocol types TSL1.0, TSL1.1 and TSL1.2, will be provided only. The requests lower than Version TSL1.0 cannot access the website normally, thus meeting security demands of the website. <br />You can also check the SSLv3 or SSLv2 protocol. Then, the client request access conforming with the protocol type selected by you will be provided, and those unmatched cannot access the website normally. <br />**The security sequence of protocols is as follows**：SSLv2 < SSLv3 < TSL1.0 (default and defeasible) < TSL1.1 (default, but indefeasible) < TSL1.2 (default, but indefeasible) <br />**Description**: The SSL (Secure Socket Layer) is the security exchange information between the Web browser and the Web server, providing capacities of identification and confidentiality. The HTTPS protocol is a network protocol formed by SSL (TSL)+HTTP protocols and used for encrypted transmission and identity certification. |
| **Cipher Suite Level** (Optional)     | The **Medium Level is selected** for the cipher suite by default. It suits for normal access, has good compatibility and moderate security and supports extensive clients. <br />If you need to pass the multi-level protection test, please select **High Level**, because access via the browser of low version is not allowed. <br />If you hope to support more client accesses, please select **Low Level**. |
| **Server Address**    | Set the origin server address for the website, with IP address format and other address formats supported. Upon completion of access, the Web Application Firewall will forward the filtered access request to the server address set. <br />**1. IP address format**: Fill in the public IP address of the origin server (correspond to the record A configured at the DNS service provider of the domain in general). Multiple IP addresses are separated by English commas (,). At most 20 IP addresses can be filled in. Line feeds are not supported. <br />The following two IP formats are supported:<br />       a. IPv4，e.g., 192.168.1.1<br />       b. IPv6, e.g., 2001:0db8:3c4d:0015:0000:0000:1a2f:1a2b<br />At least one IPv4 address shall be completed. If the origin server is located in JD Cloud, the public IP address of ESC is filled in in general case. When the origin server is located in the IDC data center other than JD Cloud, you are suggested to ping (or dig) the domain and search the public IP address first and then fill in the public IP address of the domain. <br />**2. Other addresses**: Fill in the server back-to-origin domain which shall ensure that the public network can be resolved (generally, corresponding to CNAME configured at the DNS service provider for the domain). |
| **Server Port**     | Set the forwarding port used by the website, which is used for forwarding client request to the server business port by WAF. <br />WAF can provide traffic access and forwarding service to the website via port set here, but the business traffic of the website domain can only be forwarded via the service port set. For the unset port, WAF will not forward any access request traffic of the port to the origin server. <br /> Default port: <br />1. HTTP 80: Select the HTTP protocol and then select the default setting. <br />2. HTTPS 443: Select the HTTPS protocol and then select the default setting. <br /> For the port customization, you may click **Customize** and set the customized port for the HTTP protocol and the HTTPS protocol. <br />![image](../../../../image/WAF/join-in-WAF/Add-Website-Port.png)<br />Optional ports are as shown in the prompt. Please separate ports with English commas (","). Each domain supports 10 ports (including the HTTP port and the HTTPS port). |
| **Use of proxy or not**          | If you need to configure other seven-layer proxy service before configuration of the Web Application Firewall for business forward (such as Anti-DDoS Pro, CDN, Cloud Acceleration, etc.), please be sure to select **Yes** (after **Yes** is selected, the Web Application Firewall will resolve the X-Forwarded-For field of the request head and obtain the actual IP of the client). Otherwise, **the opposite end IP connected via HTTP** is the actual IP of the client. <br />If the WAF is not equipped with other seven-layer proxy service for forward business, please select **No**. |
| **Algorithm of Load Balancer**           | If server IP addresses are set, please select the algorithm of Load Balancer between the origin server IPs. Option: <br />1. IP hash: One IP request is forwarded to one origin server as per a specific calculation method. <br />2. Round robin (default): All requests are forwarded to origin server in turn. |
| **Long Back-to-origin Connection**      | Setting of enabling long connection for session request between WAF and origin server. Enabling long back-to-origin connection can reduce communication resource consumption of origin server to some extent. |

After completing the above website information, click **OK**. After a website is successfully added, you can view it on the page configured by the website and carry out the following operations on demands:

![image](../../../../image/WAF/join-in-WAF/Website-Configure.png)

- **DNS resolution status**: Only if the domain DNS is resolved to the CNAME address of WAF and WAF detects the access traffic of the domain, the DNS resolution status will be displayed as normal. If the **DNS Resolution Status** is displayed as abnormal, you can move the icon to **Abnormal** and the floating window will display the reason for abnormality![image](../../../../image/WAF/join-in-WAF/Website-Configure-Reason.png), after the abnormal is fixed, please click ![image](../../../../image/WAF/join-in-WAF/Website-Configure-fresh.png) for another test. Please note that modification of DNS resolution will take effect after a delay time. You can try again later.

- **View of CNAME**: Move the icon to **CNAME** and then the floating window will display the value of CNAME. You can click and copy the value for the link [Local Verification](Step-3.md).

- **Mode**: Two modes are provided, including the cloud mode and the back-to-origin mode.
  - The cloud mode refers to that when a client request access to WAF, the safe traffic will be returned to the back-to-origin server after WAF traffic identification.
  - The back-to-origin mode refers to the client request to directly access the origin server. If the origin server has a white list which accepts WAF export IP requests, it needs to remove the white list and switch back to the back-to-origin mode for avoidance of business failure.
- **Uploading HTTPS certificate**: If the website supports the HTTPS protocol, please be sure to ensure the correct certificate and private key are uploaded to WAF, so as to ensure normal protection to the HTTPS business traffic. You can click **Un-associated Certificate**![image](../../../../image/WAF/join-in-WAF/Website-Configure-Cert.png) and upload the HTTPS and private key of the domain. Please refer to [Upload HTTPS Certificate](update-certificate.md) for more details.

- **Protection setting**: You can view the protection status. If the protection is enabled, the protection times will be displayed. If the protection is disabled, the disabled status will be displayed.

- **Work mode**: **Enable Protection** for the added domain or not. If the protection is disabled, only requests will be forwarded and no protection is given to the request traffic.

- **Edition**: Click **Edit** under the operation bar and modify website information, such as protocol type, server address, server port, etc.

- **Deletion**: Click **Delete** under the operation bar to delete a domain.

- **Protection configuration**: Click **Protection Configuration** under the operation bar. After the page is redirected to the protection **Rule Configuration** page of the domain, set Web protection, IAM, CC protection, BOT management, business risk control, traffic management and website compliance protection policy.
  

