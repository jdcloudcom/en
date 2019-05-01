# Features

## Message Type

### Standard Queue

Theoretically unlimited TPS caps, best effort message sequencing and at least one message delivery

### FIFO Queue

Ensure that the message is delivered in the same order as the message is sent and the one-time processing is accurate

## Flexible Configuration

### Dynamically Configurable

Queue attributes such as message life cycle, message visibility time-out period, message maximum length, and delivery delay can be configured and changed at any time according to business needs

### Dead Letter Queue

One-click setting the dead letter queue helps the user to process messages failing to be pulled successfully that exceed the maximum number of receptions, facilitating the user's business to continue uninterrupted, and isolating the problem message for the user to analyze the cause



## Queue Function

### Message Receiving and Sending

The received message can be sent single or in batch (up to 10). The size of a single request is limited to 256 KB. The FIFO queue can be deduplicated according to the content of the message

### Long Round Robin

When a pull message request is sent to the queue but the queue is empty, the long round robin request waits for up to 20 seconds for the next message, allowing the user to pull the message and reduce the number of round robins to reduce the cost



## Security Protection

### Data Encryption

The Queue Service uses the hosted key service KMS to encrypt and store user data on the server side to ensure the security of user data and prevent information leakage

### Permission Control

Specify the permission control of the resource API level to help users separate permissions and share usage

### Monitoring Warning

Provide functions such as multi-dimensional monitoring for the running status and performance of resources, stability maintenance and so on. It also provides early warning notification to reduce daily maintenance workload
