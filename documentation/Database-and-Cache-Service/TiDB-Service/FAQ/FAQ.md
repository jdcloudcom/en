# FAQ
**1. Is TiDB Service developed based on MySQL?**

No. But TiDB Service can support for MySQL syntax and protocols.

**2. Is it easy to use?**

Yes. It's easy to use the TiDB Service. After starting the entire service, we can use TiDB Service as a normal MySQL Server. You can use the TiDB Service in any application using MySQL as the background storage service without modifying any application code basically and most MySQL management tools are compatible.

**3. What is the applicable scenario?**

When the original business MySQL business encounters a stand-alone capacity or performance bottleneck, using a TiDB Service to seamlessly replace MySQL can be taken into consideration.

**4. How to migrate an application running on MySQL to TiDB Service?**

Most MySQL syntax of TiDB Service doesn't need to modify the code generally. You can use the tool Checker to check if the Schema in MySQL is compatible.

**5. Does TiDB have high availability?**

TiDB has high availability and these three components, TiDB, TiKV, PD, can tolerate partial instance failures without affecting the availability of the entire cluster.

**6. Is the TiDB data highly consistent?**

TiDB uses Raft to synchronize data between multiple copies to ensure strong data consistency, and ensure that data reliability is not affected when a single copy fails.

**7. What is the limit to username length?**

Username is limited to 32 characters in TiDB.

**8. What is the maximum number of statements in a certain transaction?**

The maximum default limit is 5000 in the number of statements in a certain transaction.

**9. How to improve performance by expanding TiDB Service?**

The database may face three bottlenecks as the business continues to grow:
- I. The storage resources are insufficient, which means there is not enough disk space.
- II. Computing resources are not enough. For example, CPU usage is high.
- III. Throughput can't keep up.

At this time, you can scale the database cluster horizontally.
- It can be solved through increasing TiKV Server node if the storage resources are not enough. After starting of new node, PD will migrate some data from other nodes automatically without manual intervention.
- You can check the CPU consumption of the TiDB node and TiKV node and then consider adding TiDB and TiKV nodes to solve it when computing resources are not enough.
- It would consider adding TiDB nodes and TiKV nodes at the same time if throughput can't keep up.

**10. What is the performance Indicator?**

In the case of large data volumes, comparing to MySQL, TiDB Service has a bigger advantage over QPS, TPS and response time. Specific indicators can be found in the official documentation: https://github.com/pingcap/docs-cn/blob/master/benchmark/sysbench.md
