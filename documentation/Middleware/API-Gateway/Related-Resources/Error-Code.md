## Public Error Code Reference during Calling

### When you use SDK to call API via JD Cloud API Gateway, the following public error code information is used for reference:

#### (1) Client error

Http Status Code|Error Code|Error Information|Semantics|Solutions
------|-----------|----------|---|------
400|HTTP_BAD_REQUEST|the request blocked by security rules|Requests are intercepted by security rules|Refer to JD Cloud waf
401|ACCESS_ERROR|Invalid authentication credentials|Illegal credential certification|Please use the access key with permissions or contact the service provider to provide access key with permissions
401|ACCESS_ERROR|Invalid accessKey|Access Key Error|Please complete the correct access key
401|ACCESS_ERROR|lack of header authorization|Authorization information is missing from header|If subscription key is used for access, please confirm the correctness of the subscription key. Otherwise, use sdk access service provided by the service provider
401|ACCESS_ERROR|lack of credential in the header authorization|Credential information is missing from authorization|Use the sdk access service provided by service provider
401|ACCESS_ERROR|lack of header x-jdcloud-date|x-jdcloud-date information is missing from header|Use sdk access service provided by service provider
401|ACCESS_ERROR|lack of header signedHeaders|signedHeaders information is missing from header|Use sdk access service provided by service provider
401|ACCESS_ERROR|sign result is not same|Inconsistent client signature and gateway signature|Check if calling data is modified and confirm if ak and sk completed are correct
403|HTTP_FORBIDDEN|Your IP address is not allowed|The current client ip does not allow access service|Contact the service provider for ip permission configuration
403|HTTP_FORBIDDEN|api is disabled|api is unavailable|The api group is deleted and please contact the service provider to recover it
404|NOT_FOUND|no route and no API found with those values|api and routing cannot be found|This group is not released and please confirm the domain is correctly used or contact the service provider
413|HTTP_REQUEST_ENTITY_TOO_LARGE|Payload too large|Too large request body|Request body time-out restriction, request body size is limited to be 100m now
414|HTTP_URI_TOO_LONG|URI too long|Too long request url|Request url is beyond the limit and the current limit is 8k
429|HTTP_RATE_LIMIT_EXCEEDED|minute rate limit exceeded, role:ak|Restriction due to accessKey flow control|It is restricted due to extremely high call frequency, please contact API service provider for negotiation on restriction relaxation
429|HTTP_RATE_LIMIT_EXCEEDED|minute rate limit exceeded, role:api|Restriction due to API group flow control|It is restricted due to extremely high call frequency, please contact API service provider for negotiation on restriction relaxation


#### (2) Server end error
API server errors are as follows. In case of frequent errors, please contact the service provider.

Http Status Code|Error Code|Error Information|Semantics|Solutions
------|-----------|----------|---|------
500|HTTP_INTERNAL_SERVER_ERROR|An unexpected error occurred|Internal Error|You are suggested to try again or contact the service provider
502|HTTP_BAD_GATEWAY|An invalid response was received from the upstream server|Server Return Error|You are suggested to try again or contact the service provider
503|HTTP_SERVICE_UNAVAILABLE|The upstream server is currently unavailable|Backend service Unavailable|You are suggested to try again or contact the service provider
504|HTTP_SERVER_TIMING_OUT|The upstream server is timing out|Backend Service Time-out|You are suggested to try again or contact the service provider
