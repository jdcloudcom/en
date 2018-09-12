# Basic architecture
The block chain data service adopts primary-secondary availability architecture and provides deployment mode of single availability zone.

# Business architecture

![Basic architecture](Pic/Basic architecture.png)


|Name           | Description                                                         |
| -------------- | ------------------------------------------------------------ |
| Account management service   | To create, delete and grant authorization to take actions to block chain data service instance accounts.           |
| Monitoring service       | To collect block chain data service instance information and physical machine information.                     |
| Database management service     | To create, delete and grant authorization to take actions to block chain data service instance database.             |
| Data synchronization service   | To synchronize in real time the public chain data of block chain data service to the user target database.       |
| Console         | JD Cloud console service provides the management interface of block chain data service.         |
| DNS            | Domain Name Resolution. In intranet, we access the block chain data service instance by way of domain. |
| Master nodes, slave node | Master node provides external services by default and slave node exists as disaster tolerance instance; when master node cannot provide services, a slave node will be enhanced to be a new master node to guarantee the uninterrupted user business. |
