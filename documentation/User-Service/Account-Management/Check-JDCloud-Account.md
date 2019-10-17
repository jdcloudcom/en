# View account information

(If you are using a JD account, please conduct operation by referring to [JD Account Management](../../../documentation/User-Service/Account-Management/Manage-JD-Account.md).)

After logging in JD Cloud, you can view account information on the "Account Management - Basic Data" page:
- Account name: Set by a user when a JD account is registered or upgraded and used for login. The account name does not support modification
- Account ID: account identifier, used for IAM authorization (refer to [IAM Help Documentation](https://docs.jdcloud.com/iam)). The account id does not support modification
- PIN (customer identification code): For system identification of an account, it might be required to transmit the pin parameter for some OpenAPI (such as [shareImage](https://docs.jdcloud.com/virtual-machines/api/shareimage?content=API)). PIN does not support modification
- Email/mobile phone number: If the email (or mobile phone number) associated with the account cannot be used for login, it will be displayed on the "Basic Data" page and be attached with ![](../../../image/User/Account-Mgmt/icon2.png)
 Icon; if the email (or mobile phone number) cannot be used for login, it will not be displayed on the page. To modify email address (or mobile phone number), please go to the "Security Setting" page (refer to [Manage Associated Manage Associated Mobile Phone Number or Email](../../../documentation/User-Service/Account-Management/Change-JDCloud-Phone-Number.md))

![](../../../image/User/Account-Mgmt/info1.png)
