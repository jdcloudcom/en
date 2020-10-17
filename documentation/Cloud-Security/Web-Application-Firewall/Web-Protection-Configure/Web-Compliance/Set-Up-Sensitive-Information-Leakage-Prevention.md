# Set Sensitive Information Leakage Prevention

After the website is accessed to the Web Application Firewall, you can enable its sensitive information leakage prevention function. Sensitive information leakage prevention helps websites filter sensitive information (such as ID number, bank card number, phone number) in the content returned by the server, displaying desensitized sensitive information or alarm. You can set rules for preventing sensitive information leakage based on your actual needs.

## Prerequisites

- A Web Application Firewall instance has been enabled, and the specification of the instance package must be advanced or above version. For more information, please refer to [Enable Web Application Firewall](https://docs.jdcloud.com/en/web-application-firewall/purchase-process).
- The website has been accessed. For more information, please refer to [Add Domain](https://docs.jdcloud.com/en/web-application-firewall/step-1).

## Background Information

The sensitive information leakage prevention function is a security protection plan for the Web Application Firewall in response to "Network operators should take technical measures and other necessary measures to ensure the safety of the personal information they collect, and prevent information leakage, damage, or loss. If personal information leakage, damage, or loss occurs or may occur, they should immediately take remedial measures, notify users in a timely manner and report to relevant competent authorities in accordance with the regulations" in the Cybersecurity Law. The sensitive information leakage prevention provides desensitization and warning measures for sensitive information leaks on websites (especially mobile phone numbers, ID card numbers, and credit card information) and the leakage of sensitive words.

For Web Application Firewall instances in Monthly Package, the following restrictions are made to its sensitive information leakage prevention function.

| Function           | Description                                     | Advanced Version   | Enterprise Version   | Flagship Version   |
| :------------- | :--------------------------------------- | :------- | :------- | :------- |
| Sensitive Information Leakage Prevention | The maximum rules for sensitive information leakage prevention that can be added.  | 10 (entries) | 20 (entries) | 20 (entries) |

## **Working Principle**

Sensitive information leakage prevention detects whether sensitive information such as ID number, phone number, bank card number and so on is contained in the response page as per the configured protection rules. After finding any sensitive information hits the rules, it will trigger an alarm or the sensitive information filtering as per the match action specified in the rules. The sensitive information filtering action refers to replacing sensitive information with * for protection.

## Operation Steps

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).

2. Click **Website Configuration** on the left navigation bar.

3. Locate the domain to be operated on the **Web Configuration** page and click **Protection Configuration** on the operation bar.

4. On the Protection Configuration page, click the **Web Compliance** tab, locate to the **Sensitive Information Leakage Prevention ** module, enable the **Status** switch, and click ** Add Rules**.

   ![image](../../../../../image/WAF/protect-configure/18.Sensitive-Infomation-Anti-leakage.png)

5. Add rules for sensitive information leakage prevention. Configure the following rules in the Add Rules dialog box.

   ![image](../../../../../image/WAF/protect-configure/19.Sensitive-Infomation-Add-Rules.png)

   | Configuration Item       | Description                                                         |
   | :----------- | :----------------------------------------------------------- |
   | **Rule Name** | Name the rule.                                                 |
   | **URI**      | Fill in the URI specified for detection, that is, only detect sensitive information on the specified page. <br />Fill in: Match mode + path<br />Optional match modes: **Exact Match**, **Prefix Match** and **Inclusion Match**. |
   | **Match Type** | Select the type of sensitive information to be detected and matched in the request response, and the optional sensitive information values are **ID Card**, **Credit Card**, **Phone Number**. <br />**Description**: **Phone Number** Only mobile phone numbers in Mainland China are supported currently. |
   | **Match Action** | Define the action to be performed after sensitive information is detected in the request response. The following matched actions are supported: <br />**Alarm**: No sensitive information is processed and only logs are recorded. <br />**Filtration of sensitive information**: Desensitize sensitive information in request response. |


