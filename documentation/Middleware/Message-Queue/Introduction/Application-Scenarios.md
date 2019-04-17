# Application Scenarios

This describes the application scenarios of MQ.

## System Decoupling
In the complicated multi-business system of an enterprise, many business processes don’t strongly depend on the core process, and can be placed in the JCQ for JCQ consumers to consume by need, without influencing the core primary process.</br>
Scenario: E-commerce scenario</br>
After the upstream business transaction system is completed, store the messages in the message queue, and the business system logistics, shopping cart, scores of the downstream will consume in the message queue, isolated from each other and processed in parallel, which ensures the final consistency between the distributed systems.

![System Decoupling](https://github.com/jdcloudcom/en/blob/translationUse/image/Internet-Middleware/Message-Queue/01.png)

## Peak Load Shifting
In case of a difference between the upstream and downstream system processing capacity, JCQ will be used as the data buffer to control the information traffic. Consumption will proceed when the downstream system is capable of processing, so as to avoid invalid request and no service capacity.</br>
Scenario: SecKil</br>
When the user is seckilling on the page, the frontend page respond immediately, a request is sent to Message Queue, the order or confirmation will be later fed back to the user, and the customer may close the webpage and carry out other activities.

![Peak Load Shifting](https://github.com/jdcloudcom/en/blob/translationUse/image/Internet-Middleware/Message-Queue/02.png)

## Broadcast
The producer has no need to care about the downstream consumer who subscribes the message. The many-to-many broadcasting mode is adopted, and consumption messages may be sent and received simultaneously.</br>
Scenario 1: Task Allocation
For distributed processing framework, use MQ to complete task allocation scheduling and the implementation of task processing.
Scenario 2: Configuration Center Update</br>
The configuration center updates the configuration files, and sends the message on configuration update to  Message Queue. Other servers regularly obtain the contents in  Message Queue, and will go to the configuration center for update after they find that the configuration is updated.

![Broadcast](https://github.com/jdcloudcom/en/blob/translationUse/image/Internet-Middleware/Message-Queue/03.png)

## Reliable Message Delivery
The receiver may not accept the requests from upstream systems for various reasons, such as network, power failure or high load. Synchronous writing and triple copy backup of MQ can store requests to ensure reliable transmission of messages and ensure the reliability of information.
Scenario: Transfer of funds</br>
When a mass of transactions occur, the actual transaction system may not change the account values yet, but the transaction operation records will be saved for a long time until they are successfully completed.


![Reliable Message Delivery](https://github.com/jdcloudcom/en/blob/translationUse/image/Internet-Middleware/Message-Queue/04.png)
