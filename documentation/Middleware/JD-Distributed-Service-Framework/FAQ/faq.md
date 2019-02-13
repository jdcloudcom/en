# FAQ



**Q: Issues related to cost such as product charge, refund, etc.**

A: The product is free during Beta. Other relevant charges shall be according to the practical situation of related resources. 



**Q: How do I select the specifications of registration center service?**

A: You should select the specifications of registration center service according to the number of your service instances. If the specification you select is under the actual rule, it will lead to performance decrease and service unavailability; if the specification you select is over large, it will result in a certain resource waste. You can select a relatively close specification first, then perform scaling according to the monitoring data of actual running status.



**Q: How can I select the specification of calling chain analysis service?**

A: You need select specification  for calling chain analysis service according to the TPS of your reported chain log calling. The factors affecting the TPS include the requests (Q) per second at the system entrance, average internal calls (C) occurred for each request during internal processing in the cluster, the data sampling rate (R) of calling chain that you have configured in the configuration file. You can carry out estimation by Q*C*R and select the configuration that is a bit lower than the estimate value, report TPS and make expansion as required according to the actual log in the monitoring data at the later period.



**Q: How is my configuration data stored?**

A: The current version only supports to use your purchased registration center cluster for configuration data storage and it will support other storage media later. The current configuration data in the registration center cluster adopts crossing data centers and multiple replicas storage mode, which can effectively ensure the availability and persistence of data.



**Q: How can I find back my deleted registration center?**

A: You can find it back through opening ticket.

