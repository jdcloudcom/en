# Message Category
Both Topic and Tag can be used for distinguishing messages and be used as different identifiers of business messages.

## Message Classification Based on Topic

Topic: Generally, Topic is used for distinguishing messages of different businesses and has the message isolation function. Namely, once subscribing TopicA, the subscriber will not receive message of TopicB.

It is allowed by the Message Queue that messages can be sent to different Topics by the producer. The consumer can consume messages in the Topic and classify the messages by subscribing different Topics.

## Message Classification Based on Tag under the Same Topic

Tag: Generally, Tag is used for further classifying messages under a Topic. The messages in the same Topic do not have the message isolation function and the consumer only can screen such message. If no tags are set, the consumer can obtain full messages in the Topic.

It is allowed by the Message Queue that the message can be filtered by setting Tags for messages and consumers, insuring that finally only the messages desired by the consumer are consumed.

- It is allowed by the Message Queue that when the producer sends the message, Tag is set to the message. Messages with or without Tags will be equally treated and delivered to the JCQ message system.

- When subscribing Topic, the consumer can select to filter messages with Tag or not. If the subscription with Tag is made, then only the messages the same Tag can be received and other messages will be discarded; otherwise, all messages will be received,


#### Consumption Consistent

For the Pub/Sub mode adopted in the Message Queue, if the consumer intends to consume the messages, the consumer needs to subscribe a Topic by using ConsumerGroup via the subscription method. To improve consumption efficiency, it is allowed to consumer several Consumers under ConsumerGroup. Due to the relationship of model, to avoid message loss, Tags set by all Consumers under ConsumerGroup shall remain the same, so as to ensure that the consumption behaviors of different Consumers in the same ConsumerGroup under the same subscription are the same.

Consistent consumption remained is as follows:

- Tags set by all Consumers under the same ConsumerGroup shall be the same

For relevant codes, please go to [SDK Reference](https://docs.jdcloud.com/en/message-queue/produce-standard-message).


## Select Topic or Tag

For message classification, the user can select to create several Topics or create several Tags under the same Topic. However, consideration can be made from the following aspects:

1. Message isolation: If the message has the data isolation requirement, please distinguish the message with Topic, because Tag is unable to absolutely isolate data.
2. Message type: If the types of messages to be sent are different, such as the common message and the global sequential message, such messages shall be distinguished with Topic.
3. Message volume: If the volumes of different messages vary a log, to guarantee the timeliness of the message with low receiving volume, it is suggested that the message shall be distinguished with Topic.
4. Business association: It is suggested that different business messages shall be distinguished with Topic, while different types under the same business shall be distinguished with Tag.





