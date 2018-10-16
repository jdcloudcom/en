# Basic Infrastructure
The cluster structure of Message Queue synchronizes writing three copies of backup, ensures high reliability and high availability of the service. The framework of independent research and development ensures the high performance of services to meet the needs of different businesses.

## Business Structure
The business structure is as follows:
![](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/Basic-Infrastructure-en.png)

| Term | Description |
| :- | :- |
| Broker Group | Broker Group is the core component of Message Queue, which is responsible for message storage, subscription management, consumption management, and data statistics. |	
| Meta Manager Cluster | The core components of Message Queue are responsible for message route, authorization, and control events. |
| Control Service | Deal with the request tasks from users and back-ends, the tasks include creating, deleting, searching, modifying configuration, and resetting consumer offset. |
| Monitoring Service | Gather the information of Message Queue Topic and Consumer Group for users and console display. |
| Log Service | Gather the log information of Message Queue. |
| Billing Service | Responsible for calculating user's request amount. |


## Related References

- [Benefits](../Introduction/Benefits.md)
- [Features](../Introduction/Features.md)
- [Price Overview](../Pricing/Price-Overview.md)
- [Billing Rules](../Pricing/Billing-Rules.md)


