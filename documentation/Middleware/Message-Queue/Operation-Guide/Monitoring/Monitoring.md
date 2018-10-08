# View Monitoring Information

The Message Queue console provides rich performance monitoring data; you can always view the running status of subscription relationships.

## Procedure
1. Sign in to [the Message Queue console](https://jcq-console.jdcloud.com/topics).
2. On the Topic Management page, choose the related topic, click **topic name**, and enter the Topic Details page.
3. On "Topic Details" page, click **Monitoring**, and view the monitoring information.



   - You can quickly choose to view data of an hour to 14 days, or you can enter a date range to view data for up to one month.
   - Support for checking the monitoring information of a Consumer Group under Topic and topic.
   
   
![监控3](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/监控-03.png)
![监控4](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/监控-04.png)

## Description of Monitoring Items
| Type	| KPI	| Description
--- | --- | ---
| Topic	| Produced TPS (/second) |	Number of messages produced per second |
| Topic |	Number of published messages	| The number of messages sent by a producer to a topic |
| Topic	| The number of API requests that have been published (Times)	| Number of requests that producers sending messages to topic |
| Topic	| The size of the published message (byte)	| The message size of topic that producers send messages to topic. |
| Consumer Group| Consumed TPS (/sec) |	Number of messages that consumed per second |
| Consumer Group| Number of accumulated messages	| The number of messages that are not consumed in the relationship of subscription. |
| Consumer Group| The request quantity of receiving message (times)| The number of requests that received by consumers in the relationship of subscription. |
| Consumer Group| The number of messages received| The number of messages that received by consumers in the relationship of subscription. |
| Consumer Group| The number of messages that received successfully |	The number of messages that consumers successfully received messages in the relationship of subscription. |
| Consumer Group| The size of received messages (byte)| Message size of consumers’ receiving messages in the relationship of subscription. |
