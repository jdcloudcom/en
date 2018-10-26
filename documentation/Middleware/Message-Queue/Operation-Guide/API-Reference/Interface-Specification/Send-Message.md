# Send Message

- Request Line

```http
POST {Http access point}/v1/messages HTTP/1.1
```

- Request Body

  Request Body is in JSON format and contains the following fields:

|  Field Name    |    Field Type | Required or Not   | Description                       |
| :------: | :-------------: | :------: | :------------------------- |
|  topic   |     string      | Required |                            |
|   type   |     string      | Required | NORMAL, ORDER, TRANSACTION |
| messages | list of Message | Required | 1 <= Number of messages <= 32        |

  Where Message is of type Map and contains the following fields:

|    Field Name                          |      Field Type | Required or Not | Description       |
| :----------: | :-----------------: | :------: | -------------------------- |
|     body     |       string        | Required | Message length does not exceed 256K         |
| delaySeconds |        int32        | Optional | 0 <= delaySeconds <= 86400 |
|     tag      |       string        | Optional | Support a single Tag only                |
|  properties  | map<string, string> | Optional | User customized key value           |

- Response Body

  1. Requested

  |  Field Name   | Field Type | Description                                                        |
  | :-------: | :------: | :---------------------------------------------------------- |
  | requestId |  string  | requestId of this request is used to search the call chain                         |
  |  result   |   map    | Return Format: `{"messageIds": ["messageId_1", "messageId_2"]}` |

  2. Request Failure

  | Field Name    | Field Type | Description                                                         |
  | --------- | -------- | ------------------------------------------------------------ |
  | requestId | string   | requestId of this request is used to search the call chain                          |
  | error       | map    | Return Format: `{"code":403,"message":" Authentication failed","status":" PERMISSION_DENIED"}` |
