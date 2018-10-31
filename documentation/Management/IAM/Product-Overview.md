# Overview
Identity and Access Management (IAM) is a user identity management and resource access control service provided by JD Cloud. Users can create and manage sub-user accounts through the IAM service, and control the access right of these sub-users to JD Cloud resources. With Identity and Access Management, users can authorize others to manage resources in their accounts without sharing account passwords or secret keys for access.

# Basic concept

 1. Primary account: it is also called the root account, and is the subject of the ownership and billing of JD Cloud resources. It is created by the system when the user registers and activates JD Cloud. The primary account pays for all resources under its name and has full access to all JD Cloud services and resources.
 2. Subaccount: it is the sub-user’s account and created by the primary account. The subaccount is not an independent JD Cloud account. It belongs to the primary account and can only be visible under the primary account. The subaccount must be authorized by the primary account to log in the console or use the API to operate the resources authorized by the primary account.
 3. Group: It is a sub-user group, which is a set of subaccounts. Using groups, the primary account can more easily manage multiple subaccounts with the same permission, or change the user’s permission by adding subaccounts to the group or removing subaccounts from the group.
 4. Permission: Permission refers to a user’s permission to access or operate resources. The primary account has full operation permission for all resources under its name. If the primary account does not authorize the subaccount, the subaccount does not have access permission to any resource by default.
 5. Authorization policy: An authorization policy is a JSON document that defines one or more permissions. The development of the policy shall follow the JSON syntactic norms. Subaccounts and user groups can be authorized by the allocation of policies. IAM 
Two types of policies are supported: system policies and user-defined policies. Users cannot modify the JD Cloud system policy, but can create and maintain customized policy versions.

