# Related Configurations of CC defense Rules
CC defense rules are of Web Service protection, so you need to switch to the Web Service Forwarding Setting first.

The steps are as follows:

- First, you need to log in to [Anti-DDoS Pro Console](https://ip-anti-console.jdcloud.com/instancelist).
- Find the instance that needs to be configured. Click the instance name to enter the **Instance Details** page.
- Switch to **Website Forwarding Setting** and click **Protection Rules** under the operation bar.
    ![网站转发规则](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/web-rule%2009.png)

### Operation Steps

1. Enable the CC protection switch. By default, the CC protection mode is normal.

    ![网站转发规则](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/web-rule%2010.png)

2. Click **Set** and select different protection modes according to business features.

    ![网站转发规则](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/CC%20rules%2002.png)

    The following is the interpretation of the rules:
    
    * The CC status field in the web service forwarding configuration list will display enabled/disabled according to CC defense switch status.
    * The CC defense peak value in the basic information displays the CC defense peak value of the purchased package.
    - CC defense mode configuration. The system supports four kinds of CC defense modes: </BR>
    
         - "Loose": Only few of the visits will be checked through CC rules. Suitable for websites with not many visits.
         - "Normal": When there is no obvious exception in the website, please select the normal mode. Only part of visits is checked.
         - "Critical": In case of the slow website response, and exception in the CPU, memory, etc., use the emergency mode. This mode is of rigorous detection and may cause false judgment.
         - "Customization": Appropriate for advanced users. Enables them to customize the protection threshold. Includes HTTP request number threshold, the protection threshold of each Host, the protection threshold of each Host+URI, the protection threshold of each source IP to Host, the protection threshold of each source IP to Host+URI. The maximum HTTP request number threshold does not exceed the threshold of the purchased package.</br>
         ![网站转发规则](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/CC%20rules%2003.png)
         
         **Note**: The defense algorithm used in the above four CC defense modes is only applicable to sites of webpage. If the business of the accessed website is an API or App application, there is a great risk of false interception as this kind of business cannot normally response to algorithm verification generally. If a user has a CC defense demand for API business or APP business, please open ticket to customize a defense policy.

3. CC Observation Mode

    * If CC observation mode is turned on, CC defense only sends alarm and does not activate protection.

4. Configure Speed Limit

    * Click **Set** and enter the customized CC Defense Rule Page. Support enabling or disabling of a single rule and a single protection domain supports configuration of 10 rules at most.</br>
    ![Web Forwarding Rules](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/CC%20rules%2005.png) </br>  
    ![Web Forwarding Rules](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/CC%20rules%2004.png) </br>  
    * Click **Add Rules** and set customized Protection Rules.</br>
    ![Web Forwarding Rules](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/CC%20rules%2006.png) </br>  
    Rule configuration fields are interpreted as below:
         - Rule name: Name of rule customized by a user.
         - URI: Access path matched with customized rules.
         - Matching rule: Support exact match or prefix match of access path.
         - Detection duration: Set detection duration for CC customized rules.
         - Access times of single IP: Set times for accessing IP triggering rules.
         - Blocking type: Support blocking and human-machine identification; by virtual of blocking, access will be blocked and the blocking page will be returned; and human-machine identification will trigger js challenges and verification code challenges.
         - Blocking and return to customized page: Please select the blocking type as visible while blocking. The blocked return page supports default page or customized page.
         - Blocking duration: Set duration of triggered blocking or human-machine identification.
