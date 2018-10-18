
# Access Control

**Referer Anti-theft Chain**

Conduct visitor identification and filter by the configured access black and white list to limit the situation where resources are accessed

![image.png](https://img1.jcloudcs.com/cms/cae838c5-ec36-405a-8d72-a1dfe1ff517120180403184257.png)

- referer blacklist: It does not allow access of the rule-compliant request; referer white list: allows access of the rule-compliant request
- Allows direct access to the resource URL through the browser: Whether to allow request access without the referer field (it currently only supports no referer field and the follow-up support of scenarios where the referer field is blank)
- Only one of the referer black and white list configurations can take effect. When the white list is selected, the rule and the “Allow the direct sample resource URL through the browser" cannot be both blank
- Support multiple referer configurations, up to 50, and cannot be repeated
- Support extensive domain name rule configuration

**IP Blacklist**

IPs from the blacklist is forbidden to access the domain name

**![image.png](https://img1.jcloudcs.com/cms/cb6511da-4608-4c31-b628-d9be43546cc120180403191802.png)**

- Multiple IPs and IP address segments can be set, can add up to 50
- Cannot add the same IP repeatedly

 


