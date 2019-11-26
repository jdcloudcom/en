# User System

For office customers such as enterprises and governments, the headquarters and the departments have the management and subordination relationships in business. But the traditional and parallel tenant mode cannot meet customer’s multi-stage and multi-permission management demands and is in-contributive to information construction of enterprises and governments.

JD Cloud Swift provides the multi-stage and multi-tenant permission systems. Therefore, customers can connect its own user system or directly set up an organization relationship on the JD Cloud Swift platform, the upper level organization easily manage its subordinate organization and users and users are separated from each other, realizing high efficient management and information security unification.

The organization, user, role and permission are core concepts in multi-level and multi-tenant management system. The user is associated with permissions via the organization and the role. In other words, one organization corresponds to several users, one user corresponds to several roles and one role has many permission types correspondingly. Based on this many-to-many relationship, JD Cloud Swift constructs a management model of "organization - user - role - permission". With the cloud management platform, visual configuration by customers is supported, meeting multi-level and multi-stage management demands of customers.



## User

User is a kind of entity identity with definite user name and password AK/SK, usually corresponding to a certain definite entity. All users in JD Cloud Swift can respectively use their unique account and login password in the entire system.



## Organization

An organization is a user group and a set of users, corresponding to an entity department/group in an enterprise or government office system. By using the organization, the system and the tenant administrator can more conveniently make unified permission management on all users under its jurisdiction.

JD Cloud Swift platform supports management on multi-level organization, with a tenant administrator set for each organization. In this way, the organization administration permission is assigned to tenant administrators of each level, so as to realize efficient management on different levels.



## Role

The role is a virtual identity type, a set of a specific count of permissions and a permission carrier. By default, each role corresponds to different permissions. The role does not have any definite identity document, which can only be used by associating with one entity identity. In other words, the role needs to be acted by a credited entity user. After the action succeeds, the entity user will obtain a role security credential such that by using the security token, the authorized module can be accessed with the role identity.

Initially preset a root organization in the cloud management platform, which and its subordinate organization internally support three user level user management levels: system management (system administrator), organization management (tenant administrator and operation and maintenance administrator) as well as final user (tenant and operation and maintenance personnel).

For three levels, 5 roles and their respective permissions are defined:

- System administrator:

  The default user role when the platform is initialized and the holder of the maximum system permission have the sole control right to the system, as well as access and operation permissions to all modules, empowering users with the following four permissions.

- Tenant:

  Cloud resource users with access and operation permissions to basic cloud modules.

- Tenant administrator:

  The leader of tenant's organization can management its own organization personnel, assign quota and have access and operation permissions to basic cloud modules and background management modules. Tenant administrator can only assign tenant permissions to users under its organization.

- Operation and maintenance personnel:

  The cloud platform operation and maintenance personnel mainly process problems and faults generated on the cloud platform, which have the access, operation and maintenance permissions to operation and maintenance modules and system setting modules.

- Operation and maintenance administrator:

  The leader of operation and maintenance personnel have higher operation and maintenance permissions, such as creation and management on operation and maintenance personnel as well as access and operation permissions to operation and maintenance monitoring modules, system setting modules and user management modules for background management. Operation and maintenance administrator can only assign permissions of operation and maintenance personnel to users of its organization and below organization.

![User-System-1](../../../../image/JD-Cloud-Swift/User-System-1.png)



## Permission

Permissions refer to licenses for accessing or operating resources and services by users. By assigning licenses to users, access contents by users are defined.

Generally, permissions in application systems are divided into several types: menu access (page level), function module operation (operation level), file upload deletion and checking if one button or image on the page is visible are also covered by the permission. The permission management system is correspondingly divided into several types when it is designed:

1. Functional operation is determined as one type, but files, menus and page elements are determined as another one, to separately authorize operation and resources.

2. Functional operation and unified resource management are directly associated with permission tables. Such classification method is of more convenience and easy expandability.

**Note: **The JD Cloud Swift platform temporarily supports menu-level permission setting, i.e., authorizing users to access and operation which system menus. 

 

|                    |              | **System Administrator** | **Tenant Administrator** | **Tenant** | **Operation and Maintenance Administrator** | **Operation and Maintenance Personnel** |
| ------------------ | ------------ | -------------- | -------------- | -------- | -------------- | ------------ |
| **Basic Cloud**         | Overview         | √              | √              | √        | ×              | ×            |
|                    | Computing Resource     | √              | √              | √        | ×              | ×            |
|                    | Storage Resource     | √              | √              | √        | ×              | ×            |
|                    | Network Resource     | √              | √              | √        | ×              | ×            |
| **Background Management**       | User Management     | √              | √              | ×        | √              | ×            |
|                    | Quota Management     | √              | √              | ×        | ×              | ×            |
| **Operation and Maintenance Monitoring**       | Visualization screen for Monitoring     | √              | ×              | ×        | √              | √            |
|                    | Virtual Asset     | √              | ×              | ×        | √              | √            |
|                    | Physical Asset     | √              | ×              | ×        | √              | √            |
| **System Setting**       | Specification Setting     | √              | ×              | ×        | √              | √            |
|                    | Object Storage Service Setting | √              | ×              | ×        | √              | √            |
| **Access Key Management** | ——           | √              | √              | √        | √              | √            |
| **Account Management**       | ——           | √              | √              | √        | √              | √            |
