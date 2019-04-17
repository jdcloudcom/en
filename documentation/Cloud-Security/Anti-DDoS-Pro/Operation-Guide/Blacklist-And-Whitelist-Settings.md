# IP Blacklist/Whitelist Configuration

The IP (segment) in whitelist can directly get access without any protection policy when visiting;
The IP (segment) in blacklist will be directly blocked when visiting.

## Operation Steps
1. Log in [Anti-DDoS Pro Console](https://ip-anti-console.jdcloud.com/instancelist).
2. On the "Instance List" page, select the target instance, and click **Instance Name** or **Forwarding Setting** to enter the "Instance Details" page.
3. On the "Instance Details" page, click **IP Blacklist/Whitelist** to configure it.
![](../../../../image/Advanced%20Anti-DDoS/blacklist%2001.png)

## Configuration Instructions
1. Both IP Blacklist/Whitelist provide 50 pieces of configuration;
2. IP Blacklist/Whitelist is of uniform global settings, and takes effect on web service and non-web service forwarding rules;
3. Blacklist/Whitelist supports the configuration of IP or IP/mask, and the configuration of /8, /16, /24 and /32 masks;
4. The same configuration cannot appear in both blacklist and whitelist. That is, the same IP (section) cannot be in both Blacklist and Whitelist.
5. If the blacklist and whitelist are of inclusion relation, the whitelist has higher priority over the blacklist. The example is as follows: </BR>
The Blacklist is 100.10.10.1/24 and the Whitelist is 100.10.10.1, then 100.10.10.1 of Whitelist.
6. The Blacklist/Whitelist is closed by default and takes effect only when the policy button is on. The Blacklist/Whitelist can be edited in advance, and does not take effect without being open.



