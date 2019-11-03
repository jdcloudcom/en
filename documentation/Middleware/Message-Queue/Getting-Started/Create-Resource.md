# Create Resource
In Message Queue, the production and consumption of messages need to be in the form of topic subscription, so the user first needs to create a message topic, sends the message to a specified message topic, and the consumer consumes the message by subscribing to the consumer body.

## Prerequisites
- You have created a JD Cloud account and finished real-name verification. Your account is usable and doesn't exist in the black list. If you don't have an account, please [Register](https://user.jdcloud.com/register), and [verify real-name](https://uc.jdcloud.com/account/certify).
- Because the Billing Type of the product is charged by amount, please confirm that your account cannot be overdue.

## Considerations
- By default, users can only create up to 10 topics in one region. If necessary, they can increase the number by opening ticket.
- There is no limit to the number of Consumer Group subscriptions for a topic.

## Step 1: Create Consumption Topic

1. Sign in to the JD Cloud console, the menu is "Middleware > Message Queue > Topic Management".
2. Choose the region of creating resources, and then click Create button to create topic.
3. You need to fill in Topic Name, Message Type and Remarks during creating topic.

### Note:

1. The Topic Name must be globally unique, if a name already exists; you are not able to create a Topic Name any more. The topic only contains letters, numbers, hyphens (-), underscores (_), waveforms (~) or sign (+), and the length is 3-64 characters.
2. The message type consists of common message and global sequential message.

- Common message: Cannot guarantee first in first out (FIFO) ordered consumption, including general messages and delayed messages.
- Global ordered messages: The production and consumption of messages are carried out according to the publishing order of messages (FIFO).

## Step 2: Add Subscription

1. In "Topic Management" page, find the topic you want to subscribe, and you can subscribe in the operations.
2. To add a subscriber, you need to create / bind an existing Consumer Group ID, select the transport type, and add a tag.
3. Fill in parameters such as extract message hidden duration, dead letter queue setting and maximum reception times, which can remain as the default configuration if no special needs.

### Note:

1. The Consumer Group ID must be globally unique. If a name already exists, you are not able to create a Consumer Group ID with that name any more. The Consumer Group ID only contains letters, numbers, hyphens (-), underscores (_), and the length is 7~64 characters.
2. The relationship between Consumer Group ID and topic is N:M; that is the same Consumer Group ID can subscribe multiple topics, and the same topic can be bound with multiple Consumer Group ID.
3. Extract message hidden duration is the length of time that messages received are not visible to other consumers, range: 30 seconds - 600 seconds.
4. Parameter of dead letter queue setting decides whether to enable dead letter queue of topic.
5. Maximum reception times are the maximum times that allow receiving this message before it is sent to the dead letter queue, range: 0-16 times.

## Step 3: Create AccessKey and SecretKey
When calling the SDK or openAPI of Message Queue to send, consume, and manage messages, you need to verify the user’s identity information, that is, you need to create AccessKey and SecretKey in the console.
### Create method:
Apply for AccessKey and SecretKey key pairs (AK/SK for short) on [AccessKey management pages](https://uc.jdcloud.com/account/accesskey) under account management of JD Cloud User Center.
AK / SK information should be kept properly, if lost, it may lead illegal users to use this information to manipulate your resources in the cloud, cause your data and property losses. AK / SK key pairs are allowed to be enabled, disabled, and can be used to call the OpenAPI when enabled, but cannot be used to call the OpenAPI when disabled.
