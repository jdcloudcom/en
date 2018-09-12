# IP Black List/White List Configuration

The IP (segment) in white list can directly get access without any protection policy when visiting;
The IP (segment) in black list will be directly blocked when visiting.

## Operation Steps
1. Log in [Advanced Anti-DDoS Console](https://ip-anti-console.jdcloud.com/instancelist).
2. On the “Instance List” page, select the target instance, and click ** Instance Name ** or ** Forwarding Setting ** to enter the "Instance Details" page.
3. On the "Instance Details" page, click ** IP Black List/White List ** to configure it.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/blacklist%2001.png)

## Configuration Instructions
1. Both IP black list/white list provide 50 pieces of configuration;
2. IP black list/white list is of uniform global setting, and takes effect on web service and non-web service forwarding rules;
3. Black list/White list supports the configuration of IP or IP/mask, and the configuration of /8, /16, /24 and /32 masks;
4. The same configuration cannot appear in both black list and white list. That is, the same IP (section) cannot be in both black list and white list.
5. If the black list and white list are of inclusion relation, the white list has higher priority over the blacklist. The example is as follows: </BR>
The black list is 100.10.10.1/24 and the white list is 100.10.10.1, then 100.10.10.1 of white list.
6. The black list/white list is closed by default and takes effect only when the policy button is on. The black list/white list can be edited in advance, and does not take effect without being open.



