# View the Monitoring
At console of TiDB Service, you can view multiple database indicators. Through the data of database indicators, you can locate the problem of the system and perform corresponding system optimization.

## Operation Steps
1. Log on management console of TiDB Service.
2. Select the target instance whose monitoring information is required to be viewed; click the target instance; go to the Instance Details page.
3. Select the tag of “Monitoring” to view the monitoring items of TIDB Service.
4. By default, the monitoring data for the dimension of 1 hour will be displayed. You can also select the dimension of 1 day, 7 days and 30 days.
![Infrastructure Architecture](../../../../image/TiDB/Monitor-1.png)

## Monitoring Item
|	Monitoring Item	|	Unit of Indicator	|	Monitoring Frequency	|	Monitoring Cycle	|
|:-|:-|:-|:-|
|	Usage Size of Cluster Storage	|	Unit: GB	|	60 Seconds/Time	|	30 Days	|
|	TiDB-Total Times of Search Requests	|	Unit: Times/Min	|	60 Seconds/Time	|	30 Days	|
|	TiDB-Quantity of Database Active Connections	|	Unit: pcs	|	60 seconds/time	|	30 days	|
|	TiDB-Usage Amount of Memory	|	Unit: GB	|	60 Seconds/Time	|	30 Days	|
|	TiDB-CPU average usage rate	|	Unit:%	|	60 seconds/time	|	30 days	|
|	TiDB-INSERT statistics of statement	|	Unit: Times/Min	|	60 Seconds/Time	|	30 Days	|
|	TiDB-DELETE statistics of statement	|	Unit: Times/Min	|	60 Seconds/Time	|	30 Days	|
|	TiDB-UPDATE statistics of statement	|	Unit: Times/Min	|	60 Seconds/Time	|	30 Days	|
|	TiDB-SELECT statistics of statement	|	Unit: Times/Min	|	60 Seconds/Time	|	30 Days	|
|	TiKV-Usage Space	|	Unit: GB	|	60 Seconds/Time	|	30 Days	|
|	TiKV-Usage Amount of Memory	|	Unit: GB	|	60 Seconds/Time	|	30 Days	|
|	TiKV-CPU average usage rate	|	Unit:%	|	60 seconds/time	|	30 Days	|
