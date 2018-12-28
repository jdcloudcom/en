## Benefits

**Quick Rollback**

Multiple rollback modes are supported, including automatic rollback in the process of deployment, manual rollback and redeployment after completion of deployment. To be specific, you can configure the trigger condition for automatic rollback, and when such condition is met, it will automatically trigger the rollback operations in this deployment; after the deployment, on the basis of full verification of functions, you can decide whether to manually rollback this deployment to make the application back to the previous successful deployment version. Moreover, rollback implemented by redeployment that is triggered by deployment history is supported.

**Easy-to-use and Powerful Operation Commands**

Operating commands are always the most flexible step in deployment operations. In CodeDeploy, we provide multiple supporting modes of operating commands. You can select to pack operation commands to the code package or fill them up by creating a new deployment page. In page filling, we provide easy-to-use forms to satisfy the basic demands of most users. At the same time, to cope with operating commands in complex customer scenarios, CodeDeploy also support to filling of yaml files.

**Uninterrupted Service**

Various deployment policies are supported. Take blue and green deployment for example, it will automatically link to the traffic switch of Load Balancer in the process of deployment so as to implement uninterrupted service in the process of version replacement and solve the availability problems concerned by technicians.
