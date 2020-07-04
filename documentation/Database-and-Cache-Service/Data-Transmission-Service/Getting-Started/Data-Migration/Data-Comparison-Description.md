# Execute Data Check

## Description

- MySQL/Percona/MariaDB support full check. If data check is selected when a task is created, users can manually execute data check after full data migration is completed.

- SQL Server supports full check. If data check is selected when a task is created, the data check will be automatically executed at the end of migration task.

- MongoDB does not support data check at present.

## Operation Steps

MySQL/Percona/MariaDB executes data check as per the following operation steps.

1. Enter the data migration task list.

2. Select a migration task, click **Check Data**, and wait until the data check is completed.

   ![image-20200113180223366](../../../../image/Data-Transmission-Service/dts-022.png)

3. The data check result can be viewed in the task detail.

   ![image-20200113180223366](../../../../image/Data-Transmission-Service/dts-023.png)
