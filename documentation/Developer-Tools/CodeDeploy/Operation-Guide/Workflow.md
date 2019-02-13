## Deployment Workflow

**Rolling Deployment (Without Using the Load Balancer)**


1. Deployment

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/line21.png)


1) Download the program package: Cache to ${root dir}/app-${app id}/group-${group id}/deploy-${deploy id}/

2) Execute stop script: Fill in the "Stop Script" in a corresponding form, corresponding to "ApplicationStop" under "hooks" of the yaml file

3) Execute deployment pre-script: Correspond to "BeforeInstall" under "hooks" of the yaml file

4) Deploy: Correspond to "files" in the yaml file

5) Execute deployment post-script: Correspond to "AfterInstall" under "hooks" of the yaml file

6) Execute start script: Fill in the "Start Script" in a corresponding form, corresponding to "ApplicationStart" under "hooks" of the yaml file

7) Execute check script: Fill in the "Check Script" in a corresponding form, corresponding to "ValidateService" under "hooks" of the yaml file


2. Rollback

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/line22.png)


1) Execute stop script: Fill in the "Stop Script" in a corresponding form, corresponding to "ApplicationStop" under "hooks" of the yaml file

2) Execute deployment pre-script: Correspond to "BeforeInstall" under "hooks" of the yaml file

3) Deployment: Correspond to "files" in the yaml file

4) Execute deployment post-script: Correspond to "AfterInstall" under "hooks" of the yaml file

5) Execute start script: Fill in the "Start Script" in a corresponding form, corresponding to "ApplicationStart" under "hooks" of the yaml file

6) Execute check script: Fill in the "Check Script" in a corresponding form, corresponding to "ValidateService" under "hooks" of the yaml file


The rollback concurrency is the deploying concurrency.

**Rolling Deployment (By Using the Load Balancer)**



1. Deployment

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/line23.png)


1) Download the program package: Cache to ${root dir}/app-${app id}/group-${group id}/deploy-${deploy id}/

2) Execute un-registered pre-script: Correspond to "BeforeBlockTraffic" under "hooks" of the yaml file

3) Un-register in the Load Balancer: Delete corresponding Virtual Machines in the virtual server group of the Load Balancer

4) Execute un-registered post-script: Correspond to "AfterBlockTraffic" under "hooks" of the yaml file

5) Execute stop script: Fill in the "Stop Script" in a corresponding form, corresponding to "ApplicationStop" under "hooks" of the yaml file

6) Execute deployment pre-script: Correspond to "BeforeInstall" under "hooks" of the yaml file

7) Deployment: Correspond to "files" in the yaml file

8) Execute deployment post-script: Correspond to "AfterInstall" under "hooks" of the yaml file

9) Execute start script: Fill in the "Start Script" in a corresponding form, corresponding to "ApplicationStart" under "hooks" of the yaml file

10) Execute check script: Fill in the "Check Script" in a corresponding form, corresponding to "ValidateService" under "hooks" of the yaml file

11) Execute registered post-script: Correspond to "BeforeAllowTraffic" under "hooks" of the yaml file

12) Register in the Load Balancer: Add corresponding Virtual Machines in the virtual server group of the Load Balancer

13) Execute registered post-script: Correspond to "AfterAllowTraffic" under "hooks" of the yaml file


2. Rollback

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/line24.png)


1) Execute un-registered pre-script: Correspond to "BeforeBlockTraffic" under "hooks" of the yaml file

2) Un-register in the Load Balancer: Delete corresponding Virtual Machines in the virtual server group of the Load Balancer

3) Execute un-registered post-script: Correspond to "AfterBlockTraffic" under "hooks" of the yaml file

4) Execute stop script: Fill in the "Stop Script" in a corresponding form, corresponding to "ApplicationStop" under "hooks" of the yaml file

5) Execute deployment pre-script: Correspond to "BeforeInstall" under "hooks" of the yaml file

6) Deploy: Correspond to "files" in the yaml file

7) Execute deployment post-script: Correspond to "AfterInstall" under "hooks" of the yaml file

8) Execute start script: Fill in the "Start Script" in a corresponding form, corresponding to "ApplicationStart" under "hooks" of the yaml file

9) Execute check script: Fill in the "Check Script" in a corresponding form, corresponding to "ValidateService" under "hooks" of the yaml file

10) Execute registered post-script: Correspond to "BeforeAllowTraffic" under "hooks" of the yaml file

11) Register in the Load Balancer: Add corresponding Virtual Machines in the virtual server group of the Load Balancer

12) Execute registered post-script: Correspond to "AfterAllowTraffic" under "hooks" of the yaml file


The rollback concurrency is the deploying concurrency.


**Blue and Green Deployment**

If the group providing service and taking over traffic (the blue group or the green group) adopts the program package version before the deployment, then the group providing no service shall adopt the program package version, and the program package version to be deployed is.


1. Deployment

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/line25.png)


1) Download the program package: Cache to ${root dir}/app-${app id}/group-${group id}/deploy-${deploy id}/

2) Execute stop script: Fill in the "Stop Script" in a corresponding form, corresponding to "ApplicationStop" under "hooks" of the yaml file

3) Execute deployment pre-script: Correspond to "BeforeInstall" under "hooks" of the yaml file

4) Deploy: Correspond to "files" in the yaml file

5) Execute deployment post-script: Correspond to "AfterInstall" under "hooks" of the yaml file

6) Execute start script: Fill in the "Start Script" in a corresponding form, corresponding to "ApplicationStart" under "hooks" of the yaml file

7) Execute check script: Fill in the "Check Script" in a corresponding form, corresponding to "ValidateService" under "hooks" of the yaml file

8) Switch traffic: Replace the virtual server group associated with the specified backend service

Note: In case of blue and green deployment, four steps will be skipped, i.e. "Execute un-registered pre-script", "Execute un-registered post-script", "Execute registered pre-script" and "Execute registered post-script".

2. Rollback

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/line26.png)

1) Switch traffic: Replace the virtual server group associated with the specified backend service
