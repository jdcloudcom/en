# Role Authorization

Role authorization function of Message Queue is realized through [IAM](https://docs.jdcloud.com/en/iam/product-overview) (Identity and Access Management, IAM).
For more information on IAM, please go to [IAM](https://docs.jdcloud.com/en/iam/product-overview) to view.


Description:

- It is required to create different IAM roles to achieve permission division

- The cost for the resource creation or use by the role player is put under the primary account of role creation in a unified way

- The primary account has the permission to create and delete the role and its policy

  

Authorization Process:

Message Queue is subject to full connection of IAM Service, and the user needs to go to the [IAM Menu](https://cm-console.jdcloud.com/cmSummary) to set role authorization.

1. Primary account A creates the user role, e.g. RoleA, and grants corresponding policies to the user role, [Reference](https://docs.jdcloud.com/en/iam/createrole).

   - For the system policy, refer to:

     | System Policy Name              | Permission Description                    | Type     | Resource Scope                       | Description                                                   |
     | ------------------------- | --------------------------- | -------- | ------------------------------ | ------------------------------------------------------ |
     | JDCloudAdmin              | JCQ Administrator Permission   | System Type | All Resources of Message Queue under Primary Account | All permissions of Message Queue, including management, and message release and subscription       |
     | JDCloudJCQTopicManagement | JCQ Subject Management Permission   | System Type | All Resources of Message Queue under Primary Account | topic under Message Queue can be managed, including topic creation, deletion and change |
     | JDCloudJCQPub             | JCQ Release Permission     | System Type | All Resources of Message Queue under Primary Account | Can release message to existing topic                                |
     | JDCloudJCQSub             | JCQ Subscription Permission     | System Type | All Resources of Message Queue under Primary Account | Can create, delete, manage subscribe and consume messages to existing topic        |
     | JDCloudJCQRead            | JCQ Read Permission       | System Type | All Resources of Message Queue under Primary Account | Can search information and dead letter queue of existing topic, without modifying permission      |

   - For the customized policy, [refer to](https://docs.jdcloud.com/en/iam/createpolicy).

2. Log in to the primary account B to create an IAM sub-user SubB, and grant the Security Token system policy to **JDCloudStsAdmin**, [Reference](https://docs.jdcloud.com/en/iam/createsubuser).

3. Log in to the IAM sub-user SubB and enter the sub-user Console, click **Switch Role** in the menu at the upper-right corner to log in the role identity. Enter the accountID of the primary account A and the role name of RoleA; and after login, SubB will access and manage the resources of primary account A with the identity and permission of RoleA.
