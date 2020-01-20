# Create subject

Click the **Create Topic** button on the Notification Service Console and enter the topic creation page.

![创建](../../../../../image/Internet-Middleware/Notification-Service/创建主题1.png)

1. region option: Three regions, "cn-north-1, cn-east-2 and cn-south-1", are available for selection.

![创建](../../../../../image/Internet-Middleware/Notification-Service/创建主题2.png)

2. The created topic name cannot be modified.

   - The topic name shall be uppercase and lowercase sensitive. It can only contain letters, numbers, hyphens (-), underlines (_) or addition operator (+), with the maximum length of 256 characters

3. Name for display: The maximum length contains 256 characters. When the email message is pushing, the display name has been set, the sender is the "Display Name<example@example.com>". Otherwise, send is "<example@example.com>".

4. The topic transmission retry policy (HTTP/S) is the transmission retry policy set by the topic for all of its HTTP/S subscriptions, with the default setting. If you do not have any special demands, please remain the default setting unchanged. For details, please refer to [Message Transmission Retry Policy](../Message-Management/Reties-Policies.md).

   Description:

   1. Maximum 100 retry times are available.
   2. The sum of minimum delay retry, maximum delay retry and immediate retry shall be less than or equal to the retry number.
   3. The minimum delay time shall be less than or equal to the maximum delay time.
