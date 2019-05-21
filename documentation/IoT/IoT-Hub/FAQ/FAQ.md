# FAQ

**Q: What type of public cloud service is the IoT Hub Service?**

A：PaaS。


**Q: What type of data will be transmitted to the Cloud by devices suitable for the IoT Hub Service?**

A: High frequency, small data. The typical scenario is the telemetry packet data reported by the device, e.g., the data monitored by various sensors. It is improper to transmit such large storage capacity data as videos and images with the IoT Hub Service.


**Q: What standard protocol connection devices will the IoT Hub Service support?**

A：MQTT、CoAP、HTTP。

**Q: Is the IoT Hub Service a shared type service?**

A: The IoT Hub Service isn’t a shared type service. Each tenant creates and manages his own instances of IoT Hub Service in his own VPC, and these instances are independent and separated from one another.

   
**Q: What JD Cloud's services can be connected to by the rule engine of the IoT Hub Service?**

A: RDS, ES and JCQ.


