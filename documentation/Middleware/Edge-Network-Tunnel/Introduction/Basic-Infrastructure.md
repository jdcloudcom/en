**Basic Architecture Chart:**

![](../../../../image/Edge-Network-Tunnel/architecture.png)



**Key Component:**

- SDK Service (end): Users conduct data transmission on SDK of device end integrated product;

- native agent (edge): Edge management component, which reports the node status, usage and local load to ENC service. Support scheduling, management, monitoring of executable program, connecting with cloud through https and receiving cloud upgrade, variable setting and other operations;

- TURN Server (edge): Computing unit of edge node, which performs distribution, management and monitoring, is scheduled, upgraded and detected by ENC, and completes the relaying of data stream;

- Scheduler Service (cloud): Global scheduling, which schedules the terminal request to the optimal edge node.
