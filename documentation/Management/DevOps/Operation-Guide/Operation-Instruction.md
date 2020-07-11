# Notice for use


**Login Operation**

![Alttext](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation32.png)

Two login methods are provided:

1) Click the JD Cloud account and jump to the JD Cloud account login page. Users can log in directly with the JD Cloud account.

2) Use the existing DevOps user name and directly enter the username and password to log in (Users can be created by the DevOps tenant administrator. For details, see Account Management)

For the JD Cloud account that uses DevOps for the first time, please log in using the first method. After logging in, the DevOps system will guide the creation of tenants. Click **Register Now** and enter the DevOps home page


**Install Agent**

In the Virtual Machine, you need to install the super Agent for deployment and use management.

The specific methods are as follows:

```
curl -fsSL https://deploy-code-vpc.jdcloud.com/dl-ifrit-agents/install | bash -s zero-agent,hawkeye-agent,log-agent,ark-query
```

In the third-party machine (physical machine or virtual machine), please ensure that the machine meets two conditions (Unicom public network+normal NTP)

The method of installing Agent is as follows:

```
wget -c http://devops-hb.oss.cn-north-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.448.0742c84.20190327191802.bin -O installer && sh installer -- -t $tenant -r $region -v $vpc -a zero-agent,hawkeye-agent,log-agent,ark-query /usr/local/share/jcloud/ifrit && rm -f installer
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
