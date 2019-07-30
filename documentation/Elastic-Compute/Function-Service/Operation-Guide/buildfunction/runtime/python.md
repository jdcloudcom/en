# Python

Support the following Python Running Environment before Function Service:

Python 2.7 ( support python2.7 Version )

Python 3.6 ( support python3.6 Version )

Python 3.7 ( support python3.7 Version)

## Processing Program

Define a simple Python function as the function entry:

```Python
   def handler(event, context):
   return 'hello world'
```

Define the function execution entry in the format of [File Name].[Function Name] when creating function. "Function Name" fields defined in entry functions are corresponded for handler function and creation function.

Upload using the local ZIP package. Please confirm that the root directory of the ZIP package contains the specified entry file, which contains the entry function corresponding to the function name. Confirm that the corresponding file and function can be found according to the defined function entry for execution.

   
## Input Parameter
Input parameters in Python Environment contain event and context, both of them are of Python dict type.

event:  Input trigger event parameters when the function is called.

context:  This parameter is used to pass running information to your processing program.


## Log

You can print the log output using the print or logging module and view output in the function log:

```Python
import logging
logger = logging.getLogger()
logger.setLevel(logging.INFO)
def main_handler(event, context):
    logger.info('got event{}'.format(event))
    print("got event{}".format(event))
    return 'Hello World!'
```


## Use Built-in Module

Except the standard module of Python, Python Running Environment of Function Service also contains the following common modules that users can refer to directly.

| Module Name |Module Introduction | Related Link |
| ------ | ------ | ----- |
| boto3 | OSS Python SDK | [ OSS Python SDK](https://docs.jdcloud.com/en/object-storage-service/sdk-python) |  

When writing THE function code, OSS SDK can be introduced and used by the following method:
```Python
import boto3
```
 
