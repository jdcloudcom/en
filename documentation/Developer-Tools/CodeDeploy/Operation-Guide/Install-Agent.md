## Agent Installation

Installation of Agent in Linux is supported only

**Install**

Agent status will be automatically obtained when creating an application/deployment group and selecting the deployment target.

For manual installation, please log in the machine which is intended to be installed/is abnormal and execute commands below depending on regions of the Virtual Machines.

```
# cn-north-1
wget -c http://devops-hb.oss-internal.cn-north-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.403.a81f9eb.20181127121007.bin -O installer && sh installer -- -a zero-agent  /usr/local/share/jdcloud/ifrit && rm -f installer
# cn-south-1
wget -c http://devops.oss-internal.cn-south-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.403.a81f9eb.20181127121007.bin -O installer && sh installer -- -a zero-agent  /usr/local/share/jdcloud/ifrit && rm -f installer
# cn-east-1
wget -c http://devops-sq.oss-internal.cn-east-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.403.a81f9eb.20181127121007.bin -O installer && sh installer -- -a zero-agent  /usr/local/share/jdcloud/ifrit && rm -f installer
# cn-east-2
wget -c http://devops-hd.oss-internal.cn-east-2.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.403.a81f9eb.20181127121007.bin -O installer && sh installer -- -a zero-agent  /usr/local/share/jdcloud/ifrit && rm -f installer
```

Taking Agent installation in the Virtual Machine in cn-north-1 as example,

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/starting16.png)


**Obtaining Agent Status**

Agent has two statuses, including "normal" and "abnormal". For Agent installed manually, its status will be updated about 5min after installation.


**Version Upgrade**

Where a new version of Agent is released, the version upgrade will be automatically made, and the update process is transparent to the user, without influence to function and use of the CodeDeploy.
