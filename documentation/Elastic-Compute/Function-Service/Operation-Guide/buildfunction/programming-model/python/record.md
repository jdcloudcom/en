# Log Record

You are allowed to record function execution conditions in the function by using the log recording sentence. Function will write such logs into the function log. If the function is invoked via the console, the console will display the same log. You can view the function logs in the code on the function page corresponding to Log Service, for function log configuration and search details, please refer to [Function Log](../../../function-log.md).

Log entries are generated using the following Python statements:

* `print`statement
* `Logger` function in `logging` module

` print ` and ` logging.* ` functions will write logs in the function log, however, `logging.*` function will write additional information in each log entry, such as time stamp and log level.

**Use `logging` statement to write in the log**

You can use `logging` module to write information into the function log, and the example is as follows: 

```
import logging
logger = logging.getLogger()
logger.setLevel(logging.INFO)
def my_logging_handler(event, context):
  logger.info('got event{}'.format(event))
  logger.error('something is error')
return 'function is worked'  
```

 

 
**Use `print` statement to write in the log**

You can print the function log through `print` statement, and the example is as follows:

```
from __future__ import print_function
def lambda_handler(event, context):
  print('it is running')`
  return 'Hello World!'`   
```  

In this example, only the printed text is sent to Log Service. Log entries will not contain the additional information returned by `logging.*` function.
