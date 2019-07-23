## 3. Identity and Access Management
Effective identity verification and IAM is the key to protect users’ data against unauthorized access and promotes availability of legal users. These technologies include verification mechanisms, IAM of data and resource, supply system and user account management. For the cloud platform itself, JD Cloud builds an account and authorization management system based on internal control requirement and personnel identify recognition mechanisms. JD Cloud provides the user with the identity and access management service (IAM).

-	Cloud Platform Identity and Access Management

In combination with the automatic operation management mechanism, JD Cloud provides unified cloud security operation and maintenance specifications, and all the operation and maintenance operations to products are under strict permission control and monitoring. Permissions of cloud platform account are assigned according to the principles of "clear permission, responsibility separation and minimum privilege". One account corresponds to one user. Permission of one account is determined by role of an assigned post and authorization is made as per role or user group. In combination with manual and static scanning technique, conditions of existing account are learned in details, account and permission baselines are formed on the basis of learned results and changes of all accounts and permissions are monitored with the scan technology.

- User Identity and Access Management

Users can create and manage sub-user accounts through the IAM service, and control the access right of these sub-users to JD Cloud resources. The user can use Identity and Access Management to authorize resources in the management account to others without sharing account password or access key, assign permissions of minimum granularity for the users as required to reduce the information security risks of the primary account.

  ·  Centralized management of IAM sub-users and their credentials: Where sub-users are created in IAM, login of the Console by such sub-users and Open API access permission can be controlled, and unified virtual MFA verification, operation protection and access key (AK/SK) management can be made.
  
  ·  Refined IAM to cloud resources: Associate one or more permission policies for each user or user group to limit the user's specific operation permissions for specific resources. You can also use IAM to add specific conditions to control use of SSL by users in specific time and at specific source IP Address or not, whether identity verification is conducted via virtual MFA device, and so on.
  
  ·	 Centralized management of user roles and service roles: You can create roles and manage their permissions in IAM to control which operations can be executed by sub-users or services. You can also define which sub-user to play the role and you can also use service roles or service relevant roles to designate relevant service to play the role, manage and operate other resources of JD Cloud on behalf of you.
