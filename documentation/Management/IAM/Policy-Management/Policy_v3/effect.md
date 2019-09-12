# IAM Permission Determination Rules

The identities accessing JD Cloud resources are divided into several types as follows
 - Primary Account Identity Access
 - Sub-user Role Identity Access
 - User Role Identity Access
 - Service Role Identity Access

Depending on the different types of identities, the IAM Permission Determination Rules are as follows:

|  Identity Type | Permission Determination Rules |
| :----------: | :----------------- |
|  Access by the primary account identity   |     The primary account is the owner of JD Cloud’s resources, which can access all operations and resources on JD Cloud by default      |
|  Access by the sub-user identity  |    After creating the sub-user, there is no any access permission by default<br>The sub-user can access the operations and resources on JD Cloud only after the primary account authorizes the sub-user|
|  Access by the user role   |   The user role is a virtual user identity<br>The user role requires the addition of a trusted primary account, and the permissions can take effect only after the sub-user of the trusted primary account plays the role<br>It can access the operations and resources on JD Cloud only after the primary account authorizes the user role  |
|  Access by the service role |     The service role is a virtual user identity<br>The service role requires the addition of a trusted cloud service, and the permissions can only take effect after the trusted cloud service plays the role<br>It only can access the operations and resources on JD Cloud after the primary account authorizes the service role  |

## Permission Determination Rules

#### Effect comprises two conditions, i.e. allow and deny

> When the same action has both Allow authorization and Deny authorization, the action will be denied in conformance with the priority principle of Deny.

![权限判断规则](../../../../../image/IAM/PolicyManagement/权限判断规则.jpg)
