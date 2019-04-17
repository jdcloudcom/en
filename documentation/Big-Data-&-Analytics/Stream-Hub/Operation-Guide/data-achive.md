## Data Archiving<br>
The data connected to the stream bus can be stored for up to 7 days. If you need to save the data permanently, you need to enable the archiving function and persist the data to the place you want to save<br><br>
1. Click the name of the topic you created<br>
![选择主题](https://github.com/jdcloudcom/en/blob/edit/image/DataBus/db-006.png?raw=true)<br><br>
2. After entering the detailed page of the topic, click **Archive** on the left and enable the Open key on the right<br>
![开启归档](https://github.com/jdcloudcom/en/blob/edit/image/DataBus/db-007.png?raw=true)<br><br>
3. Configure Archiving Information<br>
![归档配置](https://github.com/jdcloudcom/en/blob/edit/image/DataBus/db-008.png?raw=true)<br><br>
Archiving Trigger Conditions: With regard to the trigger conditions for data archiving, the length of time or the size of the amount of data can be adopted as the trigger conditions for archiving<br><br>
Archiving Target Setting: You can select the destination to which the data is archived. Such as Data Compute and Cloud Storage. <br><br>
If you have selected the Data Compute, you need to select **Database** and **Data Table** subsequently. <br><br>
Message Recognition Mode: <br>
    - The separator identifies the schema: You can make your own data separator so that the program can parse the message<br>
    - JSON Identifies Schema: The system will automatically recognize the json file and parse it<br><br>
Message Style: <br>
![消息样式](https://github.com/jdcloudcom/en/blob/edit/image/DataBus/db-009.png?raw=true)<br><br>
 After entering the message sample, the system will identify the schema according to the separator you entered. In the field comparison, you need to map the relation between the parsed archiving field and the field in the target library table. <br><br>
After configuring the mapping relation, click **OK** to complete the archiving setting

