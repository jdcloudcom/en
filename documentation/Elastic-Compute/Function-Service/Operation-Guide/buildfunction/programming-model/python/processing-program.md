# Processing Program

When creating the Function, an event processing program shall be specified and `event`, `context` and `invoke` of the object shall be specified. The general syntactic structures as below shall be followed:
```
   def my_handler(event, context):
   return 'hello world'
   ```
   

`event`: Function can get input events of functions from the event parameters. The data are transmitted when invoking functions and the parameter is of the Python dict type. You can get required information from the event parameter from the format writing code defined by Function. For format rules, please refer to [Event Format](../../../invokefunction/triggermanagement/configtigger-event.md).

`context`: Function will provide running information to our processing program via the context parameter. Include your personal information and other information. For format rules, please refer to [context object](context.md).

 

`invoke`(optional): processing program return value, notifying that terminate the running function and return information to the invoker. You must invoke the invoke function actively or a timeout error will occur.

* If the RequestResponse invoking type (synchronous invoking) is used, Function will return the Python function invoking result to the client invoking the Function. For example, as the Function console adopts the RequestResponse invoking type, the console will display the returned value when the console invoking function is used.

  If the processing program returns NONE, Function will return null.

* If the event invoking type (asynchronous invoking) is used by you, such value shall be abandoned.

For example: create a function in the name of my_handler and set the entry function to be index.handler. The execution code receives enter event from the event parameter and return a message containing data.
```
 def my_handler(event, context):
    message = 'Hello {} {}!'.format(event['first_name'], 
                                    event['last_name'])  
    return { 
        'message' : message
    }  
```

