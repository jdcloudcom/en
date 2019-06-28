# Cross-primary Account Authorization

This chapter introduces how to carry out primary account-to-primary account authorization to achieve the control over the resource and security management of Queue Service.

#### Description:

- It is required to create different IAM roles to achieve permission division

- The cost for the resource creation or use by the role player is put under the primary account of role creation in a unified way

- The primary account has the permission to create and delete the role and its policy

  

#### Authorization Process:

The Queue Service has comprehensively connected to the Identity and Access Management (IAM) Service, so the user needs to go to [Identity and Access Management Menu](https://cm-console.jdcloud.com/cmSummary) for setting to conduct the authorization to Primary Account B by Primary Account A.

1. Primary Account A creates the user role, e.g. RoleA, and grants the corresponding policy to the user role. [Refer to](https://docs.jdcloud.com/en/iam/createrole).

   - For the system policy, refer to:

     | Policy Name                          | Description                 | Type     |   Resource Scope                 | Remarks                                                         |
     | --------------------------------- | -------------------- | -------- | -------------------------- | ------------------------------------------------------------ |
     | JDCloudQueueServiceAdmin          | Administrator Permission of Queue Service   | System Policy | All Resources of Queue Service under the Primary Account | All Permissions of Queue include Management and Message Sending and Receiving                     |
     | JDCloudQueueServiceProduceMessage | Production Message Permission of Queue Service | System Policy | All Resources of Queue Service under the Primary Account | It is allowed to send messages to the existing queue                                      |
     | JDCloudQueueServiceConsumeMessage | Consumption Message Permission of Queue Service | System Policy | All Resources of Queue Service under the Primary Account | It is allowed to receive information from the existing queue, modify the time-out period of message visibility and clear the queue |
     | JDCloudQueueServiceManageQueue    | Queue Management Permission of Queue Service | System Policy | All Resources of Queue Service under the Primary Account | It is allowed to create, modify or delete the queue and obtain the queue list and detailed information         |

   - For the customized policy, [refer to](https://docs.jdcloud.com/en/iam/createpolicy). ([For the policy syntax, refer to](https://docs.jdcloud.com/en/iam/policy-management), **fill in the queue name of resource ID**)

2. Log in to Primary Account B to create an IAM sub-user SubB, and grant the security token system policy to **JDCloudStsAdmin**, [refer to](https://docs.jdcloud.com/en/iam/createsubuser).

3. Log in to the IAM sub-user SubB to enter the sub-user Console, click **Switch Role** in the menu at the upper-right corner to log in to the role identity, enter the accountID of the primary account and the role name of RoleA; and after login, SubB will access and manage the resources of Primary Account A with the identity and permission of RoleA.
