# : Create Resource

The Notification Service adopts the subscription messages release model, i.e., message release and reception shall be based on the carrier of topic and subscription. Therefore, Topics shall be created in the Notification Service by the user first, then the designated terminal address to which the Subscription is sent shall be created and finally messages are sent to the designated topic. The subscriber can receive message pug at the terminal node and consume the message.

## Preconditions

- JD Cloud account has been registered and real-name verification has been completed. It shall be ensured that the account is in a normal status, and not in the black list. If you do not have an account, please [Register](https://accounts.jdcloud.com/p/regPage?source=jdcloud&ReturnUrl=//uc.jdcloud.com/passport/complete?returnUrl=http://uc.jdcloud.com/redirect/loginRouter?returnUrl=https%3A%2F%2Fwww.jdcloud.com%2Fhelp%2Fdetail%2F734%2FisCatalog%2F1), and [Make Real-name Verification](https://uc.jdcloud.com/account/certify).
- Because the Billing Type of the product is Pay By Consumption, please confirm that your account cannot be in arrears.

## Notes

- Where you begin to use the Notification Service provided by JD Cloud, it means that you agree to [Service Level Agreement](https://docs.jdcloud.com/en/product-service-agreement/notification-service-terms-of-service) and [Billing Standard](https://docs.jdcloud.com/en/notification-service/price-overview).
- For service restriction to subject quantity created by user, please refer to: [Restrictions ](../Introduction/Restrictions.md)    

## Step 1: Create subject

1. Enter JD Cloud Console, Menu Middleware - Notification Service.
2. First select the region where you want to create the resource (such as cn-north-1) and click the **Create Subject** button to create a subject.

Figure

3. Please fill in the "Topic Name" [required] and display name [not required] in the created topic and then click **Create Topic** to finish creation.

   ### Description:

   1. The topic transmission retry policy (HTTP/S) is the transmission retry policy set by the topic for all of its HTTP/S subscriptions, with the default setting. If you do not have any special demands, please remain the default setting unchanged.

   2. If you need to retry any customized transmission, please refer to: [Message Transmission Retry Policy](../Operation-Guide/Message-Management/Reties-Policies.md) and make modification.

      

## Step 2: Create subscription

1. Select a topic to be subscribed from the topic list and click **Subscribe** in the operation bar.
2. First select a subscription type from the Creation Subscription, including "HTTP, HTTPS, JQS, SMS, Email and Function". Fill in the subscription terminal address information.
3. When the user subscription type is selected as "HTTP, HTTPS, Email and JQS", the parameter will be transmitted by the original message. Transmission of original message only covers the original message itself rather than the metadata in the JSON format of the Notification Service. You can make choice according to your demands. If you do not have any special demands, please adopt the default original parameter status.
4. After completion, click **Create Subscription**.
5. Subscription acknowledgement: After subscription is created, the subscription terminal node must acknowledge this subscription and this topic. Then, Notification Service will push messages to this terminal. For subscription types of HTTP and HTTPS, acknowledgement to Email and SMS shall be made. For subscription types of JQS and Function, no acknowledgement is required if the subscriber has JQS sending permission and Function sending permission (if the subscriber is a JQS queue and the Function owner, no acknowledgment is required). Subscribe acknowledgement method: Upon login corresponding subscription terminal, a subscription acknowledgement message will be received. Click the subscription URL to acknowledge the subscription. For details, please refer to: [Subscribe Acknowledgement](../Operation-Guide/Subscription-Management/Subscription-Confirm.md).

### Description:

1. The subscription filtering policy refers to filter polices for the subscribed messages to the extent that the topic subscriber can receive the desired messages rather than every messages released to the topic. If you have any demand, please refer to: [Subscription Filtering Policy](../Operation-Guide/Subscription-Management/Filtering-Policies.md) for edition.
2. If the subscription type is HTTP or HTTPS, you can modify the subscription transmission retry policy (HTTP/S). The policy is the important retry policy for subscription of HTTP and HTTPS. The default setting is set. If you do not have any special demands, please do not modify the default setting.
3. If you need to retry any customized transmission, please refer to: [Message Transmission Retry Policy](../Operation-Guide/Message-Management/Reties-Policies.md) and make modification.



## Step 3: Create AccessKey and SecretKey

If you have created them when applying other JD Cloud resources, please skip this step.

When calling SDK of Notification Service to release messages or manage operation, the user’s identity information needs to be verified, that is, AccessKey and SecretKey need to be created in the Console.

### Creation Mode:

Apply for AccessKey and SecretKey Key Pair (AK/SK for short) in the [AccessKey Management Page](https://uc.jdcloud.com/account/accesskey) in the Account Management of JD Cloud User Center. Please properly keep your AK/SK information. If lost, your cloud resources may be operated by illegal users with this information, and you may suffer data and property loss. The AK/SK Key Pair is allowed to be enabled and disabled. It can be used to call OpenAPI after it is enabled, and cannot be used to call OpenAPI after it is disabled.
