# Create Queue

In the Queue Service, messages are sent and received through a point-to-point Queue, therefore, the user is required to create the Queue in the Queue Service first before sending messages to a certain specified Queue, and the consumer can consume messages in the Queue through the Pull pattern.

## Preconditions

- JD Cloud account has been registered and real-name verification has been completed. It shall be ensured that the account is in a normal status, and not in the blacklist. If you have no accounts, please [register]((https://accounts.jdcloud.com/p/regPage?source=jdcloud%26ReturnUrl=%2f%2fuc.jdcloud.com%2fpassport%2fcomplete%3freturnUrl%3dhttp%3A%2F%2Fuc.jdcloud.com%2Fredirect%2FloginRouter%3FreturnUrl%3Dhttps%253A%252F%252Fwww.jdcloud.com%252Fhelp%252Fdetail%252F734%252FisCatalog%252F1), or make [Real-name Verification](https://uc.jdcloud.com/account/certify).
- Because the Billing Type of the product is Pay By Consumption, please confirm that your account cannot be in arrears.

## Note

- Where you begin to use the queue service provided by JD Cloud, which means that you agree to [Service Level Agreement](https://docs.jdcloud.com/en/product-service-agreement/queue-service-terms-of-service) of the service and [Billing Standard](../Pricing/Price-Overview.md).
- There is no limit to the queue number and service created by a user, create them according to your business needs.

## Step I: Create Queue

1. Enter JD Cloud Console, Menu Middleware - Queue Service.

2. First select the region where you want to create the resource (such as cn-north-1), click **Create** to create the queue.

   ![新建](../../../../image/Internet-Middleware/Queue-Service/入门指南-01.png)

3. It is required to fill in “Queue Name” in the created queue, select the queue type, and fill in the queue properties and dead letter queue configuration according to their own needs, then click **Create Queue** to complete creation.

   ![新建队列](../../../../image/Internet-Middleware/Queue-Service/入门指南-02.png)

   ### Description:

   1. The name of FIFO Queue needs to be ended with the “.fifo” suffix.
   2. The dead letter queue is the isolation queue after message receiving failure, that's, messages in the source queue will be sent to the dead letter queue after exceeding the maximum set number of receiving times; these messages can be isolated in the dead letter queue to determine the cause of their processing failure, and normal consumption of the source queue will not be affected. The dead letter queue of the standard queue must be the standard queue, the dead letter queue of the FIFO queue must be the FIFO queue.



## Step II: Create AccessKey and SecretKey

When calling SDK of Queue Service to send and receive messages or perform management operations, the user’s identity information needs to be verified, that's, AccessKey and SecretKey need to be created in the Console.

### Creation Mode:

Apply for AccessKey and SecretKey Key Pair (AK/SK for short) in the [AccessKey Management Page](https://uc.jdcloud.com/account/accesskey) in the Account Management of JD Cloud User Center.
Please properly keep your AK/SK information. If lost, your cloud resources may be operated by illegal users with this information, and you may suffer data and property loss. The AK/SK Key Pair is allowed to be enabled and disabled. It can be used to call OpenAPI after it is enabled, and cannot be used to call OpenAPI after it is disabled.
