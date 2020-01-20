# Import JD Cloud IAM Sub-user
Before applying machine operation and maintenance with the Bastion, the administrator needs to create a Bastion user in the Bastion instance. The document specifies the guide of importing JD Cloud IAM sub-users by the Administrator to a Bastion instance as the Bastion users. In addition to import JD Cloud IAM sub-users as the Bastion users, you can also add by hand or import other users in batches as the Bastion users. For more details, please refer to [User Management](../Operation-Guide/Administrator/Users/Users.md).

## Preconditions
* The IAM sub-users have been created. For details of creating IAM sub-users, please refer to [Create IAM User](../../IAM/Identity-Management/Sub-User.md).
* The sub-account to be imported shall have the Bastion association permission.

  The Bastion user permission falls into two types, i.e., the administrator and the common user, which correspond to JD Cloud IAM system permission strategies of JDCloudBastionHostFullAccess and JDCloudBastionHostOperateOnlyAccess.
  
  The JD Cloud primary account has the super administrator permissions, with which all data can be viewed and managed. The sub-account permissions are assigned by a primary account as the administrator permissions or the ordinary user permissions. From the perspective of minimum permission, you are suggested to assign the ordinary user permission to sub-accounts in general case and assign operation and maintenance rules among the Bastion instances.

  For specific authorization operation about sub-account, please refer to [Grant Policy to Sub-user](../../IAM/Identity-Management/Sub-User.md).

## Operation Steps

1. After the IAM sub-account authorization is completed, the Bastion instance can be logged in via the Bastion Console.

2. Go to the User > User Management page and click **Import IAM Sub-user

![](/image/Bastion/import-iam.png) 

3. Check the IAM sub-accounts to be imported to instance in the IAM sub-account import dialog box and click **Import

JD Cloud sub-accounts are successfully imported to specified Bastion instances.

