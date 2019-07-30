# Usage Process



If you want to use the function services during Beta, please apply for Beta on the product details.

The function service usage process is as follows:

1. Function creation: Compile codes on line or upload code packages to Function Service and configure function running conditions, you may select whether to create trigger synchronously;
2. Execute function: Test function codes with the Console or call API to trigger function execution, and configure the trigger for function after the testing of code execution is free of error to verify if the expected event source triggering is reached;
3. Release function version: Release new versions for tested and verified functions, and functional iteration for new functions may be continuously carried out on the LATEST version;
4. Create function alias: Alias refers to pointers to a particular version of function. We recommend using alias to serve all kinds of environments. By associating the event source triggering function with the alias, you can point to a new function version through switching alias to switch environment traffic. For detailed information, please refer to [Version Overview](../Operation-Guide/version-management/manegement.md);
5. Function monitoring: Monitor function operation status and handle function run-time error in time by configuring alarm policies;
6. Function log: Check function execution log with function logs and investigate function run-time errors.

 

## Create Function

Function is the basic unit of scheduling and running, which is the processing logic of a piece of code. You need to write code based on the function interface format provided by Function and deploy the code to the Function Service as a Function.

For function creation detailed information, please refer to [Function Construction](../Operation-Guide/buildfunction/function-overview.md).

 
## Invoke Function

Functions are invoked by events, and function services currently support OSS triggers and API gateway triggers.

For detailed information of trigger, please refer to [Trigger](../Operation-Guide/invokefunction/triggermanagement/triggeroverview.md).

In addition, if the trigger is not configured, you can also invoke function execution directly using methods such as the console, SDK.

## View function monitoring

Through cloud monitoring, the user can monitor the running status of functions in real time to ensure the smooth operation of the business.

For function monitoring detailed information, please refer to [Function Monitoring](../Operation-Guide/monitor.md).

## View execution log

After the function is executed, you can search the execution of the function through the log service, Function logs function logs in the log service, you can configure the log service to get the function logs.

For function log detailed information, please refer to [Function Log](../Operation-Guide/function-log.md).




