# Getting Started Guide<br>
## Create a Topic<br>
1. Preparation Work<br>
Before using the Stream Hub service, you first need to register for a JD Cloud account. <br><br>
2. Create a Topic<br>
Step 1: Log in to the WEB console, go to the “Topic Management” page of the Stream Hub, and click **New Topic**. <br>
![Create A Topic](https://github.com/jdcloudcom/cn/blob/edit/image/DataBus/db-004.png?raw=true)<br><br>
Step 2: Fill in the basic information of the topic, click **Confirm** to create the topic. <br>
![Fill in Information](https://github.com/jdcloudcom/cn/blob/edit/image/DataBus/db-005.png?raw=true)<br><br>
Shard: Data processing capability, with 1 shard corresponding to 1MB/s or 1000 pieces of data writing and 2MB/s data reading<br><br>
Number of Partition: Create the 1-20 for the required number of partitions, and the number of partitions after the topic is created is not allowed to be modified again. <br><br>
Life Cycle: Data can be stored in the Stream Hub for 1 – 7 days<br>
