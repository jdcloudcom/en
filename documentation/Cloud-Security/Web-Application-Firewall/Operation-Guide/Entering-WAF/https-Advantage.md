## **HTTPS** Advanced Configuration

WAF provides a flexible HTTPS configuration feature which will help you force the client to access websites by HTTPS without rebuilding the origin server.

**Operation Steps**

1. Log in to [JD Cloud Web Application Firewall Console](https://cloudwaf-console.jdcloud.com).

2. Go to **Website Configuration** page.

3. Select the domain required to be operated; click **Edit** under its operation list.

4. Select **HTTPS** in **Protocol Type**.![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/https%E9%AB%98%E7%BA%A7%E9%85%8D%E7%BD%AE.png)

5. - **Enable forced jump for HTTPS**

After turning on, the HTTP request will be displayed as HTTPS, jump to port 443 by default

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/https%E9%AB%98%E7%BA%A7%E9%85%8D%E7%BD%AE-2.png)

**Description: ** After the jump is enabled, if continuing to access http service, it will still jump to https due to the browser's caching feature, then you must cancel the HTTP protocol before enabling forced jump for HTTPS.

**Turn on HTTP back-to-origin**

If your website does not support HTTPS back-to-origin, please **Enable HTTP Back-to-origin** (the default back-to-origin port is the 80 port) to implement HTTPS access by WAF. After using this setting, the client can access the site by HTTP and HTTPS.

**Description: ** When using HTTP back-to-origin, you don't need to make any changes on the origin server or configure the HTTPS. But this configuration has a precondition that the correct certificate and private key are uploaded to the certificate management of WAF.

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/https%E9%AB%98%E7%BA%A7%E9%85%8D%E7%BD%AE-3.png)

 
