# Receive Message

- Request Line

```
GET {Http access point}/v2/messages HTTP/1.1
```

- Request headers parameters

Please refer to sections of [Common Parameters](../Call-Method/Common-parameters.md) and [Signature-Algorithm](../Call-Method/Signature-Algorithm.md) for request common parameters.

- Request Parameters

| Field Name           | Field Type | Required     | Description                                                        |
| :------------------- | :--------- | :----------- | :---------------------------------------------------------- |
| topic                | string     | Required     |                                                             |
| consumerGroupId      | string     | Required     |                                                             |
| size                 | int32      | Optional     | **Maximum** number of message pulled at a time, 0 < size <=32, defaultValue = 32  |
| consumerId           | string     | Optional     | defaultValue = httpProxyId              |
| consumeFromWhere     | string     | Optional     | Default starting consumption location, it is acceptable to select the values: HEAD, TAIL, defaultValue = HEAD |
| filterExpressionType | string     | Optional     | Message filtering expression type, it is only acceptable to select the value of TAG at present                       |
| filterExpression     | string     | Optional     | Message filtering expression, no filtering by default, if filtering is required, this parameter needs to be passed in with the filterExpressionType at the same time |
| ack                  | string     | Optional     | When the message is pulled, whether the server automatically ACK; the value available is true and false; the defaultValue = false  |

- Response Body

1.Requested

|  Field Name   | Field Type | Description                                                         |
|:----|:----|:----|
| requestId |  string  | requestId of this request is used to search the call chain      |
|  result   |   map    | Return format : {"topicName":"lizhijian-041","ackIndex":"broker-31","messages":[{"messageId":"messageId_1","messageBody":"test-0","properties":{"TAGS":"world"}},{"messageId":"messageId_2","messageBody":"test-2","properties":{"TAGS":"world"}}]} |

2.Request Failure

| Field Name | Field Type | Description                                                         |
|:----|:----|:----|
| requestId |  string  | requestId of this request is used to search the call chain |
|   error   |   map    | Return format : {"code" : 500,"message" : "Topic information query failure","status" : "INTERNAL"} |
