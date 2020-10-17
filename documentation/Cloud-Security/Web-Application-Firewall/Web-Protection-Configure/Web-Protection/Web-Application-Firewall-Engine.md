# Set protection against Web application attack

After the website is accessed to the Web Application Firewall, the Web application attack protection is enabled by default. Web Application Attack Protection Engine is based on a built-in expertise rule set, which automatically provides website defenses against Web attacks such as SQL injection, XSS cross-site attack, webshell upload, command injection, backdoor isolation, illegal file request, path traversal, common application vulnerability attack. The document specifies how to configure Web Application Attack Protection.


## Prerequisites

- A Web Application Firewall instance has been enabled. For more information, please refer to [Enable Web Application Firewall](https://docs.jdcloud.com/en/web-application-firewall/purchase-process).
- The website has been accessed. For more information, please refer to [Add Website](https://docs.jdcloud.com/en/web-application-firewall/step-1).

## Operation Steps

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).

2. Click **Website Configuration** on the left navigation bar.

3. Locate the domain to be set on the **Website Configuration** page and click **Protection Configuration** on the operation bar.

4. On the Protection Configuration page, enable the **Web Protection** tab by default and ensure the **Overall Protection Switch** is on. If such switch is off, WAF will only keep the traffic forwarding function, providing no protection. As shown in the figure below

![image](../../../../../image/WAF/protect-configure/4.whole-protect-switch.png)



5. Direct to the **Web Application Attack Protection** module in the **Web Protection** page (as shown in the figure below). The configuration is as shown in the table below.

![image](../../../../../image/WAF/protect-configure/68.Web-Application-Firewall-Engine.png)

| Configuration Item               | Description                                                         |
| -------------------- | ------------------------------------------------------------ |
| **Status Switch**         | Enable or disable Web application attack protection function.                              |
| **Mode**             | Operation carried out for attack request when an attack request is detected and discovered. Optional operation: <br />**Detection Mode**: Only logs are recorded, with no attack requests blocked. <br />**Interception Mode**: When an attack is discovered, the attack request is directly blocked. |
| **Protection Rule Policy Level** | Detection rules to be applied. Level of supported rule: <br />**Normal**: Detecting common Web application attacks (default option). <br />**Serious**: When you need more serious protection path traversal, SQL injection and command performance, you are suggested to select the level. <br />**Mild**: When there are many false interceptions discovered or the service has many uncontrollable user inputs, you can select the level. |
| **Interception Return Page**     | When the interception mode is selected and the attack request is blocked, the default interception page is returned. Selection among existing custom return pages via the drop-down box is supported. Click **Brush** and then you can add a custom page as shown below<br />![image](../../../../../image/WAF/protect-configure/1.custom-page.png)<br />Click the addition page<br />![image](../../../../../image/WAF/protect-configure/2.add-custom-page.png)Fill in information: Add name of the page and enter the page code with the maximum size of 5k as the page content. After entering, click **OK** and then approval process will be initialized. Upon approval, the upload page will display the custom page list, as shown below<br />![image](../../../../../image/WAF/protect-configure/3.custom-page-list.png)<br /> |


