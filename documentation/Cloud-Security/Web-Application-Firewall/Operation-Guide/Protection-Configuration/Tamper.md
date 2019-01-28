## **Website Tamper-proofing**

You may use website tamper-proofing to set cache to the specified sensitive page. Once cached, even if the contents of the origin server page are maliciously tampered, the pre-cached page contents will be returned by WAF to the visitor to ensure that the user views the correct page.

### **Operation Steps**

Refer to the following steps to enable and configure the website tamper-proofing:

**Description: **Prior to the following operations, please ensure that the website has accessed WAF for protection. Please refer to CNAME Access Guideline for specific operations
1. Log in to [JD Cloud Web Application Firewall Console](https://cloudwaf-console.jdcloud.com).

2. Go to **Website Configuration** page.

3. Select the domain required to be operated; click **Protection Configuration** under its operation list.

4. Enable the protection under **Website Tamper-proofing**, and single click **Go to Configure**. **Description:** If you don’t want to use the website tamper-proofing, you may disable the protection in this page.![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E7%BD%91%E9%A1%B5%E9%98%B2%E7%AF%A1%E6%94%B9-1.png)

5. Single click **Add a New Rule** to configure the specific page to be protected in the dialog box to add URL.![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E7%BD%91%E9%A1%B5%E9%98%B2%E7%AF%A1%E6%94%B9-2.png)

6. - **Name of Rule**: Name this rule.
   - **URL**: Fill in the accurate path to be protected.

7. After adding the rule, manually turn on the switch under the **Protection Status** of the corresponding rule. If you fail to turn on the protection switch after adding the rule, the setting will not enter into force.![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E7%BD%91%E9%A1%B5%E9%98%B2%E7%AF%A1%E6%94%B9-3.png)

8. If the contents in the protected page are updated, you must single click **Update Cache** to update the cache. If you fail to update the cache after page update, WAF will always return the page contents of the latest cache.![img](https://github.com/jdcloudcom/cn/blob/dns-zhangjingfeng/waf-img/%E7%BD%91%E9%A1%B5%E9%98%B2%E7%AF%A1%E6%94%B9-4.png)

 
