## Full Text Retrieval
Full-text retrieval allows users to enter keywords and search all fields of the log content without distinguishing between key and value. Full-text retrieval needs to establish a full-text index, that is, the entire log content is divided according to the delimiter to establish an index. The Log Service currently only supports the retrieval of system logs of cloud products. The cloud product system logs establish full-text index by default.

## Operation Process
1. Select the log collection and log subject you want to retrieve, and the time range you need to query.

2. According to the syntax example, enter the keywords that need to be retrieved with case sensitive, and the keyword length cannot exceed 100 characters.

3. Click **Retrieve**, the number of logs matching the retrieval criteria is displayed below, and the keywords are highlighted.

![](https://raw.githubusercontent.com/luolei-laurel/cn-1/patch-1/image/LogService/LogSearch/fullTextSearch.png)

## Customer Scenario

For example, you need to query and count all the Errors that appear in the logs in a certain period of time. You can enter the keyword "Error" to retrieve.
According to the search result notification below, you can know the number of logs that match the search criteria.
