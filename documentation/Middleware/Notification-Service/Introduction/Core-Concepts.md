# Core Concepts

| **Terminology** | **Interpretation**                                                     |
| ------------ | ------------------------------------------------------------ |
| Topic         | Resources providing and releasing subscription of modes in Notification Service, with users allowed to release messages and subscribe topics. |
| Subscription         | After the subscription relation is created, the message subscription terminal will receive the message sent to the topic by the publisher. |
| Publisher       | Users allowed to send messages to the topic.                                   |
| Subscriber       | Users allowed to create subscription relation.                                     |
| Subscription Terminal     | Terminal nodes receiving topic messages. If the subscription terminal type is HTTP/S, then the subscription terminal is HTTP/S. If the subscription terminal type is SMS, the subscription terminal is the mobile phone number. If the subscription terminal type is Email, the subscription terminal is the email address. |
| Retry Policy     | When the Notification Service pushes messages sent by the user to the topic, retry will be made if the messages cannot be successfully sent during push try. Users can subscribe customized retry policy for the terminal of HTTP/S type. Transmission policies are set for subscription of other types. [For Details, Please View](../Operation-Guide/Message-Management/Reties-Policies.md). |
| Filtering Policy     | Via the filtering policy, the subscriber can get message notification which he/she is interested rather than get each message released to this topic. [For Details, Please View](../Operation-Guide/Subscription-Management/Filtering-Policies.md). |
| Original Message Transmission | After original message transmission is enabled by subscription, the push message shall not contain the metadata in JSON format of Notification Service and shall only contain the original message itself. |
