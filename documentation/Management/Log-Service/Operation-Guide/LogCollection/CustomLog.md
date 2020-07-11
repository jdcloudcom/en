## Business Application Log Collection

**Note:**

**No log collection agent is required to be manually installed by user, and the virtual machine selected at addition of collection configuration will automatically install the log collection agent. Confirmation of collection configuration will be deemed to have accepted JD Cloud & AI Log Service’s automatic installation of log collection agent into corresponding virtual machines. Users who have manually installed the collection agent will not be affected and can still report log data in a normal manner.**

Precondition:

The user’s business applications have been deployed on JD Cloud Virtual Machines.

### Operation Steps:

1. Log into to the JD Cloud Console, and click **Cloud Service** -> **Monitoring, Operation and Maintenance** -> **Log Service** to enter the Log Overview Page.

2. Click **Create Log Configuration** and enter the creation page.

3. Create a new log set and log subject and enter the log source setting page.

![业务应用日志](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogCollection/customlogag.png)

- Select "Business Application" as log resource,
- Select whether collection is enabled according to requirements, if disabled, enter the collection configuration page to edit the collection status when it needs to be enabled, if enabled, collect immediately after the collection configuration is created successfully.
Fill in Log Path. The path is the storage path where the user business application generates logs on the Virtual Machines, and the directory prefix supports wildcard symbols, the question mark and the asterisk. The Linux file path shall start with /, for example, /var/log/db/db.log etc. The log collection of Windows Virtual Machines isn’t supported for the time being. The log text code is in UTF8.
- Select the Virtual Machine to be collected. Log Service will automatically install log collection agent into the selected Virtual Machine.
- The Virtual Machines can be selected based on the instance dimension, availability group dimension, and tag dimension. If a Virtual Machine is selected based on the availability group dimension and tag dimension, the newly added Virtual Machine under the corresponding availability group will be used as the collection instance. You can select multiple availability groups but one tag only.
- If business application logs need to be delivered to ES or Kafka, it can be set in the advanced configuration. See details in [Deliver Business Application Log to JCS for Elasticsearch](https://docs.jdcloud.com/en/log-service/logtoes) or [Deliver Business Application Log to Kafka](https://docs.jdcloud.com/en/log-service/logtokafka)

4. Click **Next** to complete the creation of log configuration. When using features of log retrieval and log dump, make sure the collection status is open.

5. After creation, the user can be directly redirected to the retrieval page for retrieval.


