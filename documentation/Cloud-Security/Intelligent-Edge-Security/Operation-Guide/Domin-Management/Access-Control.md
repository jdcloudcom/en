# IAM

##  Referer Anti-Leech

Conduct visitor identity identification and filtering by configuring referer black lists and white lists for access, so as to restrict malicious access to resources.

![Referer防盗链](/image/Intelligent-Edge-Security/Referer防盗链.png)

- referer black list: It does not allow access of the rule-compliant request; referer white list: allows access of the rule-compliant request

- Allows direct access to the resource URL through the browser: Whether to allow request access without the referer field (it currently only supports no referer field and the follow-up support of scenarios where the referer field is blank)

- Only one of the referer black list and white list configurations can take effect. When the white list is selected, the rule and the "Allow the direct access to resource URL through the browser" cannot be both blank

- Support multiple referer configurations, up to 50, and cannot be repeated

- Support extensive domain rule configuration

## URL Authentication 

  Set authentication Key to encrypt URL to protect the user’s origin server resources.

  ![URL鉴权](/image/Intelligent-Edge-Security/URL鉴权.png)

## UA IAM

Conduct visitor identity identification and filtering by configuring UA black lists and white lists for access, so as to restrict resource access.
 ![UA访问控制](/image/Intelligent-Edge-Security/UA访问控制.png)

## IP Black List

IPs from the black list is forbidden to access the domain

![IP黑名单](/image/Intelligent-Edge-Security/IP黑名单.png)

- Multiple IPs and IP address segments can be set, and up to 50 can be added;
- Repeated addition of the same IP is not allowed.