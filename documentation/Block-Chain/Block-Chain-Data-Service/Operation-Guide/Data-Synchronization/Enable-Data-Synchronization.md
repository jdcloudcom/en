# Enable data synchronization
No data is created by default when created through block chain data service console. If you want to subscribe data on the block chain, you need to manually enable the data synchronization service and develop data sources synchronized.

After synchronization service is enabled, full data will be imported first for data of assigned data source and then real-time synchronization of incremental data will be conducted. The process of full synchronization will be time-consuming, which will take 1 ~ 2 hours in quick conditions but 6 ~ 12 hours if it is at slow speed, depending on the size of full backup.

## Precautions
* Data source only supports to be selected one currently

## Action Steps
1. Log in [Block chain data service console](https://bds-console.jdcloud.com/block/list). 
2. Select the target instance needs to enable data synchronization service and click the target instance to enter the details of the instance.
3. Click **Data Synchronization** tag; then click the enable push service button; parameters in the popup are described as below:
    * Data source: data source synchronized by data; select ***BTC*** by default.
    * Target database: target database to which data is synchronized and the length and characters of the database name have some limits which are subject to the console.
    ![Enable data synchronization service](Pic/Enable block chain data synchronization service.png)

5. Complete parameters and click ***OK*** button to enable data synchronization.

