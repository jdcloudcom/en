# Basic architecture
The blockchain data service adopts master-slave availability architecture and provides deployment mode of single availability zone.

# Business architecture

![Basic architecture](Pic/Basic architecture.png)


|Name           | Description                                                         |
| -------------- | ------------------------------------------------------------ |
| Account management service   | To create, delete and grant authorization to take actions to blockchain data service instance accounts.           |
| Monitoring service       | To collect blockchain data service instance information and physical machine information.                     |
| Database management service     | To create, delete and grant authorization to take actions to blockchain data service instance database.             |
| Data synchronization service   | To synchronize in real time the chain data of public blockchain data service to the user target database.       |
| Console         | JD Cloud console service provides the management of blockchain data service.         |
| DNS            | Domain Name Resolution. In intranet, we access the blockchain data service instance by domain. |
| Master node, slave node | Master node provides external service by default and slave node exists as disaster tolerance instance. When master node cannot provide service, a slave node will be enhanced to be a new master node to guarantee the user business uninterrupted. |
