# Basic Architecture
The Block Chain Data Service adopts master-slave availability architecture and provides deployment mode of single availability zone.

# Business Architecture

![Basic Architecture](Pic/Basic architecture.png)


|Name           | Description                                                         |
| -------------- | ------------------------------------------------------------ |
| Account Management Service   | To create, delete and grant authorization to take actions to Block Chain Data Service instance accounts.           |
| Monitoring Service       | To collect Block Chain Data Service instance information and physical machine information.                     |
| Database Management Service     | To create, delete and grant authorization to take actions to Block Chain Data Service instance database.             |
| Data Synchronization Service   | To synchronize in real time the chain data of public Block Chain Data Service to the user target database.       |
| Console         | JD Cloud console service provides the management of Block Chain Data Service.         |
| DNS            | Domain Name Resolution. In intranet, we access the Block Chain Data Service instance by domain. |
| Master Node, Slave Node | Master node provides external service by default and slave node exists as disaster tolerance instance. When master node cannot provide service, a slave node will be enhanced to be a new master node to guarantee the user business uninterrupted. |
