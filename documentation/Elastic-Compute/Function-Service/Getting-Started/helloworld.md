# Hello World Example
This chapter shows the Hello World example and describes the steps to quickly write the Hello World example using function service.

Preparatory Work: Before starting the example operation, apply for enabling the function service.

## Create Function
The user logs in the function service console, go to the "Overview" page or the "Function List" page, and click "Create Function".

  * Function template: Python 3.6 customized function template;<br>
  * Function name: HelloWorld;<br>
  * Function entry: Fill in according to the notification, index.handler by default;<br>  
  * Function code: Enter Hello World function at the code edit page, the console editor default function is HelloWorld function;<br>
  
 
  ```
def handler(event,context):
print(event)
return "hello world"
```
     
  * Function execution memory: 128MB by default;  
  * Time-out period: 100 seconds by default; 
  * Description, environment variable and advanced configuration: no need to fill in;  
  * Trigger: No trigger is configured;
    Click "Complete" to complete function creation.

## Test Function 
1. Create test event<br>
Enter the "Function List" page, click ""HelloWorld" function and enter the function details, select "Configure Test Event",
    * Configure test event: Create a new test event;
    * Event template: Blank Template;
    * Event name: test;
    Click "Save" to complete test event creation. 
    ![测试事件](https://github.com/jdcloudcom/cn/blob/functionservice/image/Elastic-Compute/functionservice/test3.PNG)

2. Test function<br>
Select the saved test event "test" in the "Please Select Test Event" drop-down list, and click "Test".
![测试事件](https://github.com/jdcloudcom/cn/blob/functionservice/image/Elastic-Compute/functionservice/testwork.png)                  

3. View execution results<br>
The function execution results and logs can be directly viewed at the console.
![控制台日志](https://github.com/jdcloudcom/cn/blob/functionservice/image/Elastic-Compute/functionservice/log1.PNG)                             
Function Service Console only can view the current execution results immediately after the console test. For queries of function history logs, trigger function execution results of trigger and logs, please refer to [Function Log](../Operation-Guide/function-log.md).


