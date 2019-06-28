# Authorization Management (Identity and Access Management)

The authorization management mainly aims to solve the problem that how to safely authorize others to access the user’s resources without exposing the user’s account, password and AK/SK. Moreover, the service [Identity and Access Management \(IAM\)](https://docs.jdcloud.com/en/iam/product-overview) (Identity and Access Management, IAM) facilitates the administrator’s assigning permissions based on the demands of different users, and improves the resource utilization rate and resource security.

Management of authorization to Queue Service is achieved through Identity and Access Management (IAM), and to adapt to different customer scenarios of the users, there are two authorization methods, i.e. authorization to IAM sub-users by primary account and the cross-primary account authorization

#### Authorization to IAM Sub-users by Primary Account

- Note: The JD Cloud primary account is the basic main body for JD Cloud resource ownership and resource consumption metering and billing, and the costs for resource creation or use by IAM sub-users are put under the primary account in a unified way. The JD Cloud primary account authorizes its IAM sub-users, i.e. authorization to IAM sub-users by primary account, facilitating the division of permissions for self-owned resources and services in an enterprise or by the account owner.
- Scenario: Multiple services on JD Cloud were purchased through the enterprise primary account, including the Queue Service, Redis, etc. Different employees are required to maintain different services or operate different resources in the services, and these operations can be further subdivided into different operations in resources which can be respectively authorized. Refer to the [Authorization to IAM Sub-users by Primary Account](Main-Sub-Authorization.md) chapter for detailed operations.

#### Cross-primary Account Authorization

- Note: The JD Cloud primary account authorizes other JD Cloud primary accounts, namely cross-primary account authorization. In Identity and Access Management (IAM), the function of cross-primary account granting is generally achieved by role authorization.

- Scenario: As for different enterprise primary accounts A and B on JD Cloud, to achieve the information sharing or business development between enterprises, A needs to grant some operations of some resources to B, while guaranteeing the high security of its resources and information. Refer to the [Cross-primary Account Authorization](Main-Main-Authorization.md) chapter for the detailed operations.

  

**Authorization logic**: Only if the primary account grants permission to a resource to another primary/sub-account, only the primary/sub-account has that permission. If no permission is granted, another primary/sub-account does not have that permission.
