# Delete Private Image

## Precondition
* Only shared images with the "Available" or "Error" status support deleting.
* A shared private image cannot be deleted before the sharing relationship is cancelled. If the private image is shared with other users, please cancel the sharing before delete it.
* Images of local system disk cannot be deleted if the machine creating such images is available (if images are deleted, data cannot be recovered in case of migration or machine system breakdown). If image quota is insufficient due to this restriction, please open ticket to apply for quota increase.

## Operation Steps
1. Access [Image Console][1], or access [JD Cloud & AI Console](https://console.jdcloud.com/overview) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** - **Image** to enter the image list page.
2. Select **Private Image** TAB, find the private image to be deleted, and select [Delete] in [More] operations on the private image list.

![](../../../../../image/vm/Operation-Guide-Image-delete3.png)

3. Click **OK** in the Confirm Delete pop-up box to delete the private image. By default, the associated snapshot will not be deleted when the image is deleted. If you want to delete it at the same time, you can check "Delete the associated snapshot at the same time". The system will try to delete the original associated snapshot after the image is successfully deleted. Note that whether the snapshot can be deleted is a result of other factors (such as whether there is a sharing relationship, where there are other associated images, whether there are other tasks in progress, etc.). Regardless of whether the snapshot can be successfully deleted or not the deletion of the image will not be affected.
		
		Note:
		* After images are deleted, the Virtual Machines created based on images (including Virtual Machines created by other users after images are shared) cannot initialize disks to the backup time point of this image via the system rebuilding function.
![](../../../../../image/vm/Operation-Guide-Image-delete4.png)



  [1]: https://cns-console.jdcloud.com/host/image/list
  [3]: ./images/Operation-Guide-Image-delete1.png "Operation-Guide-Image-delete1.png"
  [4]: ./images/Operation-Guide-Image-delete2.png "Operation-Guide-Image-delete2.png"


