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

2. Enter Message Body, Business ID and tag and you can set the message latency time if you want to send latency messages.

3. If the message is sent successfully, the Message Sending Success Notice and Message ID will be returned. Click on the message details to view.

### Note:

1. The lifecycle of the message is 3 days, you cannot resume the message when exceed the lifecycle, the maximum of Message Body supports 256Kb.

2. The delay time of messages is 0~3600 seconds.

3. Subscriber tag rule description: tag is a message filter used by message consumers. When a consumer sets a tag, only messages with the same tag can be consumed by the consumer. If no tag is set, the consumer cannot filter the messages.

- For Message 1, if the message has no tag but a consumer has a tag, then this consumer does not match and will not receive any message;

- For Message 2, if the message has a tag but a consumer has no tag, then the consumer can always receive messages without matching the messages in delivery;

- For Message 3, if both the message and the consumer have tags, the consumer can receive the message when both tags match with each other;

- For Message 4, if neither the message nor the consumer have tags, all consumers can receive the message after delivery.


## Method 2: Produce and Consume Messages by SDK/API

Take Java SDK as an example, other ways and development languages please refer to other chapters.

1. Introduce dependency
```XML
<dependency>
   <groupId>com.jdcloud</groupId>
   <artifactId>jcq-java-sdk</artifactId>
   <version>${jcq.sdk.version}</version>
</dependency>
```
2. For sending and subscription codes, please refer to the demo example:[jcq-sdk-demo.zip](http://jcq-inuse-important-cannotdelete.oss.cn-north-1.jcloudcs.com/jcq-sdk-demo.zip).

### Note:

1. The server pushes the message to the subscriber (receiver) and guarantees at least 1 attempt and at most 16 attempts. When an error occurs, the retry strategy is intervals of 5, 10, 20, 30, 40, 50, 60, 120, 180, 240, 300, 360, 420, 720, 1440, and 2880 seconds in turn.

2. After the server fails to push the message 16 times, the message will enter the dead letter queue. The lifetime of the dead-letter queue is 3 days, and the message cannot be restored and resent beyond the message lifecycle.

3. For integration of Message Queue under the Spring framework, please refer to the demo example:[jcq-spring-demo.zip](http://jcq-inuse-important-cannotdelete.oss.cn-north-1.jcloudcs.com/jcq-spring-demo.zip).

