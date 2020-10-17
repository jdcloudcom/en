# Set CC Security Protection

After the website is accessed to the Web Application Firewall, the CC security protection function is enabled by default to intercept CC attacks on the website. You can adjust the protection mode of CC security protection based on your actual needs.


## Prerequisites

- A Web Application Firewall instance has been enabled. For more information, please refer to [Enable Web Application Firewall](https://docs.jdcloud.com/en/web-application-firewall/purchase-process).
- The website has been accessed. For more information, please refer to [Add Website](https://docs.jdcloud.com/en/web-application-firewall/step-1).

## Use Restrictions

For Web Application Firewall instances in Monthly Package, the following restrictions are made to its CC custom protection function.

| Function         | Description                             | Advanced Version | Enterprise Version   | Flagship Version   |
| :----------- | :------------------------------- | :----- | :------- | :------- |
| CC custom rules | The maximum custom rules that can be added.  | Not supported | 20 (entries) | 50 (entries) |

## Operation Steps

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).

2. Click **Website Configuration** on the left navigation bar.

3. Locate the domain to be set on the **Website Configuration** page and click **Protection Configuration** on the operation bar.

4. On the Protection Configuration page, enable the **Web Protection** tab by default and ensure the **Overall Protection Switch** is on. Switch to the **CC Security Protection** tab.

5. Set the **CC Security Protection** mode.
![image](../../../../../image/WAF/protect-configure/5.CC-Pattern.png)

| Configuration Item       | Description                                                         |
| :----------- | :----------------------------------------------------------- |
| **Status**     | Enable or disable the CC security protection function.                                   |
| **Protection Mode** | The protection mode to be applied. Optional values: <br />**Normal**: The normal mode is used by default. We suggest you apply this mode when there is no obvious traffic abnormality on the website. The normal mode is based on statistics on dimensions such as host, IP, and URL. <br />**Global Mode**: It is based on the global host traffic and can be set. The signal IP traffic remains unchanged. <br />**Single IP Mode**: It is based on the single IP traffic and can be set. The global host remains unchanged. <br />**Protection-Emergency**: You can apply this mode when you find that there are CC attacks that cannot be blocked by the protection mode, and the website responds slowly, and indicators such as traffic, CPU, and memory are abnormal. The verification code will be returned to all requests for verification. Please use it with caution. <br />**Description** Protection-Emergency mode is suitable for web/H5 pages, but not for API/Native App businesses |

6. Set custom rules and add rules as per the configuration item description in the table below.

![image](../../../../../image/WAF/protect-configure/6.CC-Custom-Rules.png)

| Configuration Item             | Description                                                         |
| ------------------ | ------------------------------------------------------------ |
| **Rule Name**       | You can input any rule name with 30 characters at most.                           |
| **URI**            | The URI specified to be protected: <br />Fill in: Match mode + path<br />Optional match modes: **Exact Match**, **Prefix Match**, **Inclusion Match**, and **Postfix Match**. |
| **Detection Duration**       | The detection duration of the rule and the unit is second.                                   |
| **Number of Single IP Visits** | Enter the number of single IP visits during the detection duration. We suggest you configure the number at 3 to 10 times more than the normal business traffic. |
| **Configure Action**       | When the matching URI is hit and the single IP reaches the number of visits within the detection duration, the action configured will be performed: <br />**Human-Computer Interaction": Human-computer algorithm challenge<br />**Intercept**: Intercept requests and return to 493 page by default. Returning to the custom page is supported (you need to upload a custom page first). |
| **Duration**       | The duration that the configured action is executed after rules are hit. The unit is minute.             |




