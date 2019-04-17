# Primary-sub-account Authorization

Authorization function of Message Queue primary-sub-account is implemented through [IAM](https://docs.jdcloud.com/en/iam/product-overview) (Identity and Access Management, IAM).

The core function of Identity and Access Management (IAM) Service is mainly a user identities management and resource access control. Users can use IAM to create, manage sub-users and control the operation permission of them to access JD Cloud resources. The primary account can use IAM to authorize resources in the management account to others without sharing account password or access secret key and assign minimum permissions for the users as required to reduce the security risks of enterprise information. For more information on IAM, please go to [IAM](https://docs.jdcloud.com/en/iam/product-overview) to view.

Message Queue is subject to full connection of IAM Service, and the user needs to go [IAM Menu](https://cm-console.jdcloud.com/cmSummary) to set user permission of sub-account.

Now, the system has preset five policies, the user can authorize them to sub-accounts on demand. Meanwhile, the user also can authorize the sub-account through customized policies based on [Operation Guide](https://docs.jdcloud.com/en/iam/policy-management) of IAM.

The preset policies of the system are as follows:

| System Policy Name              | Permission Description                    | Type     | Resource Scope                       | Description                                                   |
| ------------------------- | --------------------------- | -------- | ------------------------------ | ------------------------------------------------------ |
| JDCloudAdmin              | JCQ Administrator Permission   | System Type | All Resources of Message Queue under Primary Account | All permissions of Message Queue, including management, and message release and subscription       |
| JDCloudJCQTopicManagement | JCQ Topic Administrator Permission | System Type | All Resources of Message Queue under Primary Account | Can manage Topic of Message Queue, including create, delete and changeTopic |
| JDCloudJCQPub             | JCQ Release Permission     | System Type | All Resources of Message Queue under Primary Account | Can release message to existing Topic                                |
| JDCloudJCQSub             | JCQ Subscription Permission     | System Type | All Resources of Message Queue under Primary Account | Can create, delete, manage subscription and consume messages to existing Topic        |
| JDCloudJCQRead            | JCQ Read Permission       | System Type | All Resources of Message Queue under Primary Account | Can search information and dead letter queue of existing Topic, without modifying permission      |
