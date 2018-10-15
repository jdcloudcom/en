## Job Development<br>
Query: <br>
To query the instant Stream Compute Job Development, firstly you need to create a task for Job Development, click **Create** in the figure below. <br>
![sc-022](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-022.png?raw=true)<br><br>
![sc-023](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-023.png?raw=true)<br>
Allocate Computing Resources: <br>
The total computing resources of the multiple search tasks within the application shall not exceed the Stream Compute units setting at the time of creating the application. <br>
For example, if you select 20 Stream Compute units when creating the application and if you create 4 job tasks after entering the application, you can allocate computing resources independently for each job task, however the total computing resources allocated to the 4 job tasks shall not exceed the quantity of the Stream Compute units setting at the time of creating the application. <br><br>
After the creation is completed, click on the operation name of the query list to enter the development page<br>
![sc-024](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-024.png?raw=true)<br><br>
In the development page, you can use the SQL way to develop streaming operations. <br>
![sc-025](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-025.png?raw=true)<br>
Statement Description: <br>
`insert into table order_partition select id,order_date from order_partitions`<br><br>
In the SQL statement into table [tablename] is the output target table you defined in the "Output" interface. <br>
From [tablename] is the input source you defined in the "Input" interface. <br><br>
If the output-end uses the partition table, it is required to declare the information of partition table, such as: <br>
`insert into table xyc_out1 partition(city)`<br><br>
After the job’s definition is completed, on the Query List Page, click **Start** to start the job task. <br>
![sc-026](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-026.png?raw=true)<br>