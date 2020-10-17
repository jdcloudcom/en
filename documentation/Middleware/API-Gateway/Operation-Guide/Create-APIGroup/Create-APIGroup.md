# Create API Groups

API group is the fundamental management unit of API. SDK is generated based on this API group. Create the API group and then create the API under the group.

* The group has Region attribute. Determine the Region before create API groups, and no alternation is allowed once API group created.

* Perform traffic control, access authorization, backend signature and custom domain based on API group.


## Operational Steps
### STEP1: Click the **API Group Management** at left menu to enter the group list page
Login [API gateway console](https://apigateway-console.jdcloud.com/apiGroupList).

 ![API Group Management](../../../../../image/Internet-Middleware/API-Gateway/group-publishing-1.png)
 
 
 ### STEP2: Create API Groups
 On the "API Group Management page", click **Create Group** and go to the "Create" page.
 Note: IPV6 is only supported in cn-north-1 and cn-east-2 now.

![Create group](../../../../../image/Internet-Middleware/API-Gateway/APIgroup-addgroup.png)
    
 ### STEP3: Save information, create group   
After filling the group information, click the "OK", then the new group is created.

When it is first created, the system will automatically save it as version 0.0.1. Thereafter, maintenance of multiple versions can be performed in Version Management.

