# Notice for use


**Login Operation**

![Alttext](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation32.png)

Two login methods are provided:

1) Click the JD Cloud account and jump to the JD Cloud account login page. Users can log in directly with the JD Cloud account.

2) Use the existing DevOps user name and directly enter the username and password to log in (Users can be created by the DevOps tenant administrator. For details, see Account Management)

For the JD Cloud account that uses DevOps for the first time, please log in using the first method. After logging in, the DevOps system will guide the creation of tenants. Click **Register Now** and enter the DevOps home page


**Install Agent**

In the Virtual Machine, you need to install the super Agent for deployment and use management.

According to the different virtual machine regions, select different install commands. The specific methods are as follows:

```
#cn-north-1:
wget -c http://devops-hb.oss-internal.cn-north-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.391.dc2f953.20180910190347.bin -O installer && sh installer /usr/local/jdcloud/ifrit && rm -f installer
#cn-east-2:
wget -c http://devops-hd.oss-internal.cn-east-2.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.391.dc2f953.20180910190347.bin -O installer && sh installer /usr/local/jdcloud/ifrit && rm -f installer
#cn-east-1:
wget -c http://devops-sq.oss-internal.cn-east-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.391.dc2f953.20180910190347.bin -O installer && sh installer /usr/local/jdcloud/ifrit && rm -f installer
#cn-south-1:
wget -c http://devops.oss-internal.cn-south-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.391.dc2f953.20180910190347.bin -O installer && sh installer /usr/local/jdcloud/ifrit && rm -f installer
```

In the third-party machine (physical machine or virtual machine), please ensure that the machine meets two conditions (Unicom public network+normal NTP)

The method of installing Agent is as follows:

```
wget -c http://devops-hb.oss.cn-north-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.377.8918eae.20180418132906.bin -O installer && sh installer -- -t $tenant -r $region -v $vpc /export/servers/ifrit && rm -f installer
    -t tenant #tenant name in devops
    -v vpc    #name of vpc to be the server that is written by the user
    -r region #name of region to be the server that is written by the user
```

About the description of Agent is shown as below:

| Process      |   Description  | Port  |
| :--------: | :--------:|:--------:|
| ifrit-agent  | management process |  1234 |
| ifrit-supervise  | management process |  |
| hawkeye-agent  | for monitoring |  1235 |
| log-agent  | for log collection |   |
| zero-agent  | control system agent, for deployment, initialization, log query, etc. |   |
