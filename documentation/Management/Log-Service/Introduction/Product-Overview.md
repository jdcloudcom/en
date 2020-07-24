# Product Overview

Log Service serves as a one-stop log service platform provided by JD Cloud & AI. It provides log real-time collection and storage, log query and search, log real-time delivery consumption, log real-time monitoring as well as other functions, assisting the user to solve the business operation, business monitoring, question orientation and other requirements through logs.

# Architecture of Product Features

![功能架构图](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/Introduction/structure.jpg)

# Introduction to Product Features
## Log Collection
1. Cloud product log conducts automatic collection.
2. Business application log automatically installs the log collection agent, while manually installation is not required.
3. Business application log supports collection directly from the agent to ES, self-created ES, Cloud Kafka and self-created Kafka.
4. Business application log supports selection of instance, availability group and tag, which can meet the requirements of middle and small sized customers.
5. It supports collection of multi-row logs.
6. Business application log supports formatting extraction of log content.

## Log Search
1. It supports search of key value, keywords and meta content.
2. It supports context query.
3. Based on the characteristics of different business personnel, key value search supports quick search and advanced search.

## Log Dump
1. It supports the user to dump the cloud product logs to OSS.
2. It supports the compression of the dumped log content, in snappy format and gzip format.
3. It supports original dump and dump in JSON format.

## Log Monitoring
1. It supports setting the monitoring indicator for keywords
2. It supports setting the monitoring indicator for key value
3. It supports redirecting to the Custom Metric Monitoring to set alarm rules in the Monitoring
