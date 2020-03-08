## Message Queue

The servicecode for the product monitoring data is jcq and indicator data are provided from two dimensions, i.e., Topic and ConsumerGroup.

### Topic

metric | Chinese Name  | English Name |Unit | Description
---|--- |--- |--- |---
mq.topic.messages.tps | 生产的tps  | Produced TPS  |Entries/Second | 
mq.topic.messages.numbers | 已发布消息的数量 | Published Messages |Entries | 
mq.topic.messages.request | 已发布消息的请求量 | Published Message Requests |Times|
mq.topic.messages.size | 已发布消息的大小 | Published Message Size  | Bytes | 


### ConsumerGroup 
When indicator data of a specific ConsumerGroup is getting, a specific consumer group shall be designed for cid in tags.

metric | Chinese Name  | English Name |Unit | Description
---|--- |--- |--- |---
mq.cid.messages.tps | 消费的tps | Consumed TPS |  Entries/Second |
mq.cid.messages.numbers.heap | 堆积消息数量 | Buildup Messages | Entries | 
mq.cid.messages.numbers.success|接收消息数量-成功|Succed Received Messages|Entries | 
mq.cid.messages.numbers.total|接收消息数量-总计|Received Messages | Entries | 
mq.cid.messages.request | 接收消息请求量 |Received Message Requests|Times| 
mq.cid.messages.size | 接收消息大小 |Received Message Size | Bytes | 
