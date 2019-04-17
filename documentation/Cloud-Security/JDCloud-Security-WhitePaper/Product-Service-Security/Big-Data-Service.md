# 5. Big Data Analysis Service

## 5.1 Data Computing Service

JD Cloud data computing service (DCS) is a fully-hosted cloud data repository service with low cost. The data computing service provides out-of-the-box data management, flexible computing resource, open data interface and fine-grained permission system, helping the user establish the enterprise level data analysis platform and focusing on the work releasing data value constantly. It can quickly solve mass data compute problem, effectively reduce enterprise costs, and ensure data security.

· Permission Management

The system performs user password management through IAM. Use multilevel ACL data access authorization mechanism to control the data content that users can access and the read and write permissions. Role-based Identity and Access Management shall be performed on the users, and the role of a user determines the Identity and Access Management such as the user's permissions. Authorize users, groups, and policies, restrict data access by limited users, and use permissions to manage user access to data objects.

· Transfer Security

Use HTTPS/TLS for data transfer and X509 digital certificates for identity verification. For the Web API data collection method, data verification can be implemented through the HMAC-SHA1 algorithm through the application layer. Prevent data from being illegally accessed, tampered with, eavesdropped, and sniffed.

· Data Protection

Implement isolation for multi-user computing, implement data storage isolation for security sandboxing of the program execution, and provide encryption options. For sensitive user data, use appropriate desensitization algorithms to prevent sensitive data from being abused and leaked. Provide data disaster tolerance hot standby function to protect data security and improve the continuous availability of data.

## 5.2 JMR

JMR (JingDong MapReduce) is a hosted cluster platform that can run big data frameworks (such as Apache Hadoop and Apache Spark) on JD Cloud or run the open source projects (such as Apache Hive and Apache Pig) related to these frameworks. You may use MapReduce, Hive, Spark, Presto and other services conveniently to carry out large-scale distributed data compute service and mass data analysis at low cost.

JD MapReduce has a wide range of application scenarios, such as data repository, log analysis, ETL processing, temporary processing analysis, ad hoc query analysis, stream real-time computing, data external service, etc., to provide users with comprehensive, practical and convenient service, which can effectively solve the enterprise data source, complex types, big workload difference and other problems.

· Deep Integration

It is in close cooperation with other JD Cloud products, e.g. Cloud Storage, Cloud Monitor and Big Data Analysis Platform, as the input source or output destination of Hadoop/Spark computing engine in JMR product.

· Security and Reliability

Each cluster is isolated through VPC, and the firewall is automatically configured to manage network access; it supports the automatic configuration of network ACL and security group. The cluster has its own high availability scheme and provides the cluster monitoring management function.

· All-round Monitoring

The main indicators of the cluster: Provide cluster availability and performance monitoring, help users discover problems, solve problems, and meet user management requirements for cluster resource adjustment and release.

Cluster node indicators: Monitor the network status, hard disk status, etc. of each node in the monitoring cluster.

Cluster service process: Monitor based on related components in the user cluster. Monitor whether the service node is running normally.
