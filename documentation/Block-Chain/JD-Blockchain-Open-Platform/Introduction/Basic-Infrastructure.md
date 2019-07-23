# Basic Architecture
Main Components of JD Blockchain Open Platform:

Background service: Be responsible for management and maintenance of multiple JCS for Kubernetes, interaction between BaaS platform and JDCloud resources, and monitoring and searching of running status of user block chain network.

Block chain network management: Be responsible for processing of requests for creating block chain network configured by a user through the interface. When the block chain network is created, it will implement real-time communication with agent in block chain network, forward the operation for block chain network of the user through managing the Console, and return the operation result.

![图片](../../../../image/JD-Blockchain-Open-Platform/Introduction/Pic/TIM截图20190328185458.png)
