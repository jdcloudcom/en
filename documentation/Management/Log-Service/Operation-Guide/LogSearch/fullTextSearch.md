## Full Text Retrieval
Full-text retrieval allows users to enter keywords and search all fields of the log content without distinguishing between key and value. Full-text retrieval needs to establish a full-text index, that is, the entire log content is divided according to the delimiter to establish an index. The Log Service currently only supports the retrieval of system logs of cloud products. The cloud product system logs establish full-text index by default.

## Operation Process
1. Click the log set of the log subject to be retrieved and enter the Log Subject List.

2. Click the log subject to be retrieved, select **Log Retrieval** in the sub-menu and select **Full Text Retrieval** by default.

3. Enter retrieval keywords (case sensitive) according to syntax examples, which shall not contain more than 100 characters.

4. Click the **Retrieve** button, log entries meeting search conditions will be displayed below and keywords will be highlighted.

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogSearch/logsearch01.jpg)

## Customer Scenario

For example, you need to query and count all the Errors that appear in the logs in a certain period of time. You can enter the keyword "Error" to retrieve.
According to the search result notification below, you can know the number of logs that match the search criteria.
