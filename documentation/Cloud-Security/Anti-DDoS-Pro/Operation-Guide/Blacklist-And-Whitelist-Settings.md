# IP Blacklist/Whitelist Configuration

The IP (segment) in whitelist can directly get access without any protection policy when visiting;
The IP (segment) in blacklist will be directly blocked when visiting.

## Operation Steps
1. Log in [Anti-DDoS Pro Console](https://ip-anti-console.jdcloud.com/instancelist).
2. On the **Instance List** page, select the target instance, and click **Instance Name** or **Forwarding Setting** to enter the **Instance Details** page.
3. Click **IP Black/White List Library** on the **instance Detail** Page and click **Add/Edit**. Then, you can configure the IP black list/white list rules. IP black/white list rules can be applied to black and white list configuration of instance or web/non-web forwarding rules.
![](../../../../image/Advanced%20Anti-DDoS/ip-white-black-list-04.png)
4. Fill in rule names and IP addresses covered by rules in rules, with IP or IP segments supported and masks of /8, /16, /24 and /32 supported only. Multiple entries can be added in new lines and maximum 50 entries can be entered.</br>
![](../../../../image/Advanced%20Anti-DDoS/ip-white-black-list-05.png)
5. The white list and black list configuration of instances is efficient to the whole instance. On the **Instance Detail** Page, click the drop-down box to unfold the **Black List and White List Configuration**.</br>
![](../../../../image/Advanced%20Anti-DDoS/ip-white-black-list-06.png)
6. Click **Edit**, select a black/white list created in the IP black/white list library or select a blocking region.</br>
![](../../../../image/Advanced%20Anti-DDoS/ip-white-black-list-07.png)
7. IP black/white list rules are cited as non-web service forwarding rules. On the **Instance Detail** Page, click **Non-web service forwarding rules**, click **Protection Rules** of added forwarding rules, click **Protection Rules** of added forwarding rules, enter the configuration page for **Non-web Service Protection Rules** and then IP black/white list rules can be cited in white list and black list configuration of non-web service protection rules. IP black/white list rules cited by forwarding rules are only effectively for these forwarding rules. For details, please refer to the non-web service protection rules [Black/White List Setting](Net-Service-Protection-Setting/Whitelist-Rules-Setting.md)
![](../../../../image/Advanced%20Anti-DDoS/ip-white-black-list-03.png)
8. For details of IP black/white lists cited by web service forwarding rules, please refer to web service protection rules [Black and White List Setting](Web-service-Protection-Settings/URL-Whitelist-Rules-Setting.md)

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



