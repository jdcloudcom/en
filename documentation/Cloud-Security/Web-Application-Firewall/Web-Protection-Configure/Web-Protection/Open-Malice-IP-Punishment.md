# Enable malicious IP punishment

After Web Application Firewall is accessed, if you need to automatically block the any IP which frequently attacks Web within a short time, you can enable malicious IP punishment. The traditional Web Application Wall can intercept attacks from the IP-URL dimension only. When one request is determined as the attack action, it will be blocked at that time. However, attackers actually can use multiple IPs to continuously attack your web, and the single blocking is not efficient. In such case, WAF provides the malicious IP punishment function. When WAF detects that any IP is continuously attacking Web, WAF can help you automatically block the malicious client IP attacking Web for several times. The document mainly specifies how to enable and set malicious IP punishment.


## Prerequisites

- A Web Application Firewall instance has been enabled. For more information, please refer to [Enable Web Application Firewall](https://docs.jdcloud.com/en/web-application-firewall/purchase-process).
- The website has been accessed. For more information, please refer to [Add Website](https://docs.jdcloud.com/en/web-application-firewall/step-1).

## Operation Steps

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).

2. Click **Website Configuration** on the left navigation bar.

3. Locate the domain to be set on the **Website Configuration** page and click **Protection Configuration** on the operation bar.

4. On the protection configuration page, open the **Web Protection** tag, direct to the **Malicious IP Punishment** module and enable the switch as shown in the figure below. Click the button of blue pen to modify the protection threshold.

![image](../../../../../image/WAF/protect-configure/55.Evil-IP-Punishment.png)

- **Attack Threshold**: Set the Web attack threshold for statistics. During the detection period, any attack beyond the Web attack threshold will be blocked.

- **Detection Period**: Unit time of detection.

- **Blocking Time**: Time preventing attacking IP from accessing Host.

  Meanings of settings in the figure above: Count Web attacks of IP per minute. When there are more than 50 attacks, IP will be blocked and access to Host of the IP will be intercepted within 120s.


