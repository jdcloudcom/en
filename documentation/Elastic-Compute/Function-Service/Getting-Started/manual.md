# Usage Process

This chapter provides a brief overview of the process of using function services.

Use introduction:

If you want to use the function services during Beta, please apply for Beta on the product details.

The function service usage process is as follows:

1. Create functions, write codes, add event sources, deploy application;
2. Implement business functions through API or cloud service event source triggering functions;
3. View function logs;
4. View function monitoring.

 

## Create Function

Function is the basic unit of scheduling and running, which is the processing logic of a piece of code. You need to write code based on the function interface format provided by Function and deploy the code to the Function Service as a Function.

For function creation detailed information, please refer to [Function Construction](../Operation-Guide/buildfunction/config-function.md).

 
## Trigger Function

Functions are triggered by events, and function services currently support OSS triggers and API gateway triggers.

For detailed information of trigger, please refer to [Trigger](../Operation-Guide/invokefunction/triggermanagement/triggeroverview.md).

In addition, if the trigger is not configured, you can also call function execution directly using methods such as the console, SDK.



## View execution log

After the function is executed, you can search the execution of the function through the log service, Function logs function logs in the log service, you can configure the log service to get the function logs.

For function log detailed information, please refer to [Function Log](../Operation-Guide/function-log.md).



## View function monitoring

Through cloud monitoring, the user can monitor the running status of functions in real time to ensure the smooth operation of the business.

For function monitoring detailed information, please refer to [Function Monitoring](../Operation-Guide/monitor.md).
