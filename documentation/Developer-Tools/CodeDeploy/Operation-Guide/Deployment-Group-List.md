## Application Deployment Group List

There are two pages in the Application Details, respectively indicating the deployment group and the milestone in the application.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/operation11.png)


List all deployment groups under the application in the deployment group page and support "Create Deployment Group".

The following operation is supported by the specified deployment group:

- Edit: Information of a deployment group, other than deployment group name and deployment type can be edited
- Deployment: Deploy the specified deployment group. For details, please refer to "Operation Guide-Create Deployment"
- Deployment history: Redirect to the "Deployment History" page to shown the deployment history of specified deployment group under the application
- Deletion: Delete the deployment group. Please note that the deletion of deployment group will neither trigger any operation to the deployment target(Virtual Machines) in the deployment group, nor make any operation toward the virtual server group of the Load Balancer where the deployment target(Virtual Machines) of the deployment group is located. In other words, these Virtual Machines still belong to the virtual server group created by the CodeDeploy. To avoid resource waste, please delete associated virtual server groups in the Load Balancer upon deleting any deployment group

For details, please refer to "Operation Guide-Application Milestone List" in the milestone page.
