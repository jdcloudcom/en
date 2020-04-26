## Message Queue RabbitMQ Version
The servicecode for getting the product monitoring data is rabbitmq and indicator data are provided from the dimensions of instance, node and queue. Details are as follows:

### Instance
metric | 中文名称  | English Name |Unit | Description
---|--- |--- |--- |--- 
abbitmq.instance.connections.number|实例连接数|Instance Connections|Nr.|
rabbitmq.instance.channels.number|实例通道数|Instance Channels|Nr.|
rabbitmq.instance.queues.number|实例队列数|Instance Queues|Nr.|
rabbitmq.instance.consumers.number|实例消费者数|InstanceConsumers|Nr.| 
rabbitmq.instance.messages.ready|实例可消费消息数|Instance Messages Ready|Piece|
rabbitmq.instance.messages.unacknowledged|实例未确认消息数|Instance Messages Unacknowledged|Piece|
rabbitmq.instance.message.production.rate|实例消息生产速率|Instance Message Production Rate|Piece|
rabbitmq.instance.messages.ack.rate | 实例消息确认速率|Instance Message Ack Rate|Piece|


### Node
When monitoring data are getting, key in tags shall be designated as brokerId and specific node ID shall be designated for value of tags. Monitoring indicators provided are as follows:

metric | 中文名称  | English Name |Unit | Description
---|--- |--- |--- |--- 
rabbitmq.node.free.disk|节点可用存储空间|Node Free Disk|GB|
rabbitmq.node.file.descriptors.number|节点使用文件句柄数|Node  File Descriptors|Nr.|
rabbitmq.node.memory.used|节点内存占用|Node Memory Used|MB|
rabbitmq.node.erlang.processes.number|节点Erlang进程数|Node Erlang Processes|Nr.|
rabbitmq.node.socket.descriptors.number|节点使用Socket连接数|Node Socket Descriptors|Nr.|


### Queue
When the monitoring data are getting, key in tags shall be designated as queueName, specific queue name shall be designated for value of tags, and the provided indicators are as follows:

metric | 中文名称  | English Name |Unit | Description
---|--- |--- |--- |--- 
rabbitmq.queue.messages.unacknowledged|队列未确认消息数|Queue Messages Unacknowledged|Piece|
rabbitmq.queue.messages.ready|队列可消费消息数|Queue Messages Ready|Piece|
