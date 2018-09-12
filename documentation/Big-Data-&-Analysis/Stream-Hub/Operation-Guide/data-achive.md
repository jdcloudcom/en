## Data Archiving<br>
The data connected to the stream bus can be stored for up to 7 days. If you need to save the data permanently, you need to enable the archiving function and persist the data to the place you want to save<br><br>
1. Click the name of the topic you created<br>
![Select topic](https://github.com/jdcloudcom/cn/blob/edit/image/DataBus/db-006.png?raw=true)<br><br>
2. After entering the detailed page of the topic, click “Archive” on the left and enable the Open key on the right<br>
![Enable archiving](https://github.com/jdcloudcom/cn/blob/edit/image/DataBus/db-007.png?raw=true)<br><br>
3. Configure Archiving Information<br>
![Archiving configuration](https://github.com/jdcloudcom/cn/blob/edit/image/DataBus/db-008.png?raw=true)<br><br>
Archiving Division Conditions: With regard to the trigger conditions for data archiving, the length of time or the size of the amount of data can be adopted as the trigger conditions for archiving<br><br>
Archiving Target Setting: You can select the destination to which the data is archived. Such as data computing services, cloud storage. <br><br>
If you have selected the data computing service, you need to select “Database” “Data Table” subsequently. <br><br>
Message Recognition Mode: <br>
    - The separator identifies the schema: You can make your own data separator so that the program can parse the message<br>
    - JSON Identifies Schema: The system will automatically recognize the json file and parse it<br><br>
Message Style: <br>
![Message style](https://github.com/jdcloudcom/cn/blob/edit/image/DataBus/db-009.png?raw=true)<br><br>
 After entering the message sample, the system will identify the schema according to the separator you entered. In the field comparison, you need to map the relation between the parsed archiving field and the field in the target library table. <br><br>
After configuring the mapping relation, click OK to complete the archiving setting

