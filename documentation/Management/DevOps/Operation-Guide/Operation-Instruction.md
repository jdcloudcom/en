# Notice for use

When you first log in, the sample service tree node is created by default, shown as below:

![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide1.png)

**Login actions**

Address: devops.jdcloud.com

![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide2.png)

Click “JD Cloud account” for login

**Install super Agent**

In the virtual machine, you need to install the super Agent for deployment and management. The specific methods of Agent installation are shown as below
```
#cn-north-1:
wget -c http://devops-hb.oss-internal.cn-north-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.377.8918eae.20180418132906.bin -O installer && sh installer /export/servers/ifrit && rm -f installer
#cn-east-2:
wget -c http://devops-hd.oss-internal.cn-east-2.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.377.8918eae.20180418132906.bin -O installer && sh installer /export/servers/ifrit && rm -f installer
#cn-east-1:
wget -c http://devops-sq.oss-internal.cn-east-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.377.8918eae.20180418132906.bin -O installer && sh installer /export/servers/ifrit && rm -f installer
#cn-south-1:
wget -c http://devops.oss-internal.cn-south-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.377.8918eae.20180418132906.bin -O installer && sh installer /export/servers/ifrit && rm -f installer

```

In the third-party machine (physical machine or virtual machine), the installation method of Agent is as follows:
```
wget -c http://devops-hb.oss.cn-north-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.377.8918eae.20180418132906.bin -O installer && sh installer -- -t $tenant -r $region -v $vpc /export/servers/ifrit && rm -f installer
    -t tenant #tenant name in devops
    -v vpc    #name of vpc to be the server that is written by the user
    -r region #name of region to be the server that is written by the user

```

About the description of Agent is shown as below:

| Process      |   Description  | Port  |
| :--------: | :--------:| :--: |
| ifrit-agent  | management process |  1234 |
| ifrit-supervise  | management process |  |
| hawkeye-agent  | for monitoring |  1235 |
| log-agent  | for log collection |   |
| zero-agent  | control system agent, for deployment, initialization, log query, etc. |   |


**Logout actions**

Click the profile photo at the upper right corner and click exit
