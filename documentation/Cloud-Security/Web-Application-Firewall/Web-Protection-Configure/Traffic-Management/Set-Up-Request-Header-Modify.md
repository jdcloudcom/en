# Set Request Header Modification

Web Application Firewall supports adding, deleting, and modifying request headers. You can apply it to the traffic trace system on the server for user traffic tracking and other related scenarios.

## Prerequisites

- A Web Application Firewall instance has been enabled. For more information, please refer to [Enable Web Application Firewall](https://docs.jdcloud.com/en/web-application-firewall/purchase-process).
- The website has been accessed. For more information, please refer to [Add Domain](https://docs.jdcloud.com/en/web-application-firewall/step-1).

## Use Restrictions

For Web Application Firewall instances in Monthly Package, the following restrictions are made to its request header modification function.

| Function       | Description                               | Advanced Version   | Enterprise Version   | Flagship Version   |
| :--------- | :--------------------------------- | :------- | :------- | :------- |
| Request header modification | The maximum request header modification rules that can be added.  | 10 (entries) | 20 (entries) | 50 (entries) |

## Operation Steps

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).

2. Click **Website Configuration** on the left navigation bar.

3. Locate the domain to be operated on the **Web Configuration** page and click **Protection Configuration** on the operation bar.

4. On the Protection Configuration page, click the **Traffic Management** tab, locate to the **Request Header** module, and enable the **Status** switch.

   ![image](../../../../../image/WAF/protect-configure/42.Request-Header.png)

5. Click **Add Rules** and configure as per the table below.

   ![image](../../../../../image/WAF/protect-configure/43.Request-Header-Add-Rule.png)

   | Configuration Item                 | Description                                                         |
   | ---------------------- | ------------------------------------------------------------ |
   | **Rule Name **          | You can input any rule name with 30 characters at most.                           |
   | **Match Type**           | **header** and **cookie** are optional                                   |
   | **key**                | When the match type is **header**, you can select a key such as Accept, Accept-Language, Access-Control, Authorization, Cache-control, Content-Type, Cookie, Date, Host, Last-Moified, User-Agent, Origin, Referer, Server, Vary, etc. or enter a key value<br />When the match type is **cookie**, you can enter a key value |
   | **Match Mode **          | You can select either **Modify** or **Delete**. <br />When the match mode is the delete mode, the match value will be directly deleted without being shown. <br />When the match mode is the modify mode, the match value information will be replaced or the key valve of the relevant key will be added. |
   | **Type of Match Value** (Optional) | When the **Match Type** is **header** and the **Match Mode** is **Modify**, the type of match value can be **String** or **Script**. |
   | **Match Value** (Optional)     | The string to be replaced is filled in by default. When the type of match value is Script, you can fill in the specified script. For the detailed information about the script, please refer to [Script Description](https://cloudwaf-console.jdcloud.com/script_description). |

