
# Access Control

**Referer Anti-theft Chain**

Conduct visitor identification and filter by the configured access black and white list to limit the situation where resources are accessed

![image.png](https://img1.jcloudcs.com/cms/cae838c5-ec36-405a-8d72-a1dfe1ff517120180403184257.png)

- referer blacklist: It does not allow access of the rule-compliant request; referer white list: allows access of the rule-compliant request
- Allow direct access to the resource URL via browser: Whether allow the access of request without referer field or not (Only no referer field is supported in the acceleration in China, null referer field scenarios will be supported later, and this function point configuration is not supported in the acceleration outside China/on a global scale)
- Only one of the referer black and white list configurations can take effect. When the white list is selected, the rule and the "Allow the direct access resource URL through the browser" cannot be both blank
- Support multiple referer configurations, up to 50, and cannot be repeated
- Support extensive domain name rule configuration

**[URL Authentication](URL-Authentication.md)**

Advanced anti-leech function, setting the authentication Key to encrypt URL and protect the user origin server resources. This function is only supported in the acceleration in China.

**IP Blacklist**

IPs from the blacklist is forbidden to access the domain name

**![image.png](https://img1.jcloudcs.com/cms/cb6511da-4608-4c31-b628-d9be43546cc120180403191802.png)**

- Multiple IPs and IP address segments can be set, can add up to 50
- Cannot add the same IP repeatedly

 


