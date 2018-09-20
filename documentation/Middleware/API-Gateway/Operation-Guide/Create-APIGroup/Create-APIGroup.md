# Create API Groups

API group is the fundamental management unit of API. SDK is generated based on this API group. Create the API group and then create the API under the group.
- The group has Region attribute. Determine the Region before create API groups, and no alternation is allowed once API group created.
- Perform traffic control, access authorization, backend signature and custom domain based on API group.


## Operational Steps
### STEP1: Click the **API Group Management** at left menu to enter the group list page
Login [API gateway console](https://apigateway-console.jdcloud.com/apiGroupList).

 ![API Group Management](../../../../../image/Internet-Middleware/API-Gateway/apigroup-1.png)
 
 
 ### STEP2: Create API Groups
 On the “API Group Management page”, click **Create New API Group** and go to the “Create” page.

![Create group](../../../../../image/Internet-Middleware/API-Gateway/apigroup-addgroup.png)
    
 ### STEP3: Save information, create group   
After filling the group information, click the “Save”, then the new group is created.

When it is first created, the system will automatically save it as version 0.0.1. Thereafter, maintenance of multiple versions can be performed in Version Management.

