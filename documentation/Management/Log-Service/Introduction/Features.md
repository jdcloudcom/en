# Features

## Log Data Collection
**Cloud Product Log Data Collection**  
Support real-time collection of log data of multiple cloud products. Users can select the required cloud products and corresponding log types and instances to be collected to complete the collection configuration.

**Business Application Log Data Collection**  
Business application logs refer to the logs generated from businesses or applications deployed on JD Cloud Virtual Machine by the user. The user just needs to specify the collection path and the Linux Virtual Machines to be collected. The log collection agent will be automatically installed with no manual installation by the user.

## Log Delivery Destination
The log data is delivered to the log subject by default.

The user can deliver business application logs directly from agent to cloud ES, cloud Kafka or its self-built ES, self-built Kafka based on its demands for consumption.

## Log Retrieval
**Full Text Retrieval**  
The cloud product log establishes a full-text index by default. The user enters the content information that needs to be retrieved, and all the fields in the log can be retrieved without distinguishing between key and value.  

**Key Value Retrieval**  
The cloud product log establishes a key value index by default. The user can retrieve the value of the specified Key, narrow the retrieval range, and query quickly and accurately.

**Statistics & Analysis**  
For statistics and analysis function of structured logs, count, sum, max, min and average of fields are supported. Meanwhile, display forms such as forms, line charts and pie charts are provided, enabling visual and quick view of analysis results.

## Log Management
The management of the log collection and log subject can change the log retention duration and the instance information collected by the log subject.

## Log Dump
It supports that the user can dump the collected log data to OSS. Meet the users’ demands for log audit, Persistent Volume and offline analysis.

## Log Field Monitoring
Users can set log filter conditions to filter logs. After creating monitoring tasks for keywords or specified fields in the logs which meet the filter conditions, users can view the monitoring graph and set alarm rules.
