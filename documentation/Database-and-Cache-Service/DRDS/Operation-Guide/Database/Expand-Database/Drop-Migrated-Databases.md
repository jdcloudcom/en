# Check and clear the old databases that have been migrated

After the horizontal expansion is completed, a portion of the original RDS MySQL sub-databases has been migrated to the new RDS MySQL, but this portion of the sub-database system that has been migrated will not automatically delete.
It is recommended that the user delete it manually after the check and inspection of the data in the sub-database is completed** 

The user can view which sub-databases have been migrated in the **“Migrated”** column directly from the DRDS database details page.

Click **X** at the top right of the migrated sub-database, then the sub-database can be deleted at the RDS MySQL at backend.

![删除分库1](../../../../../../image/DRDS/drop-migrated-databases-1.png)
