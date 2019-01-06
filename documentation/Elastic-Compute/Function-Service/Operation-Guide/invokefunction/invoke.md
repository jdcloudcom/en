
# Function Call


## Call Type

You can call a function by 2 methods of **synchronous call** or **asynchronous call**.

Synchronous call: The result is returned directly after the event is processed by the function. For example: console call, API Gateway call are synchronous calls.

Asynchronous call: The event is returned after being written into the message queue, and the client does not care about the result of the request call. For example: OSS trigger call is the asynchronous call.

Synchronous/asynchronous requests have different restrictions on incoming events, for details, please refer to [Restrictions](../../Introduction/Restrictions.md).

 

## Concurrent Execution

Concurrent Execution means the number of simultaneous executions of your function code at any given time. The function concurrency can be estimated through the following formula.

**Request Rate * Function Execution Time**

In which, the request rate is the rate at which a function is called, and the unit is "the number of requests per second" or "the number of events per second". The unit of function execution time is "second". For example, consider one function that processes an API Gateway event of JD Cloud. Assuming that the function takes an average time of 1.5 seconds, API Gateway releases 10 events per second. Therefore, your function has 15 concurrent executions.

 

## Security Restrictions

In some cases, function execution may get out of control due to wrong settings of the user. Referring to the following scenario, you set up an OSS trigger that will call the relevant function to process after uploading the image file to a certain Bucket in OSS. This function processes the original image into images of three different sizes and mistakenly writes the results back under the same bucket. As a result, new functions will be called to form an endless loop. To avoid financial losses due to out-of-control functions, function compute sets concurrent execution restrictions at each account granularity, the default is 20. You can observe the flow control behavior through the relevant indicators (Throttles) of the function in the cloud monitoring.

If you need to increase such restrictions, please open ticket.

 

## Try Again Mechanism

Based on different call methods, the try again mechanisms for unsuccessful functions vary.

Synchronous call: If functions under the synchronous call fail to execute, the system will not process. You can try again by yourself.

Asynchronous call: If your function asynchronous call fails, Function will try again automatically and wait until to be executed.
