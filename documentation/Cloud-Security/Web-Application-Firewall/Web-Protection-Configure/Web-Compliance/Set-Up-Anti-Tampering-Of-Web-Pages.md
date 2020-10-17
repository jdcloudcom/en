# Set Webpage Tamper-proofing

After the website is accessed to the Web Application Firewall, you can enable the webpage tamper-proofing function. Webpage tamper-proofing helps you lock the website page that needs to be protected. When the locked page receives a request, it will return to the cache page that has been set to prevent the impact caused by malicious tempering on the page content from the origin server. You can set webpage tamper-proofing rules based on your actual needs.

## Prerequisites

- A Web Application Firewall instance has been enabled. For more information, please refer to [Enable Web Application Firewall](https://docs.jdcloud.com/en/web-application-firewall/purchase-process).

- The website has been accessed. For more information, please refer to [Add Domain](https://docs.jdcloud.com/en/web-application-firewall/step-1).


## Use Restrictions

For Web Application Firewall instances in Monthly Package, the following restrictions are made to its webpage tamper-proofing function.

| Function       | Description                               | Advanced Version   | Enterprise Version   | Flagship Version   |
| :--------- | :--------------------------------- | :------- | :------- | :------- |
| Webpage tamper-proofing | The maximum rules for webpage tramper-proofing that can be added.  | 10 (entries) | 20 (entries) | 50 (entries) |

## Operation Steps

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).

2. Click **Website Configuration** on the left navigation bar.

3. Locate the domain to be operated on the **Web Configuration** page and click **Protection Configuration** on the operation bar.

4. On the Protection Configuration page, click the **Web Compliance** tab, locate to the **Webpage Tamper-proofing** module, enable the **Status** switch, and click ** Add Rules**.

   ![image](../../../../../image/WAF/protect-configure/7.Website-Anti-Tamper.png)

   **Description** You must enable the webpage tamper-proofing first and then protection rules can take effect.

5. Added rules for webpage tamper-proofing.

   1. Click **Add Rules** on the **Webpage Tamper-proofing** page.

   2. Enter the **Rule Name** and **URL** corresponding to the webpage to be protected in the **Add Rules** dialog box.

      - **Rule Name**: You can input any rule name with 30 characters at most.
      - **URL**: The URL prefix can be either http or https protocol, followed by a precise path to be protected. Wildcards (such as '/*') or parameters (such as '/abc?xxx=') are not supported.

      ![image](../../../../../image/WAF/protect-configure/8.Website-Anti-TamperRules.png)

   3. Click **OK**.

   After webpage tamper-proofing rules are successfully added, the rules are disabled by default. You can view the newly created rules in the Rules list, and the **Protection Status** switch is disabled.

   ![image](../../../../../image/WAF/protect-configure/9.Website-Add-Rules.png)

6. Enable rules. Locate to the rules to be enabled in the Rules list, and enable the **Protection Status** switch.

   After the rules are successfully enabled, when a page corresponding to the rules is requested, cache records in Web Application Firewall will be returned uniformly.

   ![image](../../../../../image/WAF/protect-configure/10.Website-Open-Switch.png)

7. Optional:

   Update cache. Locate to the rules enabled in the Rules list and click **Update Cache** under the **Protection Status** column.

   **Note** If to update the content of the page being protected, you must click **Update Cache** to update cache records in the Web Application Firewall. If you do not update the cache after updating the page, the Web Application Firewall will always return the most recently cached record.