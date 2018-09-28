## WAF Engine Work Mode

​     Application Security Gateway WAF engine has two work modes: detection mode and interception mode, the default mode of WAF engine after first creation of the Application Security Gateway instance is the detection mode. You can select Instance - More - Interception mode on the instance management page to switch modes.

​    The Application Security Gateway of experience version only provides the detection mode, which cannot switch modes. Mode descriptions are as follows:

​    **Detection Mode**: WAF engine only detects and warns OWASP TOP 10 attack without intercepting, and statistics pages such as security analysis reports are not subject to impact.

​    **Interception mode**: WAF engine detects, intercepts and warns OWASP TOP 10 attack.