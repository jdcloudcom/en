# Install super Agent in the Virtual Machine

In the Virtual Machine, you need to install the super Agent for deployment and use management.

Specific methods are as follows:

```
curl -fsSL https://deploy-code-vpc.jdcloud.com/dl-ifrit-agents/install | bash -s zero-agent,hawkeye-agent,log-agent,ark-query
```

About the description of Agent is shown as below:

| Process      |   Description  | Port  |
| :--------: | :--------:| :--: |
| ifrit-agent  | management process |  1234 |
| ifrit-supervise  | management process |  |
| hawkeye-agent  | for monitoring |  1235 |
| log-agent  | for log collection |   |
| zero-agent  | control system agent, for deployment, initialization, log query, etc. |   |
