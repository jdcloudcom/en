# Modify Attached Target

There is already an "attached target" File Storage, you can change the attached target of the File Storage through "Manage File Storage Access". Applicable to changes in cloud instances that require access to file storage, where VPCs (Virtual Private Clouds) and subnets are changed.

The attached target cannot be directly modified and needs to be completed by "Delete Attached Target" and then "Create Attached Target". After deleting the original attached target, set the newly created attached target to the VPC (Virtual Private Cloud) and subnet where the cloud instance that needs to currently access the File Storage is located.

