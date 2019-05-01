# Delete Attached Target

The "attached target" of the selected File Storage can be deleted by "Manage File Storage Access". Click **Manage File Storage Access** on the file storage list page or file storage information page. If the current file storage has available attached targets, you will see the attached target with the selected status in **Manage Attached Target**. At this time, the status of the attached target is “Available" and “Subnet" cannot be modified.

Click the check box in front of the attached target and uncheck it. The “Delete Attached Target” tooltip will pop up, prompting you that “Please uninstall the file system from all Cloud Instances before deleting the attached target”. Click **OK**, then click **Save** to delete the attached target. **Deleted attaches are not recoverable**, please be sure to confirm that the file storage has been uninstalled from the cloud instance** before deleting the attached target. Otherwise, the read and write errors to file storage of Cloud Instance will be caused because the file storage cannot be accessed.

Before clicking **OK** to confirm the deletion of the attached target tooltip but not clicking **Save** on the **Manage File Storage Access** page, reselecting the check box before the attached target is equivalent to canceling the previous deletion operation.

![DeleteFs](../../../../image/Cloud-File-Service/deletemt.png) 
