# Queue Service JQS Trigger

 [Queue Service](../../../../../../Middleware/Queue-Service/Introduction/Product-Overview.md) is a fully hosted message Queue Service based on serverless architecture. For using the Queue Service, the user does not need to conduct complex infrastructure configurations or make frequent expansion to meet high reliability of data and high availability of services. The user just needs to focus on business implementation. With simple Console operations or SDK calls, a highly reliable, highly available, and infinitely scalable message queue can be built. What is more, the service is charged based on quantity, with no initial cost.

You can consume messages in Queue Service Message Queuing by writing Function which implement round robin for the Queue and call your Function asynchronously with an event that contains the queue messages. Function reads the messages in batches and then deletes the messages from Queue.

## Function Service Role Permission

Before creating Queue Service JQS Trigger, please make sure that Function to be associated has been added with a service role, and the service role policy contains the following necessary APIs permissions for Function round robin Queue Service message queuing to get message event:  
ReceiveMessage  
DeleteMessage  
DeleteMessageBatch

You need to create a service role in "IAM" - "Role Management" in advance. To trust "Function Service" to access JD Cloud resources on behalf of you, you need to add round robin Queue Service JQS permissions for this role (The system policy of JDCloudQueneServiceTriggerFunction Queue Service Trigger Function Permissions preset by JQS can be directly added to this role). If there is no round robin Queue Service JQS APIs Permissions added in the Function Permission Configuration, the trigger creation fails.

## Trigger Configuration

See Table 1 for the trigger configuration parameter description for Queue Service JQS Trigger, * is a compulsory item.
 
Table 1  Queue Service JQS Trigger Information Table

| Field         | Description                                     |
| ----------- | ---------------------------------------- |
| * Trigger Type | Select the "Queue Service JQS Trigger" in the drop-down list.           |
| * Message Queue    | Select the message queue already created  |
| * Batch Processing Size  | The maximum number of messages read from a Queue at one time. Range [ 1-10 ]    |


### Restrictions for Rule Association

* The Queue is in the same region as Function;
* FIFO Queue Trigger Function is not supported;
* A Queue can trigger one or more functions (version/alias. Latest by default). The same function and Queue cannot be associated over and over again.

 
