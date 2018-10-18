# Application Scenarios

This describes the application scenarios of MQ.

## System Decoupling
In non-strongly coupled multi-system, many business processes are not strongly dependent on the core process, and can be placed in the MQ for message consumers to consume on demand, without affecting the core mainstream process.
Scenario: E-commerce scenario</br>
After the upstream business transaction system is completed, store the messages in the message queue, and the business system logistics, shopping cart, scores of the downstream will consume in the message queue, isolated from each other and processed in parallel, which ensures the final consistency between the distributed systems.

![System Decoupling](https://github.com/jdcloudcom/en/blob/translationUse/image/Internet-Middleware/Message-Queue/01.png)

## Peak Load Shifting
When there is a gap between the upstream and downstream systems, the MQ is used as a buffer to control the flow of information, and then consume when the downstream system has the ability to process, to avoid invalid requests and no service capability.
Scenario: SecKil</br>
Users’ second kill on the page, the front page responds immediately, the order or confirmation will feed back to the user later; the customer can close the page for other activities.

![Peak Load Shifting](https://github.com/jdcloudcom/en/blob/translationUse/image/Internet-Middleware/Message-Queue/02.png)

## Broadcast
Producers only care about the messages whether are delivered to the queue, do not care about who subscribes the messages, and multiple parts of the system can send or consume messages at the same time.
Scenario 1: Task Allocation
For distributed processing framework, use MQ to complete task allocation scheduling and the implementation of task processing.
Scenario 2: Update the configuration of ConfigService</br>
ConfigService makes configuration updates and sends the existing updates to Topic. Other servers regularly retrieve the contents of Topic and discover configuration updates to update configuration information in ConfigService.

![Broadcast](https://github.com/jdcloudcom/en/blob/translationUse/image/Internet-Middleware/Message-Queue/03.png)

## Reliable Message Delivery
The receiver may not accept the requests from upstream systems for various reasons, such as network, power failure or high load. Synchronous writing and triple copy backup of MQ can store requests to ensure reliable transmission of messages and ensure the reliability of information.
Scenario: Transfer of funds</br>
When a large number of transactions occur, the real trading system may not have changed the value of the account, but trading operations are persisted stored until successful completion.

![Reliable Message Delivery](https://github.com/jdcloudcom/en/blob/translationUse/image/Internet-Middleware/Message-Queue/04.png.png)
