# Create Resource
In Message Queue, the production and consumption of messages need to be in the form of topic subscription, so the user first needs to create a message topic, sends the message to a specified message topic, and the consumer consumes the message by subscribing to the consumer body.

## Prerequisites
- You have created a JD Cloud account and finished real-name verification. Your account is usable and doesn't exist in the black list. If you don't have an account, please [Register](https://accounts.jdcloud.com/p/regPage?source=jdcloud&ReturnUrl=%2f%2fuc.jdcloud.com%2fpassport%2fcomplete%3freturnUrl%3dhttp%3A%2F%2Fuc.jdcloud.com%2Fredirect%2FloginRouter%3FreturnUrl%3Dhttps%253A%252F%252Fwww.jdcloud.com%252Fhelp%252Fdetail%252F734%252FisCatalog%252F1), and [verify real-name](https://uc.jdcloud.com/account/certify)。
- Because the Billing Type of the product is charged by amount, please confirm that your account cannot be overdue.

## Considerations
- During public beta, the user can create at most 5 topics.
- There is no limit to the number of Consumer Group subscriptions for a topic.

## Step 1: Create Consumption Topic

1. Sign in to the JD Cloud console, the menu is "Middleware > Message Queue > Topic Management".
2. Choose the region of creating resources, and then click Create button to create topic.
3. You need to fill in Topic Name, Message Type and Remarks during creating topic.

### Note:

1. The Topic Name must be globally unique, if a name already exists; you are not able to create a Topic Name any more. The topic only contains letters, numbers, hyphens (-), underscores (_), waveforms (~) or sign (+), and the length is 3~64 characters.
2. The message type includes unordered messages and global ordered messages.

- Unordered messages: Cannot guarantee first in first out (FIFO) ordered consumption, including general messages and delayed messages.
- Global ordered messages: The production and consumption of messages are carried out according to the publishing order of messages (FIFO).

## Step 2: Add Subscription

1. In "Topic Management" page, find the topic you want to subscribe, and you can subscribe in the operations.
2. To add a subscriber, you need to create / bind an existing Consumer Group ID, select the transport type, and add a tag.

### Note:

1. The Consumer Group ID must be globally unique. If a name already exists, you are not able to create a Consumer Group ID with that name any more. The Consumer Group ID only contains letters, numbers, hyphens (-), underscores (_), and the length is 7~64 characters.
2. The relationship between Consumer Group ID and topic is N:M; that is the same Consumer Group ID can subscribe multiple topics, and the same topic can be bound with multiple Consumer Group ID.
3. Choose the message type to send, including SDK method and HTTP method.
4. Subscriber tag rules: tag is a message subscriber for message filtering, when the subscriber sets the tag, the same tag message can be consumed by the subscriber, if not set the tag, the subscriber does not filter the message. A single subscriber can add up to five tags, a single tag is a string of no more than 64 characters, separated by a ',' sign.
- For message 1, does not have message tag, the subscriber has tag, then the subscriber does not match and receives no news.
- For message 2, the message has a tag, the subscriber does not have a tag, the message does not need to match when delivered, and all the subscribers can receive the message.
- For message 3, when the message and the subscriber both have a tag, the two matches, and can receive the message.
- For Message 4, the message does not have a tag; the subscriber does not have a tag either. After delivery, all subscribers can receive the message.

## Step 3: Create AccessKey and SecretKey
When calling the SDK or openAPI of Message Queue to send, consume, and manage messages, you need to verify the user’s identity information, that is, you need to create AccessKey and SecretKey in the console.
### Create method:
Apply for AccessKey and SecretKey key pairs (AK/SK for short) on AccessKey management pages under account management of JD Cloud User Center.
AK / SK information should be kept properly, if lost, it may lead illegal users to use this information to manipulate your resources in the cloud, cause your data and property losses. AK / SK key pairs are allowed to be enabled, disabled, and can be used to call the OpenAPI when enabled, but cannot be used to call the OpenAPI when disabled.
