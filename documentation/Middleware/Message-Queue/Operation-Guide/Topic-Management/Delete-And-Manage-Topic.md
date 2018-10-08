# Delete and Manage Topic

## Considerations
- For topic owners, they have topic management authority and delete authority.
- For an authorized topic, the authorized user only has the right to delete, but not really delete the topic, just delete the authorization.

## Procedure
### 1. In topic list of the "Topic Management" page, choose **More** in the topic located row that ready to delete and choose **Delete**.
![删除和管理步骤1](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/删除暂停-01.png)
Pop up prompt box, click **Delete**, when the topic is deleted, the Message Queue will no longer push messages, immediately stop the service, and data cannot be restored.  
### 2. In the topic list of "Topic Management" page, choose **More** in the topic located row that need to operate, you can select **Send Pause**, **Receive Pause** or **All Pause**.
![删除和管理步骤2](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/删除暂停-02.png)
Pop up the prompt box to confirm the required operation.
### 3. You can reset the consumer offset in the "Subscription Management" page.
![删除和管理步骤3](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/删除暂停-03.png)
Select **Reset Consumer Offset** of the relationship of resetting consumer offset.
![删除和管理步骤4](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/删除暂停-04.png)

- You can select **Clear all cumulative messages**, and all unconsumed cumulative messages will be skipped and start to consume the message from the latest next message.
- You can select **Reset consumer offset by time**, choose to reset consumer offset at any time in the message life cycle, and change consumption progress.
