## Restrictions

**Agent**

Agent shall be installed in the deployment target (Virtual Machines). See Operation Guide for specific operation methods.

**Region**

One application is only attributable to one region, so resources such as virtual machines used in such application shall also be the resources in the region to which such application is attributable.

**Real-name Verification**

Only users passed the JD Cloud real-name verification can use CodeDeploy products.

**Sub-account and Role**

Sub-account and Role are currently supported by CodeDeploy. Note: Because Availability Group and CodeBuild do not support sub-account and role for the moment, please avoid relying on Availability Group and CodeBuild when using the sub-account and role for CodeDeploy operation.

**Count of Quota**

A maximum of 50 applications can be created in a region. If you need to increase the quota, you may open ticket for application.

A maximum of 50 deployment groups can be created in an application. If you need to increase the quota, you may open ticket for application.

At most 100 Virtual Machines can be selected from one deployment group as the deployment targets.

