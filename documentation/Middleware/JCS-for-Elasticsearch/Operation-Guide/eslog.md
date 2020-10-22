## Elasticsearch Log
JCS for Elasticsearch provides Elasticsearch log search and display via JD Cloud Log Service, mainly including the log types of primary log, search slow log, index slow log, GC log, and the log content of various types of logs consists of time and content.</br>

Time: Time of Log Generation.</br>

Content: Specific Contents of Log</br>

### Preconditions
JD Cloud Log Service has been enabled.</br>

JCS for Elasticsearch cluster instance has been created.</br>

### Operation Steps
1. Click the **Operations - More - Log Service** buttons on the List Page and redirect to the Log Service Page.</br>

2. Log Service ON/OFF is off by default. In the off state, Log Service is not valid. Users can switch between the on/off states.</br>

3. When Log Service ON/OFF is on, Log Service is valid and creates log sets es-log-{ClusterID} and 4 log topics (main log, index slow log, search slow log and GC log) on JD Cloud & AI Log Service; When Log Service ON/OFF is off, the system will delete log sets and log topics which are automatically created.</br>

4. Users can search the log contents up to a maximum of 30 days for primary logs, search slow logs, index slow logs and GC logs. Click the log content to display the log context.</br>

