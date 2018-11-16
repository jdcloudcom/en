# Getting Started<br>
1. **Preparation Work**<br>
Before using the Stream Hub service, you first need to register for a JD Cloud account. <br><br>
2. **Create Application**<br>
Step 1: Login to the WEB console of Stream Compute, enter the **Application Management** page of the Stream Compute, and click **Create**. <br>
![sc-002](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-002.png?raw=true)<br><br>
Enter data information the create application interface, then click **OK** to complete the application creation. <br>
![sc-003](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-003.png?raw=true)<br>
Application Name: <br>
Create an app name that is easy for you to remember<br><br>
Task Type: <br>
Select the underlying computing engine to use, currently providing spark streaming-2.1.0, followed by storm, and flink. <br><br>
Stream Compute Unit <br>
Stream Compute Unit: It indicates the computing resources consumed by the execution of the operation, a Stream Compute unit containing 1 CPU and 4GB of memory<br><br>
3. **Job Development**<br>
On the application list page, click on the created application name and go to the Job Development page, as shown below <br>
![sc-004](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-004.png?raw=true)<br><br>
A complete streaming Compute, you need to define three parts as shown below<br>
![sc-005](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-005.png?raw=true)<br><br>
4. **Input Definition**<br>
First you need to define the input source for the Stream Compute<br>
![sc-006](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-006.png?raw=true)<br><br>
5. **Output Definition**<br>
Where the data should be output after the computing is completed<br>
![sc-007](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-007.png?raw=true)<br><br>
6. **Query**<br>
To query the instant Stream Compute Job Development, firstly you need to create a task for Job Development, click **Create** in the figure below. <br>
![sc-008](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-008.png?raw=true)<br><br>
![sc-009](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-009.png?raw=true)<br><br>
After the creation is completed, click on the operation name of the query list to enter the development page<br>
![sc-010](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-010.png?raw=true)<br><br>
In the development page, you can use the SQL way to develop streaming operations. <br>
![sc-011](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-011.png?raw=true)<br>
Statement Description: <br>
`insert into table order_partition select id,order_date from order_partitions`<br><br>
In the SQL statement into table [tablename] is the output target table you defined in the "Output" interface. <br>
From [tablename] is the input source you defined in the "Input" interface. <br><br>
After the operation definition completed, on the Query List page, click **Start** to run operation task. <br>
![sc-012](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-012.png?raw=true)<br>