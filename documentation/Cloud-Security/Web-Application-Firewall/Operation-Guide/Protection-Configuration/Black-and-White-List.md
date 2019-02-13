## IP Blacklist and Whitelist Configuration

In WAF, you can block or release the access request for the designated IP by configuring accurate identity and access management rules, namely setting IP blacklist/whitelist. IP blacklist and whitelist only takes effect to a specified domain configured.

### **Operation Steps**

Refer to the following steps to configure the IP blacklist and IP whitelist:

**Description: **Prior to the following operations, please ensure that the website has accessed WAF for protection. Please refer to CNAME Access Guideline for specific operations

1. Log in to JD Cloud Web Application Firewall console.

2. Go to **Website Configuration** page.

3. Select the domain required to be operated; click **Protection Configuration** under its operation list.

4. Enable the protection in **Accurate Identity and Access Management** and click **Go to Configuration**.![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E9%BB%91%E7%99%BD%E5%90%8D%E5%8D%95-1.png)

5. Click **Add a New Rule** to add a new protection rule.

6. - Whitelist configuration example: Use the below figure to configure all accesses of release source IP that is 1.1.1.1.

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E9%BB%91%E7%99%BD%E5%90%8D%E5%8D%95-2.png)

**Description: ** If you want to completely release all requests of this IP, do not select the Continue to Execute other Protection option under **Matching Action**. If it is selected, the requests from this IP will be continuously verified by corresponding rules.

1. - Blacklist configuration example: Use the below figure to configure all accesses of block source IP that is 1.1.1.1.

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E9%BB%91%E7%99%BD%E5%90%8D%E5%8D%95-3.png)

**Note**

- A matching priority is given among several protection rules, which will be matched from top to bottom of the rule list. You can adjust the priority among the protection rules by clicking **Ordering of Rules** on the top right corner.

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E9%BB%91%E7%99%BD%E5%90%8D%E5%8D%95-4.png)


 
