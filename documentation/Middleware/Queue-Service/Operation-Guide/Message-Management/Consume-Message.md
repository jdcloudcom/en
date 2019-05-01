# Receive Messages

1. Find the queue on which you want to receive the message on the Queue Management page, and select **Receive Message** in the operation to enter the message receiving interface.

2. Select the number of messages you want to receive and the waiting time for the queue round robin and click to start **Receive Messages”.

   Setting receiving parameter:

   ![接收参数](../../../../../image/Internet-Middleware/Queue-Service/操作指南-11.png)

   - Maximum Number Of Messages Received: It is the maximum number of messages that the queue round robin wants to receive. When such number is reached, it will stop the round robin of queue
   - Round Robin Time of Queue: It is the longest time for this round robin, whether or not it reaches the set number of accepted messages, it will stop the round robin of queue

3. You can click to stop **Receive Messages** at any time in the process of queue round robin, to stop the round robin of queue.

4. Select another queue to receive messages; select a queue from the drop-down list to receive messages from other queues.

   ![选择队列](../../../../../image/Internet-Middleware/Queue-Service/操作指南-12.png)

5. Delete messages: Check the check box in front of the message; you can choose to delete a single message or delete messages in batch, provided that the messages do not exceed the [Visibility Time-out Period](../../Introduction/Core-Concepts.md)(i.e. you still have the right to operate on this message). You can click the message ID to view the message details.
