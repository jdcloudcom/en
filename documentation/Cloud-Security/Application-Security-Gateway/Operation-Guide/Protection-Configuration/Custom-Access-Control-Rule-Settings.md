# Customized Identity and Access Management Rule

**Function Description**

​    The customized identity and access management rule will conditionally combine the common HTTP header fields and filter user accesses and take interception or warning actions to requests hitting the customized rules. Accurate identity and access management supports protection policies customized by business scenarios and is controlled by accessing source IP black list and white list, which can be used to hotlinking protection, web management background protection, etc.

**Description**

​    The customized identity and access management rule is composed of matching field, logic symbol and matching content. When creating a rule, you can define the matching conditions by setting matching field, logic symbol and corresponding matching content and define corresponding actions for access requests in line with the matching condition rules.

​    Matching fields currently supported include: UerAgent, Referer, Path, IP, Cookie and URL

​    Logic symbol: includes or excludes

**Action Steps**

​    1. Enter the console instance management page, and click protection configuration to enter the configuration page of protection tabs and then click Customized Identity and Access Management for setting.

![image.png](https://img1.jcloudcs.com/cms/285d2034-758f-41e8-adde-2b0b8faea99920180817103036.png)

​    2. Click Add a Rule to enter the rule adding page.

![image.png](https://img1.jcloudcs.com/cms/5e093e9f-47e5-431b-94eb-4f4c5c39d39520180817103804.png)

Field Description:

​    **Priority**: priority of current rules should be manually designated and the matching order should be matched according to the priority.

​    **Name Configuration**: name of the rule

​    **Action**: select action of rules based on needs.

​    **Switching Setting**: set if enable current customized rules or not.

​    **Matching Field**: Set fields need to be filtered.

​    **Logic Symbol**: select judging conditions.

​    **Matching Content**: select matching key fields.

3. After completing relevant information, enter Instance Management page to view the created rule.

4. After the rule is triggered, you can view the matching information on the Analysis Reports-Customized Identity and Access Management Rule report page.

 