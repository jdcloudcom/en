# What is a sub-user?

Sub-user is a kind of entity identity that has definite user name, password and AK/SK and it is usually corresponding to a certain definite entity, such as the enterprise technical personnel, operation and maintenance personnel, etc.

The user name of the sub-user is created by the primary account. The sub-user is not a unique JD Cloud account, it belongs to primary account and can be seen under the space of the primary account. It has resource use right only, without ownership of resources. The sub-user has no independent metering and billing, the using charge of resources will be recorded in the bill of the primary account uniformly. The sub-user must be granted by the primary account to login console or use Open API to operate resources granted by the primary account.

This document describes how to create and manage a sub-account, and how to use the sub-user to log in the console for action.

## Create sub-user

Log in JD Cloud Console, enter IAM > User Management, and click the **Create** button to fill in the sub-user information in the sub-user create window:

![创建子用户页面](../../../../image/IAM/SubUserManagement/创建子用户页面.jpg)

After successful creation of the sub-account, you can choose to download the password of the sub-user and access the secret key information by download or email.

![子用户创建成功页面](../../../../image/IAM/SubUserManagement/子用户创建成功页面.jpg)

## Grant policy to sub-user

Access the sub-user list, click the **Authorize** button to quickly grant appropriate policy to the sub-user.

![子用户列表策略授权弹窗页面](../../../../image/IAM/SubUserManagement/子用户授权页面.jpg)

## Security Credential Setting of the Sub-user

- Reset password for the sub-user.
- Enable MFA for the sub-user.
- It is required that the sub-user must enable MFA, instead of completing the association of MFA directly for the sub-user. The sub-user will redirect to the MFA association page the next time it logs in, and it will not enter the console until the association is successful.
- Enable action protection for the sub-user; when the sub-user's virtual MFA is enabled, the primary account can turn on operation protection for the sub-user. Therefore, when the sub-user operates sensitive actions granted by the primary account, Virtual MFA verification is required.
- Enable access secret key for the sub-user.

 ![子用户安全凭证页面](../../../../image/IAM/SubUserManagement/子用户安全凭证页面.jpg)

## Sub-account Login Console

Each primary account has a separate sub-user login link. Please be sure to provide such login link to the sub-user, ensuring that the sub-user can log in the sub-user console page.

![子用户登录页](../../../../image/IAM/Summary/子用户登录页.jpg)
