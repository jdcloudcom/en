# Function Permission Configuration Example

[Identity and Access Management (IAM)](https://docs.jdcloud.com/en/iam/product-overview) is a user identity management and resource access control service provided by JD Cloud.                   
The Function Service uses IAM based on permission management mechanism of service role. Policy is an ability of accessing a certain service. If a service role is associated with a designated policy, then the service role has an ability to access the service.                 

When accessing the JD Cloud product, a user needs to possess the access permission for this product. The permission currently involved in Function Service is: Permission that is required to authorize Function Service to access event source service when the Function Service accesses the event source service. The event source service involved is: Queue Service JQS.



The followings will introduce how to create permission configuration for functions to access Queue Service JQS for round robin of the designated queue.

## Create Service Role

Log in IAM Console, go to "Role Management" -- "Create Role" -- Select to create "Service Role" -- and then the Trusted Cloud service can access your resources by playing this role. "

- Role name: JQS-func            
- Trust relationship: Function Service                                
Allow the Function Service to access JD Cloud resources on behalf of you

![JQS3](https://github.com/jdcloudcom/cn/blob/function0116/image/Elastic-Compute/functionservice/JQS3.PNG) 

## Policy Description
The JQS-func service role policy contains at least the following necessary APIs permissions for Function round robin Queue Service message queuing to get message event:        
ReceiveMessage     
DeleteMessage           
DeleteMessageBatch            

## Authorization Policy       
To authorize a policy to the created JQS-func role, select "Authorize" in the "JQS-func" role operations on the role list page.
Description: The Queue Service has preset the trigger function system policy JDCloudQueueServiceTriggerFunction in IAM, and this system policy has preset necessary APIs which can be directly selected and authorized to the service role. In addition, you can also create a new customized policy, which need to include the necessary APIs.  

![JQS5](https://github.com/jdcloudcom/cn/blob/function0116/image/Elastic-Compute/functionservice/JQS5.PNG) 

Search Queue Service in the authorized resources list, find the preset system policy JDCloudQueueServiceTriggerFunction Queue Service trigger function permission, and select Add.

![JQS4](https://github.com/jdcloudcom/cn/blob/function0116/image/Elastic-Compute/functionservice/JQS4.PNG) 

The creation and policy authorization of JQS-func service role are done according to the above steps.      
![JQS6](https://github.com/jdcloudcom/cn/blob/function0116/image/Elastic-Compute/functionservice/JQS6.PNG) 



## Add the permission configuration to the designated function

Before creating the Queue Service JQS trigger, you can add the created JQS-func service role in the Create Function step2: Function Configuration -- "Permission Configuration"; or in the function details, add the created JQS-func service role for the created function.
Note: The function that incorrectly configured function permission cannot create a Queue Service JQS trigger.

![JQS9](https://github.com/jdcloudcom/cn/blob/function0116/image/Elastic-Compute/functionservice/JQS9.png) 

![JQS10](https://github.com/jdcloudcom/cn/blob/function0116/image/Elastic-Compute/functionservice/JQS10.PNG) 

The function permission configuration is done according to the above steps.

