# Cancel Shared Private Image

## Precautions
* When unshared, the original shared user can no longer create instances with the image, and instances created with the image cannot be reset to the original system state.

## Operation Steps
1. Access [Image Console][1], or access [JD Cloud Console][2] Click navigation bar on the left **Elastic Compute** - **Virtual Machines** - **Image** to enter the image list page.
2. Select **Private** TAB and the private image you want to unshare in the list.
3. You can Click **Shared Image** in the list operation column, select the account to be unshared from the shared account displayed in the pop-up window, click **Cancel Sharing** in the operation column, then the shared private image of the corresponding account is canceled, and the image will be automatically removed from the **Shared Image** list of the corresponding account. You can also click on the image name to enter the detail page, select the **Image Sharing** TAB to view the account shared by this image, and click **Cancel Sharing**.
![](../../../../../image/vm/Operation-Guide-Image-unshare1.png)
![](../../../../../image/vm/Operation-Guide-Image-unshare2.png)



  [1]: ./images/Operation-Guide-Image-unshare2.png "Operation-Guide-Image-unshare2.png"
  [2]: https://cns-console.jdcloud.com/host/compute/list