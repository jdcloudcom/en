# Subscribe Acknowledgement

When the subscriber subscribes a topic, the Notification Service will send a subscription acknowledgement message to the subscription terminal, requesting subscription acknowledgement by the user. After the user acknowledges the subscription, the Notification Service will push the subscribed topics to the subscription terminal.

The subscription acknowledgement mechanism guarantees user experience and information security of terminal node user and avoids unwanted messages and resource waste.



#### Frequency of requests sending subscription acknowledgement information

- One entry per 1 minute, no greater than 10 times per day, frequent or massive requests will be rejected by the server

### Subscription Acknowledgement Methods of Different Terminals

| Subscription Type             | Acknowledge Method                                                     |
| -------------------- | ------------------------------------------------------------ |
| HTTP/S               | 1. Receive messages with "x-amz-sns-message-type: SubscriptionConfirmation" at the HTTP/S server end and access the link of `SubscribeURL` in the (HTTP GET request) message body. <br/>2. Click the **Subscription Acknowledgement** button on the Console and fill in topicJRN and Token obtained `SubscribeURL` from the message body to finish subscription. |
| Email        | Click the subscription acknowledgement link or SubscribeURL in the request acknowledgement message             |
| SMS          | Click the subscription acknowledgement link in the request acknowledgement message                             |
| Queue Service (JQS)      | 1. Resources of Notification Service topic and those of Queue Service Queue belong to the same primary account, which do not require acknowledgement and will be automatically acknowledged |
| Function Service (Function) | 1. Resources of Notification Service topic and those of Function Service Function belong to the same primary account, which do not require acknowledgement and will be automatically acknowledged |
