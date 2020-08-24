# Confirm Message

- Request Line

```
POST {Http access point}/v2/ack HTTP/1.1
```

- Request headers parameters

Please refer to sections of [Common Parameters](../Call-Method/Common-parameters.md) and [Signature-Algorithm](../Call-Method/Signature-Algorithm.md) for request common parameters.

- Request Body
  The Request Body is in JSON format and contains the following parameters:

| Field Name      | Field Type | Required     | Description                                                        |
| :-------------- | :------- | :------- | :--------------------------------------- |
| topic           | string   | Required |                                          |
| consumerGroupId | string   | Required |                                          |
| ackAction       | string   | Required | 1. SUCCESS: Comsumption Succeeded <br/>2. CONSUME_FAILED: Comsumption failed, server will push again<br/> 3. RESEND: Resend Now<br/> 4. DISCARD: Discard message, server will not try again |
| ackIndex        | string   | Required |                                          |

- Response Body

1.Requested

|  Field Name   | Field Type | Description                                                         |
| :------- | :------ | :---------------------------------- |
| requestId |  string  | requestId of this request is used to search the call chain |
|  result   |   null   | `null`|

2.Request Failure

|  Field Name   | Field Type | Description                                                         |
| :------- | :------ | :------------------------------------------------------------ |
| requestId |  string  | requestId of this request is used to search the call chain |
|   error   |   map    | Return format:`{"code":500,"message":"Ack message failure","status":"INTERNAL"}`|
