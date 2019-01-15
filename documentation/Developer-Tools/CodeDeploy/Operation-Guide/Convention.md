## Agreement

**Delete**

No matter deleting application, deleting deployment group or deleting milestone will not perform any operation on deploying the target virtual machines. It will have no impact on deployment tasks that are being deployed, rolled back and manually terminated.

**Time-out Period of Deployment**

In a deployment task, the time-out period of a single instance is 5min and the time-out period of the whole deployment task is 1h.

The time-out period of rollback is the same with the time-out period of deployment.

**Rollback**

- The rollback is a rollback of deployment task granularity, not that of a non-single instance
- Rollback will back to the previous existed good version
- The new increment file will not be deleted, only the old files backed up will be recovered, mainly for the case in which the same name file policy is selected as "Replace"
- Distinction with redeployment: Redeployment means start the deployment task once again, including program package download. While rollback will directly use the program package of the downloaded local backup
- The manual rollback operation is only supported for the latest deployment task that was not successfully deployed for the first time
- Because the manual rollback operation of the blue and green deployment only performs traffic routing and does not operate on the instance, the instance status is still displayed as "Deployed".
- After the initial deployment task triggers automatic rollback, the backup file recovery will be skipped because there is no backup file.


**Cancel**

The deploying task will be canceled. Please note that the rollback is not supported for the deployed task, i.e. the program package versions of different instances can be inconsistent in the same deployment group. It is also possible that the deployment task has been canceled, but the instances in the deployment group are all successfully deployed.


**Load Balancer**

- CodeDeploy will not automatically create the listening port in the Load Balancer instance
- In the specified Load Balancer instance, the count of monitor has a maximum limit. See the Load Balancer Documentation for details
- One Load Balancer backend service can only associate with one Load Balancer virtual server group
- When the rollback deployment is not performed for the first time, it will add to or delete a Virtual Machine instance the Load Balancer virtual server group
- When the blue and green deployment is not performed for the first time, it will create a virtual server group and delete the old virtual server group
- If the Load Balancer is selected, then the Virtual Machines in the selected deployment target shall be in the same subnet with the Load Balancer instance
- When the Load Balancer adds the virtual server groups or adds Virtual Machines to the existing virtual server groups, the health check will be performed first before opening traffic. Therefore, there is a certain time interval, and the health check can be determined whether to be enabled according to the actual situation.

**Status**

Instance status of the application details page, deployment history page and deployment details page and overall status of the progress of deployment details page

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/operation21.png)


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
