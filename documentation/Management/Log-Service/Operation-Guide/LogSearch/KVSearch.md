## Key Value Retrieval
The key value retrieval is to index the fields in the log in the form of key-value pairs, which is convenient for the users to retrieve the logs more quickly and accurately. The users can specify a key to retrieve value by a specific condition. At the same time, according to different users and needs, JD Cloud Log Service provides two retrieval methods: Quick retrieval and advanced retrieval.
The cloud product system logs automatically establish a key value index without user settings.

### Quick Retrieval

Fast retrieval is recommended when the fields displayed in the logs are not familiar to you or when only individual retrieval conditions need to be retrieved.

1. The user clicks to add the retrieval conditions; it supports to add up to 5 retrieval conditions. The relationship between multiple retrieval conditions is "and".
2. The Key in the retrieval condition is the Key in the KV pair in the logs that establishes the key value retrieval. The cloud product indexes all KVs in the logs by default.
3. After selecting Key, select the comparison operator according to needs, enter the value of Value, and pay attention to the value type corresponding to Key when entering the value.

![](https://raw.githubusercontent.com/luolei-laurel/cn-1/patch-1/image/LogService/LogSearch/quickSearch.png)

**Customer Scenario**

For example, retrieve the logs whose field "statuscode" is greater than 400 in the past hour.

1. Click to add new retrieval conditions
2. Select Key as statuscode, select ">" for comparison operator, and enter 400 for Value
3. Click **Retrieve** to display all logs with statuscode > 400 in the last hour.

### Advanced Retrieval

Advanced retrieval is recommended when the fields displayed in the logs are more familiar to you or when you need to conduct combination query to multiple KVs.

1. The user enters the retrieval conditions according to the specified syntax rules and business needs. The advanced retrieval supports combination of up to 30 KVs.
2. The key in the advanced retrieval condition must be the real key in the log field. For all the field descriptions in the cloud product system logs, please check it in the cloud product log.
3. Click **Retrieve** to display the log data that matches the retrieval conditions.

![](https://raw.githubusercontent.com/luolei-laurel/cn-1/patch-1/image/LogService/LogSearch/advanceSearch.png)

**Customer Scenario**

For example, retrieve logs that match status < 400 and payment = "jdpay" in the last hour.

1. Enter the retrieval conditions: status < 400 and payment = "jdpay". Note that if it is a string type, you need to add double quotation marks; if it is a numeric type, you don't need to add it.
2. Click **Retrieve** to display all logs with status < 400 and payment = "jdpay" in the last hour.
