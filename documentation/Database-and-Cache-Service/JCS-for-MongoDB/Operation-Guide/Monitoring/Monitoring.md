# View monitoring information

The MongoDB console provides a wealth of performance monitoring data so you can see the operation status of your instances at any time.

## Operation Steps
1. Login [MongoDB Console](https://mongodb-console.jdcloud.com/mongodb?dataCenter=bj_02).
1. On the "Instance List" page, select the target instance, then click **Instance Name** to enter the "Instance Details" page.
1. On the "Instance Details" page, click **Monitor** to view the monitoring information.

   ![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-024.png)

   - You can quickly view data from 1 hour to 14 days, or enter a date range for up to 1 month to view.
   - Viewing of monitoring information for primary and secondary nodes is supported.
	

## Instructions to Monitoring Item

Monitoring item | Instructions
--- | ---
CPU Utilization Rate | CPU utilization rate of the instance.
Memory Utilization Rate | Memory utilization rate of the instance.
Disk Utilization Rate| The ratio of the total used space of the instance to the maximum usable space of the specification.
IOPS Utilization Rate| The ratio of the instance IOPS to the accessible maximum IOPS
Connections | Connection number of instance
opcounters	| QPS operation number of instance, including: <br />	- insert operation number<br />	- query operation number<br />	- delete operation number<br />- update operation number<br />	- getmore operation number<br />	- command operation number>
network	 | Network flow of instance, including: <br />	-import flow<br />	- export flow<br />	- requested number for processing>
cursors	| cursor number of instance, including: <br />	- number of currently open cursor <br />	- overtime number of cursor>
globalLock	| Queue length currently waiting for global locking of instance, including: <br />	- length of queue waiting for global lock reading<br />	- length of queue waiting for global lock writing<br />	- length of queue waiting for the whole global lock>
wiredTiger	| Index of Layer cache with wiredTiger engine of instance, including: <br />	- read-in data quantity of cache<br />	- disk space written from cache<br />	- available maximum disk space for configuration>



	
## Related Reference

- [Set Alarm Rules](Alarm-Rules.md)
	




	
	


