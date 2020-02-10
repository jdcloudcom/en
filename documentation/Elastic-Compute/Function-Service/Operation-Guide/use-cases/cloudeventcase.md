# Cloud Event Trigger Example

[Cloud Event Service](https://docs.jdcloud.com/en/cloudevents/product-overview) is a cloud event product offered by JD Cloud with which users can view monitoring statistics incurred by events and set event subscription to some specific events. When there is an event, specific behavior will be triggered.

The current event types supported by the Cloud Event Service include: system events, customized events and timing events.

The example introduces how to periodically trigger function execution by virtue of the Timing event function of Cloud Event Service.

## Create Function

Login the function service console, go to the "Overview" page or the "Function List" page, and click "Create Function".

**step1 Function Code**

- In function running:  python 3.6
- Function template: Customized template                     
- Function name: timing-function (You can set your own function name)                           
- Function entry: index.handler  (the format of Handler: [file name][function name])              
- Function code: Customized template hello word function by default

![timing1](https://github.com/jdcloudcom/cn/blob/function0116/image/Elastic-Compute/functionservice/timing1.PNG) 

**step2 Function Configuration**

- Function execution memory: 128MB                 
- Time-out period: 100 seconds                                               
- Description, environment variable, permission configuration: Not configure by default
- Advanced Configuration:                                       
         Log set: func_log                  
         Log subject: log-function                            
         Description: Log set and log subject need to be created in the log service in advance                                      
![timing1](https://github.com/jdcloudcom/cn/blob/function0116/image/Elastic-Compute/functionservice/timing1-2.PNG) 

**step3 Trigger Methods**

- Trigger: No trigger is configured        
![timing1](https://github.com/jdcloudcom/cn/blob/function0116/image/Elastic-Compute/functionservice/timing3.PNG) 

Click "Complete" to complete function creation.

## Test Function

Before creating a trigger, you can configure test event to simulate the execution of a function through the console.

The Cloud Event source will be passed as an input parameter to the function in the form of event, and you can pass the event to the function through the Console test event to test whether the code is correct.

**Create Test Event**                                     
Enter the "Function List" page, click **timing-function** function and enter the function details, select "Configure Test Event",

- Configure test event: Create a new test event                       
- Event template: Blank Template                      
- Event name: test                         
- Click "Save" to complete test event creation.                                     


**Test Function**                                
Select the saved test event "test" in the "Please Select Test Event" drop-down list, and click "Test".

After successful execution, you can view the real-time function execution log in the Console.

![timing5](https://github.com/jdcloudcom/cn/blob/function0116/image/Elastic-Compute/functionservice/timing5.PNG) 


## Create Trigger    
To create a Cloud Event trigger, you can create in advance the subscription rules on the Cloud Event Service Console and designate this function as the destination, or add the existed subscription rules or create new suspension rules on the Function Service Console. The following describes how to create a new Cloud Event trigger on the Function Service Console.

Select "Trigger" tab in the "timing-function" function details, and click "Create Trigger" to create a one-minute Timing trigger.

- Trigger type: Cloud Event trigger                                 
- Event subscription: Create new subscription rules                                  
- Rule name: 1min-timing                                                               
- Event source type: timing event                                          
- Timing mode: Fixed frequency 1 minute or timing expression([View Rules](https://docs.jdcloud.com/en/cloudevents/crongrammar) ) */1 * * * * 

The timing-rule trigger is created according to the above steps.

![timing6](https://github.com/jdcloudcom/cn/blob/function0116/image/Elastic-Compute/functionservice/timing6.PNG) 


## View function execution log

On the Log Service Console, select "Log Retrieval" and select the log set and log subject configured by the "JQS-func" function, and then this function log can be queried, which is executed every 1 minute:

![JQS13](https://github.com/jdcloudcom/cn/blob/function0116/image/Elastic-Compute/functionservice/JQS13.PNG) 

![JQS14](https://github.com/jdcloudcom/cn/blob/function0116/image/Elastic-Compute/functionservice/JQS14.png) 










