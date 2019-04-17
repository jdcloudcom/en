# Returned Result

After calling the API service, the HTTP status code returned is 2xx, representing the success of the calling; which, in case that the HTTP status code returned is 4xx or 5xx, represents the failure of the calling.

### Http Response Status Code

| HTTP Status Code | Error Status Code              | message                                             | Description             | Suggestion                    |
| ---------- | ----------------------- | --------------------------------------------------- | --------------- | ----------------------- |
| **400**    | INVALID_ARGUMENT        | Invalid request parameters：[ error parameter name] | Parameter verification failed    | It is suggested to check the parameter with error notification  |
| **400**    | ACK_FAILED              | ACK_FAILED                                          | ack failed         |                         |
| **400**    | TOPIC_NOT_EXIST         | TOPIC_NOT_EXIST                                     | topic does not exist     | It is suggested to check the existence of the topic   |
| **400**    | INVALID_ARGUMENT        | INVALID_ARGUMENT                                    | Invalid Parameter        | It is suggested to check the parameter            |
| **403**    | PERMISSION_DENIED       | Authentication failure                              | Verification failed        | It is suggested to check the parameter and the signature |
| **403**    | USER_AUTH_FAILED        | USER_AUTH_FAILED                                    | Verification failed        | It is suggested to check the user permission        |
| **403**    | TOPIC_AUTH_FAILED       | TOPIC_AUTH_FAILED                                   | Verification of topic failed   | It is suggested to check the topic permission       |
| **403**    | TOPIC_PERMISSION_DENIED | TOPIC_PERMISSION_DENIED                             | No topic operation permission | It is suggested to check the topic permission       |
| **408**    | SYNC_TIMEOUT            | SYNC_TIMEOUT                                        | Operation timeout        | It is suggested to try again later            |
| **429**    | RATE_LIMIT              |                                                     | tps exceeding limit     | It is suggested to access tps         |
| **429**    | ABNORMAL_ACCESS_RATE    | ABNORMAL_ACCESS_RATE                                | tps exceeding limit     | It is suggested to access tps         |
| **429**    | THROUGHPUT_UP_TO_LIMIT  | THROUGHPUT_UP_TO_LIMIT                              | tps exceeding limit     | It is suggested to access tps         |
| **500**    | INTERNAL                |                                                     | Internal Error        |                         |
