# Error response

When the user accesses the image service and the error occurs, the image service will return the corresponding error code and error information to the user to help the user locate and handle the problem.

## Error response format of image service

Message body example of error response:

```
{"code":"BadRequest","message":"BadRequest","resource":"/zsytest/example.jpg","requestId":"ADDB2C69B9FB23E9"}
```

Errors include the following elements:

Code: Error code returned to the user by image service.

Message: Detailed error information given by Image Service.

Resource: Processed image file.

requestId: The only UUID used for identifying error request; the error ID can be sent to the engineers at image service to locate the error reasons when the problem cannot be solved.

## Error code of image service

|Error code|Message|Description|HTTP code|
|-|-|-|-|
|BadRequest|Bad Request|Format error of request packet|400|
|NoSuchKey|The specified key does not exist.|No existing resource|404|
|AccessDenied|Access Denied|Access to server denied|403|
|MethodNotAllowed|The specified method is not allowed against this resource.|MethodNotAllowed|405|
|Internal Error|We encountered an internal error. Please try again.|Server internal error|500|
|-|unknown error|Unknown error|400|
|-|wrong request para|request parameter error|400|
|-|wong processing mode|Wrong processing mode|400|
|-|can't decode image|Can’t decode image|400|
|-|processing error|Apprehending error|400|
|-|can't get response json|Can’t get result json|400|
|-|can't encode image|Can't encode image|400|
|-|can't copy image|Can't copy image|400|
|-|release error|Clear resource error|400|
