# Set Web Cache

After the website is accessed to the Web Application Firewall, you can enable the web cache function. Web cache can help you improve your web access speed and relieve pressure of origin server. You can set web cache rules according to real demands.

## Prerequisites

- A Web Application Firewall instance has been enabled. For more information, please refer to [Enable Web Application Firewall](https://docs.jdcloud.com/en/web-application-firewall/purchase-process).

- The website has been accessed. For more information, please refer to [Add Domain](https://docs.jdcloud.com/en/web-application-firewall/step-1).


For Web Application Firewall instances in Monthly Package, the following restrictions are made to its web cache function.

| Function     | Description                               | Advanced Version   | Enterprise Version   | Flagship Version   |
| :------- | :--------------------------------- | :------- | :------- | :------- |
| Web Cache | At most the quantity of web cache rules are supported.  | 10 (entries) | 20 (entries) | 20 (entries) |

## Operation Steps

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).

2. Click **Website Configuration** on the left navigation bar.

3. Locate the domain to be operated on the **Web Configuration** page and click **Protection Configuration** on the operation bar.

4. On the protection configuration page, click the **Web Cache** tag, direct to the **Web Cache** module, enable the **Status** switch and click **Add Rules**.

   ![image](../../../../../image/WAF/protect-configure/52.Web-cache.png)

5. Click **Cache Configuration** and set cache configuration (as shown below). Cache configuration is effective to all cache rules, which can be set at below:
   ![image](../../../../../image/WAF/protect-configure/53.Web-Cache-Setting.png)

   - **Cache Time**: Page cache period, during which cache records in Web Application Firewall will be returned upon requests by users.
   - **Status Code**: In the course of accessing URI, cache will be done only when the specified state code page is returned.

6. Click **Add Rules** and add web cache rules.

   ![image](../../../../../image/WAF/protect-configure/54.Web-Cache-Add-Rule.png)

   - **Rule Name**: You can input any rule name with 30 characters at most.
   - **Protocol**: Selection of the http/https protocol is supported.
   - **URI**: Input complete and accurate URI, with wildcard characters (such as '/*') or parameters (such as '/abc?xxx=') unsupported.

   7. Click **OK** and add rules.

   

   