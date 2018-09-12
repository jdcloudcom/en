# Enable data synchronization
There is no data in the new blockchain data service instance by default. If you want to subscribe data on the blockchain, you need to manually enable the data synchronization service and choose data source.

After synchronization service is enabled, full data of the data source will be imported first, then real-time synchronization of incremental data will be conducted. The process of full synchronization will be time-consuming, which will take 1 ~ 2 hours in quick conditions but 6 ~ 12 hours if it is at slow speed, depending on the size of full backup.

## Precautions
* You can only select one data source at the same time.

## Action Steps
1. Log in [blockchain data service console](https://bds-console.jdcloud.com/block/list). 
2. Select the target instance needs to enable data synchronization service and click the target instance to enter the details of the instance.
3. Click **Data Synchronization** tag; then click the enable push service button. The parameters in the popup are described as below:
    * Data source: the data will be synchronized. ***BTC*** will be selected by default.
    * Target database: target database to which data is insert, the length and characters of the database name have some limits which are subject to the console.
    ![Enable data synchronization service](Pic/Enable block chain data synchronization service.png)

5. Complete parameters and click ***OK*** button to enable data synchronization.
