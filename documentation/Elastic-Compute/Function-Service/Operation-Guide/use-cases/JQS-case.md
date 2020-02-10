# Queue Service JQS Trigger Examples

Using the function service, the function service can designate a Queue Service Message Queuing by round robin, and call your function asynchronously through an event that contains Queue Messages. Function reads the messages in batches and then deletes the messages from Queue.

This example shows how to configure the Queue Service JQS Trigger to pull the messages to be consumed in the Message Queue and print the message content.


## Create Function

Login the function service console, go to the "Overview" page or the "Function List" page, and click "Create Function".

step1 Function Code:

- In function running:  python 3.6                
- Function template: Queue Service JQS Trigger Use Guidance                                  
- Function name: JQS-func (You can set your own function name)                                      
- Function entry: index.handler  (the format of Handler: [file name][function name])                         
- Function code: Default Queue Service JQS example code (round robin will be implemented by the function for messages in the Message Queue of Queue Service JQS, print the message contents and attributes)           

![jqs1](https://github.com/jdcloudcom/cn/blob/function0116/image/Elastic-Compute/functionservice/JQS1.PNG) 

step2 Function Configuration:

- Function execution memory: 128MB                 
- Time-out period: 100 seconds                                               
- Description, environment variable: Not configure by default     
- Permission configuration: JQS-func (In IAM, authorize [Create Service Role](role.md) in advance to authorize round robin by the Function Service for JQS Message Queue)               
- Advanced Configuration:                   
         Log set: func_log                           
         Log subject: log-function                                    
         Description: Log set and log subject need to be created in the log service in advance                                              
![jqs2](https://github.com/jdcloudcom/cn/blob/function0116/image/Elastic-Compute/functionservice/JQS2.PNG) 

step3 Trigger Methods:

- Trigger: No trigger is configured        

Click "Complete" to complete function creation.

## Test Function

Before creating a trigger, you can configure test event to simulate the execution of a function through the console.

Round robin will be implemented by function for the designated Message Queue and pass the message contents as an input parameter to the function in the form of event, and you can pass the event to the function through the Console test event to test whether the code is correct.

Create Test Event
Enter the "Function List" page, click **JQS-func** function and enter the function details, select "Configure Test Event",

- Configure test event: Create a new test event                       
- Event template: JQS-event-template                      
- Event name: test                         
Click "Save" to complete test event creation.                                     

Test function -- Select the saved test event "test" in the "Please Select Test Event" drop-down list, and click **Test**.

After successful execution, you can view the real-time function execution log in the Console. Successfully print the following contents in the test event.

- jqs_message: test (contents of Queue Service JQS message event)                 
- receive_count: 1 (times of messages that have been consumed)        
- message_attributes: None (customized message attribute by user)                

![jqs7](https://github.com/jdcloudcom/cn/blob/function0116/image/Elastic-Compute/functionservice/JQS7.PNG) 

## Create Queue Service JQS Trigger

Select "Trigger" tab in the "JQS-func" function details, and click **Create Trigger** -- **Queue Service JQS Trigger**. You can select the created message queue or click **Create Queue** and go to the Queue Service Console [Create Message Queue](https://docs.jdcloud.com/en/queue-service/create-queue).             
Description: The Function Service only supports types: Message Queue of standard queue triggers functions.  

- Trigger type: Queue Service JQS Trigger                                 
- Message Queue: Select the message queue already created                                
- Batch Processing Size: 1                                         

The Queue Service JQS Trigger is created according to the above steps.

![jqs8](https://github.com/jdcloudcom/cn/blob/function0116/image/Elastic-Compute/functionservice/JQS8.PNG) 


## View function execution log
On Queue Service JQS Console, select the Message Queue associating "JQS-func" function and select "Send Message" to successively send 4 messages, with contents "test1", "test2", "test3" and "test4".

On the Log Service Console, select "Log Retrieval" and select the log set and log subject configured by the "JQS-func" function, and then this function log can be queried; 4 messages have successfully triggered the function execution as below:

![jqs13](https://github.com/jdcloudcom/cn/blob/function0116/image/Elastic-Compute/functionservice/JQS13.PNG) 

![jqs12](https://github.com/jdcloudcom/cn/blob/function0116/image/Elastic-Compute/functionservice/JQS12.PNG) 


