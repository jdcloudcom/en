## **Customized CC Defense**

The customized CC defense supports the feature of CC customized defense. You can customize the protection rule on the console to limit the access frequency of a single IP to a specific path (URI) on your website. For example, you can configure the following rules: When a source IP has accessed www.yourdomain.com/login.html for more than 100 times within 60 seconds, block this IP for 10 minutes.

**Operation Steps**

Refer to the following steps to configure the CC security defense mode:

**Description: **Prior to the following operations, please ensure that the website has accessed WAF for protection. Please refer to CNAME Access Guideline for specific operations.

1. Log in to [JD Cloud Web Application Firewall Console](https://cloudwaf-console.jdcloud.com).
2. Go to **Website Configuration** page.
3. Select the domain required to be operated; click **Protection Configuration** under its operation list.
4. In **CC Security Defense**, select **Normal**protection mode and click **Go to Configuration** to configure customized rules. 
         **Description: ** If you don’t want to use this function, you may disable it here.![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E8%87%AA%E5%AE%9A%E4%B9%89CC%E9%98%B2%E6%8A%A4-1.png)
5. Click **Add a New Rule** to add a new rule. Parameters are described as below:

|      Configuration      | Description                                                         |
| :------------: | ------------------------------------------------------------ |
|    Name of rule    | Name this rule.                                               |
|      URI       | Designate a specific address required for protection, e.g. /register. Support to include parameters in the address, e.g. /user?action=login. |
|    Matching rule    | Complete matching: i.e. accurate matching, the request address will only be counted when it is completely same with the configured URI. |
|    Detection duration    | Designate the period to sum up the access times. It needs to coordinate with the access times of a single IP.           |
| Access times of a single IP | Designate the times that a single source IP is allowed to access the protected address within the detection duration.         |
|    Blocking Type    | Designate the operation (blocking, man-machine recognition) after the trigger condition and the duration of block action after the request is blocked.    - Blocking: Directly disconnect after the trigger condition.      - Man-machine recognition: After the trigger condition, access the client by way of redirection (WAF returns to the 302 state) and release upon approval of verification. For example, if a single IP has accessed for more than 5 times within 20s, execute the man-machine recognition, in which case, the access request of this IP within 10 minutes is required to be approved by the man-machine recognition. If it is recognized to be illegal, it will be intercepted by WAF; only those recognized to be legal will be released. |
|    Duration    | Designate the duration for subsequently blocking this IP.                                     |

**Example:**

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E8%87%AA%E5%AE%9A%E4%B9%89CC%E9%98%B2%E6%8A%A4-2.png)

**Description: **Take the configuration in the figure for example, it means that when a single IP accesses the target address (complete matching), once it has accessed for more than 100 times within 60 seconds, the access of this IP will be directly blocked for 10 minutes. WAF needs to gather data of several servers in the cluster to count up the access frequency of a single IP and there may be certain latency during the statistics, so the actual effective date of blocking may slightly lag.

**Execution Results**

The rule takes effect upon added successfully. You can select **Edit**or**Delete** the rule.

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E8%87%AA%E5%AE%9A%E4%B9%89CC%E9%98%B2%E6%8A%A4-3.png)

 
