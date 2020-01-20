# Features

## Release and Subscribe

### Terminal Subscribe

Provide message push functions at multi-terminal nodes, including HTTP/S, SMS, Email, Queue Service and Function Service, and realize one-to-many message broadcast.

### Subscribe Acknowledgement

Provide subscribe terminal acknowledgement mechanism to ensure the experience of users and information security of terminal node users and avoid harassment information and wasting of resources.

## Message Notification

### Message Content

Two message sending modes, plain and json, are provided, which can realize the message content at different terminals are separately set to meet the personalized needs of different business at different terminal.

### Message Push Retry

Push retries are made for all types of message notification terminals, so as to ensure the delivery of message notifications as much as possible, and customized message retry policies are provided for HTTP/S.

### Message Filtering

Rich message filtering policies are provided so that topic subscribers can receive the required message notifications instead of receiving every message published to that topic.

### Dead Letter Queue (Under Research and Development)

To avoid losing messages that are pushed again but fail to be transmitted, Notification Service provides a dead letter queue, which allows users keep the messages that fail to be successfully transmitted to the dead letter queue for further analysis and processing.

## Security Protection

### Data Encryption (Under Research and Development)

The hosted key service KMS is used to encrypt and store user data on the server side to ensure the security of user data and prevent information leakage

### Permission Control

Specify the permission control of the resource API level to help users separate permissions and share usage.

### Monitoring Warning

Provide functions such as multi-dimensional monitoring for the running status and performance of resources, stability maintenance and so on. It also provides early warning notification to reduce daily maintenance workload.
