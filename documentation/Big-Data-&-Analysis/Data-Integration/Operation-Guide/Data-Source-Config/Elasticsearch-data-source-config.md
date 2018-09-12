# Configure Elasticsearch Data Source

Elasticsearch data source provides the ability of reading Elasticsearch. You can configure the synchronization tasks.

**Operation Steps:**

1.        Enter the data factory; click ‘Connection Management’; select ‘Add Connection’;

2.        Select the type of data source ‘Elasticsearch’;

![es Data Source Connection](../../../../../image/Data-Integration/es-connection.png)

Configuration Item Description:

 **Connection Type**: Currently, only the version of work-net IP is supported;

​    **Connection Name**: Consisting of Chinese text, English text, numbers and underline, with no more than 30 characters in length;

​    **Description**: A simple description of the data source, with no more than 50 characters;

**Server Address**: Fill in the connection IP and port;

**Authentication**: You can choose Yes/No according to the specific conditions of ES service

​    **User Name/Password**: The username and password corresponding to the database.

3.        Click ‘Connection Test’;

4.        After the connection test is passed, click ‘OK’.