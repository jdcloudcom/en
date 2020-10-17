# Set Custom BOT Rules - General

Web Application Firewall supports adding custom rules to identify BOT robot requests and configure actions (such as intercept). The general custom rules are mainly to configure rules and identify statistics for the dimensions of IP requests under the specified Host (domain). On this page, we mainly introduce how to use custom BOT rules.

## Prerequisites

- A Web Application Firewall instance has been enabled, and it shall be the enterprise version or above. For more information, please refer to [Enable Web Application Firewall](https://docs.jdcloud.com/en/web-application-firewall/purchase-process).
- The website has been accessed. For more information, please refer to [Add Domain](https://docs.jdcloud.com/en/web-application-firewall/step-1).

## Use Restrictions

For Web Application Firewall instances in Monthly Package, the following restrictions are made to its function of custom BOT rules - general.

| Function               | Description                                     | Advanced Version | Enterprise Version   | Flagship Version |
| :----------------- | :--------------------------------------- | :----- | :------- | :----- |
| Custom BOT rules-general | The maximum custom BOT rules-general that can be added.  | Not supported | 20 (entries) | Unlimited   |

## Operation Steps

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).

2. Click **Website Configuration** on the left navigation bar.

3. Locate the domain to be operated on the **Web Configuration** page and click **Protection Configuration** on the operation bar.

4. On the Protection Configuration page, click the **BOT Management** tab, locate to the **Custom BOT Rules** module, and enable the **Status** switch. Select the **General** tab.

   ![image](../../../../../image/WAF/protect-configure/33.Bot-Custom-Currency.png)

5. Click the **Custom BOT Policy** button and configure the information as per the figure below.

![image](../../../../../image/WAF/protect-configure/34.Bot-Custom-Currency-Add-Rule.png)

| Configuration Item       | Description                                                         |
| :----------- | :----------------------------------------------------------- |
| **Rule Name** | You can input any rule name with 30 characters at most.                           |
| **Matching Conditions** | You can add URL, User-Agent, IP, Cookie, Referer, and other dimensions. <br /> Each matching condition supports **Exact Match** and **Subsume** match. <br />The relationship between the added conditions is **And **. **5** matching conditions at most are supported for each rule<br />![image](../../../../../image/WAF/protect-configure/35.Bot-Custom-Currency-Condition.png) |
| **Detection Duration** | The detection duration of the rule and the unit is second.                                   |
| **Number of Visits** | Enter the number of single IP visits and configure the frequency during the detection duration.                 |
| **Configure Action** | You can choose observation, human-computer interaction, and intercept action. <br />**Observation**: Release requests and record logs only. <br />**Human-computer Interaction**: Challenge requests by human-computer interaction. Those successfully verified will be released; otherwise will be intercepted. <br />**Intercept**: Intercept requests and return to 493 page. Returning to the custom page is supported (you need to upload a custom page at first) |

Click **OK** to add custom Bot rules.