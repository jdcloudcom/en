# Disable data synchronization
If you want to obtain data from other data sources without creating new instances, you can select to disable the data synchronization service and then enable it again to select the data source you want to synchronize.

Disabling synchronization service will synchronously delete the database and account created when synchronization service is enabled, that means all data of data sources synchronized previously will be deleted.

## Precondition
* The status of block chain data service instance is ***Running***

## Action Steps
1. Log in [Block chain data service console](https://bds-console.jdcloud.com/block/list). 
2. Select the target instance needs to disable data synchronization service and click the target instance to enter the details of the instance.
3. Click **Data Synchronization** tag; then click the disable push service button; parameters in the popup are described as below:
    * Click ***OK*** button to complete the disablement of synchronization service.
    * Click ***Cancel*** button to complete the enablement of synchronization service.
    ![Disable data synchronization service](Pic/Disable data synchronization service.png)

4. Click ***OK*** button to disable data synchronization service.

