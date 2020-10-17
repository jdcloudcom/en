# Set Custom BOT Rules - Advanced

Web Application Firewall supports adding custom rules to identify BOT robot requests and configure actions (such as intercept). The general custom rules are mainly to configure rules and identify statistics for the dimensions of IP requests under the specified Host (domain). By the advanced custom rules, you can configure rules based on the device fingerprint dimension. Custom advanced rules are mainly to solve the situation that if the crawler passes through the IP pool, a single IP crawl low frequency will form while this situation cannot be recognized by the general custom rules and anti-crawler module. On this page, we mainly introduce how to use **Custom BOT Rules-Advanced**.

## Prerequisites

- A Web Application Firewall instance has been enabled, and it shall be the enterprise version or above. For more information, please refer to [Enable Web Application Firewall](https://docs.jdcloud.com/en/web-application-firewall/purchase-process).
- The website has been accessed. For more information, please refer to [Add Domain](https://docs.jdcloud.com/en/web-application-firewall/step-1).
- Only webpages are supported. You can access via a browser and execute JS programs.

## Background Information

The working principle of custom BOT rules-advanced is to execute JS for suspected BOT requests and generate fingerprint information (for request re-verification). Subrequests carry fingerprint information for verification and identification. The way the advanced rules work is based on fingerprint verification and fingerprint-based frequency statistics. For multi-IP slow crawlers, it can provide good protection. To generate fingerprint information needs to execute JS via a webpage. So you need to set the JS page first and then customize the configuration of fingerprint verification and rules based on fingerprint frequency.

For Web Application Firewall instances in Monthly Package, the following restrictions are made to its function of custom BOT rules - advanced.

| Function               | Description                                     | Advanced Version | Enterprise Version   | Flagship Version   |
| :----------------- | :--------------------------------------- | :----- | :------- | :------- |
| Custom BOT rules-advanced | The maximum custom BOT rules-advanced that can be added.  | Not supported | 10 (entries) | 20 (entries) |

## Operation Steps

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).

2. Click **Website Configuration** on the left navigation bar.

3. Locate the domain to be operated on the **Web Configuration** page and click **Protection Configuration** on the operation bar.

4. On the Protection Configuration page, click the **BOT Management** tab, locate to the **Custom BOT Rules** module, and enable the **Status** switch. Click the **Advanced** Tab page on the right.

   ![image](../../../../../image/WAF/protect-configure/36.Bot-Senior.png)

5. Click **JS Insert Page** Tab, as shown in the figure below. This page is mainly used to configure the JS injection page for obtaining device fingerprints. By default, all pages are selected to support JS injection.

![image](../../../../../image/WAF/protect-configure/38.Bot-Senior-JS.png)

If not all pages to be protected support JS injection, you can choose to specify the page to insert JS. See the figure below

![image](../../../../../image/WAF/protect-configure/39.Bot-Senior-JS-Add.png)

Click **Add Page** and add the specified page to insert JS. As shown in the figure, enter a complete URL.

![image](../../../../../image/WAF/protect-configure/40.Bot-Senior-JS-Add-Page.png)

6. Click **Custom Rules** Tab, click **Add Rules**, and configure the information as per the figure below

![image](../../../../../image/WAF/protect-configure/37.Bot-Senior-Add-Rule.png)

| Configuration Item       | Description                                                         |
| :----------- | :----------------------------------------------------------- |
| **Rule Name** | You can input any rule name with 30 characters at most.                           |
| **URL**      | Enter the URL to be protected.                                            |
| **Fingerprint Verification** | The fingerprint verification dimensions include **Existence** and **Legality**:<br />**Existence**: Whether requests carry fingerprints generated. <br />**Legality**: Whether the fingerprints carried are legal. |
| **Verification Action** | In the process of fingerprint verification, if you encounter a non-compliant request, you can select the human-computer identification and an intercept action. <br />**Human-Computer Identification**: When performing a human-computer challenge, requests passing the challenge can access normally; otherwise they will be intercepted. <br />**Intercept**: Return to 493 intercept page to block requests. |
| **Detection Duration** | The statistical duration of the rule and the unit is second.                                   |
| **Number of Visits** | A fingerprint-based statistical threshold during the detection duration. If the threshold is exceeded, the action configured will be executed.   |
| **Configure Action** | You can choose observation, human-computer interaction, and intercept action. <br />**Observation**: Release requests and record logs only. <br />**Human-computer Interaction**: Challenge requests by human-computer interaction. Those successfully verified will be released; otherwise will be intercepted. <br />**Intercept**: Return to 493 intercept page. Returning to the custom page is supported (you need to upload a custom page at first) |

Click **OK** to add custom Bot rules.