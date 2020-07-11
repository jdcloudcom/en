# Configure Subscription Task

After the subscription task is created, it needs to configure information of the source database and the target related to the subscription task. The configuration steps are specified as below.

## Preparation Task

- Create a Kafka instance serving as the subscription target. If the instance is not created, please [Create a Kafka Instance](http://kafka-console.jdcloud.com/list).
- The source database is created with an account of corresponding permissions.

## Operation Steps

1. Log in [DTS Console](http://dts-console.jdcloud.com/subscription/list) and click **Data Subscription** on the left menu.

2. Click **Configure Subscription Task** on the Data Subscription List Page and enter the Data Subscription List Page.

   ![image-20200628185220129](../../../../../image/Data-Transmission-Service/dts-028.png)

3. Fill in relevant information on the Configure Subscription Task Page.

   ![image-20200628185220129](../../../../../image/Data-Transmission-Service/dts-029.png)

   - Task Name
   - Source Library Information
     - Instance type: Support Cloud Database, self-built databases with public IP and self-built databases connected via Direct Connection/intranet.
     - Database type: Database type of subscribed task, which is selected while subscribing a task and cannot be modified.
     - Instance ID: When the instance type is "Cloud Database", please select the database instance ID serving as the subscription source.
     - Address and port of database: In case of instance type "Self-built Database of Public IP" or "Self-built Database Connected via Direct Connection/Intranet", please fill in address and port of such database.
     - Database account and password.
   - Target End Information
     - At present, the Message Queue Kafka Version is supported. Please select an instance ID.
     - Topic: Refer to Topic on a Kafka instance. If it is not created, please fill in the Topic name and then DTS Service will create a Topic on Kafka instance.

4. After completion, click **Next**, enter the next page and select a subscription data type and a subscription object.

5. Confirm that **Authorize DTS Service Management Source Database and Target End** and click **Save and Enable**.

6. Wait until the pre-check is finished. If the subscription task status is changed to be **Running**, it means that the subscription task succeeds.

   

   

