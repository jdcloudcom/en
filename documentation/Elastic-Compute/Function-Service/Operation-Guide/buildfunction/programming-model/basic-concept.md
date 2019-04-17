
# Basic Concept

Where the user uses the language supported by the Function Service of JD Cloud to write codes, a general code writing mode comprising the following core concepts shall be used:


## Processing Program

Function will execute your codes from the processing program, with the function entry in format of file name: Function name. For example, if the function entry assigned by the user is index.handler, the function service will find the index file in the code program package and execute such file from the handler.

Note: The file name and function name of function entry must begin with a letter [a-z, A-Z] and contain letters, numbers, characters and underlines only.

## Function Parameter

The function parameter refers to the content transferred to the function when a function is invoked, comprising event and context.

 

### event parameter 

The event parameter is the inputted data of a function, transmitted to the processing function as the first parameter.

For example: if the function execution is triggered due to file upload, the code can obtain any information of such file from the event parameter, comprising file name, download path, file type, size, etc.

The data structures of transmitted events will vary with the functions triggered by different triggers. For details of data structures, please refer to [Configuration of Trigger and Event Format](../../invokefunction/triggermanagement/configtigger-event.md).



### context object

The Function Service will transmit context to the function entry as the second parameter. Via such context object, your codes can be interacted with the Function Service. For example, via the context object, your codes can obtain basic information of this request ID function, etc.



## Function Log

The function execution log will be written to the log service by the Function Service. The function log comprises the system log and the user log, specifically depending on your function codes. For details please refer to [Function Log](../../function-log.md).





## Function Return

Upon execution, your function needs to transmit the execution result to the Function and treatment will be made according to invoking method of event source.

Synchronous invoke: For the function triggered via the synchronization method, the request will not be returned during execution of such function. When the function execution is finished, the function return value will be encapsulated in the JSON format and then returned to the invoker. For example: triggering of the API Gateway.

Asynchronous invoke: For the function triggered via the asynchronous method, once the Function receives the function, the triggering request will be returned. When the function execution is finished, the function return value will be encapsulated in the JSON format and then saved in the log. Where the user needs to get the function return value after asynchronous triggering, the function return value can be obtained by searching logs via the requestId returned by the record request, upon completion of the function execution. For example: OSS triggering.
