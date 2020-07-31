# Create rule engine

1. Log in the IoT Management Platform
2. Select **Rule Engine** -> **Rule List** on the left navigation bar**
3. Click **Create Rule** on the upper right corner of the page.**

![新建规则](../../../../../image/IoT/IoT-Core/Rule-Engine/Create-Rule.png)

**Basic Information** 

- Rule name: Rule engine unique identifier supports Chinese, English, numbers, underline (_) and line-through (-) within 2-30 characters.

- Thing Type ID: It is not required now. The system will support rule filtering on the information reported by all devices under multiple products. At that time, the corresponding product IDs shall be added here.

- MQTT Topic: The MQTT Topic reported by the device indicates that the data reported on the Topic is to be processed.

- SQL statement: The SQL statement executed when defining data filtering. All data reported will be processed by the SQL statement and then be forwarded. The table name can be named at will. It has no actual meaning.

```
Currently, the following formats are supported:

1. SELECT * FROM Orders
2. SELECT a, c AS d FROM Orders
3. SELECT * FROM Orders WHERE b = 'red'
4. SELECT * FROM Orders WHERE a> 0
```

- Data reported by the device: It describes the data fields and field types reported by the device.

```
{ 
  "messageId":"1234567898765432",
  "event":"connected",
  "deviceId":"1.2.156.156.11.11.962",
  "timestamp":1573696479
}
```
- User customized settings: When enhancing the data reported by the device, you can select a user customized setting to enhance information for the reported data. The reported data can be enhanced by expanded column, intercepted column and coalesced column.

![新建规则](../../../../../image/IoT/IoT-Core/Rule-Engine/User-Setting.png)

Expanded column: Add expansion properties to the forwarded data. Now the expansion of device ID, thing type code, device name and device physical id are supported.

![扩展字段](../../../../../image/IoT/IoT-Core/Rule-Engine/extend-column.png)
Intercepted column: For a character type column, you can specify to intercept certain characters in the column, such as: ‘device.profile.name, 0, 4’, which means the device.profile.name columns to be intercepted starting from 0 with an interception length of 4. If you do not enter the interception length, the default interception is to the end.

Coalesced column: It refers to the combination column (multiple columns are supported), supporting the combination of character and numeric. For instance, coalescing the character column (person.name:xiaoli) and numeric column (person.age:23), please enter 'person.name, person.age', and the final output result is: 'xiaoli23'


**Data forward**

The data filtered by rules can be forwarded to three message storages: Kafka, MySQL, and JCQ.

- Note: Kafka and MySQL must be under the same VPC with the current IoT management platform instance.

1. Forward to Kafka
To forward to kafka, you need to fill in the name, address and Topic.

![转发到Kafka](../../../../../image/IoT/IoT-Core/Rule-Engine/Forward-To-Kafka.png)

Get the parameter information of Kafka:
- Log in **Message Queue Kafka Version** -> **Instance List**
- Click the target Kafka name to enter the Kafka details. If Kafka is not created in the Instance List page, click the **Create** button to create one.
- AK/SK information can be created/obtained on the AccessKey Management page.

2. Forward to MySQL
To forward to MySQL, you need to fill in the name, database address, library name, table name, column name, batch (data warehousing threshold), account number, and password.

![转发到MySQL](../../../../../image/IoT/IoT-Core/Rule-Engine/Forward-To-MySQL.png)

Get the parameter information of MySQL:
- Log in **RDS** -> **Instance List**
- Click the target MySQL name to enter the MySQL details and get the name and address, click to log in the database and get the database name, table name and column name. If MySQL is not created in the Instance List page, click the **Create** button to create one.
- AK/SK information can be created/obtained on the AccessKey Management page.

3. Forward to JCQ
To forward to JCQ, you need to fill in the address, Topic, AccessKey/SecretKey message type, etc.

![转发到JCQ](../../../../../image/IoT/IoT-Core/Rule-Engine/Forward-To-JCQ.png)

Get the parameter information of Message Queue:
- Log in **Message Queue** -> **Topic Management**
- Click the target Topic name to enter the Topic details. If Topic is not created in the Topic Management page, click the **Create** button to create one.
- AK/SK information can be created/obtained on the AccessKey Management page.

## Edit Rules
1. Log in the Rule Engine - Rules List page, select a rule, click the **Edit** button, and enter the Edit Rules page.
2. If the rules are in stopped status, after entering the Edit Rules page, you can change the attributes of the rules, and click **Save** to take effect.
3. If the rules are in running status, after entering the Edit Rules page, you cannot change the attributes of the rules.

## Run/Stop Rules
1. Log in the Rule Engine - Rules List page, click the **Run/Stop** button.
2. After successfully running the rules, the running status starts. The operation button in the rules list changes into the Stop button. After successfully stopping the rules, the stopped status starts. The operation button in the rules list changes into the Stop button.

![启停规则](../../../../../image/IoT/IoT-Core/Rule-Engine/Start-And-Stop-RuleEngine.png)

## Delete Rules

Log in the Rule Engine - Rules List page, click the **Delete** button. If the rules are in running status, they cannot be deleted; if the rules are in stopped status, they can be deleted; after being successfully deleted, they cannot be searched in the rules list.

![删除规则](../../../../../image/IoT/IoT-Core/Rule-Engine/Delete-Rule-Engine.png)
