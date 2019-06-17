# Log Service

You can realize real-time log collection, log storage, log retrieval, intelligent analysis and other functions currently in API group management of JD Cloud to help users solve business operation, workload monitoring, log analysis and other problems through logs.

#### Entry I:

Middleware > API Gateway > Open API > API Group Management > Log Service

#### Entry II:

Management > Log Service



##  Operation Steps:
###  Step 1: Enter the management page of API group, click **Log

 ![API分组管理](../../../../../image/Internet-Middleware/API-Gateway/Log_Service_APIGroupList.png)


###  Step 2: Click **Create Log Set** on the [Log Set Management](https://logs-console.jdcloud.com/logset/list) module to open the Create Log Set page.

 ![日志集管理](../../../../../image/Internet-Middleware/API-Gateway/Log_Service_logset1.png)
 

###  Step 3: Set the log set name, description (non-compulsory), and save time. After clicking **OK**, the notification "Log set creation succeeded, go to add the log subject immediately?" will pop up "

![创建日志集](../../../../../image/Internet-Middleware/API-Gateway/Log_Service_logset2.png)

![创建日志集2](../../../../../image/Internet-Middleware/API-Gateway/Log_Service_logset3.png)

###  Step 4: After clicking **OK**, redirect to the log set details to create a log subject.

![创建日志集主题](../../../../../image/Internet-Middleware/API-Gateway/Log_Service_logset_theme1.png)
![创建日志集主题](../../../../../image/Internet-Middleware/API-Gateway/Log_Service_logset_theme2.png)

###  Step 5: After adding the log subject name, click **OK**, the notification "Log subject creation succeeded, go to add the collection configuration immediately?" will pop up "
![添加采集配置](../../../../../image/Internet-Middleware/API-Gateway/Log_Service_logset_config1.png)

###  Step 6: After clicking **OK**, enter the collection configuration page. Click **Add Collection Configuration** to enter the adding collection configuration page and select "API Gateway" from the corresponding options of "Products", click **OK** to complete configuration.
![添加采集配置](../../../../../image/Internet-Middleware/API-Gateway/Log_Service_logset_config2.png)
![添加采集配置](../../../../../image/Internet-Middleware/API-Gateway/Log_Service_logset_config3.png)
![添加采集配置](../../../../../image/Internet-Middleware/API-Gateway/Log_Service_logset_config4.png)

###  Step 7: Go back to the log subject list page in the log set management, select the log set ID/Name, click **Preview** to view the latest log data under the log subject. If it is required to search the log data, you can go to [Log Retrieval](https://logs-console.jdcloud.com/search)for search.
![日志检索](../../../../../image/Internet-Middleware/API-Gateway/Log_Service_logset_preview.png)

###  Step 8: Select the log subject to be viewed in the log subject list, click **Retrieve**, or switch to the [Log Retrieval](https://logs-console.jdcloud.com/search) module in the left menu to perform the corresponding full text retrieval or key value retrieval to the log:
1. Full Text Retrieval
![全文检索](../../../../../image/Internet-Middleware/API-Gateway/Log_Service_logset_retrieval_1.png)

2. Key Value Retrieval

(1) Quick Retrieval
![快捷检索](../../../../../image/Internet-Middleware/API-Gateway/Log_Service_logset_retrieval_2.png)

(2) Advanced Retrieval
![高级检索](../../../../../image/Internet-Middleware/API-Gateway/Log_Service_logset_retrieval_3.png)

