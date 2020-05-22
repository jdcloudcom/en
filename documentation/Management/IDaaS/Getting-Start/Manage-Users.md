# Manage User

The administrator can manage the Identity Pass beta user, user group or organization architecture.

## User

User is an Identity Pass beta account which is independent from JD Cloud & AI account. The Identity Pass beta supports directly creating or importing in batch users.

When directly creating a user, you need to fill in either a mobile phone number or an email. The random user password in the form can be modified and you need to designate an organization unit for the user.

![创建用户](../../../../image/IDaaS/create-user.png)

In the batch import of user template, you must fill in at least one of the items including user name, mobile phone number and email. If no password is filled in, the system will give a random password to the user. The organization unit ID is optional. If nothing is filled in, the user will be attributed to the organization root node by default. The user group ID is optional. If nothing is filled in, the user is not attributed to any user group. Both the organization unit ID and user group ID can be viewed on the organization management and user group management pages. After the template is imported, you can view the import information on the page, and click **Import** when you confirm it to begin the import.

![创建用户](../../../../image/IDaaS/load-user.png)

## User Group

The administrator can create any number of groups. The relationship between a user and a group is many-to-many, in which a user may not belong to any group or may belong to many groups. When an application is authorized to a user, every user in the group will inherit this authorization.

## Organization Architecture

Organization architecture is a tree structure, and each node in the tree is an organization unit. A user must belong to and only belong to an organization unit. If no unit is designated, the user belongs to the root node of the enterprise organization architecture by default. The root node name of an organization unit is the "enterprise name" which can be modified on the "Enterprise Settings" Page.

By moving the mouse to the organization architecture, you can create or delete the organization unit. The Identity Pass beta supports creating three-level organization architectures at most. When there is a subordinate organization unit, the organization unit taken as a parent node is not allowed to be deleted. When there isn't a subordinate organization unit, after the organization unit is deleted, all users in the organization will be automatically transferred to its superior organization unit, which means the users in the "sub-department" will be automatically transferred to the "department" after the "sub-department" is deleted.

After an application authorization is given to an organization unit, the authorization will only be effective to the users in current organization unit, and every user in this organization unit will inherit this authorization but users in the subordinate organization unit will not obtain this authorization.

Users can be moved among organization units. When "Add Member" in an organization unit, the added member will be moved from the original organization unit to the new organization unit, and the moved user will lose the application authorization inherited from the original organization unit and automatically obtain the application access permission authorized by the new organization unit.

![组织管理](../../../../image/IDaaS/org.png)
