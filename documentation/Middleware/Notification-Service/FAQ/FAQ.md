# FAQ

### Service Related

1. What is the difference between Notification Service and Message Queue?


- Notification Service and Queue Service are message middlewares based on serverless architectures, which support dynamic service expansion. Users do not need to care about resource planning, capacity threshold and other problems, but only need simple SDK calling service and make charge on demand. The message transmission model of Notification Service is the release subscription model, allowing message push to multiple terminal nodes. The subscribers do not need to get messages via the round robin service and the user’s push consumption mode is supported. The message transmission mode of Queue Service is a point-to-point queue model, for which the user needs to consume the messages via the round robin mode. Such mode supports the Pull consumption mode of the user. For users who build brand new applications in the Cloud, it is more convenient to build a distributed system of high availability or applications of severless architecture with the Notification Service and the Queue Service. They set up the connection between service types such as the Function Service and OSS, without coding by users.

  Combination of service modes of the two service types is to release messages to the Notification Service, and then the Notification Service distributes messages to different queues of the Queue Service, sending messages asynchronously to one or more system components.

- The message transmission model of Message Queue is a release subscription model, which supports user's Push/Pull consumption pattern, supports more diversified consumption patterns, such as cluster consumption and broadcast consumption, and supports more message middleware operations such as message backtracking. For users who already have existing message middleware who want to migrate for JD Cloud Onboarding or have unique instance requirements for message queue, we recommend that such users use Message Queue.

2. Which restrictions do the Notification Service have?

   For restriction details, please view in [Restriction Description](../Introduction/Restrictions.md).

3. Is public network/VPC service supported by Notification Service?

   They both supported. The service supports users to directly access the public network and will support uses to access the service directly in VPC.

### Subject Relevance

1. Are messages allowed to be sent from multiple users or terminals to a single topic by the Notification Service?

   Yes. The topic owner can set the access permission and messages are allowed to be released by multiple JD Cloud users.

### Subscription associated

1. What is the validity period of subscription request acknowledgement?

   3 Days. For subscription acknowledgement requests, token in the acknowledgment message sent to the terminal node is valid for 3 days. Then, token will become invalid and the unacknowledged subscription will be deleted.

2. How to unsubscribe by the terminal subscription user?

   - Unsubscribe by the topic owner or the subscription owner

     You can delete subscription via the Console or call the unsubscribe API at SDK to unsubscribe the subscriber’s topic.

   - Unsubscribe by Terminal Subscriber

     If the AuthenticateOnUnsubscribe attribute is set as True while acknowledging subscription, the subscription cannot be canceled by the terminal subscription user, but can only be canceled by the topic owner or the subscription owner via the Console or be deleted by calling the unsubscribe API via SDK.

   - If the AuthenticateOnUnsubscribe attribute is set as false (false is not the default value) while acknowledging subscription, you can unsubscribe bay calling unsubscribeURL in the received message json.
