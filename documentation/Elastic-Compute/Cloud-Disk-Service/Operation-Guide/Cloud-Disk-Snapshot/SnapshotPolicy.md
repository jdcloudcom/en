# Customized Snapshot Policy

## Create Customized Snapshot Policy

Log in JD Cloud & AI Console, find the "Customized Snapshot Policy" menu through "Elastic Compute" - "Cloud Disk" - "Cloud Disk Snapshot", and click to enter Customized Snapshot List page.

On the Customized Snapshot List page, you can see the existing policy under the current login account. Policies are arranged in reverse chronological order in terms of the "Last Modification Time".

![policylist](../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/policylist.png)

Click **Create** on the upper left of the list to create a new snapshot policy.

![createpolicy](../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/createpolicy.png)

Where,

"Effective Time of Policy" refers to the first time when the policy begins execution, which must be later than current time plus 30 minutes. After selection, you can confirm if it is the anticipated backup time in "Next Backup Time" below. Please note that the effective time of a snapshot policy is not the time when all cloud disks begin the backup. When beginning execution, the snapshot policy will form a backup queue to begin successively the backup of cloud disk according to the data volume to be backed up and the then service load. The actual backup time shall be subject to the "Creation Time" for snapshots formed by backup.

The "Backup Interval" can be measured by "Day", "Week", "Month" and "Hour". To avoid conflict between two tasks using the same policy due to short interval, the minimum interval shall be 12 hours;

For "Snapshot Retention Time", you can select either to retain for a fixed number of days or "Permanent Retention". If a fixed number of days is selected, the snapshot will be automatically deleted once expired. The deletion time of snapshot can be viewed in "Cloud Disk" - "Cloud Disk Snapshot" - "Snapshot List";

After you check the "Send a Notice Upon Backup", a notice of policy execution result will be sent to the designated contact or contact group by SMS and/or email after the policy is executed. The contact or contact group can be set in "Account Management" - "[Contact Management](https://uc.jdcloud.com/account/contacts)".



## Modify Policy

Users can modify the created snapshot policy. In the "Snapshot Policy List", Click **Modify Policy** in the "Operations" list for the policy to be modified. In the new window, users can modify the policy name, effective time of policy, backup interval, snapshot retention time and contact or contact group to be notified.

"Effective Time of Policy" cannot be 12 hours earlier than the previous execution time of this policy or earlier than current time plus 30 minutes.

The modification to a snapshot policy will take effect at **Next Execution** of the snapshot policy.

![editpolicy](../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/editpolicy.png)



## Associate with Cloud Disk

After creating a customized snapshot policy, users can associate this policy with a cloud disk to realize periodical backup of the cloud disk.

Cloud disk and snapshot policy are in a one-to-one relationship, in which only one cloud disk can be associated with one snapshot policy at the same time. When the cloud disk that has associated with one policy associates with another customized snapshot policy, the previous relationship will be replaced.

On the Snapshot Policy List page, click **Associate with Cloud Disk** in the "Operations" list on the right side of the policy to associate this policy with the cloud disk. In the "Not Associate" tab in the popup, check the cloud disk to be associated, click **Associate** on the lower right to back up this policy with this selected cloud disk.

Multiple cloud disks can be associated in one go. Users can switch to cloud disks in different regions through "Current Region" on the top of the list, or search the corresponding cloud disk by "Cloud Disk ID", "Cloud Disk Name" or "Instance ID".

![applypolicy](../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/applypolicy.png)

By switching to "Associated", users can view cloud disks that have associated with this policy. Check one of the cloud disks, click **Disassociate** to stop automatic backup of the selected cloud disk under this policy.

![applied](../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/applied.png)



## Delete Policy

On the Customized Snapshot Policy List page, click **Delete Snapshot Policy** in "More" of "Operations" List of snapshot policy, and then confirm to delete the snapshot policy.

Please note that the policy will no longer automatically back up the associated cloud disk after being deleting.

## Policy Execution Log

By clicking **Policy Execution Log** in the "Cloud Disk Snapshot" menu, users can view results of each execution for all snapshot policies. Where,

"Start Time of Backup" refers to the time when the policy begins the backup of the first cloud disk associated at this time; please note that not all associated cloud disks begin the backup at this time point;

"Snapshot Creation Count" refers to the count made in this snapshot creation task, which is equal to that of cloud disks associated with the policy at this time point;

"Success Count" refers to the count successfully done in snapshot creation. If this count is equal to the "Snapshot Creation Count", then all cloud disks are successfully backed up in this policy execution;

"Failed Cloud Disk ID" refers to the cloud disk ID that cannot successfully create a snapshot in this execution. Snapshot creation can be normally conducted only when the cloud disk is in an "Available" or "Attached" status. Therefore, when a snapshot policy begins execution, if the cloud disk is in a status of "Attaching", "Detaching" or "Creating Snapshot", it cannot conduct backup as scheduled.

On the "Customized Snapshot Policy" List page, by clicking **Policy Execution Log** in the "Operations" List on the right side of the policy, you can redirect to the "Policy Execution Log" page to search the execution log of this policy.
