# Restrictions
- Relevant Restrictions on Queues

| Restricted Items       | Restricted Rules                                                     | Adjustment Method                                                     |
| ------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| Standard Queue     | There is no cap set for TPS                                              | -                                                            |
| FIFO Queue     | TPS has a cap of 300 and supports up to 3,000 messages per second with batch requests. | -                                                            |
| Number of Visible Messages | There is no quantitative limit on the number of visible message. | -                                                            |
| Number of Invisible Messages | 1. For the standard queue, the maximum number of invisible messages is 120,000; if this limit is reached, an error message OverLimit will be returned by the Queue Service. <br/>2. For the FIFO Queue, the maximum number of invisible messages is 20,000; if this limit is reached, an error message OverLimit will be returned by the Queue Service. | To avoid reaching this limit, it shall be deleted from the queue after the message is processed. In addition, the number of queues used to process the messages can be increased to break the limit for a single queue. |
| Latency Setting     | 1. Set a latency time on the queue, which will take effect for all messages in the queue. The setting of the message latency will replace the value of the latency queue of Queue Service. <br/>2. For the standard queue, the change of queue latency setting will not affect the latency of existing messages in the queue. <br/>3. For the FIFO Queue, the change of queue latency setting will affect the latency of existing messages in the queue. The FIFO Queue does not support latency setting on a single message. | -                                                            |
| Visibility Time-out   | Change of the visibility time-out period of a queue on the queue will not affect the visibility time-out period of invisible messages, but will affect the visibility time-out period of the visible messages in the queue. | -                                                            |
| Dead Letter Queue     | 1. The dead letter queue of the standard queue must be the standard queue, the dead letter queue of the FIFO queue must be a FIFO queue. <br/>2. Multiple queues can target a dead letter queue. You must use the same account in the same region to create a dead letter queue and the source queue to send messages to the dead letter queue. <br/>3. The life cycle of a message is always based on its original queue time stamp. The time stamp remains the same when the message moves to the dead letter queue. I.e., the starting point of the message's life cycle is calculated from the source queue; if the message spent 1 day in the source queue before it is sent to the dead letter queue, and the message life cycle of the dead letter queue is 4 days, the message will expire and be deleted in the dead letter queue after 3 days. | -                                                            |



- Relevant Restrictions on Messages

| Restricted Items             | Restricted Rules                                                     | Adjustment Methods |
| ------------------ | ------------------------------------------------------------ | -------- |
| Message Attribute           | A message can contain up to 10 message attributes.                         | -        |
| Message Batch Processing | It can contain up to 10 messages in a message batch processing request.                       | -        |
| Message Life Cycle       | By default, a message can be retained for 4 days; the unit is second, with a minimum value of 60 seconds, and a maximum value of 1,209,600 seconds (14 days). |          |
| Message Maximum Length       | It is 256 KB by default; the size of the minimum message is 1 byte and the size of the maximum message is 262,144 bytes (256 KB). |          |
| Message Group           | The Queue Service will process messages with the same message group ID mark in a FIFO manner (but messages in different message groups may be unordered). |          |
| Message Duplicated Data Deletion ID | 1. Each FIFO message must have a message duplicated data deletion ID, which is a token used to delete the duplicated messages. If a message with a specific message duplicated data deletion ID is successfully sent, within the 5-minute duplicated data deletion interval, any message with the same message duplicated data deletion ID will be received but will not be delivered. It will not be detected as a duplicated message by the service beyond the 5-minute duplicated data deletion interval. <br/>2. If the user’s FIFO queue enables the deduplication based on message content, the Queue Service will use the message main text to generate the message duplicated data deletion ID through SHA-256 Hash. If the user specifies a message duplicated data deletion ID at the same time, it will replace the one automatically generated. <br/>3. If the user’s FIFO queue **does not** enable the deduplication based on message content, the user must specify a message duplicated data deletion ID, or the operation will fail and it will show as error. |          |



