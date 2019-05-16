# Modify Attached Target

There is already an "mount target" File Storage, you can change the mountd target of the File Storage through "Manage File Storage Access". Applicable to changes in cloud instances that require access to file storage, where VPCs (Virtual Private Clouds) and subnets are changed.

The mount target cannot be directly modified and needs to be completed by "Delete Mount Target" and then "Create Mount Target". After deleting the original mount target, set the newly created mount target to the VPC (Virtual Private Cloud) and subnet where the cloud instance that needs to currently access the File Storage is located.

