## Web Application Attack Protection

Web application attack protection may provide protection against SQL injection, XSS cross-site and other common Web application attack, and provide different levels of protection policies: normal, loose and strict.

### Background Information

After the website accesses WAF, you can enable Web application attack protection for it and adjust corresponding protection policy based on actual needs. Web application protection take effect in real time upon enabling; if any emergency affects the business traffic, it may be disabled.

**Operation Steps**

Refer to the following steps to configure Web application attack protection:

**Description: **Prior to the following operations, please ensure that the website has accessed WAF for protection. Please refer to CNAME Access Guideline for specific operations

1. Log in to [JD Cloud Web Application Firewall Console](https://cloudwaf-console.jdcloud.com).

2. Go to **Website Configuration** page.

3. Select the domain required to be operated; click **Protection Configuration** under its operation list.

4. Enable the protection under **Web Application Attack Protection** and select protection **mode**: 
         **Description: **In case of traffic exception arising during the use, the protection may be disabled by toggling the button.![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/web%E9%98%B2%E6%8A%A4-1.png)

5. - **Protection Mode**: Attack request is intercepted after any attack is found.
   - **Warning Mode**: Only alarm information is sent after an attack is found, and no request will be intercepted.

6. Select the proper protection policy under the **Protection Rule Policy Level**:

7. - **Normal** mode rule is used by default.
   - When a lot of false interceptions are found, or there are a lot of uncontrollable user entries in business, select the **Loose** mode.       
   - When you need to protect path traversal, SQL injection and command execution more strictly, you are suggested to select the **Strict** mode.

 
