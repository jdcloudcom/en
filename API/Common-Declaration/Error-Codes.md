
The common mistakes are shown in the table below. For the specific reason, the prompt in message shall prevail.

Error code| error status| error reason
:---|:---|:---
400|INVALID_ARGUMENT|Parameter error
400|FAILED_PRECONDITION|Failed to satisfy the preconditions required by the operation
400|OUT_OF_RANGE|The parameters are out of range
401|UNAUTHENTICATED|Validation failure
403|HTTP_FORBIDDEN|No permission
404|NOT_FOUND|Object not found
409|ABORTED|Operation aborted
409|ALREADY_EXISTS|Object has already existed
429|QUOTA_EXCEEDED|Insufficient quota
429|RATE_LIMIT|Requests exceeded limit
499|CANCELLED|Cancel operation
500|UNKNOWN|Unknown error
500|INTERNAL|Internal error
501|NOT_IMPLEMENTED|Failed to implement operation
502|SOURCE_UNAVAILABLE|Unavailable source station
503|UNAVAILABLE|Unavailable service
