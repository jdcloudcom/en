# Enable Anti-crawler

Web Application Firewall supports enabling the anti-crawler module. The anti-crawler module can access URLs (after deduplication) for all requests based on a single IP for a period of time and reach a certain threshold, which is considered a crawling behavior and challenged. The challenge process starts from the human-computer interaction challenge and gradually escalates to interception.

## Prerequisites

- A Web Application Firewall instance has been enabled, and it shall be the enterprise version or above. For more information, please refer to [Enable Web Application Firewall](https://docs.jdcloud.com/en/web-application-firewall/purchase-process).
- The website has been accessed. For more information, please refer to [Add Domain](https://docs.jdcloud.com/en/web-application-firewall/step-1).

## Operation Steps

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).
2. Click **Website Configuration** on the left navigation bar.
3. Locate the domain to be operated on the **Web Configuration** page and click **Protection Configuration** on the operation bar.
4. On the Protection Configuration page, click the **BOT Management** tab, locate to the **Anti-crawler** module, and enable the **Status** switch.

![image](../../../../../image/WAF/protect-configure/41.Bot-Anti.png)