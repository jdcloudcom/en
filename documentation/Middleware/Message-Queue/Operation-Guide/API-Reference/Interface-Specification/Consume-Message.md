# Receive Message

- Request Line

```http
GET {Http access point}/v1/messages HTTP/1.1
```

- Request Parameters

| Field Name                     | Field Type | Required     | Description                                                        |
| -------------------- | ---------- | ------------ | ----------------------------------------------------------- |
| topic                | string     | Required     |                                                             |
| consumerGroupId      | string     | Required     |                                                             |
| size                 | int32      | Optional     | **Maximum** number of message pulled at a time, 0 < size <=32, defaultValue = 32  |
| ~~consumerId~~       | ~~string~~ | ~~Optional~~ | ~~defaultValue = httpProxyId (It's useless to pass anything)~~              |
| consumeFromWhere     | string     | Optional     | Default starting consumption location, it is acceptable to select the values: HEAD, TAIL, defaultValue = HEAD |
| filterExpressionType | string     | Optional     | Message filtering expression type, it is only acceptable to select the value of TAG at present                       |
| filterExpression     | string     | Optional     | Message filtering expression, no filtering by default                                |
| ack                  | bool       | Optional     | When the message is pulled, whether the server automatically ACK, defaultValue = false           |

- Response Body

  1. Requested

  |  Field Name   | Field Type | Description                                                         |
  | :-------: | :------: | :----------------------------------------------------------- |
  | requestId                          |  string  | requestId of this request is used to search the call chain |
  |  result   |   map    | Return format : `{"topicName":" lizhijian-041","ackIndex":31,"messages": [{"messageId":" messageId_1","messageBody":" test-0","properties": {"TAGS":" world"}},{"messageId":" messageId_2","messageBody":" test-2","properties": {"TAGS":" world"}}]}` |

  2. Request Failure

  |  Field Name   | Field Type | Description                                                         |
  | :-------: | :------: | ------------------------------------------------------------ |
  | requestId                          |  string  | requestId of this request is used to search the call chain |
  |   error   |   map    | Return format: `{"code":500,"message":" Topic information query failure","status":" INTERNAL"}` |
