## Deliver log data to Kafka

Support delivery of business application to cloud Kafka and the Kafka self-established by user.

**The cloud Kafka selected by user is required to be in the same VPC network with the selected Virtual Machine for log collection.**

### Operation Process

1. During the creation of the log configuration for business application, the advanced configuration and the designated destination for delivery shall be enabled, and Kafka shall be selected as the type of delivery destination.

2. Users shall select the cloud Kafka instance in certain region based on their needs or choose to establish Kafka by themselves. If users choose to establish Kafka by themselves, they need to fill out the brokers of the corresponding self-established Kafka.

3. Fill out Kafka topic to be delivered.

4. Select compression or not, and support the compression format of snappy and gzip.

5. Upon configuration, the reported log data can be checked at cloud or self-established Kafka.
