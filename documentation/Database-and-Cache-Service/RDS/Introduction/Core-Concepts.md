# Core Concepts
Please refer to the following the terms and explanations used in the Help Documentation of RDS.

|Technical Terms|Explanation|
|---|---|
|Region| Machine rooms of JD Cloud are distributed in multiple locations around the world, which are called regions. JD Cloud is completely isolated from different regions, ensuring maximum stability and fault tolerance between different regions. It is recommended to choose the region closest to the regions of users or their customers to reduce access delay and increase>download speed|.
|Availability Zone| Available zone is a physical zone in which the infrastructure such as power and network are independent of each other in the same region. A region contains one or more availability zones, and multiple availability zones in the same region can be connected to each other.|
|Single Availability Zone Deployment|Able to Withstand Rack-Level Failures|
|Multiple Availability Zone|It can withstand rack-level failures. However, since there is a certain network delay between different availability zones, the response time for a single update will be longer than the single availability zone deployment.|
|Virtual Private Cloud (VPC)|[Virtual Private Cloud](../../../Networking/Virtual-Private-Cloud/Introduction/Product-Overview.md)|
|Subnet|[Subnet](/documentation/Networking/Virtual-Private-Cloud/Introduction/Features/Subnet-Features.md)|
|General Instance| A database service process that occupies CPU and memory resources independently. Users can create database services of different types, disk space and types as demanded. The types determine the performance of the instance.
|Database| A logical unit created under one instance. An instance can create multiple databases, and the database has a unique name within the instance.|
|Account| A logical unit created under an instance. An instance can create multiple accounts, and each account name is unique within the instance. |
|Read-only Instance| Different from regular instances, read-only instances only receive read requests, and do not receive write requests.|
|Slow Log| Among all executed SQL instructions, those with execution time more than 1 second are called slow SQL, and they will be displayed in the slow log. |
|SQL Audit| All SQL instructions executed on the current instance can be recorded by SQL audit. |
|Cloud on Single Database| It supports database-level recovery data to RDS instance.|
