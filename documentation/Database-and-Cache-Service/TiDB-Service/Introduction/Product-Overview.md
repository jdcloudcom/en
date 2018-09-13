# Product Overview
The TiDB Service is a distributed cloud database product created by JD Cloud in cooperation with PingCAP on the basis of the domestic open source NewSQL database TiDB, supporting both scenarios of OLTP and OLAP at the same time, realizing automatic horizontal scaling and distributed transactions with strong consistancy, which is simple in deployment, provided with an online asynchronous table based on a structure that the changes thereof will not affect the business while compatible with the MySQL protocol, so that the use and migration cost is reduced to an entremely low level.

## Main Features of TiDB Service 
1. TiDB Service can seamlessly extend the quantity of nodes as the growth of the data and can increase computational and storage ability approximately linearly;
2. Consistent distributed transaction; support standard ACID transaction; start transactions across multiple machines without affecting consistency;
3. Support most MySQL syntax; high compatibility for MySQL; the switch from MySQL to TiDB can be seamless with almost no need to modify the code; migration cost is extremely low;
4. Use multiple replica for data storage. When the master replica fails, there is no need for manual intervention and it can automatically guarantee the continuity of the sbusiness, which can realize the real sense of performing multiple tasks in different places.

## Common Operations
- [Create Instance](../Operation-Guide/Instance/Create-Instance.md)
- [Connect Instance](../Operation-Guide/Instance/Connect-Instance.md)
- [Node Management](../Operation-Guide/Node.md)
- [Reset Password](../Operation-Guide/Reset-Password.md)
- [Monitoring](../Operation-Guide/Monitor.md)
  
## Billing
TiDB Service supports two billing types: “**monthly package**” and “**Pay By Configuration**”. Refer to “[Charging Rules](../Pricing/Billing-Rules.md)” for details.