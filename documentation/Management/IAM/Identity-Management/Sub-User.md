
# What is a sub-user
A sub-user is an identity in Identity and Access Management (IAM), and each sub-user corresponds to a certain personal entity, such as an enterprise’s technical staff, operation and maintenance personnel, etc. This document describes how to create and manage a subaccount, and how to use the subaccount to log in the console for operation.

# Create subaccounts
Log in JD Cloud Console, enter Identity and Access Management > User Management, and click the**Create** button to fill in the subaccount information in the subaccount create window:

 - The subaccount login name supports 4-20 digits of letters, Chinese characters or numbers, and a hyphen “-” and an underline “_”;
 - The subaccount password is 6-20 digits in length and must contain one of the English letters and numbers or symbols (without spaces).
 ![Create Subaccounts](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/%E5%88%9B%E5%BB%BA%E5%AD%90%E8%B4%A6%E6%88%B7.png)

# Reset the password of a subaccount

On the User Management List page, you can edit the login name, notes, and contact information of the subaccount, or quickly manage the sub-user’s authorization and groups, or delete the subaccount.
![Reset The Password Of A Subaccount](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/%E4%B8%BA%E5%AD%90%E8%B4%A6%E5%8F%B7%E9%87%8D%E7%BD%AE%E5%AF%86%E7%A0%81.png)

Click the sub-user name to enter Sub-user Details. Enter from the Actions > Reset Password in the upper right corner of the User Details page, you can reset the subaccount login password.
![Reset Password1](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/%E9%87%8D%E7%BD%AE%E5%AF%86%E7%A0%811.png)
![Reset Password2](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/%E9%87%8D%E7%BD%AE%E5%AF%86%E7%A0%812.png)

# Authorize subaccounts

On the User Authorization Policy page, you can view the current authorization of the subaccount.
![Authorize Subaccounts](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/%E5%AD%90%E8%B4%A6%E5%8F%B7%E5%BD%93%E5%89%8D%E6%8E%88%E6%9D%83.png)
Click **Add Authorization Policy**, select the policy that needs to be authorized, and add it to the subaccount. When adding multiple policies to a subaccount, the permission of the subaccount is a set of all policies.
![Add Authorization Policy](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/%E6%B7%BB%E5%8A%A0%E7%94%A8%E6%88%B7%E6%8E%88%E6%9D%83%E7%AD%96%E7%95%A5.png)

# Add the subaccount to group

On the Group Authorization Policy page, click **Add to Group** to select the user group that the user needs to add.
![Add To Group](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/%E5%8A%A0%E5%85%A5%E7%BE%A4%E7%BB%84.png)
Meanwhile, on this page, you can view the authorization of the group that the user has joined, or remove the user from the specific group.
![已加入群组](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/%E5%B7%B2%E5%8A%A0%E5%85%A5%E7%BE%A4%E7%BB%84.png)

# Subaccount login console

In the overview page where you configure Identity and Access Management, you can view the number of the subaccounts, groups, and customized authorization policies that have been created.
![Subaccount Login Console](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/%E5%AD%90%E8%B4%A6%E5%8F%B7%E7%99%BB%E5%BD%95%E6%8E%A7%E5%88%B6%E5%8F%B0.png)
At the same time, the subaccount login link is displayed on the page. This link is the only entry for all your subaccounts to log in the console.
![Subaccounts Login Page](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/%E5%AD%90%E8%B4%A6%E5%8F%B7%E7%99%BB%E5%BD%95%E9%A1%B5%E9%9D%A2.png)
