# MFA(Multi-Factor Authentication) Support

MFA (Multi-Factor Authentication) is a simple and effective best security practice. It can add an extra layer of security protection in addition to the user name and password, and it can perform identity authentication to prevent false deletion when JD Cloud performs sensitive operations.

Please refer to the [MFA Document](https://docs.jdcloud.com/cn/iam/mfa-overview) for the specific introduction and setup of MFA

### The authentication methods supported by RDS include:

- Mobile SMS
- Email
- WeChat Applet (JD Cloud Assistant)

### Sensitive Operation Supported by RDS
- MySQL、Percona、MariaDB
    - Delete Instance
    - Delete Read-only Instance
    - Delete Database
- SQL Server
    - Delete Instance
    - Delete Database
    - Import of Cloud on Single Database
    - Backup Recovery
    - Single Database Cross-instance Recovery
