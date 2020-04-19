# IP Blacklist/Whitelist Configuration

The IP (segment) in whitelist can directly get access without any protection policy when visiting;
The IP (segment) in blacklist will be directly blocked when visiting.

## Operation Steps
1. Log in [Anti-DDoS Pro Console](https://ip-anti-console.jdcloud.com/instancelist).
2. On the "Instance List" page, select the target instance, and click **Instance Name** or **Forwarding Setting** to enter the "Instance Details" page.
3. Click **IP Black/White List** in the "Instance Details" page to configure IP black/white list rules. IP black/white list rules can be applied to the configuration or forwarding rules of instance black list and white list.
![](../../../../image/Advanced%20Anti-DDoS/ip-white-black-list-01.png)
4. The configuration of instance black list and white list takes effect for all rules of the entire instance. Click **Black List and White List Configuration** in the "Instance Details" page to apply the configured IP black/white list to the instance.
![](../../../../image/Advanced%20Anti-DDoS/ip-white-black-list-02.png)
5. To refer to IP black/white list rules in non-web service forwarding rules, click **Non-web Service Forwarding Rules** in the "Instance Details" page, then click **Protection Rules** to which forwarding rules have been added, and enter the **Non-web Service Protection Rules** configuration page to refer to IP black/white list rules in the white list and black list configuration for non-web service protection rules. The IP black/white list rules referred to in forwarding rules only take effect in these rules.
![](../../../../image/Advanced%20Anti-DDoS/ip-white-black-list-03.png)
6. For referring to IP black/white list in web service forwarding rules, please see [Black List and White List Setting](Web-service-Protection-Settings/URL-Whitelist-Rules-Setting.md) for web service protection rules.

## Configuration Instructions
1. Configuration of maximum 10 IP black/white list rules is supported; 
2. Configuration of maximum 50 IPs (segments) is supported for each IP black/white list rule;
3. Blacklist/Whitelist supports the configuration of IP or IP/mask, and the configuration of /8, /16, /24 and /32 masks;
4. IP black/white list rules can be referred to in instance black list and white list configuration, and web service and non-web service forwarding rules, IP black list and white list rules only take effect after being referred to;
5. IP black/white list rules referred to in non-web service rules have a higher priority than IP black/white list rules referred to in instance black list and white list configuration;
6. Web service protection is performed based on instance-level IP black list and white list rules first and then based on black list and white list configuration of web service rules;
7. The same configuration cannot appear in both blacklist and whitelist. That is, the same IP (section) cannot be in both Blacklist and Whitelist.
8. If the blacklist and whitelist are of inclusion relation, the whitelist has higher priority over the blacklist. The example is as follows: </BR>
The Blacklist is 100.10.10.1/24 and the Whitelist is 100.10.10.1, then 100.10.10.1 of Whitelist.



