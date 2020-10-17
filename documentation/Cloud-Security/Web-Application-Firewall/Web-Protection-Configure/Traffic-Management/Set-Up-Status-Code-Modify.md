# Set Status Code Modification

Web Application Firewall supports modifying status codes. You can apply it to the origin server to ensure user experience, so that users do not access abnormal pages, such as 502, 504, and 404. In this case, the origin server can set the status code modification on WAF to point abnormal status such as 502 and 504 to normal status and then to a normal page. On this page, we mainly introduce how to modify the status code.

## Prerequisites

- A Web Application Firewall instance has been enabled. For more information, please refer to [Enable Web Application Firewall](https://docs.jdcloud.com/en/web-application-firewall/purchase-process).
- The website has been accessed. For more information, please refer to [Add Domain](https://docs.jdcloud.com/en/web-application-firewall/step-1).

## Use Restrictions

For Web Application Firewall instances in Monthly Package, the following restrictions are made to its status code modification function.

| Function       | Description                               | Advanced Version   | Enterprise Version   | Flagship Version   |
| :--------- | :--------------------------------- | :------- | :------- | :------- |
| Status code modification | The maximum rules for status code modification that can be added.  | 10 (entries) | 20 (entries) | 50 (entries) |

## Operation Steps

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).
2. Click **Website Configuration** on the left navigation bar.
3. Locate the domain to be operated on the **Web Configuration** page and click **Protection Configuration** on the operation bar.
4. On the Protection Configuration page, click the **Traffic Management** tab, locate to the **Status Code Modification** module, and enable the **Status** switch.

![image](../../../../../image/WAF/protect-configure/46.Status-Code-Modify.png)

5. Click **Add Rules** and add rules as per the instructions below.

​	![image](../../../../../image/WAF/protect-configure/47.Status-Code-Modify-Add-rule.png)

| Configuration Item                 | Description                                                         |
| ---------------------- | ------------------------------------------------------------ |
| **Rule Name**           | You can input any rule name with 30 characters at most.                           |
| **Original Status Code**         | You can input http status codes such as 400, 401, 402, 403, 404, 502, 503, and 504. |
| **Options** (Optional)       | When you choose 502 or 504, there will be options, and then you can choose **Modify Status Code and Return Page** or **Modify Return Page Only** as shown in the figure below. <br />![image](../../../../../image/WAF/protect-configure/49.Status-Code-Modify-502.png) |
| **Status Code Modified**       | By default, it is 200 but you can choose 302.                                     |
| **Origin Server Return Page After Modification** | When the modified status code is 200 or other non-302 status codes, you can choose the default and custom pages. <br />When the modified status code is 302, the address under the domain of the current instance, starting with http(s), will be input in the return page. |