# System Architecture
RDS provides primary and secondary availability architectures by default, and there are two available deployment, namely, single-availability zone deployment and multiple availability zone deployment:

## Single Availability Zone Deployment

![5a9e4356N131f1eb3.png](https://img1.jcloudcs.com/cms/a8b79d24-7f2b-44a5-85ff-178fd000c71320180319132608.png)

## Multiple Availability Zone Deployment

![5a9e4352N63d77d0d.png](https://img1.jcloudcs.com/cms/26880449-0a8f-4d26-a0ab-0fc8da77828420180319132619.png)

## Architecture Analysis
* DNS: Domain Name Resolution service, used to access RDS instance through domain name in the intranet.
* DMS: Database Management service, providing a WEB management interface, convenient for simple management on cloud database instances.
* Console: JD Cloud console service, providing RDS management interface.
* Master Node and Subnode: The default master node provides external services, and the subnode exists as a disaster recovery instance. When the master node fails to provide services, the subnode can be promoted as a new master node to ensure uninterrupted user services.
* Monitoring Service: To collect RDS instance information and physical machine information.
* Account Management Service: It is responsible for the creation, deletion and authorization of the RDS instance account.
* Database Management Service: It is responsible for the creation, deletion, and authorization of the RDS instance database.
* Backup Service: Automatic scheduled backup, supporting customized backup.
* Performance Optimization Service: To collect RDS slow log information for analysis and system optimization.
* SQL Audit: It is responsible for collecting SQL execution statements for safety audit.
