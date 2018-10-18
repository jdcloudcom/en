# Confirm Message

- Request Line

```http
POST {Http access point}/v1/ack HTTP/1.1
```

- Request Body
  The Request Body is in JSON format and contains the following parameters:

| Field Name                     | Field Type | Required     | Description                                                        |
| --------------- | -------- | -------- | ---------------------------------------- |
| topic           | string   | Required |                                          |
| consumerGroupId | string   | Required |                                          |
| ackAction       | string   | Required | SUCCESS, CONSUME_FAILED, RESEND, DISCARD |
| ackIndex        | int64    | Required |                                          |

- Response Body

  1. Requested

  |  Field Name   | Field Type | Description                                                         |
  | :-------: | :------: | :---------------------------------- |
  | requestId                          |  string  | requestId of this request is used to search the call chain |
  |  result   |   null   | `null`                              |

  2. Request Failure

  |  Field Name   | Field Type | Description                                                         |
  | :-------: | :------: | ------------------------------------------------------------ |
  | requestId                          |  string  | requestId of this request is used to search the call chain |
  |   error   |   map    | Return format: `{"code":500,"message":" Ack message failure","status":" INTERNAL"}` |
