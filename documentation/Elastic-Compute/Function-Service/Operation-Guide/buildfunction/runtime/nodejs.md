# NodeJS

Support the following NodeJS Running Environment before Function Service:

NodeJS 6 ( support  NodeJS 6.17 Version )

NodeJS 8 ( support  NodeJS 8.16 Version )

## Processing Program

Define a simple NodeJS function as the function entry:

```JavaScript
exports.handler = function(event, context, callback) {
  console.log('hello world');
  callback(null, 'hello world');
}
```

Define the function execution entry in the format of [File Name].[Function Name] when creating function. "Function Name" fields defined in entry functions are corresponded for handler function and creation function.

Upload using the local ZIP package. Please confirm that the root directory of the ZIP package contains the specified entry file, which contains the entry function corresponding to the function name. Confirm that the corresponding file and function can be found according to the defined function entry for execution.

   
## Input Parameter
Input parameters in NodeJS Environment contain event, context, callback, wherein callback is an optional parameter.

event:  Input trigger event parameters when the function is called.

context:  This parameter passes running information to your processing program.

callback:  This parameter is used to return the information you want to the caller. If this parameter value is not present, the return value is null.


## Log

You can print the log output using the following statement and view output in the function log:

```JavaScript
console.log()
console.error()
console.warn()
console.info()
```


## Use Built-in Module

Except the standard module of NodeJS, there is no module built in the Function Service, you can open ticket and contact us.
