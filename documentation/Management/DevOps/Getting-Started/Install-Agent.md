# Install super Agent in the Virtual Machine

Super Agent shall be installed in the Virtual Machine for deployment and management. The specific methods for installing Agent are shown as below:

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

About the description of Agent is shown as below:

| Process      |   Description  | Port  |
| :--------: | :--------:| :--: |
| ifrit-agent  | management process |  1234 |
| ifrit-supervise  | management process |  |
| hawkeye-agent  | for monitoring |  1235 |
| log-agent  | for log collection |   |
| zero-agent  | control system agent, for deployment, initialization, log query, etc. |   |
