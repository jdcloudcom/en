## **Accurate Identity and Access Management**

  Accurate Identity and Access Management supports customized access rules and filter access requests according to the client IP, request URL and common request header field.

Common http fields are combined by conditions to support customized protection of business scenarios.

### **Feature Description**

  Accurate Identity and Access Management allows you to set the identity and access management rules, conditionally combine common HTTP fields (e.g. IP, URL, Host and parameter) to filter the access request and set operations including release, block or alarm to the request hitting the condition. Accurate Identity and Access Management supports protection policies customized by business scenarios and can be used to hotlinking protection, web management background protection, etc.

  Accurate Identity and Access Management rules are composed of matching conditions and matching actions. When creating a rule, you can define the matching conditions by setting matching field, logic symbol and corresponding matching content and define corresponding actions for access requests in line with the matching condition rules.

### **Matching Condition**

The matching condition consists of matching field, logic symbol and matching content.

**Description: **A maximum of three matching condition combinations is allowed to be set for each accurate identity and access management rule; the logical relation among each condition is “and”, namely that this rule is hit until the access request must simultaneously satisfy all matching conditions and corresponding matching action will be executed.

### **Matching Action**

Accurate identity and access management rules support the following matching actions:

- - **Block**: Block the access request hitting the matching conditions.
  - **Release**: Release the access request hitting the matching conditions.
  - **Alarm**: Release the access request hitting the matching conditions and alarm for the requests.

**Description: **After selecting **Release** and **Alarm** matching actions, you may further set whether the request needs to continue being filtered by other WAF protection feature detection, such as Web application attack protection, CC application attack protection, etc.

### **Rule Matching Order**

If you set multiple rules, and there is a sequential matching order for multiple rules, i.e. the access requests will be matched in the order for accurate identity and access management rules as set by you, the accurate identity and access management rule with higher priority will be matched first.

You may sequence all the accurate identity and access management rules with the rule sequencing feature to achieve the best protection effects.

### **Operation Steps**

Refer to the following operation steps to configure accurate identity and access management rules for the protected domains:

**Description: **Prior to the following operations, please ensure that the website has accessed WAF for protection. Please refer to CNAME Access Guideline for specific operations
1. Log in to [JD Cloud Web Application Firewall Console](https://cloudwaf-console.jdcloud.com).

2. Go to **Website Configuration** page.

3. Select the domain required to be operated; click **Protection Configuration** under its operation list.

4. Enable the protection in **Accurate Identity and Access Management** and click **Go to Configuration**.![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E7%B2%BE%E5%87%86%E8%AE%BF%E9%97%AE%E6%8E%A7%E5%88%B6-1.png)

5. Click **Add a New Rule** to set the matching conditions and relevant matching actions for rules and click **OK** after completion.![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E7%B2%BE%E5%87%86%E8%AE%BF%E9%97%AE%E6%8E%A7%E5%88%B6-2.png)

6. After the rule is successfully created, you may select to operate as follows:![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E7%B2%BE%E5%87%86%E8%AE%BF%E9%97%AE%E6%8E%A7%E5%88%B6-3.png)

7. - **Edit** rule contents or **Delete** rules.
   - Where there are multiple rules, click **Ordering of Rules**, and operate **Shift Up**, **Shift Down**, **Stick on Top** and **Stick to Bottom** to adjust the matching order of rules.

**Description: **The rule closer to the top will be given priority for matching.

**Configuration Instance**

Accurate identity and access management rules support multiple configuration methods, and you may define the relevant rules in combination with your own business characteristics. Specific Web vulnerability protection may also be implemented by setting accurate identity and access management rules.

Some common accurate Identity and Access Management configuration examples are listed as follows for your reference.

- **Configure IP Black and Whitelist**

- - Set the following accurate identity and access management rules to block all access requests from 1.1.1.1.

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E7%B2%BE%E5%87%86%E8%AE%BF%E9%97%AE%E6%8E%A7%E5%88%B6-4.png)

- - Set the following accurate identity and access management rules to release all access requests from 2.2.2.2.

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E7%B2%BE%E5%87%86%E8%AE%BF%E9%97%AE%E6%8E%A7%E5%88%B6-5.png)

**Description:** When apply the whitelist configuration rules, please do not check **Continue to execute Web application attack protection**, **Continue to execute CC application attack protection** and other options, or the access request may be intercepted by other protection features of WAF.

- **Block Specific URL**

Where you find a mass of IPs are accessing a specific URL that does not exist, you may directly block all the request by configuring the following accurate identity and access management rules, to reduce the resource consumption of the origin server.

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E7%B2%BE%E5%87%86%E8%AE%BF%E9%97%AE%E6%8E%A7%E5%88%B6-6.png)

- **Anti-Leech**

You may block the leech by configuring the identity and access management of Referer matching fields. For example, if you find abc.blog.sina.com embezzle a mass of pictures of the website, you may configure the following accurate identity and access management rules to block the relevant access requests.

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E7%B2%BE%E5%87%86%E8%AE%BF%E9%97%AE%E6%8E%A7%E5%88%B6-7.png)

**Supported Matching Fields**

The matching fields and their descriptions supported by accurate identity and access management are listed as follows.

 

| **Matching Field** | **Field Description**                                             | **Applicable Logic Symbol**                                               |
| ------------ | -------------------------------------------------------- | ------------------------------------------------------------ |
| IP           | Source IP of Access Request.                                       | - Belong to    - Not belong to                                           |
| URL          | URL Address of Access Request.                                      | - Contains    - Does Not Contain    - Equals to    - Does Not Equal to                     |
| Host         |                                                          | - Contains    - Does Not Contain    - Equals to    - Does Not Equal to                     |
| Post-Body    | Response Content Information of Access Request.                                 | - Contains    - Does Not Contain    - Equals to    - Does Not Equal to                     |
| Referer      | The source website of access request, i.e. from the jump of which page the access request is generated. | - Contains    - Does Not Contain    - Equals to    - Does Not Equal to    - Length Less than    - Length Equal to    - Length Greater than    - Does Not Exist |



 
