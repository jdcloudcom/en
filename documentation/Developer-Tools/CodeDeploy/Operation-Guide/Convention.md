## Agreement

**Delete**

No matter deleting application, deleting deployment group or deleting milestone will not perform any operation on deploying the target virtual machines. It will have no impact on deployment tasks that are being deployed, rolled back and manually terminated.

**Time-out Period of Deployment**

In a deployment task, the time-out period of a single instance is 5min and the time-out period of the whole deployment task is 1h.

The time-out period of rollback is the same with the time-out period of deployment.

**Rollback**

- The rollback is a rollback of deployment task granularity, not that of a non-single instance
- Rollback will back to the previous existed good version
- Distinction with redeployment: Redeployment means start the deployment task once again, including program package download. While rollback will directly use the program package of the downloaded local backup

**Status**

Instance Status of the application details page, deployment history page and deployment details page and overall status of the progress of deployment details page

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/status4.png)

**Load Balancer**

- CodeDeploy will not automatically create the listening port in the Load Balancer instance
- In the specified Load Balancer instance, the count of monitoring ports has a maximum limit. See the Load Balancer Documentation for details
- One Load Balancer backend service can only associate with one Load Balancer virtual server group
- When the rollback deployment is not performed for the first time, it will add to or delete a Virtual Machine instance the Load Balancer virtual server group
- When the blue and green deployment is not performed for the first time, it will create a virtual server group and delete the old virtual server group
- If the Load Balancer is selected, then the Virtual Machines in the selected deployment target shall be in the same subnet with the Load Balancer instance

**Workflow**

- For script in hooks, it is recommended to pay attention to idempotence
- Execute stop command, namely to execute the stop command that has been backed up in the deployment target machine. Considering that the most recent deployment task may not be successful, so the stop command executed here may not always be that of the task deployed in the previous time


**Deployment Directory Description**

```
#Cache Path (Program Package, Decompress)
${root dir}/app-${app id}/group-${group id}/deploy-${deploy id}/
#Backup Path (Backup)
${root dir}/.backup
```

Descriptions for the variable therein are as follows:

| Variable      |    Explanation |
| :--------: | :--------:|
| ${root dir}  | /home |
| ${app id}  | Application ID, which can be viewed on the deployment application page |
| ${group id}  | Deployment group ID, which can be viewed on the application details page |
| ${deploy id}  | Deployment task ID, which can be viewed on the deployment history page |
