

# Data Risk Control

After the website is accessed to the Web Application Firewall, you can enable the data risk control function. Data risk control helps prevent possible crawler frauds in the key businesses (such as registration, login, activities, forums) of the website. You can set data risk control protection policies based on your actual needs.

## Prerequisites

- A Web Application Firewall instance has been enabled, and it shall be the enterprise version or above. For more information, please refer to [Enable Web Application Firewall](https://docs.jdcloud.com/en/web-application-firewall/purchase-process).
- The website has been accessed. For more information, please refer to [Add Domain](https://docs.jdcloud.com/en/web-application-firewall/step-1).
- Only webpages are supported. You can access via a browser and execute JS programs.

## Background Information

Based on JD Cloud's big data capabilities, via the leading risk decision engine in the industry, combined with the human-computer identification technology, the data risk control can prevent key business frauds in various scenarios. You can use the data risk control function by just connecting your business to the Web Application Firewall and easily obtain the risk control capability without any modification on the server or client.

Scenarios that can be protected by the data risk control include but are not limited to the following: spam registration, SMS verification code abuse, credential stuffing, brute force, malicious purchase, seckilling, gamma scalping, red envelope grab, ticket-grabbing by robots, and ballot-rigging.

For Web Application Firewall instances in Monthly Package, the following restrictions are made to its data risk control function.

| Function     | Description                         | Advanced Version | Enterprise Version   | Flagship Version   |
| :------- | :--------------------------- | :----- | :------- | :------- |
| Data risk control | The maximum protection requests that can be added.  | Not supported | 10 (entries) | 20 (entries) |

## Operation Steps

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).

2. Click **Website Configuration** on the left navigation bar.

3. Locate the domain to be operated on the **Web Configuration** page and click **Protection Configuration** on the operation bar.

4. On the Protection Configuration page, click the **Business Risk Control** tab, locate to the **Data Risk Control** module, and enable the **Status** switch. After enabling the data risk control, by default, Web Application Firewall will insert JS plug-ins in all (or specified) pages of the website for security protection.

   ![image](../../../../../image/WAF/protect-configure/71.Data-Risk.png)

5. On the Request Protection Tab page, click **Add Protection Request ** and fill in the protection requests as per the table below.

   ![image](../../../../../image/WAF/protect-configure/72.Data-Risk-Add-Rule.png)

   | Configuration Item        | Description                                                   |
| :------------ | :----------------------------------------------------------- |
   | **Rule Name ** | Enter the name of the protection rule                                           |
| **Protection URL **  | Enter the protection request URL. For more information, please refer to the **Protection Request URL**.       |
   | **Configure Action**  | The protection mode of data risk control. Optional values: <br />**Observation**: When a business attack is identified, record risk logs and do not intercept. You can view the risk details through the business risk control log. <br />**Human-Computer Interaction**: When a business attack is identified, an algorithm challenge is performed for secondary verification. |

6. Click **OK** to add rules. After the protection request is successfully added, it will take effect in about 10 minutes.

7. (Optional) Specify the page to be inserted with JS.

There may be compatibility issues between the front-end codes of  some pages and JavaScript scripts for data risk control. If you encounter such problems, we suggest you just add some of the pages to insert JS for security protection.

**Description** When you just insert JS plug-ins into some pages, you may not be able to obtain the overall user access behaviors by the data risk control function and thus affect the final protection effect.

Use Restrictions: At most 20-page addresses can be specified.

i. Click **Page to be Inserted with JS**Tab page.

ii. Select the **Specified Page to be Inserted with JS** and click **Add Page**.

![image](../../../../../image/WAF/protect-configure/73.Data-Risk-Add-JSPage.png)

iii. Enter the address (starting with "/") of the page to be inserted with JS in the **Add URL** dialog box and click **OK**.

![image](../../../../../image/WAF/protect-configure/74.Data-Risk-Add-JS-URL.png)

After a URL is successfully added, the data risk control will only insert JS plug-ins on the page under the URL path added by you.

After the data risk control is enabled, you can use the general log function of the Web Application Firewall to view the protection results. For log examples, please refer to **View Protection Results**.

## What is Protection Request URL

The protection request URL refers to the API address where business actions are executed. The URL isn't the URL address of the page itself. For example, as shown in the figure below, the URL address of the registered page itself is 'www.abc.com/login', and the business API address corresponding to the Login button is 'www.abc.com/register.do'.

![image](../../../../../image/WAF/protect-configure/77.Business-Risk-Control-Example.png)

In this situation, you can log in to the API address ('www.abc.com/login.do') corresponding to the Login button, add a protection request and set it as the protection request URL to prevent the risk of credential-stuffing login. If you set the address ('www.abc.com/login') of the page logged in as the protection request URL, normal users will also receive algorithm challenges when visiting the page, which will affect the user experience.

**Precautions on protection request URLs**

- The protection request URL must be accurate to the actual request URL. Fuzzy matching is not supported.

  For example, if you set 'www.exzample.com/test' as the protection request URL, the data risk control will only match the access requests of the test path and will not match the access requests of all pages under the test path.

- If you directly request the URL protected by the data risk control, an algorithm challenge will definitely be triggered. Therefore, please make sure that the configured protection request URLs will not be requested by users under normal circumstances, namely, normal users generally need to go through a series of pre-accesses before requesting the URL address.

- For scenarios directly calling APIs, the data risk control is not available for protection. As API calls are computer behaviors directly initiated, they cannot be verified by the human-computer identification of the data risk control. However, in the case where a normal user clicks a button on the page to call the API, the data risk control function can be used for protection.

