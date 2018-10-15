# Delete Private Image

## Precondition
* Only shared images with the "Available" or "Error" status support deleting.

## Precautions
* A shared private image cannot be deleted before the sharing relationship is cancelled. If the private image is shared with other users, please cancel the sharing before delete it.

## Operation Steps
1. Access [Image Console][1], or access [JD Cloud Console](https://console.jdcloud.com/overview) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** - **Image** to enter the image list page.
2. Select the "Private Image" TAB to find the private image needs to be deleted, then select **Delete** in the private image list.
![](../../../../../image/vm/Operation-Guide-Image-delete1.png)

3. In the confirmation pop-up window, click **OK** to delete the private image. If the private image contains device mapping information, then the cloud disk snapshot associated with it will not be deleted when deleting the image. Access the cloud disk snapshot page to delete the snapshot, if necessary.
![](../../../../../image/vm/Operation-Guide-Image-delete2.png)



  [1]: https://cns-console.jdcloud.com/host/image/list
  [3]: ./images/Operation-Guide-Image-delete1.png "Operation-Guide-Image-delete1.png"
  [4]: ./images/Operation-Guide-Image-delete2.png "Operation-Guide-Image-delete2.png"