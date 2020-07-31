# Infrastructure

## Business Structure

![1568968591708](../../../../image/Data-Transmission-Service/dts-037.png)

**Description**

- DTS management service: Create a management migration task. For each task, a DTS Kernel Agent will be created accordingly.
- DTS monitoring service: Monitor task status.
- DTS Kernel Agent: DTS migration service for data migration, deployed in the form of container in the subnet where the target database is located. DTS Kernel Agent supports automatic high availability.



## Data Migration Rationale

![1568968924973](../../../../image/Data-Transmission-Service/dts-004.png)

**Description:**

- Data migration supports various migration types: structure migration, full data migration and incremental migration.
- Structure migration is the migration of the source database structure.
- Full data migration is the migration of the current full data set of the source database.
- For incremental data pull, the changing data in the source database will be continuously obtained by the incremental migration service during the full data migration.
- After the full data migration, the incremental migration service will continue obtaining the changes in the source database and migrate them to the target database.
