# Set custom protection

After the website is accessed to the Web Application Firewall, you can enable the custom protection policy function. The custom protection policy allows you to customize IAM rules based on exact match conditions. The custom protection policy supports customization as per business scenarios and can be used to hotlinking protection and background protection for website management, etc. Custom rules can be configured according to real demands.


## Prerequisites

- A Web Application Firewall instance has been enabled. For more information, please refer to [Enable Web Application Firewall](https://docs.jdcloud.com/en/web-application-firewall/purchase-process).
- The website has been accessed. For more information, please refer to [Add Website](https://docs.jdcloud.com/en/web-application-firewall/step-1).

## Operation Steps

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).

2. Click **Website Configuration** on the left navigation bar.

3. Locate the domain to be set on the **Website Configuration** page and click **Protection Configuration** on the operation bar.

4. On the protection configuration page, open the **Web Protection** tag, direct to the **Custom Protection** module and enable the switch as shown in the figure below.

![image](../../../../../image/WAF/protect-configure/56.Custom-Protection.png)

5. Please add custom protection conditions before adding rules. Click the **Protection Conditions** Tab page on the right side (as shown below).

![image](../../../../../image/WAF/protect-configure/57.Custom-Protection-Condition.png)

6. Click **Add Conditions** and add conditions as per steps below.

![image](../../../../../image/WAF/protect-configure/58.Custom-Protection-Condition-Add1.png)

i. Enter name of conditions.

ii. Enter match types: Determination dimensions of protection conditions can be selected among types such as **String**, **Regularization **, **Region**, **Length**, **IP**, **SQL Injection** and **XSS**.

iii. Click **Add**. After the protection condition addition rules are popped up on the right (as shown below), add rules as per descriptions given in the table below and click **OK**.
![image](../../../../../image/WAF/protect-configure/59.Custom-Protection-Condition-Add2.png)

| Match Type    | Add description of condition                                                 |
| ----------- | ------------------------------------------------------------ |
| **String**  | 1.**Request Position**: Select a position which is matched with a string among **headers**, **cookie**, **args**, **body**, **uri**, **method*, etc. <br />2.**Use of Decoding Function**: Determine whether the decoding function is used for the contents selected by the request position. If yes, please select the decoding function. <br />![image](../../../../../image/WAF/protect-configure/61.Custom-Protection-Condition-String.png)3.**Decoding function** (optional): After you select to use decoding functions, the following decoding functions can be selected: **Converting to Lower Case**, **No Space**, **base64 Decoding**, **URL Decoding** and **HTML Decoding**. Multiple functions can be selected. If so, decoding operation will be carried out as per the selection sequence. <br />4.**Match Logic**: **Exact Match**, **Prefix Match**, **Suffix Match** and **Inclusion Match** are supported. <br />5.**Match Content**: Strings to be matched. **Whether base64 decoding is required for matched content**: Refer to whether the matched content requires WAF decoding first and then matching. If the contents entered are coded, please check the field. <br />6. Click **Add** to complete addition of one rule among addition conditions. |
| **Regular**    | 1.**Request Position**: Select a position requiring match of regular expressions from **headers**, **cookie**, **args**, **body**, **uri**, **method*, etc. <br />2.**Use of Decoding Function**: Determine whether the decoding function is used for the contents selected by the request position. If yes, please select the decoding function. <br />![image](../../../../../image/WAF/protect-configure/62.Custom-Protection-Condition-Zhengze.png)<br />3.**Decoding function** (optional): After you select to use decoding functions, the following decoding functions can be selected: **Converting to Lower Case**, **No Space**, **base64 Decoding**, **URL Decoding** and **HTML Decoding**. Multiple functions can be selected. If so, decoding operation will be carried out as per the selection sequence. <br />4.**Match Content**: Regular expressions to be matched. <br />5. Click **Add** to complete addition of one rule among addition conditions. |
| **Region**    | 1.**Match Content**: A matched region can be selected. Provinces, cities and regions within China can be selected. <br />![image](../../../../../image/WAF/protect-configure/63.Custom-Protection-Condition-Region.png)<br />2. Click **Add** to complete addition of one rule among addition conditions. |
| **Length**    | 1.**Request Position**: Select a position requiring determining length among **headers**, **cookie**, **args**, **body**, **uri**, **method**, etc. <br />2.**Designate key**: When the request position is selected among headers, cookie and args, designated key can be selected or key can be inputted. <br />3.**Match Logic**: Logic for matching length of contents selected at the request position, with **Equal to, greater than, less than** supported. <br />4.**Match Content**: Input length value to be matched. <br />5. Click **Add** to complete addition of one rule among addition conditions. ![image](../../../../../image/WAF/protect-configure/64.Custom-Protection-Condition-Length.png) |
| **IP**      | 1.**Match Content**: Enter IP address. Input of address in CIDR format, IPv4 address and IPv6 address is supported. <br />![image](../../../../../image/WAF/protect-configure/65.Custom-Protection-Condition-IP.png)<br />2. Click **Add** to complete addition of one rule among addition conditions. |
| **SQL Injection** | 1.**Request Position**: By ​virtual ​of ​Intelligent ​Semantic ​Engine, ​SQL ​injection ​judgment ​can ​be ​made ​to ​contents ​in ​the ​request ​position ​such ​as ​**headers**, ​**cookie**, ​**args**, ​**body**, ​**uri** ​and ​**method**. <br />2.**Use of Decoding Function**: Determine whether the decoding function is used for the contents selected by the request position. If yes, please select the decoding function. <br />![image](../../../../../image/WAF/protect-configure/66.Custom-Protection-Condition-SQL.png)<br />3.**Decoding function** (optional): After you select to use decoding functions, the following decoding functions can be selected: **Converting to Lower Case**, **No Space**, **base64 Decoding**, **URL Decoding** and **HTML Decoding**. Multiple functions can be selected. If so, decoding operation will be carried out as per the selection sequence. <br />4. Click **Add** to complete addition of one rule among addition conditions. |
| **XSS**     | 1.**Request Position**: By virtual of Intelligent Semantic Engine, SQL injection judgment can be made to the contents of the positions such as **headers**, **cookie**, **args**, **body**, **uri** and **method**. <br />2.**Use of Decoding Function**: Determine whether the decoding function is used for the contents selected by the request position. If a decoding function is selected to be used, please select the decoding function. <br />![image](../../../../../image/WAF/protect-configure/67.Custom-Protection-Condition-XSS.png)<br />3.**Decoding function** (optional): After you select to use decoding functions, the following decoding functions can be selected: **Converting to Lower Case**, **No Space**, **base64 Decoding**, **URL Decoding** and **HTML Decoding**. Multiple functions can be selected. If so, decoding operation will be carried out as per the selection sequence. <br />4. Click **Add** to complete addition of one rule among addition conditions. |

**Note: The above contents specify how to add one sub-rule for one protection condition. At most 3 sub-rules can be added for one protection condition. The three rules are in **or** relationship. In other words, the protection conditions are true even if only one sub-rule is hit.**

7. Add protection conditions on the interface as shown below. Click the **Protection Rule** Tab on the upper right corner and switch to the protection rule page.

![image](../../../../../image/WAF/protect-configure/75.Custom-Protection-Condition.png)

8. Click **Add Rules** (as shown below) and add protection rules according to description in the table below.

![image](../../../../../image/WAF/protect-configure/60.Custom-Protection-Add-Rule.png)

| Match Type      | Add descriptions of protection rules                                             |
| ------------- | ------------------------------------------------------------ |
| **Rule Name**  | You can input any protection rule name with 30 characters at most.                       |
| **Add Conditions** | **Condition**: Select a protection condition added from the drop-down choice box. <br />**Logic Operator**: Operation for selected protection condition, with **Negation** or **Not Negation** available. <br />After **Add Conditions** is clicked, new protection conditions can be added. At most 5 protection conditions can be added, which are in the **And** relationship. When these conditions are satisfied, configuration action will be executed. |
| **Configuration Action**  | When the above conditions are reached, the configuration action will be performed, including:<br />**Observation**: Release requests and record logs only. <br />**Human-machine Interaction**: Human-machine algorithm challenge<br />**Interception**: Intercept requests and return to 493 page. Returning to the custom page is supported (you need to upload a custom page at first). |