
# Delete Instance

Operation Instructions

Monthly package instance is not allowed to be deleted before due time and shall be deleted automatically 7 days after due time; you can delete it manually on console within 7 days after due time;

All data of the instance shall be cleared up and can not be recovered after delete and please backup data in advance; refer to creating cloud disk snapshot instance for details;

When deleting, the public IP associated to container and cloud disk service which is not set to deleted automatically shall disassociate instance and continue to be preserved; if preservation is not needed, please go to the L EIP Resource List page and the Cloud Disk Resource List page to delete the resource to avoid the occurrence of additional expenses; refer to Delete Elastic EIP and Delete Cloud Disk for details.

When deleting containers in batch, the yearly package and monthly package containers which are charged normally shall not be checked, or Delete in batch button shall be put gray and non-operational;

Containers in the intermediate status can not be deleted

Operation Guide

Method 1: Delete container in the Container List page

1. Open JD Cloud Console and select **Elastic Compute**-**Container Service**-**Container Instance** to enter into the Containers List page;

2. Select container you want to delete and click **Delete**button in the operation column to pop up **Delete container**confirmation window;

3. You can also check multiple containers needed to be deleted, click the Delete in batch button at the bottom of the page to pop up **Delete container**confirmation window;

4. The public IP associated to container and cloud disk service which is not set to be deleted automatically shall disassociate instance and continue to be preserved and generating costs; check “I have known the cost problem and I shall delete relevant resources by myself if i don’t need them anymore”, then click**OK** button to confirm deleting container;

5. If the deletion succeeds, the relevant information will be updated; if the deletion fails, a prompt box will appear; if the deletion failed repeatedly, please contact the Customer Service or open a ticket.



Method 2: Delete container in the Container Details page

1. Open JD Cloud Console and select **Elastic Compute**-**Container Service**-**Container Instance** to enter into the Containers List page;

2. Click the name of the container which shall be deleted to go to Container Details page;

3. Click **Operation**icon at the upper right corner and more operation option lists appear; click**Delete** button to pop up **Delete container**confirmation window;

4. The public IP associated to container and cloud disk service which is not set to be deleted automatically shall disassociate instance and continue to be preserved and generating costs; check “I have known the cost problem and I shall delete relevant resources by myself if i don’t need them anymore”, then click**OK** button to confirm deleting container;

5. If the deletion succeeds, the relevant information will be updated; if the deletion fails, a prompt box will appear; if the deletion failed repeatedly, please contact the Customer Service or open a ticket.