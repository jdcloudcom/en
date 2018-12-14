# Creating Initialization

##  1. Key Creation
When calling the Message Queue JCQ SDK or openAPI to perform the sending consumption and management operations of message, the user's identity information needs to be verified to check the validity of the user identity, that is, AccessKey and SecretKey need to be created in the console or the created Key needs to be used.

### Creation Mode:
Apply for AccessKey and SecretKey Key (AK/SK for short) in the [AccessKey Management Page](https://uc.jdcloud.com/account/accesskey) in the Account Management of JD Cloud User Center. Please appropriately keep your AK/SK information. If lost, your cloud resources may be operated by illegal users with this information, and you may suffer data and property loss. The AK/SK Key is allowed to be enabled and disabled. It can be used to call OpenAPI after it is enabled, and cannot be used to call OpenAPI after it is disabled.

## 2. Resource Creation

Please create the topic and consumerGroup in the console or by calling OpenAPI to acquire the Topic and ConsumerGroup ID, and acquire the access point of the created topic.

Methods of Acquiring Access Point in the Console:

1. Find the topic you want to acquire the access point and click "Acquire Access Point" in the operation bar.
![获取接入点1](https://github.com/jdcloudcom/cn/blob/MessageQueue/image/Internet-Middleware/Message-Queue/获取接入点1.png)
2. Click Copy to acquire the topic access points of different modes.
![获取接入点2](https://github.com/jdcloudcom/cn/blob/MessageQueue/image/Internet-Middleware/Message-Queue/获取接入点2.png)

After the above resources are created, they can be initialized in the program.

```java
/**
 * User accessKey
 */
private static final String ACCESS_KEY = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0";
/**
 * User secretKey
 */
private static final String SECRET_KEY = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB0";
/**
 * Metadata Server Address (Access Point Address)
 */
private static final String META_SERVER_ADDRESS = "127.0.0.1:18888";
/**
 * topic Name
 */
private static final String TOPIC = "testTopic";
/**
 * Consumer Group Id
 */
private static final String CONSUMER_GROUP_ID = "testConsumerGroup";
```
