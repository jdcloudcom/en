## Deployment Workflow

**Rolling Deployment (Without Using the Load Balancer)**

If the program package version is V1 before the deployment, then the program package version to be deployed is V2.

1. Deployment

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/line1.png)


1) Download the program package V2: Cache to \${root dir}/app-\${app id}/group-\${group id}/deploy-\${deploy id}/

2) Execute V1 stop script: Fill in the "Stop Script" in a corresponding form, corresponding to "ApplicationStop" under "hooks" of the yaml file

3) Execute V2 deployment pre-script: Correspond to "BeforeInstall" under "hooks" of the yaml file

4) Deploy V2: Correspond to "files" in the yaml file

5) Execute V2 deployment post-script: Correspond to "AfterInstall" under "hooks" of the yaml file

6) Execute V2 start script: Fill in the "Start Script" in a corresponding form, corresponding to "ApplicationStart" under "hooks" of the yaml file

7) Execute V2 check script: Fill in the "Check Script" in a corresponding form, corresponding to "ValidateService" under "hooks" of the yaml file


2. Rollback

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/line2.png)


1) Execute V2 stop script: Fill in the "Stop Script" in a corresponding form, corresponding to "ApplicationStop" under "hooks" of the yaml file

2) Execute V1 deployment pre-script: Correspond to "BeforeInstall" under "hooks" of the yaml file

3) Deployment V1: Correspond to "files" in the yaml file

4) Execute V1 deployment post-script: Correspond to "AfterInstall" under "hooks" of the yaml file

5) Execute V1 start script: Fill in the "Start Script" in a corresponding form, corresponding to "ApplicationStart" under "hooks" of the yaml file

6) Execute V1 check script: Fill in the "Check Script" in a corresponding form, corresponding to "ValidateService" under "hooks" of the yaml file


The rollback concurrency is the deploying concurrency.

**Rolling Deployment (By Using the Load Balancer)**

If the program package version is V1 before the deployment, then the program package version to be deployed is V2.

1. Deployment

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/line3.png)


1) Download the program package V2: Cache to \${root dir}/app-\${app id}/group-\${group id}/deploy-\${deploy id}/

2) Execute un-registered pre-script: Correspond to "BeforeBlockTraffic" under "hooks" of the yaml file

3) Un-register in the Load Balancer: Delete corresponding Virtual Machines in the virtual server group of the Load Balancer

4) Execute un-registered post-script: Correspond to "AfterBlockTraffic" under "hooks" of the yaml file

5) Execute V1 stop script: Fill in the "Stop Script" in a corresponding form, corresponding to "ApplicationStop" under "hooks" of the yaml file

6) Execute V2 deployment pre-script: Correspond to "BeforeInstall" under "hooks" of the yaml file

7) Deployment V2: Correspond to "files" in the yaml file

8) Execute V2 deployment post-script: Correspond to "AfterInstall" under "hooks" of the yaml file

9) Execute V2 start script: Fill in the "Start Script" in a corresponding form, corresponding to "ApplicationStart" under "hooks" of the yaml file

10) Execute V2 check script: Fill in the "Check Script" in a corresponding form, corresponding to "ValidateService" under "hooks" of the yaml file

11) Execute registered post-script: Correspond to "BeforeAllowTraffic" under "hooks" of the yaml file

12) Register in the Load Balancer: Add corresponding Virtual Machines in the virtual server group of the Load Balancer

13) Execute registered post-script: Correspond to "AfterAllowTraffic" under "hooks" of the yaml file


2. Rollback

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/line4.png)


1) Execute un-registered pre-script: Correspond to "BeforeBlockTraffic" under "hooks" of the yaml file

2) Un-register in the Load Balancer: Delete corresponding Virtual Machines in the virtual server group of the Load Balancer

3) Execute un-registered post-script: Correspond to "AfterBlockTraffic" under "hooks" of the yaml file

4) Execute V2 stop script: Fill in the "Stop Script" in a corresponding form, corresponding to "ApplicationStop" under "hooks" of the yaml file

5) Execute V1 deployment pre-script: Correspond to "BeforeInstall" under "hooks" of the yaml file

6) Deploy V1: Correspond to "files" in the yaml file

7) Execute V1 deployment post-script: Correspond to "AfterInstall" under "hooks" of the yaml file

8) Execute V1 start script: Fill in the "Start Script" in a corresponding form, corresponding to "ApplicationStart" under "hooks" of the yaml file

9) Execute V1 check script: Fill in the "Check Script" in a corresponding form, corresponding to "ValidateService" under "hooks" of the yaml file

10) Execute registered post-script: Correspond to "BeforeAllowTraffic" under "hooks" of the yaml file

11) Register in the Load Balancer: Add corresponding Virtual Machines in the virtual server group of the Load Balancer

12) Execute registered post-script: Correspond to "AfterAllowTraffic" under "hooks" of the yaml file


The rollback concurrency is the deploying concurrency.


**Blue and Green Deployment**

If the group providing service and taking over traffic (the blue group or the green group) adopts the program package version V1 before the deployment, then the group providing no service shall adopt the program package version V0, and the program package version to be deployed is V2.


1. Deployment

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/line5.png)


1) Download the program package V2: Cache to \${root dir}/app-\${app id}/group-\${group id}/deploy-\${deploy id}/

2) Execute V0 stop script: Fill in the "Stop Script" in a corresponding form, corresponding to "ApplicationStop" under "hooks" of the yaml file

3) Execute V2 deployment pre-script: Correspond to "BeforeInstall" under "hooks" of the yaml file

4) Deploy V2: Correspond to "files" in the yaml file

5) Execute V2 deployment post-script: Correspond to "AfterInstall" under "hooks" of the yaml file

6) Execute V2 start script: Fill in the "Start Script" in a corresponding form, corresponding to "ApplicationStart" under "hooks" of the yaml file

7) Execute V2 check script: Fill in the "Check Script" in a corresponding form, corresponding to "ValidateService" under "hooks" of the yaml file

8) Switch traffic: Replace the virtual server group associated with the specified backend service and direct the traffic toward V2

Note: In case of blue and green deployment, four steps will be skipped, i.e. "Execute un-registered pre-script", "Execute un-registered post-script", "Execute registered pre-script" and "Execute registered post-script".

2. Rollback

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/line6.png)

1) Execute V1 check command: Fill in the "Check Script" in a corresponding form, corresponding to "ValidateService" under "hooks" of the yaml file

2) Switch traffic: Replace the virtual server group associated with the specified backend service and direct the traffic toward V1
