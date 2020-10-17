# Set URI Rewrite

Web Application Firewall supports URI rewrite. If you do not want to expose the path of the resources at the origin server to the outside, you can rewrite the resource path with a URI.

## Prerequisites

- A Web Application Firewall instance has been enabled. For more information, please refer to [Enable Web Application Firewall](https://docs.jdcloud.com/en/web-application-firewall/purchase-process).
- The website has been accessed. For more information, please refer to [Add Domain](https://docs.jdcloud.com/en/web-application-firewall/step-1).

## Use Restrictions

For Web Application Firewall instances in Monthly Package, the following restrictions are made to its URI rewrite function.

| Function    | Description                            | Advanced Version   | Enterprise Version   | Flagship Version   |
| :------ | :------------------------------ | :------- | :------- | :------- |
| URI rewrite | The maximum URI rewrite rules that can be added.  | 10 (entries) | 20 (entries) | 50 (entries) |

## Operation Steps

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).

2. Click **Website Configuration** on the left navigation bar.

3. Locate the domain to be operated on the **Web Configuration** page and click **Protection Configuration** on the operation bar.

4. On the Protection Configuration page, click the **Traffic Management** tab, locate to the **URI Rewrite** module, and enable the **Status** switch.

   ![image](../../../../../image/WAF/protect-configure/50.URI-Rewrite.png)

5. Click **Add Rules** and configure as per the table below.

   ![image](../../../../../image/WAF/protect-configure/51.URI-Rewrite-Add-Rule.png)

   | Configuration Item                | Description                               |
   | --------------------- | ---------------------------------- |
   | **Rule Name         ** | You can input any rule name with 30 characters at most. |
   | **Request Path**          | The url requested by the user                      |
   | **Rewrite Path**          | The url actually requested                      |

6. Click **OK** to add rules.