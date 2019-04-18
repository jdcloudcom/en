# Install super Agent in the Virtual Machine

In the Virtual Machine, you need to install the super Agent for deployment and use management.

According to the different virtual machine regions, select different install commands, with specific methods as follows::

```
#cn-north-1:    
wget -c http://devops-hb.s3.cn-north-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.448.0742c84.20190327191802.bin -O installer && sh installer -- -a zero-agent,hawkeye-agent,log-agent,ark-query /usr/local/share/jcloud/ifrit && rm -f installer
#cn-east-2:
wget -c http://devops-hd.s3.cn-east-2.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.448.0742c84.20190327191802.bin -O installer && sh installer -- -a zero-agent,hawkeye-agent,log-agent,ark-query /usr/local/share/jcloud/ifrit && rm -f installer
#cn-east-1:
wget -c http://devops-sq.s3.cn-east-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.448.0742c84.20190327191802.bin -O installer && sh installer -- -a zero-agent,hawkeye-agent,log-agent,ark-query /usr/local/share/jcloud/ifrit && rm -f installer
#cn-south-1:
wget -c http://devops.s3.cn-south-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.448.0742c84.20190327191802.bin -O installer && sh installer -- -a zero-agent,hawkeye-agent,log-agent,ark-query /usr/local/share/jcloud/ifrit && rm -f installer
```

About the description of Agent is shown as below:

| Process      |   Description  | Port  |
| :--------: | :--------:| :--: |
| ifrit-agent  | management process |  1234 |
| ifrit-supervise  | management process |  |
| hawkeye-agent  | for monitoring |  1235 |
| log-agent  | for log collection |   |
| zero-agent  | control system agent, for deployment, initialization, log query, etc. |   |
