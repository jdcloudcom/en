# Application Layer Protection

## **Black List and White List Configuration**

During application layer protection, you can configure accurate IAM rules to block or release access requests for specified IP, URL and region, i.e., setting IP black lists/white lists which are only effective for special domain configured.

**Operation Steps**

Refer to the following steps to configure the black list and white list:

1. Log in JD Cloud Intelligent Edge Security Console.
2. Go to the **Domain Management** page.
3. Select the domain to be operated and click **Application Layer Protection** under its operation bar.
4. Enable protection of the main WAF protection switch.

![WAF总开关](/image/Intelligent-Edge-Security/WAF总开关.png)
5. Enable the white list or black list switch, click **Setting Rule** to add one protection rule.
6. IP white list configuration example: Use the configuration in the picture below to release all accesses to source IP that is 1.1.1.1.

![IP白名单](/image/Intelligent-Edge-Security/IP白名单.png)

**Description: ** If you want to completely release all requests of this IP, do not check the Continue to Execute Other Protection option under **Matching Action**. If it is checked, the requests from this IP will be continuously verified by corresponding rules.

7. IP black list configuration example: Use the configuration in the picture below to block all accesses to source IP that is 1.1.1.1.

![IP黑名单](/image/Intelligent-Edge-Security/IP黑名单.png)

**Notes**

- Enable protection of the main WAF protection switch first and then the function switch which comprises white list, black list, CC defense rules and WEB application protection attacks and configure corresponding rules. Then, the application layer protection function can take effect.
- There is a matching priority among several protection rules which will be matched from top to bottom of the rule list.

## **CC Defense Rules**

You can customize the protection rules on the console to limit the access frequency of a single IP to a specific path (URI) on your website. For example, you can configure the following rules: When a source IP has accessed www.yourdomain.com/login.html for more than 100 times within 60 seconds, block this IP for 10 minutes.
5. Click **Add a New Rule** to add a new rule. Parameters are described as below:

| Configuration           | Description                                                         |
| -------------- | ------------------------------------------------------------ |
| Name of Rule       | Name this rule.                                               |
| URI            | Designate a specific address required for protection, e.g. /register. Support to include parameters in the address, e.g. /user?action=login. |
| Matching Rules       | Exact matching: i.e., accurate matching, the request address will only be intercepted when it is completely as the same as the configured URI. |
| Detection Duration       | Designate the period to sum up the access times. It needs to coordinate with the access times of a single IP.           |
| Access times of a single IP | Designate the times that a single source IP is allowed to access the protected address within the detection duration.         |
| Blocking Type       | Designate the operation (blocking, man-machine recognition) after the trigger condition and the duration of block action after the request is blocked.                                                                   Blocking: Connection is directly cut off when the trigger conditions are met.                                                                                                              Man-machine interaction: After the trigger conditions are meet, access the client by way of redirection (WAF returns to the 302 status) and release upon approval of verification. For example, if a single IP has accessed for more than 5 times within 20s, execute the man-machine recognition, in which case, the access request of this IP within 10 minutes is required to be approved by the man-machine recognition. If it is recognized to be illegal, it will be intercepted by WAF; only those recognized to be legal will be released. |
| Duration       | Designate the duration for subsequently blocking this IP.                                     |

**Example:**

![自定义CC防护规则](/image/Intelligent-Edge-Security/自定义CC防护规则.png)

**Description: **Take the configuration in the figure for example, it means that when a single IP accesses the target address (complete matching), once it has accessed for more than 100 times within 60 seconds, the access of this IP will be directly blocked for 10 minutes. WAF needs to gather data of several servers in the cluster to count up the access frequency of a single IP and there may be certain latency during the statistics, so the actual effective date of blocking may slightly lag.

**Execution Results**

The rule takes effect upon added successfully. You can select **Edit**or**Delete** the rule.

![编辑或删除自定义CC规则](/image/Intelligent-Edge-Security/编辑或删除自定义CC规则.png)

## **Web Application Attack Protection**

Web application attack protection may provide protection against SQL injection, XSS cross-site and other common Web application attack, and provide different levels of protection policies: normal, loose and strict.

1. Under the **Web Application Attack Protection**, enable protection and select the protection **Mode**: **Description: **If there is any traffic exception during use, you can pull the button to disable protection.

![web应用防护攻击](/image/Intelligent-Edge-Security/web应用防护攻击.png)

2. - **Interception Mode**: Attack request is intercepted after any attack is found.
   - **Detection mode **: Only alarm information is sent after an attack is found, and no request will be intercepted.

3. Select the proper protection policy under the **Protection Rule Policy Level**:

4. - **Normal** mode rule is used by default.
   - When a lot of false interceptions are found, or there are a lot of uncontrollable user entries in business, select the **Loose** mode.
   - When you need to protect path traversal, SQL injection and command execution more strictly, you are suggested to select the **Strict** mode.