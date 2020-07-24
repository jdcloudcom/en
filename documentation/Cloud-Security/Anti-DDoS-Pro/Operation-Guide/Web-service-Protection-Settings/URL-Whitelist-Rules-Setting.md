# Black List and White List Configuration
Black list and white list allow you to set the identity and access management rules, conditionally combine common HTTP fields (e.g. IP, URI, Header and Cookie) to filter the access request and set operations including release or block to the request hitting the condition.</BR>
Before configuration, please locate to web service forwarding rules. Steps are as follows:
- First, you need to log in to [Anti-DDoS Pro Console](https://ip-anti-console.jdcloud.com/instancelist).
- Find the instance that needs to be configured. Click the instance name to enter the **Instance Details** page.
- Switch to **Website Forwarding Setting**
   ![网站转发规则](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/web-rule%2009.png)



### Operation Steps
1. Click **Protection Rules** and enter the Web Service Protection Rules Interface.
 ![网站防护规则](../../../../../image/Advanced%20Anti-DDoS/web-service-rule-01.png)
2. Click the **Go to Set** button for black/white list, and add to or edit the black/white list in the following page.
 ![网站黑白名单](../../../../../image/Advanced%20Anti-DDoS/web-service-rule-02.png)
3. Click **Add** to add black/white list rules and set matching conditions and relevant matching actions for rules.</BR>
 ![网站黑白名单](../../../../../image/Advanced%20Anti-DDoS/web-service-rule-03.png)
4. Enable the black/white list after editing, and the rules take effect.</BR>
 ![网站黑白名单](../../../../../image/Advanced%20Anti-DDoS/web-service-rule-04.png)

Configuration Description
 -  Configuration of maximum 10 rules for black/white list respectively is supported;</BR>
 -  Matching rules include: URI, IP, Cookie, Geo and headers.</BR>
 -  Matching mode: Exact match, prefix match, suffix match, regex match, and contain.</BR>
 -  When the matching rule is IP, the matching value indicates the IP black list and white list rules referred to.</BR>
 -  White list matching actions: Include release and CC defense. Release is selected by default, and the traffic matched with the white list will be released without filtration; if CC defense is selected, CC defense will be provided for the traffic matched with the white list.</BR>
 -  Black list matching actions: Include blocking, redirecting to other pages and verification code. Redirecting to other pages requires a specified page URI.</BR>
 -  Rules are enabled by default, and will not take effect if disabled.</BR>




