## Use Kibana
Kibana is a visual open source platform for data analysis. Users can use Kibana to search and analyze the data stored in JCS for Elasticsearch.
![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/kibana访问设置-01.png)

### Definition Index Mode
Enter into the ES console, single click **kibana** in the Instance List page, redirect to kibana web page, single click **Management** in the left navigation bar, and select **Index Patterns**, so you can define the new index mode in the page.</br>
#### Operation Example
1. Define index "shakes*" for the sample data set Shakespeare in the previous step, then click **Create**.</br>
2. Define another index "ba*" with the same method;</br>
3. Click **Add New** to define indexes for the sample data set logstash in the previous step, check **Use event times to create index names [DEPRECATED]** and select **Daily** in the drop-down box **Index pattern interval**.</br>
4. Select **@timestamp** in the drop-down box **Time Filter field name**, and click **Create** to complete the definition of index.</br>
### Retrieve Data
Single click **Discover** in the left navigation bar of kibana, and select the corresponding index to view the search results. Retrieval may also be done in the search box by entering specific search conditions, and in the search box it is allowed to use operational character >,<=, logic symbol "AND OR NOT"(Uppercase) for combine search.</br>
#### Operation Example
1. Select "ba*" as the retrieval conditions;</br>
2. Enter "account_number:<100 AND balance:>47500" in the search box for search;</br>
3. Under the search conditions, results with the account_number between [0, 99] and the balance value more than 47,500 will be returned.</br>

![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/kibana_1.png)
In addition, the search results may be filtered by adding filter attributes as conditions. Select **Add** as the Fields in the filter conditions under **Available Fields list**. If **account_number** is selected as the Fields, then the search result only contains the account_number column.</br>
![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/kibana_2.png)
### Data Visualization
Single click **Visualize** in the left navigation bar of kibana for data visualization.
#### Operation Example
1. Click **Create a visualization** in the center of the screen;</br>
![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/kibana_3.png)
2. Select pie.</br>
![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/kibana_4.png)
3. Select the index mode as "ba*" for data visualization. Visualization may be created in the search results already saved, and new retrieval rules may be also entered again. If retrieval rules are entered again, a retrieval mode is required to be specified;</br>
![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/kibana_5.png)
4. All documents are searched and matched by default.
![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/kibana_6.png)
5. Define bucket. In the sample data set account.json, each account includes balance. Create a bucket to define the ranges of balance, and view how many accounts there are in each rangs.</br>
a)	 Click **Split Slices** bucket type</br>
b)	 Select **Range** in the drop-down box of **Aggregation**</br>
c)	 Select **balance** in the drop-down box of **Field**</br>
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
6. Define sub-bucket: Use the holder’s age of the account as the measurement unit, add another bucket, and the age of account holder in each balance range can be seen.</br>
a)	 Click **Add sub-buckets** bucket type</br>
b)	 Click **Fields Split Slices** bucket type</br></br>
c)	 Select **Terms** in the drop-down box of **sub Aggregation**</br>
d)	 Select **age** in the drop-down box of **Field**</br>
e)	 Click **Apply changes**</br>
Now it can be seen that the age of account holder encircles in the balance range.</br>

![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/kibana_8.png)
7. Click **Save** and enter "Pie Example" for saving.</br>
Any other type of visualization may be created based on your needs, such as Coordinate Map, Markdown, and Vertical Bar.

### Combine the dashboard
Click **Dashboard** in the left navigation bar of kibana page, click **Add** to display all the saved visual charts, click the saved visual data, and click the small up arrow to consolidate the visual lists
Then, saving and generating link share will be available.
