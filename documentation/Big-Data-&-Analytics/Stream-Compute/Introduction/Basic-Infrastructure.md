## System Structure<br>
![System structure](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-001.png?raw=true)<br><br><br>
**Data Source Input:**<br>
The data source mainly comes from the streaming data of the Stream Hub. In the Stream Compute, you can also choose to configure the reference data source to enrich your data source. The reference data will be imported into the reference data table of the Stream Compute for subsequent analysis. If you want to use reference data in a Stream Compute service, you must store it in a database or Object Storage Service. <br><br>
**Analysis/Compute:**<br>
The analysis in the Stream Compute is composed of SQL statements. The SQL statement analyzes the input data source flowing in real time, and the processing result will be output according to your configuration in the data output for downstream consumption processing. At the same time, you can also compile SQL statements for streaming data and reference data, and combine the data from these two sources for query analysis through JOIN query. <br><br>
**Data Output/Consumption:**<br>
In a Stream Compute operation, SQL query results can be mapped to one or more output stream tables, after which you can configure the final results to be output to the outside, such as output to a cloud storage or data warehouse for persistent data storage. It is also possible to output the data stream again to a new Stream Hub.
