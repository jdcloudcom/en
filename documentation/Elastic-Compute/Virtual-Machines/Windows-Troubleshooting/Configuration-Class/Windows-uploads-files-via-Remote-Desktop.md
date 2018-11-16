# Upload Files via Remote Desktop under Windows System

**Application Scenarios**

This document describes how to upload files via Remote Desktop under Windows system.

**Precautions**

This method is not applicable to uploading large files.

**Operation steps**

1. Click Run and enter the command: ***mstsc*** to open the Remote Desktop Connection dialog.

2. Click **Display Options** to bring up the **Remote Desktop Connection** dialog box.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E9%80%9A%E8%BF%87%E8%BF%9C%E7%A8%8B%E6%A1%8C%E9%9D%A2%E4%B8%8A%E4%BC%A0%E6%96%87%E4%BB%B601.png)

3. Select the tab **Local Resources** and click **Details**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E9%80%9A%E8%BF%87%E8%BF%9C%E7%A8%8B%E6%A1%8C%E9%9D%A2%E4%B8%8A%E4%BC%A0%E6%96%87%E4%BB%B602.png)

4. In the drive module, select the local hard drive containing the files to be uploaded to the Windows VM.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E9%80%9A%E8%BF%87%E8%BF%9C%E7%A8%8B%E6%A1%8C%E9%9D%A2%E4%B8%8A%E4%BC%A0%E6%96%87%E4%BB%B603.png)

5. After the configuration is completed, log in the Windows VM and select **Start** - **Computer** to see the local hard disk attached to the Virtual Machines.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E9%80%9A%E8%BF%87%E8%BF%9C%E7%A8%8B%E6%A1%8C%E9%9D%A2%E4%B8%8A%E4%BC%A0%E6%96%87%E4%BB%B604.png)

6. Copy the code files from the local hard disk to the Windows VM to complete the file uploading operation.
