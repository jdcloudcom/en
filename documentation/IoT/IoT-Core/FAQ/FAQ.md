# FAQ

**Q: For IoT Core, what type of data will be transmitted to the cloud by devices?**

A: High frequency, small data. The typical scenario is the telemetry packet data reported by the device, e.g., the data monitored by various sensors. It is improper to transmit such large storage capacity data as videos and images with the IoT Hub Service.

**Q: Is the IoT Core a shared type service?**

A: The IoT Hub Service isn’t a shared type service. Each tenant creates and manages his own instances of IoT Hub Service in his own VPC, and these instances are independent and separated from one another.

**Q: Which service connections of JD Cloud are supported by the rule engine of IoT Core?**

A: RDS, ES and JCQ.


