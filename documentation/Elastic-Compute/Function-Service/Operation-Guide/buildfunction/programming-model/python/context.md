# Context Object 

Related function information about the running execution can be gotten via context. For example, obtain basic information of function, obtain the request ID in context and record it in the function log. Subsequently, track detailed information of request execution via this ID.

 The definition is as follows:

```
class FunctionMeta:
    def __init__(self, invoked_function_id, function_name, function_version, function_handler, memory_size, timeout):
        self.invoked_function_id = invoked_function_id
        self.function_name = function_name
        self.function_version = function_version
        self.function_handler = function_handler
        self.memory_size = memory_size
        self.timeout = timeout

class FContext:
    def __init__(self, request_id, function_meta, logset, logtopic):
        self.request_id = request_id
        self.function = function_meta
        self.logset = logset
        self.logtopic = logtopic
```



Table 1: Attribute of context object

| Attribute                    | Description                                                         |
| ----------------------- | ------------------------------------------------------------ |
| **request_id**          | Request ID associated with a request. This is to return the client ID invoking the `invoke` method.   Note: If the invoking is tried again, the request ID shall remain unchanged. |
| **function_name**       | Name of Function being executed.                               |
| **function_handler**    | Processing Function.                                                     |
| **function_version**    | Function version being executed. If the alias is used for invoking a function, `function_version` refers to the version of such alias. |
| **invoked_function_id** | id Be used for invoking the function. One function_id corresponds to a function version.       |
| **memory_size**         | Memory restriction for Function configuration (unit: MB). The memory limit can be set at the time of creating the function and can be changed subsequently. |
| **timeout**             | Function Time-out Period.                                               |
| **logset**              | The function log set shall be null if it is not created.                                   |
| **logtopic**            | The log subject shall be null if it is not created.                                     |

 

