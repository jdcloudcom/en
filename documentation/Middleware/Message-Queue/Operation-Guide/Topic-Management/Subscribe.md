# Subscribe Topic
## Prerequisites
- You have created the topics.

## Considerations
- There is no limit to the number of Consumer Group subscriptions for a topic.
- You can choose the existing Consumer Group, or you can choose to create a new Consumer Group.


## Procedure
### 1. In topic list, choose **Subscribe** button in the subscription topic row.

![订阅步骤1](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/订阅-01.png)

### 2. When you have entered the subscription information, click **Subscribe** button.

![订阅步骤2](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/订阅-02.png)  
I. The Consumer Group ID must be globally unique, if a name already exists; you are not able to create a Consumer Group ID any more. The Consumer Group ID only contains letters, numbers, hyphens (-), underscores (_), and the length is 7~64 characters.  
II. The relationship between Consumer Group ID and topic is N:M; that is the same Consumer Group ID can subscribe multiple topics, and the same topic can be bound with multiple Consumer Group ID.  
III. Choose the sending message type that includes SDK and HTTP two methods.  
IV. Subscriber tag rules: tag is a message subscriber filters the messages, when the subscriber set the tag, the subscriber can consume the same tag message, if you do not set the tag, the subscriber does not filter the message. A single tag is a string of no more than 64 characters, separated by a ','.

- For message 1, does not have message tag, the subscriber has tag, then the subscriber does not match and receives no news.
- For message 2, the message has a tag, the subscriber does not have a tag, the message does not need to match when delivered, and all the subscribers can receive the message.
- For message 3, when the message and the subscriber both have a tag, the two matches, and can receive the message.
- For Message 4, the message does not have a tag; the subscriber does not have a tag either. After delivery, all subscribers can receive the message.

### 3. You can view the subscription information in "Topic Detail > Subscription Management".

![订阅步骤3](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/订阅-03.png)
Click **Cancel Subscription** button to cancel the subscription operation.
