# Invoke cloud function

Users can invoke local cloud functions via the invoke command for test verification.       

## Invoke cloud function command
`sca  invoke`  Invoke function specified by cloud.

## Parameter Description  
The following parameters are supported:

| Abbreviation | Parameter       | Required | Description                                                         | Example           |
| ---- | ---------- | ---- | ------------------------------------------------------------ | -------------- |
| -n  |name   | Y   | Simulate file source of test event. File content must be in JSON format. If no test template is appointed, the character string key:value will be transmitted by default                 | event.json   |
|-e  |event | N    |Appoint a test template file. If no test template is appointed, the character string key:value will be transmitted by default | ./event.json    |

Remark: Cloud invoking is made via the synchronous calling method.

## Use Example   
Execute commands below, use a blank test template and synchronously invoke cloud hello_world function.
