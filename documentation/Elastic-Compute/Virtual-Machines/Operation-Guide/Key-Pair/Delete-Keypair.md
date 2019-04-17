# Key Pair Deletion

The created SSH Key Pair can be deleted. When the key pair is deleted, the instance using such key pair can still log in normally by using a matched local private key pair and the key pair will be still displayed in the instance details.

	Note:
    * If the instance template is used when creating the key pair, such template cannot be used for creating the Availability Group when the key pair is deleted.
    * If an instance template is created with the key pair and the Availability Group is created based on this template, the Availability Group will become unavailable when the key pair is deleted.

## Operation Steps

1. Access [SSH Key Pair Console][1] or access the [JD Cloud Console] [2]. Click **Elastic Compute**-**Virtual Machine**-**[SSH Key Pair** on the left navigation bar to enter the key pair list page.

2. Select the key pair to be deleted and click **Delete** in the operation.

3. Click **OK** in the deletion confirmation pop-up box to delete the key pair.






[1]: https://cns-console.jdcloud.com/host/ssh/list
[2]:https://console.jdcloud.com
