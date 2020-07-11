# End Migration Task

In case of the migration type "Structural Migration" or "Full Data Migration", the task will be automatically ended after data migration. In case of the migration type "Incremental Migration", the migration task shall be manually ended.

## Notes

- In case that the migration type is "Incremental Migration", DTS will continuously obtain the changed source database data and duplicate the same to a target database. You need to pay attention to progress of incremental migration. It is suggested that writing to the source database shall be stopped before completion of confirmation and the migration task shall be ended after it is confirmed that data of the target database catches up with the source database.
- Any ended task cannot be started again. Please be sure to confirm that the target database catches up with the source database.

## Operation Steps

1. Enter the Task List Page.

2. Select a migration task and click **End**.**

![1571223249585](../../../../../image/Data-Transmission-Service/dts-007.png)



