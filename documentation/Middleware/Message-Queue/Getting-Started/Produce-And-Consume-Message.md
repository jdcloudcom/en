# Produce and Consumer Message
After creating message topic (topic) in the MQ console, you can send message through console, calling SDK or API.
The console does not support batch sending, which mainly used for verifying the availability of resources, the production links suggest using SDK or API to send messages.
    
After the message is sent successfully, it needs to consume the message according to the bound Consumer Group ID, and it needs to call the SDK / API.

## Prerequisites
- Topic and subscription relationships have been created, and the state is in service.

## Considerations
- For a single topic, the maximum number of transactions per second is 5000TPS.
- The life cycle of the message is 3 days.
- The message size is 256KB.

## Method 1: Produce message by console
1. In the Topic Management page, find the topic that you want to send the message, and you can choose to send the message during the operation.

2. Input Message Body and tag, and if you want to send the delay message, you can set the message delay time.

3. If the message is sent successfully, the Message Sending Success Notice and Message ID will be returned. Click on the message details to view.

### Note:

1. The lifecycle of the message is 3 days, you cannot resume the message when exceed the lifecycle, the maximum of Message Body supports 256Kb.

2. The delay time of messages is 0~3600 seconds.

3. Subscriber tag rules: tag is a message subscriber filters the messages, when the subscriber sets the tag, the subscriber can consume the same tag message, if you do not set the tag, and the subscriber does not filter the message. The single subscriber can add no more than 5 tags. A single tag is a string of no more than 64 characters, separated by a ','.

- For message 1, does not have message tag, the subscriber has tag, then the subscriber does not match and receives no news.

- For message 2, the message has a tag, the subscriber does not have a tag, the message does not need to match when delivered, and all the subscribers can receive the message.

- For message 3, when the message and the subscriber both have a tag, the two matches, and can receive the message.

- For Message 4, the message does not have a tag; the subscriber does not have a tag either. After delivery, all subscribers can receive the message.


## Method 2: Produce and Consume Messages by SDK/API

Take Java SDK as an example, other ways and development languages please refer to other chapters.

1. Introduce dependency
```
<dependency>
   <groupId>com.jdcloud</groupId>
   <artifactId>jcq-java-sdk</artifactId>
   <version>1.0.2</version>
</dependency>
```
2. For the sending code part, please refer to the demo sample: [jcq-sdk-demo.zip](http://jcq-inuse-important-cannotdelete.oss.cn-north-1.jcloudcs.com/jcq-sdk-demo.zip).

### Note:

1. The server pushes the message to the subscriber (receiver) and guarantees at least 1 attempt and at most 16 attempts. When an error occurs, the retry strategy is intervals of 5, 10, 20, 30, 40, 50, 60, 120, 180, 240, 300, 360, 420, 720, 1440, and 2880 seconds in turn.

2. After the server fails to push the message 16 times, the message will enter the dead letter queue. The lifetime of the dead-letter queue is 3 days, and the message cannot be restored and resent beyond the message lifecycle.

3. Integrates MQ under the Spring framework, please refer to the demo sample: [jcq-spring-demo.zip](jcq-spring-demo.zip](http://jcq-inuse-important-cannotdelete.oss.cn-north-1.jcloudcs.com/jcq-spring-demo.zip).

