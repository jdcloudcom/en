# Authorization to IAM Sub-users by Primary Account

This chapter introduces how to carry out authorization to IAM sub-users by primary account to achieve the resource control and security management of Queue Service.

#### Description:

- It is required to create different IAM sub-users to achieve permission division

- The cost for the resource creation or use by the IAM sub-user is put under the primary account in a unified way

- The primary account has the permission to create and delete the IAM sub-user and its policy

  

#### Authorization Process:

The Queue Service has been comprehensively connected to the Identity and Access Management (IAM) service, and the user needs to go to the [IAM menu](https://cm-console.jdcloud.com/cmSummary) to set the permission of IAM sub-users.

1. For logging in the Console to create the IAM sub-user, [refer to](https://docs.jdcloud.com/en/iam/createsubuser).

2. For authorizing the system policy to IAM sub-users, [refer to](https://docs.jdcloud.com/en/iam/createsubuser).

   Pre-set Authorization Policy of the System:

   Now, the system has preset four policies, which can be authorized to the IAM sub-user on demand.

   | Policy Name                          | Description                 | Type     |   Resource Scope                | Remarks                                                         |
   | --------------------------------- | -------------------- | -------- | -------------------------- | ------------------------------------------------------------ |
   | JDCloudQueueServiceAdmin          | Administrator Permission of Queue Service   | System Policy | All Resources of Queue Service under the Primary Account | All Permissions of Queue include Management and Message Sending and Receiving                     |
   | JDCloudQueueServiceProduceMessage | Production Message Permission of Queue Service | System Policy | All Resources of Queue Service under the Primary Account | It is allowed to send messages to the existing queue                                      |
   | JDCloudQueueServiceConsumeMessage | Consumption Message Permission of Queue Service | System Policy | All Resources of Queue Service under the Primary Account | It is allowed to receive information from the existing queue, modify the time-out period of message visibility and clear the queue |
   | JDCloudQueueServiceManageQueue    | Queue Management Permission of Queue Service | System Policy | All Resources of Queue Service under the Primary Account | It is allowed to create, modify or delete the queue and obtain the queue list and detailed information         |
    | JDCloudResourceTagAdmin           | Tag Service Administrator Permission   | System Policy | All Resources Under Primary Account         | The resource tag can be edited, tag-level resources are filtered and authorization is required if the tag function is required |
    | JDCloudResourceTagRead            | Tag Service Read permission       | System Policy | All Resources Under Primary Account         | The tag can be viewed, tag-level resources are filtered and it is suggested to authorize the read permission       |

3. Or create the customized policy before authorization [refer to](https://docs.jdcloud.com/en/iam/createpolicy). ([For the policy syntax, refer to](https://docs.jdcloud.com/en/iam/policy-management), **fill in the queue name of resource ID**)

4. Log in to the interface with the login name and password of IAM sub-user to carry out the resource operation complying with the permission.

