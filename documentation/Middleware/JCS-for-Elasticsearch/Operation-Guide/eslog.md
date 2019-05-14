## Elasticsearch Log
JCS for Elasticsearch provides Elasticsearch log search and display via JD Cloud Log Service, mainly including the log types of primary log, search slow log, index slow log, GC log, and the log content of various types of logs consists of time and content.</br>
Time: Time of Log Generation.</br>
Content: Specific Contents of Log</br>

### Preconditions
JD Cloud Log Service has been enabled.</br>
JCS for Elasticsearch cluster instance has been created.</br>
### Configuration Process
First, you need to create log set for storing Elasticsearch logs in Log Service, which the log set name and saving time can be defined according to your business requirements.</br>
Then, you need to add corresponding log topic to the log set, which the name topic is suggested to be corresponding to the log type that you need to search, i.e., one log topic of primary log, search slow log, index slow log, GC log can only correspond one type of log respectively.</br>
Finally, you need to add collection configuration of corresponding product and log type for the log topic, and you can also collect log information of all instances under the product and instance type, or collect log information by designating part of instances. See cloud product [Log Collection](https://docs.jdcloud.com/en/logservice/cloudresource) and [Log Configuration Management](https://docs.jdcloud.com/en/logservice/collectionconfigmanagement) for Log Service collection configuration method.</br>
### Retrieval Log
After collection configuration of you log information you need is completed, you can search log information on Log Retrieval page of Log Service. By entering keywords and setting time scope, you can rapidly lock the log contents you want to search. See [Log Retrieval](https://docs.jdcloud.com/en/logservice/fulltextsearch) for log syntax and rules of JCS for Elasticsearch.
