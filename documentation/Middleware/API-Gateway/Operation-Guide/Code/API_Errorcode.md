# Error Code

You may be faced with error codes when using services of the API gateway. The table below is provided for your reference:

####   Table 1. General Error Code

|  Error Code  |   HTTP Status Code  |  Error Information  |  Solution   |
|-|-|-|-|
| ARGUMENT_NOT_SUPPORT |  400 |  The parameter argument is not supported  |  Please check access information      |
|  ARGUMENT_NOT_FOUND  |  400 |  The parameter argument is required |  Please check access information     |
|  ARGUMENT_WRONG_FORMAT  | 400 | Type of parameter argument shall be of a format  |  Please check access information    |
|  OUT_OF_RANGE  | 400 | The parameter value is illegal or exceeds the range |   Please check access information    |
| ARGUMENT_MISMATCH  | 400 |  The resource does not contain the parameter argument | Please check access information     |
| INVALID_ARGUMENT   | 400 |  Parameter Argument Error  |  Please check access information      |
| FAILED_PRECONDITION   | 400 |  The resource is not available for current operation in the current state  |   Please check access information      |
| UNAUTHENTICATED   | 401 |  Verification Failed  |  Please check access information      |
| HTTP_FORBIDDEN   | 403 |  No Resource Permission  |    Please authorize the permission to relevant systems or contact relevant administrator for permission authorization     |
| RESOURCE_NOT_EXIST   | 404 |  Resource Absent  |     Please check access information    |
| NOT_FOUND   | 404 |  resource cannot be found   |     Please check access information    |
| ABORTED   | 409 |  Operation cannot be made to the resource now  |    Please check access information     |
| ALREADY_EXISTS   | 409 |  The resource already exists  |     Please check access information    |
| CONFLICT   | 409 |  The two resources have different parent resources  |    Please check access information     |
| FAILED_PRECONDITION   | 409 |  Parameters are dependent to each other in size  |      Please check access information   |
|  QUOTA_EXCEEDED  | 429 |  Insufficient Quota |     Please check access information or add cooperation    |
|  RATE_LIMIT_EXCEEDED  | 429 |  Your requests are too frequent  | Please try again later     |
| CANCELLED   | 499 |  Cancel Operation  |      |
| UNKNOWN   | 500 |  Unknown Error  |    Please try again later      |
| INTERNAL   | 500 |  Internal Error |   Please try again later       |
| NOT_IMPLEMENTED   | 501 |  method is not supported now   |    Please check access information       |
| SOURCE_UNAVAILABLE   | 502 |  Origin Server Unavailable  |   Please check access information        |
| UNAVAILABLE   | 503 |  Service Unavailable  |    Please check access information       |
| DEADLINE_EXCEEDED   | 504 |  Time Out  |        Please try again later      |


####   Table 2. Console Error Code
|  Error Code  |   HTTP Status Code  |  Error Information  |  Solution   |
|-|-|-|-|
| APIGATEWAY_SUCCESS |  200 |  Successful  |  None    |
| APIGATEWAY_ARGUMENT_NOT_SUPPORT |  400 |  The parameter param is not supported  |    Please check access information     |
| APIGATEWAY_ARGUMENT_NOT_FOUND |  400 |  param cannot be null  |     Please check access information     |
| APIGATEWAY_MODIFY_ERROR |  400 |  The group is released and cannot be modified  |  Please carry out the operation after making the group offline or creating a new version     |
| APIGATEWAY_DELETE_API_ERROR |  400 |  Online versions are still available and cannot be deleted  |   The online versions can be deleted only when being offline   |
| APIGATEWAY_NONE_VALID_PIN |  400 |  Invalid User pin  |    Please check access information     |
| APIGATEWAY_DELETE_ERROR |  400 |  Cannot be deleted before disassociation  |   The item can be deleted only when all groups are disassociated   |
| APIGATEWAY_BIND_GROUP_TOO_MUCH |  400 |  There are more than one groups associated to the traffic control policy  |  For next operation, please disassociate all groups at first    |
| APIGATEWAY_PATH_PARAMETERS_MUST_BE_DEFINED |  400 |  Please define path parameter in the Parameter Path |   Define path parameter in the Parameter Path   |
| APIGW_NO_HEADER | 400 |  Lack of Header Parameter userId  |       Please check access information           |
| APIGW_PARAMS_NOT_EXIST | 400 |  An Absent Parameter  |      Please check access information          |
| APIGW_PARAM_VALUE_INVALID | 400 |  An Illegal Parameter  |       Please check access information         |
| APIGW_RECORD_CONFLICT | 403 |  An Existed Parameter  |       Please check access information          |
| APIGW_RECORD_NOT_FOUND | 404 |  An Absent Parameter  |       Please check access information         |
| APIGATEWAY_BIND_GROUP_NOT_FOUND |  404 |  Access authorization is not matched with the group  |  Please check if the authorized AK and SK are associated with the group    |
| APIGATEWAY_HTTP_FORBIDDEN |  403 |  No Permission  |    Please authorize the permission to relevant systems or contact relevant persons for permission authorization     |
| APIGATEWAY_DOMAIN_NO_RECORDED |  403 |  No License  |  Please apply for the license at first     |
| APIGATEWAY_DOMAIN_ALREADY_EXISTS |  403 |  The domain already exists  |   Please use another one   |
| APIGATEWAY_DOMAIN_IS_BINDED |  403 |  The domain is associated and cannot be modified  |  Please disassociate the domain first and then modify it    |
| APIGATEWAY_DOMAIN_NUM_IS_MAX |  403 |  Number of domains exceeds the maximum value  |   Please set the domain number within the range    |
| APIGATEWAY_NONE_VALID_APPID |  404 |  Invalid keyID  |    Please check access information          |
| APIGATEWAY_NOT_FOUND |  404 |  The param resource is absent  |     Please check access information         |
| APIGATEWAY_NONE_VALID_API |  404 |  The group has no valid API  |  Please create an API first and then carry out the next operation    |
| APIGATEWAY_NOT_EXIST_METHOD_ERROR |  404 |  No APIs to be verified  |     Please check access information         |
| APIGATEWAY_SWAGGER_NULL_ERRO |  404 |  yaml file cannot be null  |     Please check access information          |
| APIGATEWAY_APIGROUPNAME_ISREPEAT |  409 |  Group Name Repeated  |   Please create a different group name   |
| APIGATEWAY_BACKENDSERVICE_PREFIX_ISREPEAT |  409 |  Backend service prefix name repeated in groups  |      Please create a different prefix name    |
| APIGATEWAY_APINAME_ISREPEAT |  409 |  API Name Repeated  |     Please create a different name     |
| APIGATEWAY_ACCESSKEY_ISREPEAT |  409 |  Signature Access Key Repeated  |      Please create a different signature access key    |
| APIGATEWAY_ACCESSKEYAUTH_ISREPEAT |  409 |  Authorized Access Key Repeated  |     Please create a different authorized access key     |
| APIGATEWAY_POLICYNAME_ISREPEAT |  409 |  Policy Name Repeated  |   Please create a different policy name        |
| APIGATEWAY_API_PATH_ISREPEAT |  409 |  API Path Repeated  |     Please create a different path     |
| APIGATEWAY_APISNAME_ISREPEAT |  409 |  Repeated Group Name for Creation of Business Line  |    Please create a different group name       |
| APIGATEWAY_REVISION_ISREPEAT |  409 |  New Revision Number Repeated  |     Please create a different revision number     |
| APIGATEWAY_SWAGGER_PARSE_ERROR |  500 |  yaml File Resolution Exception  |  Please check the information       |
| APIGATEWAY_OPERATION_FAILED |  500 |  Operation Failed  |    Please check information       |
| APIGATEWAY_API_BODY_ERROR |  500 |  The body definition corresponding to the APIs to be verified is abnormal  |    Please check the information     |
| APIGATEWAY_INVALID_SERVICE_STATUS |  500 |  Service Disabled or Stopped  |     Please check the information    |
| APIGATEWAY_INVALID_AUTHENTICATION_STATUS |  500 |  The user has not completed real-name verification  |  Please complete the real-name verification first    |



