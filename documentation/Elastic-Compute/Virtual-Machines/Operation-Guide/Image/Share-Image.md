# Share Private Image
A shared image is a private image that you share your private image with other JD Cloud users. You can easily get permission to use the image from other users, get the necessary components and can add custom content, or you can share your private images through the "Image Sharing" feature with other JD Cloud accounts.
Only the owner of the image has permission to share the image, and the shared image cannot be shared again by the user shared to other JD Cloud users.
It is important to note that JD Cloud cannot guarantee the integrity and security of the images that other users share with you, and we recommend that you only use shared images from trusted sources.

## Precondition
* Only private images in the "Available" status support sharing;
* "Image Sharing" function, can only be shared with the JD Cloud account, do not support the associated sharing through mobile number associated with account, please obtain the correct JD Cloud account information by the following ways:
    * Click on the user account in the upper right corner and select **Account Management** to enter the user center.
    * View the basic information in "Basic Information", "User Pin" is the correct user account.
![](../../../../../image/vm/Operation-Guide-Image-share1.png)

## Operation Steps

1. Access [Image Console][2], or access [JD Cloud Console](https://console.jdcloud.com/overview) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** - **Image** to enter the image list page.

2. Select **Private** TAB and the private image you want to share in the list.

3. You can click **Shared Image** in the list operation column, or you can enter the image detail page and click **Add Share** under **Image Sharing** TAB.

4. In the share image window, enter the JD Cloud account of the shared object, click **Share Image**, the sharing takes effects if the account verification is successful, while the verification failure will prompt you "JD Cloud account does not exist".

5. The shared accounts will be displayed in the list below, where you can directly click **Cancel Sharing**.
![](../../../../../image/vm/Operation-Guide-Image-share2.png)

**Note: Private images that reference snapshots do not currently support sharing.**




  [1]: ./images/Operation-Guide-Image-share1.png "Operation-Guide-Image-share1.png"
  [2]: https://cns-console.jdcloud.com/host/image/list
 