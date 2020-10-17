# Set Rules for Known Crawler Libraries

Web Application Firewall supports the identification and classification of BOT robot programs and the adoption of targeted traffic management policies, such as releasing search engine robot traffic, blocking malicious crawling of product information, seckilling price, inventory information, and other core data. Besides, it also can deal with problems such as resource consumption and business data query caused by malicious robot program crawling, and meanwhile guarantee the normal operation of friendly robot programs (such as search engines and advertising programs) On this page, we mainly introduce how to use known crawler libraries in the BOT management module.

## Prerequisites

- A Web Application Firewall instance has been enabled, and it shall be the enterprise version or above. For more information, please refer to [Enable Web Application Firewall](https://docs.jdcloud.com/en/web-application-firewall/purchase-process).
- The website has been accessed. For more information, please refer to [Add Domain](https://docs.jdcloud.com/en/web-application-firewall/step-1).

## Background Information

Web Application Firewall provides known crawler libraries, including 11 publicly known BOT categories and more than 300+ BOT subcategories, such as search engines, speed measurement tools, content aggregation, scanning, and web crawlers. Users can set protection actions (observation, human-computer interaction, and intercept) for the public BOT categories as per their own needs, and WAF will possess the BOT requests that hit the public categories accordingly.

**Description** In addition to the Bot management module, you can also use IAM rules to further add IPs or UAs to the friendly crawler white list.

## Operation Steps

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).

2. Click **Website Configuration** on the left navigation bar.

3. Locate the domain to be operated on the **Web Configuration** page and click **Protection Configuration** on the operation bar.

4. On the Protection Configuration page, click the **BOT Management** tab, locate to the **Known BOT Type Setting** module, and enable the **Status** switch.

   ![image](../../../../../image/WAF/protect-configure/30.Bot-Ua-Rule.png)

5. Select whether to enable the corresponding enable mode in the **Known BOT Type" rule list according to the **BOT Description**. You can click **View Type** to view the BOT type details. For legal crawlers to be released, enable the **Observation** switch on the operation bar. For all BOT rules, the **Observation** mode is enabled by default. We suggest you release crawl requests from search engines (Google, Bing, Baidu, Sogou, 360), that is, select the **Observation** mode.

![image](../../../../../image/WAF/protect-configure/32.Bot-Details.png)

![image](../../../../../image/WAF/protect-configure/31.Bot-Ua-Lib.png)



| Operation     | Description                                                 |
| :------- | :--------------------------------------------------- |
| Observation     | Release requests and record logs only                                 |
| Human-computer interaction | Challenge requests by human-computer interaction. Those successfully verified will be released; otherwise will be intercepted |
| Intercept     | Intercept requests and return to 493 page                                |

