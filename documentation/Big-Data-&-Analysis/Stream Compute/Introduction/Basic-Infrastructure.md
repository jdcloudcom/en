## System Structure<br>
![System structure](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-001.png?raw=true)<br><br><br>
**Data Source Input:**<br>
The data source mainly comes from the streaming data of the stream data bus. In the stream computing, you can also choose to configure the reference data source to enrich your data source. The reference data will be imported into the reference data table of the stream computing for subsequent analysis. If you want to use reference data in a stream computing service, you must store it in a database or object storage. <br><br>
**Analysis/Computation:**<br>
The analysis in the flow computation is composed of SQL statements. The SQL statement analyzes the input data source flowing in real time, and the processing result will be output according to your configuration in the data output for downstream consumption processing. At the same time, you can also compile SQL statements for streaming data and reference data, and combine the data from these two sources for query analysis through JOIN query. <br><br>
**Data Output/Consumption:**<br>
In a stream computing operation, SQL query results can be mapped to one or more output stream tables, after which you can configure the final results to be output to the outside, such as output to a cloud storage or data warehouse for persistent data storage. It is also possible to output the data stream again to a new stream data bus.
