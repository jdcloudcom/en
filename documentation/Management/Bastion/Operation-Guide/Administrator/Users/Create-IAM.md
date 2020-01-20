# Add JD Cloud IAM Sub-user
The document specifies how to create IAM sub-users for Bastion management, operation and maintenance in JD Cloud IAM as well as how to import IAM sub-users to the Bastion instance.

## Operation Steps

**Create sub-user**

Log in JD Cloud Console, enter Identity and Access Management > User Management, and click the [Create] button to fill in the sub-user information in the sub-user create window:

![](/image/IAM/SubUserManagement/创建子用户页面.jpg) 

After the successful creation of the sub-account, you can choose to download the password of the sub-user and access the secret key information by download or email.

![](/image/IAM/SubUserManagement/子用户创建成功页面.jpg) 

**Grant policy to sub-user**

Access the sub-user list and click the **Authorize** button.

In the authorization policy page, search the following authorization policies:
JDCloudBastionHostFullAccess (administrator permission)
JDCloudBastionHostReadOnlyAccess (operation and maintenance personnel permission)

![](/image/IAM/SubUserManagement/子用户授权页面.jpg) 

**Security Credential Setting of the Sub-user**

- Reset password for the sub-user
- Enable MFA for the sub-user
- It is required that the sub-user must enable MFA, instead of completing the association of MFA directly for the sub-user. The sub-user will redirect to the MFA association page the next time it logs in, and it will not enter the console until the association is successful.
- Enable action protection for the sub-user; when the sub-user's virtual MFA is enabled, the primary account can turn on the action protection for the sub-user. Therefore, when the sub-user operates sensitive actions granted by the primary account, Virtual MFA verification is required.
- Enable access secret key for the sub-user.

![](/image/IAM/SubUserManagement/子用户安全凭证页面.jpg) 

**Console Login by Sub-user**

Each primary account has a separate sub-user login link. Please be sure to provide such login link to the sub-user, ensuring that the sub-user can log in the sub-user console page.

![](/image/IAM/Summary/子用户登录页.jpg) 

**Import IAM sub-users in the Bastion instance**

1. After a sub-user is created and authorized, please login the Bastion instance and import IAM sub-users.

2. Go to the User > User Management page and click **Import IAM Sub-user

![](/image/Bastion/import-iam.png) 

3. Check the IAM sub-accounts to be imported to instance in the IAM sub-account import dialog box and click **Import**.

   JD Cloud sub-accounts are successfully imported to specified Bastion instances.
