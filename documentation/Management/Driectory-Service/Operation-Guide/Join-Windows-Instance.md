### Add Directory Service Domain Control Manually

1. Login to Virtual Machines that need domain control to be added, select to open the network and share center, select linked Ethernet, select Internet Protocol Version 4 after clicking **Attribute

![img](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-2019011501/image/DirectoryService/cn/Join-Windows-Instance-cn-1.png)

2. Change the DNS service to the DNS website address of Directory Service, click **OK

![img](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-2019011501/image/DirectoryService/cn/Join-Windows-Instance-cn-2.png)

3. Click **Start** to select this computer, and click **Change** in attributes

![img](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-2019011501/image/DirectoryService/cn/Join-Windows-Instance-cn-3.png)

4. Select the domain in the new window, enter the DNS website address of Directory Service

![img](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-2019011501/image/DirectoryService/cn/Join-Windows-Instance-cn-4.png)

5. Enter the user name and password of Directory Service (the default user name is Admin when creating the Directory Service, the password is in customized setting)

![img](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-2019011501/image/DirectoryService/cn/Join-Windows-Instance-cn-5.png)

6. Restart the computer after successful domain addition

![img](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-2019011501/image/DirectoryService/cn/Join-Windows-Instance-cn-6.png)