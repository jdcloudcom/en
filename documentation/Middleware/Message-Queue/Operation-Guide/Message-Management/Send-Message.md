# Send Messages

## Prerequisites
- Topic and subscription relationships have been created, and the state is in service.

## Considerations
- For a single topic, the maximum number of transactions per second is 5000TPS.
- The life cycle of the message is 3 days.
- The message size is 256KB.

## Procedure
### 1. In topic list, select **Send Message** button in the row of sending message topic.

![发送消息步骤1](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/发送消息-01.png)
### 2. Complete filling in the content of sending message, and click **Send** button.

![发送消息步骤2](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/发送消息-02.png)  


I. Enter Message Body and tag, and if you want to send the delay message, you can set the message delay time.  
II. When the message is sent successfully, it returns the Message Sending Success Notice and Message ID, which can be viewed by clicking **Message Details**.  
III. Note:  

- Message life cycle is 3 days, message deletion beyond life cycle cannot be restored, and Message Body supports is up to 256 Kb.
- The delay time of messages is 0~3600 seconds.
- Subscriber tag rules specify that a tag is a message subscriber's filter for a message. When a subscriber sets a tag, the subscriber consumes messages with the same tag. If no tag is set, the subscriber does not filter the message.
