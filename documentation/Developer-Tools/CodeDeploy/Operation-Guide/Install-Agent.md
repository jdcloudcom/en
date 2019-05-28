## Agent Installation

Installation of Agent in Linux is supported only.

**Install**

Agent status will be automatically obtained when creating/editing a deployment group and selecting the deployment target.

For manual installation, please log in the machine which is intended to be installed/is abnormal and execute commands below

```
curl -fsSL http://deploy-code-vpc.jdcloud.com/dl-ifrit-agents/install_deploy | bash
```

Taking Agent installation in the Virtual Machine in cn-north-1 as example,

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/starting20.png)


**Obtaining Agent Status**

Agent has two statuses, including "normal" and "abnormal".


**Version Upgrade**

Where a new version of Agent is released, the version upgrade will be automatically made, and the update process is transparent to the user, without influence to function and use of the CodeDeploy.
