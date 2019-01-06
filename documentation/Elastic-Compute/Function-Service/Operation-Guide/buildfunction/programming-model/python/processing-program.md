# Processing Program

When creating the Function, an event processing program shall be specified and `event`, `context` and `callback` of the object shall be specified. The general syntactic structures as below shall be followed:
```
   def my_handler(event, context):
   return 'hello world'
   ```
   

`event`: Function can get input events of functions from the event parameters. The data are transmitted when calling functions and the parameter is of the Python dict type. You can get required information from the event parameter from the format writing code defined by Function. For format rules, please refer to [Event Format](../../../invokefunction/triggermanagement/configtigger-event.md).

`context`: Function will provide running information to our processing program via the context parameter. Include your personal information and other information. For format rules, please refer to [context object](context.md).

 

`callback`(optional): processing program return value, notifying that terminate the running function and return information to the caller. You must call the callback function actively or a timeout error will occur.

* If the RequestResponse calling type (synchronous calling) is used, Function will return the Python function calling result to the client calling the Function. For example, as the Function console adopts the RequestResponse calling type, the console will display the returned value when the console calling function is used.

  If the processing program returns NONE, Function will return null.

* If the event calling type (asynchronous calling) is used by you, such value shall be abandoned.

For example: create a function in the name of my_handler and set the entry function to be index.handler. The execution code receives enter event from the event parameter and return a message containing data.
```
 def my_handler(event, context):
    message = 'Hello {} {}!'.format(event['first_name'], 
                                    event['last_name'])  
    return { 
        'message' : message
    }  
```

