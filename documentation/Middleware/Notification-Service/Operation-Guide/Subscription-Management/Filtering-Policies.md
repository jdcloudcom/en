# Subscription Filtering Policy

The subscription filtering policy helps filtering of messages released to the topic by the subscribers. Therefore, the subscribers can get messages and notifications which he/she is interested rather than get every message released to the topic.

The subscription filtering policy is used for filtering based on message attributes. Firstly, please define message attributes, field: MessageAttributes

### Message with Message Attribute
1. Via control, messages with message attributes can be released
![创建](../../../../../image/Internet-Middleware/Notification-Service/Subscription Filtering Policy1.png)
2. Message JSON format when SDK release a message
As the message contains the MessageAttributes field, any topic subscription containing filtering policy can select to accept or reject this message.

```
{
   "Type": "Notification",
   "MessageId": "0279074ae73a4b1097ab86b39c161f44",
   "TopicArn": "jrn:jns:cn-north-1:012345678910:Topic",
   "Message": "message body",
   "Timestamp": "2019-12-26 12:31:22",
   "SignatureVersion": "1",
   "Signature": "xxxxx",
   "UnsubscribeURL": "unsubscribe-url",
   "MessageAttributes": {
      "price": {
         "Type": "Number",
         "Value": "123"
      }
   }
}
```

### Filtering Policy
The filtering policy is used for accepting or rejecting messages based attribute names or values of messages.

#### Message Accepting Policy
Attributes of the following subscription filtering policy are matched with the attribute assigned to sample messages.

If any attribute of this policy is not matched with the attribute assigned to this message, this policy will reject this message.

```
{
   "price": [{"numeric": [">=", 100]}]
}
```

#### Message Rejection Policy
The following subscription policies do not have any match items as for attributes assigned to sample messages. Therefore, the messages will be rejected due to the policy attributes.
```
{
   "event": ["order_cancelled"],
}
```
