# Delete RDS Instance
You can manually delete instance which is paid by configuration, according to workload change.

## Precautions
* The instance can be deleted only when the instance is running.
* All read-only instances and relevant backup will be synchronously deleted while the instance is deleted.

## Operation Steps
1. Login [RDS Console](https://rds-console.jdcloud.com/database).
2. There are two entries for deleting instances as follows:
    * List Page: Select the instance to be deleted, and click ***More  - > Delete*** in ***Operation*** column.
    * Instance Detailed Page: Select the instance to be deleted, enter the instance detailed page, click ***Operation - > Delete*** in the upper right corner of the page.
3. Popup box for deletion confirmation is shown in the figure.
    * Click ***OK*** to delete the instance.
    * Click ***Cancel*** to cancel the instance deletion.
    
    ![Screenshot](https://img1.jcloudcs.com/cms/7075a6a6-3752-4827-b492-8bb9623940e720180315164324.png)
