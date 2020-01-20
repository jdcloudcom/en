# Overview of IAM 

For access to Object stored in Bucket, JD Cloud OSS provides a variety of permission control methods, including ACL, IAM Policy and Bucket Policy.

-   ACL: OSS provides access control list (ACL) for permission control. ACL is an authorization policy based on Bucket, which can grant bucket access permissions as: Private Read/Write, Public Read and Private Write, Public Read/Write.
    You can set ACL when you create a Bucket in the console, and can modify the ACL at any time after you have created a Bucket. For action details, refer to [Create Bucket-Specify Space Access Permissions](../../Getting-Started/Create-Bucket-1.md).

-   IAM Policy: IAM (Identity and Access Management) is a user identity management and resource access control service (IAM) provided by JD Cloud. IAM Policy is a user-based authorization policy. By setting IAM Policy, you can centrally manage your users (such as employees, systems, or applications) and control the permission of users on which resources users can access under your name. For example, you can restrict your users to having read permission to only one Bucket. The sub-account is subordinate to the primary account, and these accounts cannot have any actual resources. All resources belong to the primary account, and the billing subject is also the primary account.

-   Bucket Policy: Bucket Policy is a resource-based authorization policy. Compared with IAM Policy, the action for Bucket Policy is simple, it can only authorize the resources (including Bucket and Object) in OSS. If your account is the primary account or has been granted the permission for Bucket policy setting, you can complete the authorization via Bucket Policy. At the same time, Bucket Policy supports granting access permission to other accounts, IAM users of other accounts and anonymous users, and can attach access permission to specified associated IP and referer restrictions.

# Basic Concepts of IAM Policy and Bucket Policy
The basic concepts of the two are the same, but the syntax is slightly different.
## Basic Concept
Granting access permission refers to the control capability combination where the user can decide who, under what conditions, to which resources and perform which specific actions. Therefore, the description of an access permission behavior usually comprise of four elements: identity, resource, action and condition (optional).

### Identity of JD Cloud
When the user applies for a JD Cloud account, the system creates a primary account identity to log in JD Cloud Service. The primary account can manage the users under various types with different responsibilities through the user management function. User types include sub-users and groups. For the specific definitions, refer to [Access Management-Identity Management](https://docs.jdcloud.com/en/iam/sub-user) .

### Resources of Object Storage Service (OSS)

Bucket and Object are the basic resources of Object Storage Service, and it also includes sub-resources of bucket.

Sub-resources of bucket include:

|Resource Name|Description|
|-|-|
|acl and policy|IAM Information of Bucket|
|website|Static Website Hosting Configuration of Bucket|
|cors|Cross-origin Configuration Information of Bucket|
|Encryption|Default Encryption Configuration of Bucket|
|Replication|Bucket Incremental Data Synchronization Configuration|
|Image Back-to-Origin|Image Back-to-Origin Configuration of Bucket|
|Customized Domain|Customized Domain Configuration of Bucket|

### Actions of Object Storage Service
Object Storage Service provides a series of API actions for resources; each action may correspond to one or a set of Object Storage Service API.

### IAM Private Principle

- By default, all resources in Object Storage Service (OSS) are private.

- The resource owner (the JD Cloud primary account that created the Bucket) has the highest permission to the resource. The resource owner can edit and modify the access policy to grant access permission to others or anonymous users.

- When using JD Cloud sub-account to create Bucket or upload object, its parent primary account is the resource owner.

- Bucket owner can grant other JD Cloud primary accounts the permission for uploading object (i.e., cross-account uploading). In this case, the owner of the object is still the owner of the bucket, i.e., the primary account.
















