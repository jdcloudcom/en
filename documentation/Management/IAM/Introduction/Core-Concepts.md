# Core Concepts

 The relevant terms used in IAM are listed in this document to help you understand and use IAM correctly.
## Relevant Terms of Identity Management
### Primary Account
 The primary account is also known as root account, which is the subject of the ownership and billing of JD Cloud resources. It is created by the system when the user registers and activates JD Cloud. The primary account pays for all resources under its name and has full access to all JD Cloud services and resources.
### Sub-user
 Sub-user is a kind of entity identity that has definite user name, password and AK/SK and it is usually corresponding to a certain definite entity.
 The user name of the sub-user is created by the primary account. The sub-user is not a unique JD Cloud account, it belongs to primary account and can be seen under the space of the primary account. It only has resource use right, but ownership of resources. The sub-user has no independent metering and billing, the using charge of resources will be recorded in the bill of the primary account uniformly. The sub-user must be granted by the primary account to login console or use Open API to operate resources granted by the primary account.
### Primary Account and IAM Sub-user
#### According to permission relationship:
 - The primary account has all permissions of all resources on the JD Cloud, which is the administrator account or Root account as we know. And the sub-user only has specific permissions granted by the primary account and the permissions granted to the sub-user by the primary account can be revoked at any time.
- The primary account can set sub-users in its own account, which one primary account may have multiple sub-users while each sub-user can only belong to one primary account.
#### According to resource ownership:
 - The primary account has the ownership of all resources of JD Cloud, which is the billing subject of using JD Cloud resources. And the sub-user only has specific operation permissions of specific resources granted by the primary account, which only has use permissions but ownership. Even though the sub-user is granted Resource Create permission, the primary account has the ownership of created resources, and the bill of resource operation after being granted permissions will charge the primary account.
### Group
 It is sub-user group that is a collection of sub-users. The primary account can use group to conveniently manage multiple sub-users with same permissions and also change user permissions by adding in or remove sub-users from a group.
### Role
 Role is divided into user role and service role, which is kind of virtual identity type that has no definite credential and only can be used by being associated to a certain entity identity. The difference between sub-user and role is use method, of which the role is required to be played by a credit entity user. After successfully playing, the entity user will get the temporary credential of the role, which can access granted resources as the identity of the role by using the temporary security token.
 * The user role can only take effect after being played by a sub-user under the primary account or a sub-user under the crossing primary account.
 * The service role is required to be played by a certain cloud service (such as Virtual Machines, databases), which service role will on behalf of user to manage and operate your JD Cloud resources.
### Principal
 The entity users or services that can play roles in the JD Cloud.
### Play and switch roles
 - Switch login identity to SwitchRole: after the sub-user login the console, it can select **Role Switch**, the precondition is that the sub-user is granted the permission playing the user role. The sub-user only can play one user role for each time. When the sub-user enters the user role identity from the login identity, the user only can use the granted permissions of the user role while the permissions associated by the sub-user login identity are shielded. If the sub-user needs to use permissions of login identity, then it needs to switch role identity to login identity.
- The entity identity play roles through program call (AssumeRole): if a sub-user is granted permissions for playing a certain user role, the sub-user can use AccessKey to call AssumeRole interface of STS service to get the temporary access key of the user role. The sub-user can set the expiration time of the temporary credential by itself. The access permissions of temporary credential subject to that granted by the user role, which are usually the solution to temporary authorization and crossing account access authorization.
### Security Credential
 Security credential is the credential proofing user real identity, it usually refers to login password or access key (AccessKey), the security credential belongs to privacy information, which user must well protect.
 - Login name/password: you can use login name and password to login JD Cloud console to access related resources and services.
- Access key (AceessKey): you can use AccessKey to access Open API for managing and operating JD Cloud resources.
- Virtual MFA Verification: Multi-Factor Authentication is a kind of simple and effective best security practice, which can add a layer of extra security protection apart from user name and password. The combination of these multiple factors will provide your account with higher security protection. After enabling MFA, when the user logins JD Cloud, the system will require it to enter two layers of security factors:
  - The first security factor: user name and password.
  - The second security factor: dynamic verification code from your virtual MFA equipment.
- Operation protection: you can enable operation protection for the sub-account separately, once the operation protection is enabled, when the user operates sensitive operations granted by the primary account, Virtual MFA Verification is required.

## Relevant Terms of Policy
 The primary account has full operation permission for all resources under its name. If the primary account has not granted the sub-user role with permissions, the sub-user and the role have no access permission to any resources by default.
### Policy
 Authorization policy refers to JSON document with one or multiple permissions defined, developing policies shall follow the JSON syntax specification. By granting policies to the sub-users, groups, roles to control the access permissions of JD Cloud resources for the sub-users, groups and roles.
 IAM supports two types of policies: system policies preset by JD Cloud and customized policies managed by users themselves.
 - The system policies preset by JD Cloud when accessing product line, which are not allowed to be modified by users.
- As for customized policies managed by users themselves, users can create policies for specific action to specific resource by means of customized policy. You can also add restricted conditions to restrict source IP, specific access time, Virtual MFA Verification, etc. Users can edit this kind of policies by themselves or delete customized policies.
 > The functions of Condition is continuously under update, coming soon
### Effect
 Effect refers to the users' access or operation permission to the resources, which includes: Allow or Deny.
 > The functions of Deny is continuously under update, coming soon
### Action
 In order to unify the access of JD Cloud Console and SDK, we have detailed each action on the console at Open API level, the action is divided into two major types:
 - Operations that cannot designate resources: such as IAM sub-user list (iam:descirbeSubusers), group list (iam:describeGroups), sub-user creation (iam:createSubuser) and other interfaces, which these interfaces are not allowed to conduct operations of designating resources by definition. When you create customized policies in IAM, these interfaces do not support operations for designated resources. In general, list interface, creation interface and report interface all do not support action of authorization to designated resources.
- Operations that can designate resources: such as IAM sub-user description (iam:describeSubuser), IAM sub-user modification (iam:modifySubuser) and other interfaces, and these interfaces support operations to designated resources by definition. When you create customized policies in IAM, these interfaces allow you to conduct authorization and operation to designated resources. In general, interfaces such as description, modification, deletion, disassociation all support action and authorization to designated resources.
### Resources
 JDCloud resource name (JDCloud Resource Name, JRN) is used for unique identification of a JDCloud resource, which we can use JRN definitely designate a resource in the global environment of JDCLOUD.

