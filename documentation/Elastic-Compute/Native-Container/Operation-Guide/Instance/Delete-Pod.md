
# Delete Pod

**Operation Description**

* Native container Pod of monthly package is not allowed to be deleted before expiration. It can be automatically deleted after 7 days of expiration. You can manually delete it on the console within the 7 days of expiration;

* After native container Pod is deleted, all data will be cleared and cannot be recovered. Please backup your data in advance. See instance [Create Cloud Disk Snapshot][1] for details;

* When delete native container Pod, public IP and Cloud Disk unset as automatically deleting associated with native container Pod will be disassociate with native container Pod and continue to be kept. If you need not keep them, please delete these resources at Public IP Resource List page and Cloud Disk Service Resource List page to avoid generating extra costs. See [Delete Elastic IP][2] and [Delete Cloud Disk][3] for details.

* When delete native container Pod in batches, you cannot select native container that is normally billing with monthly package, otherwise the Delete in Batches button will be unavailable;

* Native container Pod in intermediate state cannot be deleted.

**Operation Guide**

**Method 1**: delete the container on Native Container Pod List page

1. Open JD Cloud console, select [Elastic Compute] - [Native Container] - [Pod] enter Container List page;

2. Select native container Pod to be deleted, click **Delete** in Operation bar, confirm the popup of [Delete Pod];

3. You can check multiple native container Pod to be deleted, click **Delete in Batches ** at the bottom of the page, and confirm the popup of [Delete Pod];

4. Public IP and Cloud Disk unset as automatically deleting associated with native container Pod will be disassociate with native container Pod and continue to be kept, which will continue to generate costs. After checking "I have understood the cost matters, associated resources will be automatically deleted if I do not need them", click **OK** to confirm to delete native container Pod;

5. In the case of successful deletion, relevant information will update; in the case of failure, tooltip will pop. If you fail to delete them for several times, please contact customer service and open ticket.



**Method 2**: delete Pod on native container Pod Details page

1. Open JD Cloud console, select [Elastic Compute] - [Native Container] - [Pod] enter Native Container Pod List page;

2. Click the name of native container to be deleted and access the native container Pod details page;

3. Click **Operation** at the upper right corner and list of more operation options will show, click **Delete** and confirm the popup of [Delete Pod];

4. Public IP and Cloud Disk unset as automatically deleting associated with native container Pod will be disassociate with instance and continue to be kept, which will continue to generate costs. After checking "I have understood the cost matters, associated resources will be automatically deleted if I do not need them", click **OK** to confirm to delete native container Pod;

5. In the case of successful deletion, relevant information will update; in the case of failure, tooltip will pop. If you fail to delete them for several times, please contact customer service and open ticket.


  [1]: https://docs.jdcloud.com/cn/cloud-disk-service/create-clouddisk-snapshot
  [2]: https://docs.jdcloud.com/cn/elastic-ip/delete-elastic-ip
  [3]: https://docs.jdcloud.com/cn/cloud-disk-service/delete-cloud-disk