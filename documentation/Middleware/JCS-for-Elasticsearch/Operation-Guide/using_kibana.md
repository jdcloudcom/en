## Use Kibana
### Definition Index Mode
Enter into the ES console, single click **kibana** in the Instance List page, jump to kibana web page, single click Management in the left navigation bar, and select Index Patterns, so you can define the new index mode in the page.</br>

For example: Define index “shakes*” for sample data set Shakespeare in the last step, then click **Create**. By the same means, another index “ba*” can be defined, single click **Add New** to define index for the sample data set logstash in the last step, check “Use event times to create index names [DEPRECATED]”, select “Daily” in the drop-down box for “Index pattern interval”, select “@timestamp” in the drop-down box “Time Filter field name”, and click **Create** to complete the definition of index.
### Retrieve Data
Single click **Discover** in the left navigation bar of kibana, and select the corresponding index to view the search results. Retrieval may also be done in the search box by entering specific search conditions, and in the search box it is allowed to use operational symbol >,<=, and logical operator AND OR NOT(In Uppercase) to combine search.</br>

For example: select “ba*” as the retrieval condition, and enter “account_number:<100 AND balance:>47500” in the search box. For the search conditions, results with the account_number between [0, 99] and the balance value more than 47500.</br>

![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/kibana_1.png)
In addition, the search results may be filtered by adding filter attributes as conditions. Select “Add” as the Fileds in the filter conditions under “Available Fields list”. For example, where “account_number” is selected as the Fileds, the search results only include the column of account_number.</br>
![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/kibana_2.png)
### Data Visualization
Single click **Visualize** in the left navigation bar of kibana for data visualization.
First, single click **Create a visualization** in the center of the screen
![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/kibana_3.png)
Then, select pie.
![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/kibana_4.png)
Visualization may be created in the search results already saved, and new retrieval rules may be also entered again. If retrieval rules are entered again, a retrieval mode is required to be specified. For example, select the index mode as “ba*” for data visualization.
![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/kibana_5.png)
All documents are searched and matched by default.
![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/kibana_6.png)
Define bucket: In the sample data set account.json, each account includes balance. Create a bucket to define the ranges of balance, and view how many accounts there are in each rangs.
a)	 Click **Split Slices** bucket type</br>
b)	 Select **Range** in the drop-down box of “Aggregation”</br>
c)	 Select **balance** in the drop-down box of “Field”</br>
d)	 Click **Add Range** for 4 times, and there are totally 6 rangs</br>
e)	 Define the following ranges:</br>
0             999</br>
1000         2999</br>
3000         6999</br>
7000        14999</br>
15000       30999</br>
31000       50000</br>
Thus, the proportion of account in each balance range can be seen.
![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/kibana_7.png)
Define sub bucket: Use the holder’s age of the account as the measurement unit, add another bucket, and the age of account holder in each balance range can be seen.</br>
a)	 Click **Add sub-buckets** bucket type</br>
b)	 Click **Split Slices** bucket type</br></br>
)	 Select **Terms** in the drop-down box of “sub Aggregation”</br>
c)	 Select **age** in the drop-down box of “Field”</br>
e)	 Click **Apply changes**</br>
Now it can be seen that the age of account holder encircles in the balance range.</br>

![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/kibana_8.png)
Click **Save**, and enter ”Pie Example“ for saving.</br>
Any other type of visualization may be created based on your needs, such as Coordinate Map, Markdown, and Vertical Bar.

### Combine the dashboard
Click **Dashboard** in the left navigation bar of kibana page, click **Add** to display all the saved visual charts, click the saved visual data, and click the small up arrow to consolidate the visual lists
Then, saving and generating link share will be available.
